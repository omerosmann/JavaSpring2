package kodlama.io.kodlama.io.Devs.business.concretes;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.mapper.programminglanguage.ProgrammingLanguageMapper;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.CreateProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.DeleteProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.UpdateProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.rules.ProgrammingLanguageBusinessRules;
import kodlama.io.kodlama.io.Devs.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import lombok.RequiredArgsConstructor;


import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private final ProgrammingLanguageRepository programmingLanguageRepository;
    private final ProgrammingLanguageBusinessRules programmingLanguageBusinessRules;
    private final ProgrammingLanguageMapper programmingLanguageMapper;

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguageRepository.findAll().stream()
                .map(p -> programmingLanguageMapper.programmingLanguageToGetAllProgrammingLanguagesResponse(p))
                .collect(Collectors.toList());
    }

    @Override
    public GetByIdProgrammingLanguageResponse getById(Long id) {
        programmingLanguageBusinessRules.programmingLanguageMustExistWhenRequested(id);
        return programmingLanguageMapper
                .programmingLanguageToGetByIdProgrammingLanguageResponse(programmingLanguageRepository.findById(id).get());
    }

    @Override
    @Validated
    public CreateProgrammingLanguageResponse create(CreateProgrammingLanguageRequest createRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageMapper
                .createProgrammingLanguageRequestToProgrammingLanguage(createRequest);

        programmingLanguageBusinessRules.programmingLanguageNameMustBeUniqueWhenCreating(programmingLanguage);

        return programmingLanguageMapper.programmingLanguageToCreateProgrammingLanguageResponse(
                programmingLanguageRepository.save(programmingLanguage)
        );
    }

    @Override
    @Validated
    public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateRequest) {
        programmingLanguageBusinessRules.programmingLanguageMustExistWhenRequested(updateRequest.getId());

        ProgrammingLanguage programmingLanguage = programmingLanguageMapper
                .updateProgrammingLanguageRequestToProgrammingLanguage(updateRequest);

        programmingLanguageBusinessRules.programmingLanguageNameMustBeUniqueWhenUpdating(programmingLanguage);

        return programmingLanguageMapper.programmingLanguageToUpdateProgrammingLanguageResponse(
                programmingLanguageRepository.save(programmingLanguage)
        );
    }

    @Override
    public DeleteProgrammingLanguageResponse deleteById(Long id) {
        programmingLanguageBusinessRules.programmingLanguageMustExistWhenRequested(id);

        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        programmingLanguageRepository.deleteById(programmingLanguage.getId());
        return programmingLanguageMapper.programmingLanguageToDeleteProgrammingLanguageResponse(programmingLanguage);
    }
}
