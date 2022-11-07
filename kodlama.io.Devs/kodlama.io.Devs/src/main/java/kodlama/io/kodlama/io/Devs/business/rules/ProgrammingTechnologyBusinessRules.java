package kodlama.io.kodlama.io.Devs.business.rules;

import org.springframework.stereotype.Component;

import kodlama.io.kodlama.io.Devs.dataAccess.ProgrammingTechnologyRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnology;
import kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnology.ProgrammingTechnologyNotFoundException;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProgrammingTechnologyBusinessRules {
	
	private final ProgrammingTechnologyRepository programmingTechnologyRepository;

    public void programmingTechnologyNameMustBeUniqueWhenCreating(ProgrammingTechnology programmingTechnology) {
        ProgrammingTechnology existence = programmingTechnologyRepository.findAll().stream().filter(p -> p.getName().equalsIgnoreCase(programmingTechnology.getName())).findAny().orElse(null);
        if (existence != null) throw new RuntimeException("Programming technology name exist.");
    }

    public void programmingTechnologyNameMustBeUniqueWhenUpdating(ProgrammingTechnology programmingTechnology) {
        ProgrammingTechnology existence = programmingTechnologyRepository.findAll().stream().filter(p -> p.getName().equalsIgnoreCase(programmingTechnology.getName()) && p.getId() != programmingTechnology.getId()).findAny().orElse(null);
        if (existence != null) throw new RuntimeException("Programming technology name exist.");
    }

    public void programmingTechnologyMustExistWhenRequested(Long id) {
        programmingTechnologyRepository
                .findById(id).orElseThrow(() -> new ProgrammingTechnologyNotFoundException("Requested programming technology does not exist."));
    }

}
