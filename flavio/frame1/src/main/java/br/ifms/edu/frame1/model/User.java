package br.ifms.edu.frame1.model;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User{
     @Id
     @GeneratedValue
     UUID id;
     @Column(name="nameUser", nullable = false)
     @NotBlank
     String nome;
     String email;
 }


