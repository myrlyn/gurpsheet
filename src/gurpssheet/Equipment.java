package gurpssheet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "equipment")
public class Equipment {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(columnName="equipped")
	private boolean equipped;
	
	@DatabaseField(columnName="name")
	private String name;
	
	@DatabaseField(columnName="notes")
	private String notes;

	@DatabaseField(columnName="cost")
	private double cost;
	
	@DatabaseField(columnName="weight")
	private double weight;
	
	@DatabaseField(columnName="page_ref")
	private String pageRef;
	
	
	@DatabaseField(columnName="container",foreign=true)
	private EquipmentContainer container;

	@DatabaseField(columnName="character_sheet",foreign=true)
	private CharacterSheet characterSheet;

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPageRef() {
		return pageRef;
	}

	public void setPageRef(String pageRef) {
		this.pageRef = pageRef;
	}

	public EquipmentContainer getContainer() {
		return container;
	}

	public void setContainer(EquipmentContainer container) {
		this.container = container;
	}
	
	
	public void setCharacter(CharacterSheet character) {
		this.characterSheet = character;
	}

	
	
}
