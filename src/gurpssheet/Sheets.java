package gurpssheet;

import java.sql.SQLException;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.ForeignCollection;

@Path("sheets")

public class Sheets {
	@GET
	@Path("new")
	@Produces(MediaType.APPLICATION_JSON)
	public CharacterSheet newSheet() {
		Dao<CharacterSheet, Long> csheetDao = null;
		try {
			csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		cs.collapseFP = 0 ;
		cs.collapseHP = 0;
		cs.currentFP = 0;
		cs.currentHP =0;
		cs.deadHP = 0;
		cs.dexterity = 0;
		cs.eyeDR = 0;
		cs.eyes = "two, brown";
		cs.faceDR = 0;
		cs.footDR =0;
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
		cs.size =0;
		cs.skin = "some color of skin";
		cs.skullDR=0;
		cs.smellTaste = 0;
		cs.strength=0;
		cs.tiredFP=0;
		cs.tl=0;
		cs.torsoDR=0;
		cs.touch=0;
		cs.twoHandLift=0;
		cs.unconsciousFP=0;
		cs.vision=0;
		cs.vitalsDR=0;
		cs.weight="smol";
		cs.will=0;
		cs.xHeavyLoad=0;
		try {
			csheetDao.create(cs);
			csheetDao.assignEmptyForeignCollection(cs, "skills");
			csheetDao.assignEmptyForeignCollection(cs, "advantages");
			csheetDao.assignEmptyForeignCollection(cs, "melee_attacks");
			csheetDao.assignEmptyForeignCollection(cs, "ranged_attacks");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		Collection<Skill> skills =new java.util.LinkedList<>();
		Skill sk= new Skill();
		//sk.characterSheet = cs;
		sk.name="New Skill";
		sk.pageRef="-";
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
		
		
		try {
			csheetDao.update(cs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return cs;
	}
}
