package kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology;

import lombok.Data;

@Data
public class UpdateProgrammingTechnologyRequest {
	
	private Long id;
	private Long programmingLanguageId;
	private Long programmingTechnologyTypeId;
	private String name;
}
