package kodlama.io.kodlama.io.Devs.business.rules;

import org.springframework.stereotype.Component;

import kodlama.io.kodlama.io.Devs.dataAccess.ProgrammingTechnologyTypeRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnologyType;
import kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnology.ProgrammingTechnologyTypeNotFoundException;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProgrammingTechnologyTypeBusinessRules {
	
	private final ProgrammingTechnologyTypeRepository programmingTechnologyTypeRepository;

    public void programmingTechnologyTypeNameMustBeUniqueWhenCreating(ProgrammingTechnologyType programmingTechnologyType) {
        ProgrammingTechnologyType existence = programmingTechnologyTypeRepository.findAll().stream().filter(p -> p.getName().equalsIgnoreCase(programmingTechnologyType.getName())).findAny().orElse(null);
        if (existence != null) throw new RuntimeException("Programming Language name exist.");
    }

    public void programmingTechnologyTypeNameMustBeUniqueWhenUpdating(ProgrammingTechnologyType programmingTechnologyType) {
        ProgrammingTechnologyType existence = programmingTechnologyTypeRepository.findAll().stream().filter(p -> p.getName().equalsIgnoreCase(programmingTechnologyType.getName()) && p.getId() != programmingTechnologyType.getId()).findAny().orElse(null);
        if (existence != null) throw new RuntimeException("Programming Language name exist.");
    }

    public void programmingTechnologyTypeMustExistWhenRequested(Long id) {
        programmingTechnologyTypeRepository
                .findById(id).orElseThrow(() -> new ProgrammingTechnologyTypeNotFoundException("Requested programming technology type does not exist."));
    }

}
