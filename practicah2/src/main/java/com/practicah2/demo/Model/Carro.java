package com.practicah2.demo.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "Carros")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true,ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long placa;

    @Column(name = "Color")
    @Size(min = 1, max = 50)
    private String  color;

    @Column(name = "Capacidad")
    private long capacidad;

    @Column(name = "Peso")
    private long peso;

    @Column(name = "Combustible")
    @Size(min = 1, max = 50)
    private String combustible;

    @Column(name = "Modelo")
    @Size(min = 1, max = 50)
    private String modelo;

    @Column(name = "Año")
    private long año;

    @OneToOne
    //@JoinColumn(name="ID_Transportador")
    private Transportador transportador;


}
