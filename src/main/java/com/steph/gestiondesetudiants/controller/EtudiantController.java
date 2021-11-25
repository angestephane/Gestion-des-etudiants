package com.steph.gestiondesetudiants.controller;

import com.steph.gestiondesetudiants.entity.Etudiant;
import com.steph.gestiondesetudiants.service.EtudiantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EtudiantController {
    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        super();
        this.etudiantService = etudiantService;
    }

    @GetMapping("/etudiants")
    public String listetudiant(Model model){
        model.addAttribute("etudiants", etudiantService.getAllEtudiant());
        return "etudiant";
    }

    @GetMapping("/etudiants/nouveau")
    public String callFormToAddStudent(Model model){
        //On créer un model étudiant pour réccuperer les données du formulaire
        Etudiant etudiant = new Etudiant();
        model.addAttribute("etudiant", etudiant);
        return "form";
    }

    @PostMapping("/etudiants")
    public String ajouterEtudiant(@ModelAttribute("etduiant") Etudiant etudiant){
        etudiantService.saveEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    @GetMapping("/etudiant/update/{id}")
    public String callFormToUpdateStudent(@PathVariable Long id,  Model model){
        model.addAttribute("etudiant", etudiantService.getEtudiantById(id));
        return "updateform";
    }

    @PostMapping("/etudiants/{id}")
    public String updateEtudiant(@PathVariable Long id,
                                 @ModelAttribute("etudiant") Etudiant newEtudiantValues,
                                 Model model){
        Etudiant etudiant = etudiantService.getEtudiantById(id);
        etudiant.setNom(newEtudiantValues.getNom());
        etudiant.setPrenom(newEtudiantValues.getPrenom());
        etudiant.setApoge(newEtudiantValues.getApoge());
        etudiant.setEmail(newEtudiantValues.getEmail());

        etudiantService.udpdateEtudiant(etudiant);

        return "redirect:/etudiants";

    }

    @GetMapping("/etudiant/delet/{id}")
    public String deletEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiantById(id);
        return "redirect:/etudiants";
    }
}
