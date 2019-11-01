package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "advantage_container")
 
public class AdvantageContainer {
	@DatabaseField(generatedId = true)
	private long id;
	
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

	@DatabaseField(columnName = "name",canBeNull=false)
	String name;
	
	@DatabaseField(columnName = "notes")
	String notes;
	
	@DatabaseField(columnName = "modifiers")
	String modifiers;
	

}
