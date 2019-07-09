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
@Table(name = "Envios")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true,ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Viaje implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_Envio;

    @Column(name = "Costo")
    private long Costo;

    @Column(name = "Fecha_I")
    @Size(min = 1, max = 50)
    private String Fecha_I;

    @Column(name = "Fecha_F")
    @Size(min = 1, max = 50)
    private String Fecha_F;

    @Column(name = "Destinos")
    @Size(min = 1, max = 50)
    private String Destino;

    @Column(name = "Inicios")
    @Size(min = 1, max = 50)
    private String Inicio;

    @ManyToOne(fetch= FetchType.LAZY)
    //@JoinColumn(name = "ID_Transportador")
    private Transportador transportador;
}