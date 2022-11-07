package kodlama.io.kodlama.io.Devs.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingTechnology;

@Repository
public interface ProgrammingTechnologyRepository extends JpaRepository<ProgrammingTechnology, Long>{

}
