package kodlama.io.kodlama.io.Devs.webApi.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.CreateProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.DeleteProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.responses.programminglanguage.UpdateProgrammingLanguageResponse;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
@RequiredArgsConstructor
public class ProgrammingLanguagesController {
	
	private final ProgrammingLanguageService programmingLanguageService;

    @GetMapping
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdProgrammingLanguageResponse> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(programmingLanguageService.getById(id));
    }

    @PostMapping
    public ResponseEntity<CreateProgrammingLanguageResponse> create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        return ResponseEntity.ok(programmingLanguageService.create(createProgrammingLanguageRequest));
    }

    @PutMapping
    public ResponseEntity<UpdateProgrammingLanguageResponse> update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        return ResponseEntity.ok(programmingLanguageService.update(updateProgrammingLanguageRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeleteProgrammingLanguageResponse> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(programmingLanguageService.deleteById(id));
    }
}
