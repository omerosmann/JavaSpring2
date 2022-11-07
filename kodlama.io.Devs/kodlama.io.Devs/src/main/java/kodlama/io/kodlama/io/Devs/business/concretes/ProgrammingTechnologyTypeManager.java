package kodlama.io.kodlama.io.Devs.business.concretes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingTechnologyTypeService;
import kodlama.io.kodlama.io.Devs.business.mapper.programmingtechnologytype.ProgrammingTechnologyTypeMapper;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.CreateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.UpdateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.CreateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.DeleteProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetAllProgrammingTechnologyTypesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetByIdProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.UpdateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.rules.ProgrammingTechnologyTypeBusinessRules;
import kodlama.io.kodlama.io.Devs.dataAccess.ProgrammingTechnologyTypeRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnologyType;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProgrammingTechnologyTypeManager implements ProgrammingTechnologyTypeService{
	
	 private final ProgrammingTechnologyTypeRepository programmingTechnologyTypeRepository;
	    private final ProgrammingTechnologyTypeMapper mapper;
	    private final ProgrammingTechnologyTypeBusinessRules businessRules;


	    @Override
	    public List<GetAllProgrammingTechnologyTypesResponse> getAll() {
	        return programmingTechnologyTypeRepository.findAll().stream()
	                .map(p -> mapper.programmingTechnologyTypeToGetAllProgrammingTechnologyTypesResponse(p)).collect(Collectors.toList());
	    }

	    @Override
	    public GetByIdProgrammingTechnologyTypeResponse getById(Long id) {
	        businessRules.programmingTechnologyTypeMustExistWhenRequested(id);
	        return mapper.programmingTechnologyTypeToGetByIdProgrammingTechnologyTypeResponse(programmingTechnologyTypeRepository.findById(id).get());
	    }

	    @Override
	    @Validated
	    public CreateProgrammingTechnologyTypeResponse create(CreateProgrammingTechnologyTypeRequest request) {
	        ProgrammingTechnologyType programmingTechnologyType = mapper.createProgrammingTechnologyTypeRequestToProgrammingTechnologyType(request);
	        businessRules.programmingTechnologyTypeNameMustBeUniqueWhenCreating(programmingTechnologyType);
	        return mapper.programmingTechnologyTypeToCreateProgrammingTechnologyTypeResponse(programmingTechnologyTypeRepository.save(programmingTechnologyType));
	    }

	    @Override
	    @Validated
	    public UpdateProgrammingTechnologyTypeResponse update(UpdateProgrammingTechnologyTypeRequest request) {
	        businessRules.programmingTechnologyTypeMustExistWhenRequested(request.getId());
	        ProgrammingTechnologyType programmingTechnologyTypeToUpdate = programmingTechnologyTypeRepository.findById(request.getId()).get();

	        ProgrammingTechnologyType programmingTechnologyType = mapper.updateProgrammingTechnologyTypeRequestToProgrammingTechnologyType(request);
	        businessRules.programmingTechnologyTypeNameMustBeUniqueWhenUpdating(programmingTechnologyType);

	        programmingTechnologyTypeToUpdate.setName(programmingTechnologyType.getName());
	        return mapper.programmingTechnologyTypeToUpdateProgrammingTechnologyTypeResponse(programmingTechnologyTypeRepository.save(programmingTechnologyTypeToUpdate));
	    }

	    @Override
	    public DeleteProgrammingTechnologyTypeResponse deleteById(Long id) {
	        businessRules.programmingTechnologyTypeMustExistWhenRequested(id);
	        ProgrammingTechnologyType programmingTechnologyType = programmingTechnologyTypeRepository.findById(id).get();
	        programmingTechnologyTypeRepository.deleteById(id);
	        return mapper.programmingTechnologyTypeToDeleteProgrammingTechnologyTypeResponse(programmingTechnologyType);
	    }
}
