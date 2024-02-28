package com.hiba.gym_pfe_spring.services;

import com.hiba.gym_pfe_spring.entities.Equipement;
import com.hiba.gym_pfe_spring.entities.Gymplace;
import com.hiba.gym_pfe_spring.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementServices {
    private final EquipementRepository equirepo;
    @Autowired
    public EquipementServices(EquipementRepository equirepo) {
        this.equirepo = equirepo;
    }
    public List<Equipement> getAllequipement(){
        return equirepo.findAll();
    }
    public Equipement Saveequipement(Equipement eq){
        return equirepo.save(eq);
    }
    public void Deletequipementbyid(Long id){
        equirepo.deleteById(id);
    }
    public Optional<Equipement> getequipementbyid(Long id){
        return equirepo.findById(id);
    }
}
