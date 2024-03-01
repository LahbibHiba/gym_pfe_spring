package com.hiba.gym_pfe_spring.services;

import com.hiba.gym_pfe_spring.entities.Gymplace;
import com.hiba.gym_pfe_spring.repository.GymplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class GymplaceServices {
    private final GymplaceRepository gymrepo;
    @Autowired
    public GymplaceServices(GymplaceRepository gymrepo) {
        this.gymrepo = gymrepo;

    }
//    public List<Gymplace> getAllgymplaces(){
//        return gymrepo.findAll();
//    }
//    public Gymplace Savegymplace(Gymplace gp){
//        return gymrepo.save(gp);
//    }
//    public void Deletgymplacebyid(Long id){
//         gymrepo.deleteById(id);
//    }
//    public Optional<Gymplace> getgymplacebyid(Long id){
//        return gymrepo.findById(id);
//    }
}
