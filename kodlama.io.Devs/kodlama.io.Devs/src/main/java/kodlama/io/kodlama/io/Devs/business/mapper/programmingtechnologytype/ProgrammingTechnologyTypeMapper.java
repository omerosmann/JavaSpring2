package kodlama.io.kodlama.io.Devs.business.mapper.programmingtechnologytype;




import org.mapstruct.Mapper;

import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.CreateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.UpdateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.CreateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.DeleteProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetAllProgrammingTechnologyTypesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetByIdProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.UpdateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnologyType;


@Mapper(componentModel = "spring")
public interface ProgrammingTechnologyTypeMapper {
	 ProgrammingTechnologyType createProgrammingTechnologyTypeRequestToProgrammingTechnologyType(CreateProgrammingTechnologyTypeRequest createProgrammingTechnologyTypeRequest);

	    ProgrammingTechnologyType updateProgrammingTechnologyTypeRequestToProgrammingTechnologyType(UpdateProgrammingTechnologyTypeRequest updateProgrammingTechnologyTypeRequest);

	    GetAllProgrammingTechnologyTypesResponse programmingTechnologyTypeToGetAllProgrammingTechnologyTypesResponse(ProgrammingTechnologyType ProgrammingTechnologyType);

	    GetByIdProgrammingTechnologyTypeResponse programmingTechnologyTypeToGetByIdProgrammingTechnologyTypeResponse(ProgrammingTechnologyType ProgrammingTechnologyType);

	    CreateProgrammingTechnologyTypeResponse programmingTechnologyTypeToCreateProgrammingTechnologyTypeResponse(ProgrammingTechnologyType ProgrammingTechnologyType);

	    UpdateProgrammingTechnologyTypeResponse programmingTechnologyTypeToUpdateProgrammingTechnologyTypeResponse(ProgrammingTechnologyType ProgrammingTechnologyType);

	    DeleteProgrammingTechnologyTypeResponse programmingTechnologyTypeToDeleteProgrammingTechnologyTypeResponse(ProgrammingTechnologyType ProgrammingTechnologyType);
}
