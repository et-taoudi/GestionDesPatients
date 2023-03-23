package ma.ettaoudi.tp4patientsmvc;

import ma.ettaoudi.tp4patientsmvc.entities.Patient;
import ma.ettaoudi.tp4patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp4PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp4PatientsMvcApplication.class, args);
    }
    @Bean
    //Pour des traitements au démarage
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args ->{
            patientRepository.save(
                    new Patient(null,"Yasmine",new Date(),false,15));
            patientRepository.save(
                    new Patient(null,"Zineb",new Date(),true,10));
            patientRepository.save(
                    new Patient(null,"Amal",new Date(),true,16));
            patientRepository.save(
                    new Patient(null,"Ahmed",new Date(),false,20));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
