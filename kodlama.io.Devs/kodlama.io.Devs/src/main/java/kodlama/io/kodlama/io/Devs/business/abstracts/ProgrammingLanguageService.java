package kodlama.io.kodlama.io.Devs.business.abstracts;


import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.CreateProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.DeleteProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.UpdateProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	
	List<GetAllProgrammingLanguagesResponse> getAll();

    GetByIdProgrammingLanguageResponse getById(Long id);

    CreateProgrammingLanguageResponse create(CreateProgrammingLanguageRequest createRequest);

    UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateRequest);

    DeleteProgrammingLanguageResponse deleteById(Long id);
}
