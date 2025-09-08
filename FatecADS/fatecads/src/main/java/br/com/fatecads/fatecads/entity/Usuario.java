package br.com.fatecads.fatecads.entity;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "usuario")
public class Usuario {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;
 
    @Column(nullable = false, length = 20)
    private String nomeUsuario;
 
    @Column(nullable = false, length = 40)
    private String cpfUsuario;
 
    @Column(nullable = false, length = 40)
    private String loginUsuario;
 
    @Column(nullable = false, length = 100)
    private String senhaUsuario;
 
    private String role = "ROLE_USER";
 
}
