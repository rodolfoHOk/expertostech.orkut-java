package br.com.expertostech.orkutjava.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmigoModel {
  
  private String id;
  private String nome;
  private boolean aprovado;
  private OffsetDateTime dataHoraReq;

}
