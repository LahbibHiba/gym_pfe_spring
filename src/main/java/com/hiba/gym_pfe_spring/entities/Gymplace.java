package com.hiba.gym_pfe_spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "gymplaces")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gymplace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String addresse;
    @OneToMany(mappedBy = "salle")
    private List<Equipement> equipementList;



}
