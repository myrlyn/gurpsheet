package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ranged_attack")

public class RangedAttack {
	@DatabaseField(generatedId = true)
	private long id;
	@DatabaseField(columnName = "name",canBeNull=false)
	String name;
	@DatabaseField(columnName = "usage")
	String usage;
	@DatabaseField(columnName = "level")
	int level;
	@DatabaseField(columnName = "acc")
	int acc;
	@DatabaseField(columnName = "damage")
	String damage;
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


	public String getUsage() {
		return usage;
	}


	public void setUsage(String usage) {
		this.usage = usage;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getAcc() {
		return acc;
	}


	public void setAcc(int acc) {
		this.acc = acc;
	}


	public String getDamage() {
		return damage;
	}


	public void setDamage(String damage) {
		this.damage = damage;
	}


	public String getRange() {
		return range;
	}


	public void setRange(String range) {
		this.range = range;
	}


	public String getRof() {
		return rof;
	}


	public void setRof(String rof) {
		this.rof = rof;
	}


	public String getShots() {
		return shots;
	}


	public void setShots(String shots) {
		this.shots = shots;
	}


	public String getBulk() {
		return bulk;
	}


	public void setBulk(String bulk) {
		this.bulk = bulk;
	}


	public String getRd() {
		return rd;
	}


	public void setRd(String rd) {
		this.rd = rd;
	}


	public String getSt() {
		return st;
	}


	public void setSt(String st) {
		this.st = st;
	}


	

	public void setCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet = characterSheet;
	}


	@DatabaseField(columnName = "range")
	String range;
	@DatabaseField(columnName = "rof")
	String rof;
	@DatabaseField(columnName = "shots")
	String shots;
	@DatabaseField(columnName = "bulk")
	String bulk;
	@DatabaseField(columnName = "rd")
	String rd;
	@DatabaseField(columnName = "st")
	String st;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "character_sheet")
	CharacterSheet characterSheet;	
	
	
	public RangedAttack() {
		// TODO Auto-generated constructor stub
	}

}
