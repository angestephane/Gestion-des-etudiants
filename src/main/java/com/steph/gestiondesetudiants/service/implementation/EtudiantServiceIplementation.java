package com.steph.gestiondesetudiants.service.implementation;

import com.steph.gestiondesetudiants.entity.Etudiant;
import com.steph.gestiondesetudiants.repository.EtudiantRepository;
import com.steph.gestiondesetudiants.service.EtudiantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceIplementation implements EtudiantService {
    private EtudiantRepository etudiantRepository;

    public EtudiantServiceIplementation(EtudiantRepository etudiantRepository) {
        super();
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }
}
