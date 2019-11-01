package gurpssheet;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "equipment_container")
public class EquipmentContainer {

	
	@DatabaseField(generatedId = true)
	private long id;

	@DatabaseField(columnName="equipped")
	private boolean equipped;
	
	@DatabaseField(columnName="name")
	private String name;
	
	@DatabaseField(columnName="notes")
	private String notes;
	
	@DatabaseField(columnName="page_ref")
	private String pageRef;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isEquipped() {
		return equipped;
	}

	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
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

	public String getPageRef() {
		return pageRef;
	}

	public void setPageRef(String pageRef) {
		this.pageRef = pageRef;
	}

	
}
