package com.example.democyber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemocyberApplication {

    // private static final String GITHUB_TOKEN = "ghp_1234567890abcdef1234567890abcdef1234";

    // FAUX secret pour le TP3 - Gitleaks doit l'attraper

    private static final String SECRET_TEST = "1234567890";

    public static void main(String[] args) {
        SpringApplication.run(DemocyberApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Helloo from Democyber 123!";
    }

}
