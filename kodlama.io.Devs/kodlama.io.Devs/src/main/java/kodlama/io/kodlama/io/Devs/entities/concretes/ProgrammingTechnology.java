package kodlama.io.kodlama.io.Devs.entities.concretes;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programming_technology")
public class ProgrammingTechnology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "programming_technology_type_id", referencedColumnName = "id")
	@JsonBackReference
	private ProgrammingTechnologyType programmingTechnologyType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "programming_language_id", referencedColumnName = "id")
	@JsonBackReference
	private ProgrammingLanguage programmingLanguage;
}
