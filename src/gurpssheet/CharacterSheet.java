/**
 * 
 */
package gurpssheet;

import java.util.Collection;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author jwalker
 *
 */
@DatabaseTable(tableName = "character_sheet")
public class CharacterSheet {

	/**
	 * 
	 */
	public CharacterSheet() {
		// TODO Auto-generated constructor stub
	}

	@DatabaseField(generatedId = true)
	private long id;
	@DatabaseField(columnName = "name")
	String name;
	@DatabaseField(columnName = "religion")
	String religion;
	@DatabaseField(columnName = "birthday")
	String birthday;
	@DatabaseField(columnName = "player")
	String player;
	@DatabaseField(columnName = "campaign")
	String campaign;
	@DatabaseField(columnName = "created_on")
	String createdOn;
	@DatabaseField(columnName = "race")
	String race;
	@DatabaseField(columnName = "gender")
	String gender;
	@DatabaseField(columnName = "age")
	String age;
	@DatabaseField(columnName = "height")
	String height;
	@DatabaseField(columnName = "weight")
	String weight;
	@DatabaseField(columnName = "size")
	int size;
	@DatabaseField(columnName = "tl")
	int tl;
	@DatabaseField(columnName = "hair")
	String hair;
	@DatabaseField(columnName = "eyes")
	String eyes;
	@DatabaseField(columnName = "skin")
	String skin;
	@DatabaseField(columnName = "hand")
	String hand;
	@DatabaseField(columnName = "strength")
	long strength;
	@DatabaseField(columnName = "dexterity")
	long dexterity;
	@DatabaseField(columnName = "intelligence")
	long intelligence;
	@DatabaseField(columnName = "health")
	long health;
	@DatabaseField(columnName = "will")
	long will;
	@DatabaseField(columnName = "fright")
	long fright;
	@DatabaseField(columnName = "basic_move")
	long basicMove;
	@DatabaseField(columnName = "basic_speed")
	double basicSpeed;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTl() {
		return tl;
	}

	public void setTl(int tl) {
		this.tl = tl;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public long getStrength() {
		return strength;
	}

	public void setStrength(long strength) {
		this.strength = strength;
	}

	public long getDexterity() {
		return dexterity;
	}

	public void setDexterity(long dexterity) {
		this.dexterity = dexterity;
	}

	public long getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(long intelligence) {
		this.intelligence = intelligence;
	}

	public long getHealth() {
		return health;
	}

	public void setHealth(long health) {
		this.health = health;
	}

	public long getWill() {
		return will;
	}

	public void setWill(long will) {
		this.will = will;
	}

	public long getFright() {
		return fright;
	}

	public void setFright(long fright) {
		this.fright = fright;
	}

	public long getBasicMove() {
		return basicMove;
	}

	public void setBasicMove(long basicMove) {
		this.basicMove = basicMove;
	}

	public double getBasicSpeed() {
		return basicSpeed;
	}

	public void setBasicSpeed(double basicSpeed) {
		this.basicSpeed = basicSpeed;
	}

	public long getPerception() {
		return perception;
	}

	public void setPerception(long perception) {
		this.perception = perception;
	}

	public long getVision() {
		return vision;
	}

	public void setVision(long vision) {
		this.vision = vision;
	}

	public long getSmellTaste() {
		return smellTaste;
	}

	public void setSmellTaste(long smellTaste) {
		this.smellTaste = smellTaste;
	}

	public long getTouch() {
		return touch;
	}

	public void setTouch(long touch) {
		this.touch = touch;
	}

	public long getLightLoad() {
		return lightLoad;
	}

	public void setLightLoad(long lightLoad) {
		this.lightLoad = lightLoad;
	}

	public long getMediumLoad() {
		return mediumLoad;
	}

	public void setMediumLoad(long mediumLoad) {
		this.mediumLoad = mediumLoad;
	}

	public long getHeavyLoad() {
		return heavyLoad;
	}

	public void setHeavyLoad(long heavyLoad) {
		this.heavyLoad = heavyLoad;
	}

	public long getxHeavLoad() {
		return xHeavyLoad;
	}

	public void setxHeavLoad(long xHeavLoad) {
		this.xHeavyLoad = xHeavLoad;
	}

	public long getBasicLift() {
		return basicLift;
	}

	public void setBasicLift(long basicLift) {
		this.basicLift = basicLift;
	}

	public long getTwoHandLift() {
		return twoHandLift;
	}

	public void setTwoHandLift(long twoHandLift) {
		this.twoHandLift = twoHandLift;
	}

	public long getShoveKnockOver() {
		return shoveKnockOver;
	}

	public void setShoveKnockOver(long shoveKnockOver) {
		this.shoveKnockOver = shoveKnockOver;
	}

	public long getRunningShoveKnockOver() {
		return runningShoveKnockOver;
	}

	public void setRunningShoveKnockOver(long runningShoveKnockOver) {
		this.runningShoveKnockOver = runningShoveKnockOver;
	}

	public long getCarryOnBack() {
		return carryOnBack;
	}

	public void setCarryOnBack(long carryOnBack) {
		this.carryOnBack = carryOnBack;
	}

	public long getShiftSlightly() {
		return shiftSlightly;
	}

	public void setShiftSlightly(long shiftSlightly) {
		this.shiftSlightly = shiftSlightly;
	}

	public long getEyeDR() {
		return eyeDR;
	}

	public void setEyeDR(long eyeDR) {
		this.eyeDR = eyeDR;
	}

	public long getSkullDR() {
		return skullDR;
	}

	public void setSkullDR(long skullDR) {
		this.skullDR = skullDR;
	}

	public long getFaceDR() {
		return faceDR;
	}

	public void setFaceDR(long faceDR) {
		this.faceDR = faceDR;
	}

	public long getRightLegDR() {
		return rightLegDR;
	}

	public void setRightLegDR(long rightLegDR) {
		this.rightLegDR = rightLegDR;
	}

	public long getRightArmDR() {
		return rightArmDR;
	}

	public void setRightArmDR(long rightArmDR) {
		this.rightArmDR = rightArmDR;
	}

	public long getTorsoDR() {
		return torsoDR;
	}

	public void setTorsoDR(long torsoDR) {
		this.torsoDR = torsoDR;
	}

	public long getGroinDR() {
		return groinDR;
	}

	public void setGroinDR(long groinDR) {
		this.groinDR = groinDR;
	}

	public long getLeftArmDR() {
		return leftArmDR;
	}

	public void setLeftArmDR(long leftArmDR) {
		this.leftArmDR = leftArmDR;
	}

	public long getLeftLegDR() {
		return leftLegDR;
	}

	public void setLeftLegDR(long leftLegDR) {
		this.leftLegDR = leftLegDR;
	}

	public long getHandDR() {
		return handDR;
	}

	public void setHandDR(long handDR) {
		this.handDR = handDR;
	}

	public long getFootDR() {
		return footDR;
	}

	public void setFootDR(long footDR) {
		this.footDR = footDR;
	}

	public long getNeckDR() {
		return neckDR;
	}

	public void setNeckDR(long neckDR) {
		this.neckDR = neckDR;
	}

	public long getVitalsDR() {
		return vitalsDR;
	}

	public void setVitalsDR(long vitalsDR) {
		this.vitalsDR = vitalsDR;
	}

	public long getCurrentFP() {
		return currentFP;
	}

	public void setCurrentFP(long currentFP) {
		this.currentFP = currentFP;
	}

	public long getBasicFP() {
		return basicFP;
	}

	public void setBasicFP(long basicFP) {
		this.basicFP = basicFP;
	}

	public long getTiredFP() {
		return tiredFP;
	}

	public void setTiredFP(long tiredFP) {
		this.tiredFP = tiredFP;
	}

	public long getCollapseFP() {
		return collapseFP;
	}

	public void setCollapseFP(long collapseFP) {
		this.collapseFP = collapseFP;
	}

	public long getUnconsciousFP() {
		return unconsciousFP;
	}

	public void setUnconsciousFP(long unconsciousFP) {
		this.unconsciousFP = unconsciousFP;
	}

	public long getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(long currentHP) {
		this.currentHP = currentHP;
	}

	public long getBasicHP() {
		return basicHP;
	}

	public void setBasicHP(long basicHP) {
		this.basicHP = basicHP;
	}

	public long getReelingHP() {
		return reelingHP;
	}

	public void setReelingHP(long reelingHP) {
		this.reelingHP = reelingHP;
	}

	public long getCollapseHP() {
		return collapseHP;
	}

	public void setCollapseHP(long collapseHP) {
		this.collapseHP = collapseHP;
	}

	public long getCheckOneHP() {
		return checkOneHP;
	}

	public void setCheckOneHP(long checkOneHP) {
		this.checkOneHP = checkOneHP;
	}

	public long getCheckTwoHP() {
		return checkTwoHP;
	}

	public void setCheckTwoHP(long checkTwoHP) {
		this.checkTwoHP = checkTwoHP;
	}

	public long getCheckThreeHP() {
		return checkThreeHP;
	}

	public void setCheckThreeHP(long checkThreeHP) {
		this.checkThreeHP = checkThreeHP;
	}

	public long getCheckFourHP() {
		return checkFourHP;
	}

	public void setCheckFourHP(long checkFourHP) {
		this.checkFourHP = checkFourHP;
	}

	public long getDeadHP() {
		return deadHP;
	}

	public void setDeadHP(long deadHP) {
		this.deadHP = deadHP;
	}

	public ForeignCollection<MeleeAttack> getMeleeAttacks() {
		return meleeAttacks;
	}

	public void setMeleeAttacks(ForeignCollection<MeleeAttack> meleeAttacks) {
		this.meleeAttacks = meleeAttacks;
	}

	public ForeignCollection<RangedAttack> getRangedAttacks() {
		return rangedAttacks;
	}

	public void setRangedAttacks(ForeignCollection<RangedAttack> rangedAttacks) {
		this.rangedAttacks = rangedAttacks;
	}

	public ForeignCollection<Advantage> getAdvantages() {
		return advantages;
	}

	public void setAdvantages(ForeignCollection<Advantage> advantages) {
		this.advantages = advantages;
	}

	public Collection<Skill> getSkills() {
		return skills;
	}

	
	@DatabaseField(columnName = "perception")
	long perception;
	@DatabaseField(columnName = "vision")
	long vision;
	@DatabaseField(columnName = "smell_taste")
	long smellTaste;
	@DatabaseField(columnName = "touch")
	long touch;
	@DatabaseField(columnName = "light_load")
	long lightLoad;
	@DatabaseField(columnName = "medium_load")
	long mediumLoad;
	@DatabaseField(columnName = "heavy_load")
	long heavyLoad;
	@DatabaseField(columnName = "x_heavy_load")
	long xHeavyLoad;
	@DatabaseField(columnName = "basic_lift")
	long basicLift;
	@DatabaseField(columnName = "two_hand_lift")
	long twoHandLift;
	@DatabaseField(columnName = "shove_knock_over")
	long shoveKnockOver;
	@DatabaseField(columnName = "running_shove_knock_over")
	long runningShoveKnockOver;
	@DatabaseField(columnName = "carry_on_back")
	long carryOnBack;
	@DatabaseField(columnName = "shift_slightly")
	long shiftSlightly;
	@DatabaseField(columnName = "eye_dr")
	long eyeDR;
	@DatabaseField(columnName = "skull_dr")
	long skullDR;
	@DatabaseField(columnName = "face_dr")
	long faceDR;
	@DatabaseField(columnName = "right_leg_dr")
	long rightLegDR;
	@DatabaseField(columnName = "right_arm_dr")
	long rightArmDR;
	@DatabaseField(columnName = "torso_dr")
	long torsoDR;
	@DatabaseField(columnName = "groin_dr")
	long groinDR;
	@DatabaseField(columnName = "left_arm_dr")
	long leftArmDR;
	@DatabaseField(columnName = "left_leg_dr")
	long leftLegDR;
	@DatabaseField(columnName = "hand_dr")
	long handDR;
	@DatabaseField(columnName = "foot_dr")
	long footDR;
	@DatabaseField(columnName = "neck_dr")
	long neckDR;
	@DatabaseField(columnName = "vitals_dr")
	long vitalsDR;
	@DatabaseField(columnName = "current_fp")
	long currentFP;
	@DatabaseField(columnName = "basic_fp")
	long basicFP;
	@DatabaseField(columnName = "tired_fp")
	long tiredFP;
	@DatabaseField(columnName = "collapse_fp")
	long collapseFP;
	@DatabaseField(columnName = "unconscious_fp")
	long unconsciousFP;
	@DatabaseField(columnName = "current_hp")
	long currentHP;
	@DatabaseField(columnName = "basic_hp")
	long basicHP;
	@DatabaseField(columnName = "reeling_hp")
	long reelingHP;
	@DatabaseField(columnName = "collapse_hp")
	long collapseHP;
	@DatabaseField(columnName = "check_one_hp")
	long checkOneHP;
	@DatabaseField(columnName = "check_two_hp")
	long checkTwoHP;
	@DatabaseField(columnName = "check_three_hp")
	long checkThreeHP;
	@DatabaseField(columnName = "check_four_hp")
	long checkFourHP;
	@DatabaseField(columnName = "dead_hp")
	long deadHP;
	@ForeignCollectionField(columnName = "melee_attacks",foreignFieldName = "characterSheet",eager=true)
	private ForeignCollection<MeleeAttack> meleeAttacks = null;
	@ForeignCollectionField(columnName = "ranged_attacks",foreignFieldName = "characterSheet",eager=true)
	private ForeignCollection<RangedAttack> rangedAttacks = null;
	@ForeignCollectionField(columnName = "advantages",foreignFieldName = "characterSheet",eager=true)
	private ForeignCollection<Advantage> advantages = null;
	@ForeignCollectionField(columnName = "skills",foreignFieldName = "characterSheet",eager=true)
	private ForeignCollection<Skill> skills = null;

	public long getxHeavyLoad() {
		return xHeavyLoad;
	}

	public void setxHeavyLoad(long xHeavyLoad) {
		this.xHeavyLoad = xHeavyLoad;
	}

	public void setSkills(ForeignCollection<Skill> skills) {
		this.skills = skills;
	}

}
