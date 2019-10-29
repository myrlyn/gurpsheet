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
	CharacterSheet characterSheet;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet = characterSheet;
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
		// TODO Auto-generated constructor stub
	}

}
