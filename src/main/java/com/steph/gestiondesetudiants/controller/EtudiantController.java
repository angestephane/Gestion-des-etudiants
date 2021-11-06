package com.steph.gestiondesetudiants.controller;

import com.steph.gestiondesetudiants.repository.EtudiantRepository;
import com.steph.gestiondesetudiants.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtudiantController {
    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        super();
        this.etudiantService = etudiantService;
    }

    //méthode de gestions des étudiants
    @GetMapping("/etudiant")
    public String listeEtudiant(Model model){
        model.addAttribute("etudiant", etudiantService.getAllEtudiant());
        return "etudiant";
    }
}
