package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.CreateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.UpdateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.CreateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.DeleteProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetAllProgrammingTechnologyTypesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetByIdProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.UpdateProgrammingTechnologyTypeResponse;

public interface ProgrammingTechnologyTypeService {
	
	 List<GetAllProgrammingTechnologyTypesResponse> getAll();

	    GetByIdProgrammingTechnologyTypeResponse getById(Long id);

	    CreateProgrammingTechnologyTypeResponse create(CreateProgrammingTechnologyTypeRequest request);

	    UpdateProgrammingTechnologyTypeResponse update(UpdateProgrammingTechnologyTypeRequest request);

	    DeleteProgrammingTechnologyTypeResponse deleteById(Long id);
}
