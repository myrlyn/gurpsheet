package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "melee_attack")
public class MeleeAttack {
	@DatabaseField(generatedId = true)
	private long id;
	@DatabaseField(columnName = "name",canBeNull=false)
	String name;
	@DatabaseField(columnName = "usage")
	String usage;
	@DatabaseField(columnName = "level")
	long level;
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
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public String getParry() {
		return parry;
	}
	public void setParry(String parry) {
		this.parry = parry;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getReach() {
		return reach;
	}
	public void setReach(String reach) {
		this.reach = reach;
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
	@DatabaseField(columnName = "parry")
	String parry;
	@DatabaseField(columnName = "block")
	String block;
	@DatabaseField(columnName = "damage")
	String damage;
	@DatabaseField(columnName = "reach")
	String reach;
	@DatabaseField(columnName = "st")
	String st;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "character_sheet")
	CharacterSheet characterSheet;
	public MeleeAttack() {
		// TODO Auto-generated constructor stub
	}

}
