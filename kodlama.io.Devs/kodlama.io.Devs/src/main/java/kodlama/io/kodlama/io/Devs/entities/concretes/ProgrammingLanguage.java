package kodlama.io.kodlama.io.Devs.entities.concretes;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programming_languages")
public class ProgrammingLanguage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "programmingLanguage",
            fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProgrammingTechnology> programmingTechnologies;
}
