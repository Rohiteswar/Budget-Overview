package net.codejava;

import javax.persistence.*;

@Entity
@Table(name = "apply")
public class ApplyProject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	@Column(name = "material", nullable = false, length = 300)
	private String material;
	@Column(name = "software", nullable = false, length = 300)
	private String software;
	@Column(name = "hardware", nullable = false, length = 300)
	private String hardware;
	@Column(name = "equipment", nullable = false, length = 300)
	private String equipment;
	@Column(name = "employees", nullable = false, length = 4)
	private String employees;
	@Column(name = "time", nullable = false, length = 15)
	private String time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
