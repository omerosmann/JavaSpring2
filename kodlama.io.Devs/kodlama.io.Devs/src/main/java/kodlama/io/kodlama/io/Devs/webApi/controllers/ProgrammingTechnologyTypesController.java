package kodlama.io.kodlama.io.Devs.webApi.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingTechnologyTypeService;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.CreateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.UpdateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.CreateProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.DeleteProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetAllProgrammingTechnologyTypesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.GetByIdProgrammingTechnologyTypeResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnologytype.UpdateProgrammingTechnologyTypeResponse;

import java.util.List;

@RestController
@RequestMapping("/api/programmingTechnologyTypes")
@RequiredArgsConstructor
public class ProgrammingTechnologyTypesController {
	
	 private final ProgrammingTechnologyTypeService programmingTechnologyTypeService;

	    @GetMapping
	    public List<GetAllProgrammingTechnologyTypesResponse> getAll() {
	        return programmingTechnologyTypeService.getAll();
	    }

	    @GetMapping("/{id}")
	    public GetByIdProgrammingTechnologyTypeResponse getById(@PathVariable("id") Long id) {
	        return programmingTechnologyTypeService.getById(id);
	    }

	    @PostMapping
	    public CreateProgrammingTechnologyTypeResponse create(CreateProgrammingTechnologyTypeRequest request) {
	        return programmingTechnologyTypeService.create(request);
	    }

	    @PutMapping
	    public UpdateProgrammingTechnologyTypeResponse update(UpdateProgrammingTechnologyTypeRequest request) {
	        return programmingTechnologyTypeService.update(request);
	    }

	    @DeleteMapping("/{id}")
	    public DeleteProgrammingTechnologyTypeResponse delete(@PathVariable("id") Long id) {
	        return programmingTechnologyTypeService.deleteById(id);
	    }
}
