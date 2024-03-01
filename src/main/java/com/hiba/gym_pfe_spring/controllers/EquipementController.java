package com.hiba.gym_pfe_spring.controllers;

import com.hiba.gym_pfe_spring.entities.Equipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipement")
public class EquipementController {
    private final EquipementController equiSer;

    @Autowired
    public EquipementController(EquipementController equiSer) {
        this.equiSer = equiSer;
    }
    @GetMapping("/get")
    public ResponseEntity<List<Equipement>> getAllequipement(){
        List<Equipement> equipements = (List<Equipement>) equiSer.getAllequipement();
        return ResponseEntity.ok(equipements);
    }
    @PostMapping("/create")
    public ResponseEntity <Equipement> createquipement(@RequestBody Equipement eq){
        Equipement equ=equiSer.Saveequpement(eq);
        return ResponseEntity.status(HttpStatusCode.CREATED).body(equ);
    }
    @DeleteMapping("del/get")
    public ResponseEntity <Void> deleteEquipementById(@PathVariable Long id){
        equiSer.deleteEquipementById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Equipement> getEquipementById(@PathVariable Long id){
        return equiSer.getEquipementById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
