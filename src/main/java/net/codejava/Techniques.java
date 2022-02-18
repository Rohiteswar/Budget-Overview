package net.codejava;

import javax.persistence.*;

@Entity
@Table(name = "techniques")
public class Techniques {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 65)
	private String name;

	@Column(name = "definition", nullable = false, length = 500)
	private String definition;

	@Column(name = "recommendations", nullable = false, length = 500)
	private String recommendations;

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

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

}
