package estudo.java.gestao_vagas.modules.candidate.controllers;

import estudo.java.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {


    @PostMapping
    public void create(@Valid @RequestBody CandidateEntity candidate){

        System.out.println(candidate.getName());
    }
}
