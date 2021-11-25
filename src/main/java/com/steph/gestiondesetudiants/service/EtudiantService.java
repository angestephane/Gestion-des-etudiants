package com.steph.gestiondesetudiants.service;

import com.steph.gestiondesetudiants.entity.Etudiant;

/** Cette interface permet de definir
 * toutes les méthodes (services)
 * qui dont on aura besoin pour
 * l'entité etudiant**/

import java.util.List;

public interface EtudiantService {
   List<Etudiant> getAllEtudiant();
   Etudiant saveEtudiant(Etudiant etudiant);
   Etudiant getEtudiantById(Long id);
   Etudiant udpdateEtudiant(Etudiant etudiant);
   void deleteEtudiantById(Long id);
}
