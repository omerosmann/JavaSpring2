package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.CreateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.UpdateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.CreateProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.DeleteProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetAllProgrammingTechnologiesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetByIdProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.UpdateProgrammingTechnologyResponse;

public interface ProgrammingTechnologyService {
	List<GetAllProgrammingTechnologiesResponse> getAll();

    GetByIdProgrammingTechnologyResponse getById(Long id);

    CreateProgrammingTechnologyResponse create(CreateProgrammingTechnologyRequest request);

    UpdateProgrammingTechnologyResponse update(UpdateProgrammingTechnologyRequest request);

    DeleteProgrammingTechnologyResponse deleteById(Long id);
}
