package kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology;

import lombok.Data;

@Data
public class CreateProgrammingTechnologyRequest {
	private Long programmingLanguageId;
    private Long programmingTechnologyTypeId;
    private String name;
}
