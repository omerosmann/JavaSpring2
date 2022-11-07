package kodlama.io.kodlama.io.Devs.webApi.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingTechnologyService;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.CreateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnology.UpdateProgrammingTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.CreateProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.DeleteProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetAllProgrammingTechnologiesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.GetByIdProgrammingTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programmingtechnology.UpdateProgrammingTechnologyResponse;

import java.util.List;

@RestController
@RequestMapping("/api/programmingTechnologies")
@RequiredArgsConstructor
public class ProgrammingTechnologiesController {
	
	private final ProgrammingTechnologyService programmingTechnologyService;

    @GetMapping
    public List<GetAllProgrammingTechnologiesResponse> getAll() {
        return programmingTechnologyService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdProgrammingTechnologyResponse getById(@PathVariable("id") Long id) {
        return programmingTechnologyService.getById(id);
    }

    @PostMapping
    public CreateProgrammingTechnologyResponse create(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) {
        return programmingTechnologyService.create(createProgrammingTechnologyRequest);
    }

    @PutMapping
    public UpdateProgrammingTechnologyResponse update(UpdateProgrammingTechnologyRequest request) {
        return programmingTechnologyService.update(request);
    }

    @DeleteMapping("/{id}")
    public DeleteProgrammingTechnologyResponse delete(@PathVariable("id") Long id) {
        return programmingTechnologyService.deleteById(id);
    }
}
