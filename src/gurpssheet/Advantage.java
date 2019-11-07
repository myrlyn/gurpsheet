package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
@DatabaseTable(tableName = "advantage")
public class Advantage {
	
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(columnName = "name",canBeNull=false)
	String name;
	
	@DatabaseField(columnName = "container",foreign = true, canBeNull=true)
	AdvantageContainer container;
	
	@DatabaseField(columnName = "has_levels")
	boolean hasLevels;
	
	@DatabaseField(columnName = "level")
	long level;
	
	@DatabaseField(columnName = "description")
	String description;
	
	@DatabaseField(columnName = "page_ref")
	String pageRef;
	
	@DatabaseField(columnName = "character_sheet", foreign=true)
	private transient CharacterSheet characterSheet;
	
	@DatabaseField(columnName = "notes")
	String notes;
	
	@DatabaseField(columnName = "modifiers")
	String modifiers;
	
	
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


	public AdvantageContainer getContainer() {
		return container;
	}


	public void setContainer(AdvantageContainer container) {
		this.container = container;
	}


	public boolean isHasLevels() {
		return hasLevels;
	}


	public void setHasLevels(boolean hasLevels) {
		this.hasLevels = hasLevels;
	}


	public long getLevel() {
		return level;
	}


	public void setLevel(long level) {
		this.level = level;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPageRef() {
		return pageRef;
	}


	public void setPageRef(String pageRef) {
		this.pageRef = pageRef;
	}


	public Advantage() {
		// default constructor
	}

}
