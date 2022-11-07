package kodlama.io.kodlama.io.Devs.business.mapper.programmingtechnology;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.CreateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.UpdateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.CreateProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.DeleteProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetAllProgrammingTechnologiesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetByIdProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.UpdateProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnology;

@Mapper(componentModel = "spring")
public interface ProgrammingTechnologyMapper {
	
	
	@Mapping(source = "programmingTechnologyTypeId", target = "programmingTechnologyType.id")
    @Mapping(source = "programmingLanguageId", target = "programmingLanguage.id")
    ProgrammingTechnology createProgrammingTechnologyRequestToProgrammingTechnology(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest);

    @Mapping(source = "programmingTechnologyTypeId", target = "programmingTechnologyType.id")
    @Mapping(source = "programmingLanguageId", target = "programmingLanguage.id")
    ProgrammingTechnology updateProgrammingTechnologyRequestToProgrammingTechnology(UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest);

    @Mapping(source = "programmingTechnologyType.name", target = "programmingTechnologyTypeName")
    @Mapping(source = "programmingLanguage.name", target = "programmingLanguageName")
    GetAllProgrammingTechnologiesResponse programmingTechnologyToGetAllProgrammingTechnologiesResponse(ProgrammingTechnology programmingTechnology);

    @Mapping(source = "programmingTechnologyType.name", target = "programmingTechnologyTypeName")
    @Mapping(source = "programmingLanguage.name", target = "programmingLanguageName")
    GetByIdProgrammingTechnologyResponse programmingTechnologyToGetByIdProgrammingTechnologyResponse(ProgrammingTechnology programmingTechnology);

    @Mapping(source = "programmingTechnologyType.name", target = "programmingTechnologyTypeName")
    @Mapping(source = "programmingLanguage.name", target = "programmingLanguageName")
    CreateProgrammingTechnologyResponse programmingTechnologyToCreateProgrammingTechnologyResponse(ProgrammingTechnology programmingTechnology);

    @Mapping(source = "programmingTechnologyType.name", target = "programmingTechnologyTypeName")
    @Mapping(source = "programmingLanguage.name", target = "programmingLanguageName")
    UpdateProgrammingTechnologyResponse programmingTechnologyToUpdateProgrammingTechnologyResponse(ProgrammingTechnology programmingTechnology);

    @Mapping(source = "programmingTechnologyType.name", target = "programmingTechnologyTypeName")
    @Mapping(source = "programmingLanguage.name", target = "programmingLanguageName")
    DeleteProgrammingTechnologyResponse programmingTechnologyToDeleteProgrammingTechnologyResponse(ProgrammingTechnology programmingTechnology);
}
