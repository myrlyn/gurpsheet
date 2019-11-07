package gurpssheet;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

@Path("sheets")

public class Sheets {
	public static final Logger LOGGER = LogManager.getLogger(Sheets.class);
	protected static String dataBaseURL = "jdbc:sqlite::memory:";
	protected static ConnectionSource dbsrc = null;
	static {
		try {
			dbsrc = new JdbcConnectionSource(Sheets.dataBaseURL);
			TableUtils.dropTable(dbsrc,SkillContainer.class, true);
			TableUtils.dropTable(dbsrc,Equipment.class, true);
			TableUtils.createTableIfNotExists(dbsrc, SkillContainer.class);
			TableUtils.createTableIfNotExists(dbsrc, Skill.class);
			TableUtils.createTableIfNotExists(dbsrc, AdvantageContainer.class);
			TableUtils.createTableIfNotExists(dbsrc, Advantage.class);
			TableUtils.createTableIfNotExists(dbsrc, MeleeAttack.class);
			TableUtils.createTableIfNotExists(dbsrc, RangedAttack.class);
			TableUtils.createTableIfNotExists(dbsrc, CharacterSheet.class);
			TableUtils.createTableIfNotExists(dbsrc, EquipmentContainer.class);
			TableUtils.createTableIfNotExists(dbsrc, Equipment.class);
			
		} catch (SQLException  e) {
			LOGGER.error("Error opening SQLITE in memory DB", e);
		}

	}

	@DELETE
	@Path("delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean deleteCharacterSheet(CharacterSheet cs) {
		try {
			Dao<CharacterSheet, Long> csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
			csheetDao.delete(cs);
		} catch (SQLException e) {
			LOGGER.error("Could Not Delete Character Sheet", e);
			return false;
		}
		return true;
	}

	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean saveNewSheet(CharacterSheet cs) {
		try {
			Dao<CharacterSheet, Long> csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
			csheetDao.create(cs);
		} catch (SQLException e) {
			LOGGER.error("Error Creating New Sheet", e);
			return false;
		}
		return true;
	}

	@POST
	@Path("save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean saveSheet(CharacterSheet cs) {
		try {
			Dao<CharacterSheet, Long> csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
			csheetDao.createOrUpdate(cs);
		} catch (SQLException e) {
			LOGGER.error("Error Saving Sheet", e);
			return false;
		}
		return true;
	}

	@POST
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean changeSheet(CharacterSheet cs) {
		try {
			Dao<CharacterSheet, Long> csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
			csheetDao.update(cs);
		} catch (SQLException e) {
			LOGGER.error("Error Updating Sheet", e);
			return false;
		}
		return true;
	}

	@GET
	@Path("blank")
	@Produces(MediaType.APPLICATION_JSON)
	public CharacterSheet newSheet() {
		Dao<CharacterSheet, Long> csheetDao = null;
		try {
			csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
		} catch (SQLException e) {
			LOGGER.error("Erro Creating Blank Sheet", e);
			return null;
		}

		CharacterSheet cs = new CharacterSheet();
		cs.age = "newborn";
		cs.basicFP = 0;
		cs.basicHP = 0;
		cs.basicLift = 0;
		cs.basicMove = 0;
		cs.basicSpeed = 0.0;
		cs.birthday = "today";
		cs.campaign = "new";
		cs.carryOnBack = 0;
		cs.checkFourHP = 0;
		cs.checkOneHP = 0;
		cs.checkThreeHP = 0;
		cs.checkTwoHP = 0;
		cs.collapseFP = 0;
		cs.collapseHP = 0;
		cs.currentFP = 0;
		cs.currentHP = 0;
		cs.deadHP = 0;
		cs.dexterity = 0;
		cs.eyeDR = 0;
		cs.eyes = "two, brown";
		cs.faceDR = 0;
		cs.footDR = 0;
		cs.fright = 0;
		cs.gender = "indeterminate";
		cs.groinDR = 0;
		cs.hair = "fine, light";
		cs.hand = "right";
		cs.health = 0;
		cs.heavyLoad = 0;
		cs.height = "short";
		cs.intelligence = 0;
		cs.leftArmDR = 0;
		cs.leftLegDR = 0;
		cs.lightLoad = 0;
		cs.mediumLoad = 0;
		cs.name = "New Character";
		cs.neckDR = 0;
		cs.perception = 0;
		cs.player = "new player";
		cs.race = "Human";
		cs.reelingHP = 0;
		cs.religion = "agnostic";
		cs.rightArmDR = 0;
		cs.rightLegDR = 0;
		cs.runningShoveKnockOver = 0;
		cs.shiftSlightly = 0;
		cs.shoveKnockOver = 0;
		cs.size = 0;
		cs.skin = "some color of skin";
		cs.skullDR = 0;
		cs.smellTaste = 0;
		cs.strength = 0;
		cs.tiredFP = 0;
		cs.tl = 0;
		cs.torsoDR = 0;
		cs.touch = 0;
		cs.twoHandLift = 0;
		cs.unconsciousFP = 0;
		cs.vision = 0;
		cs.vitalsDR = 0;
		cs.weight = "smol";
		cs.will = 0;
		cs.xHeavyLoad = 0;
		try {
			csheetDao.create(cs);
			csheetDao.assignEmptyForeignCollection(cs, "skills");
			csheetDao.assignEmptyForeignCollection(cs, "advantages");
			csheetDao.assignEmptyForeignCollection(cs, "melee_attacks");
			csheetDao.assignEmptyForeignCollection(cs, "ranged_attacks");
			csheetDao.assignEmptyForeignCollection(cs, "equipment");
		} catch (SQLException e) {
			LOGGER.error("Error Populating Blank Sheet", e);
		}
		Advantage adv = new Advantage();
		AdvantageContainer advc = new AdvantageContainer();
		adv.setContainer(advc);
		adv.setDescription("Some Advantage is granted");
		
		adv.setHasLevels(false);
		adv.setLevel(0);
		adv.setName("An Advantage");
		adv.setPageRef("-");
		adv.setModifiers("Some Modifier");
		adv.setNotes("some notes on an advantage");
		advc.setModifiers("None");
		advc.setModifiers("Some advantage container modifiers");
		advc.setNotes("Some advantage container notes");
		advc.setName("Advantage Container Name");
		
		
		Skill sk = new Skill();
		sk.name = "New Skill";
		sk.pageRef = "-";
		SkillContainer sc = new SkillContainer();
		sc.setName("skill container");
		sk.setPageRef("-");
		sk.setPts(1);
		sk.setSl(1);
		sk.setRsl("DX+1");

		Skill csk = new Skill();
		csk.setCharacterSheet(cs);
		csk.setContainer(sc);
		csk.setName("contained skill");
		csk.setPts(1);
		csk.setSl(1);
		csk.setPageRef("-");
		csk.setRsl("IQ+1");

		cs.getSkills().add(sk);
		cs.getSkills().add(csk);

		MeleeAttack ma = new MeleeAttack();
		ma.setName("A Melee Attack");
		ma.setDamage("1d-6");
		ma.setLevel(1);
		ma.setParry("no");
		ma.setBlock("no");
		ma.setReach("1,C");
		ma.setSt("1");
		ma.setUsage("Swing");

		cs.getMeleeAttacks().add(ma);

		RangedAttack ra = new RangedAttack();
		ra.setName("A Ranged Attack");
		ra.setBulk("1");
		ra.setDamage("1d-6");
		ra.setLevel(1);
		ra.setRd("-");
		ra.setRof("1(T)");
		ra.setRange("100/1000");
		ra.setShots("1");
		ra.setUsage("Thrown");
		ra.setSt("1");

		cs.getRangedAttacks().add(ra);

		EquipmentContainer ec = new EquipmentContainer();
		ec.setName("A Bag");
		ec.setEquipped(true);
		ec.setNotes("just a bag");
		ec.setPageRef("-");

		Equipment item = new Equipment();
		item.setName("stuff");
		item.setContainer(ec);
		item.setCost(0.0);
		item.setEquipped(true);
		
		cs.getEquipment().add(item);
		
		try {
			csheetDao.update(cs);
		} catch (SQLException e) {
			LOGGER.error("Error Updating Blank Sheet", e);
		}

		return cs;
	}
}
