package kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnology;
import lombok.Data;

@Data
public class GetAllProgrammingTechnologyTypesResponse {
	private Long id;
    private String name;
    private List<ProgrammingTechnology> programmingTechnologies;
}
