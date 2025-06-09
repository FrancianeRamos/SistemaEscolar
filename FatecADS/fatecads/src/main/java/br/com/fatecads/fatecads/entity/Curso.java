package br.com.fatecads.fatecads.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;
    
    @Column(name = "nome", nullable = false, length = 20)
    private String nomeCurso;
    
    @Column(name = "cargaHoraria", nullable = false, length = 40)
    private String cargaHoraria;
    
    @Column(name = "periodo", nullable = false, length = 10)
    private String periodo;

}
