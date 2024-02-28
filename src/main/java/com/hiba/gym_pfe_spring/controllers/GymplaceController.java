package com.hiba.gym_pfe_spring.controllers;

import com.hiba.gym_pfe_spring.entities.Gymplace;
import com.hiba.gym_pfe_spring.services.GymplaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gymplace")
public class GymplaceController {
    private final GymplaceServices gymSer;
    @Autowired
    public GymplaceController (GymplaceServices gymSer) {
        this.gymSer = gymSer;
    }
    @GetMapping("/get")
    public ResponseEntity <List<Gymplace>> getAllgymplaces(){
        List<Gymplace> Gymplaces =gymSer.getAllgymplaces();
        return ResponseEntity.ok(Gymplaces);
    }
    @PostMapping("/create")
    public ResponseEntity <Gymplace> creatgymplace(@RequestBody Gymplace jp){
        Gymplace sgp=gymSer.Savegymplace(jp);
        return ResponseEntity.status(HttpStatus.CREATED).body(sgp);

    }
    @DeleteMapping("del/{id}")
    public ResponseEntity<Void> deleteEquipmentById(@PathVariable Long id) {
        gymSer.Deletgymplacebyid(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Gymplace> getGymPlaceById(@PathVariable Long id) {
        return gymSer.getgymplacebyid(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
