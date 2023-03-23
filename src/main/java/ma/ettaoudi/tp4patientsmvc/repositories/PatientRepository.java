package ma.ettaoudi.tp4patientsmvc.repositories;

import ma.ettaoudi.tp4patientsmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient>findByNomContaining(String kw, Pageable pageable);
}
