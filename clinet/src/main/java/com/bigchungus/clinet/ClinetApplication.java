package com.bigchungus.clinet;

import com.bigchungus.clinet.model.Laboratory;
import com.bigchungus.clinet.repository.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinetApplication implements CommandLineRunner {

    @Autowired
    private LaboratoryRepository labrepo;

    public static void main(String[] args) {
        SpringApplication.run(ClinetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        labrepo.deleteAll();
//
//        labrepo.save(new Laboratory("Clinica 1", "BC", "Tijuana", "Revolucion", 0, 102, "abcde123", "adfa6455", "roro@gmail.com", "roro@gmail.com"));
//        labrepo.save(new Laboratory("Clinica 2", "BC", "Tijuana", "Cuahtemoc", 0, 102, "abcde123", "adfa6455", "charlie@gmail.com", "charlie@gmail.com"));
//        labrepo.save(new Laboratory("Clinica 3", "BC", "Tijuana", "Cuahtemoc", 0, 102, "abcde123", "adfa6455", "charlie@gmail.com", "charlie@gmail.com"));
//        labrepo.save(new Laboratory("Clinica 4", "BC", "Tijuana", "Cuahtemoc", 0, 102, "abcde123", "adfa6455", "charlie@gmail.com", "charlie@gmail.com"));
//        labrepo.save(new Laboratory("Clinica 5", "BC", "Tijuana", "Cuahtemoc", 0, 102, "abcde123", "adfa6455", "charlie@gmail.com", "charlie@gmail.com"));
//        labrepo.save(new Laboratory("Clinica 6", "BC", "Tijuana", "Cuahtemoc", 0, 102, "abcde123", "adfa6455", "charlie@gmail.com", "charlie@gmail.com"));

//        String id;
//        for(Laboratory labs : labrepo.findAll()) {
//            id = labs.getId();
//            System.out.println(labs.getId().substring(0, labs.getId().length() - 1));
//        }
    }
}
