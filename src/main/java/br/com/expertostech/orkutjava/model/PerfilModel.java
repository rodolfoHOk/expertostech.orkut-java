package br.com.expertostech.orkutjava.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerfilModel {
  
  @Id
  private String id;

  private String nome;
  private String estadoCivil;
  private String pais;
  private Collection<RedeSocialModel> redesSociais;
  private Collection<AmigoModel> amigos;
  
}
