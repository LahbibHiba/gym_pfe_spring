package com.hiba.gym_pfe_spring.repository;

import com.hiba.gym_pfe_spring.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
