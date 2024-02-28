package com.hiba.gym_pfe_spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipements")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long referance;
    @ManyToOne
    @JoinColumn(name = "gymplaces_id")
    private Gymplace salle;



}
