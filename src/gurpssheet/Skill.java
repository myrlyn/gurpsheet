package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "skill")

public class Skill {

	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(columnName = "name",canBeNull=false)
	String name;
		
	@DatabaseField(columnName = "sl")
	long sl;
	
	@DatabaseField(columnName = "rsl")
	String rsl;
	
	@DatabaseField(columnName = "pts")
	long pts;
	
	@DatabaseField(columnName = "page_ref")
	String pageRef;
	
	@DatabaseField(columnName = "container",foreign=true)
	SkillContainer container;
	@DatabaseField(columnName = "character_sheet",foreign=true)
	private CharacterSheet characterSheet;

	public void setCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet = characterSheet;
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

	public long getSl() {
		return sl;
	}

	public void setSl(long sl) {
		this.sl = sl;
	}

	public String getRsl() {
		return rsl;
	}

	public void setRsl(String rsl) {
		this.rsl = rsl;
	}

	public long getPts() {
		return pts;
	}

	public void setPts(long pts) {
		this.pts = pts;
	}

	public String getPageRef() {
		return pageRef;
	}

	public void setPageRef(String pageRef) {
		this.pageRef = pageRef;
	}

	public SkillContainer getContainer() {
		return container;
	}

	public void setContainer(SkillContainer container) {
		this.container = container;
	}
}
