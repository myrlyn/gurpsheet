package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
 
@DatabaseTable(tableName = "skill_container")

public class SkillContainer {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(columnName = "name",canBeNull=false)
	String name;

	@DatabaseField(columnName = "notes",canBeNull=true)
	String notes;

	@DatabaseField(columnName = "modifiers",canBeNull=true)
	String modifiers;

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getModifiers() {
		return modifiers;
	}

	public void setModifiers(String modifiers) {
		this.modifiers = modifiers;
	}
	

}
