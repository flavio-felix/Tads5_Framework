package br.ifms.edu.frame1.model;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
     UUID id;
     String nome;
     String email;
 }


