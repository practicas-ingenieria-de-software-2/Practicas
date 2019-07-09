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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "Transportadores")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true,ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Transportador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long ID_Transportador;

    @Column(name = "Noicencia")
    private long  nolicencia;

    @Column(name = "Tipo_Licencia")
    @Size(min = 1, max = 50)
    private String tipo_Licencia;

    @Column(name = "Calificacion")
    @Size(min = 1, max = 50)
    private String calificacion;


    @OneToOne(mappedBy ="transportador", fetch = FetchType.LAZY)
    private Carro carro;

    @OneToMany(mappedBy = "transportador")
    private List<Viaje> envio = new ArrayList<>();

    public Transportador(Optional<Transportador> transportador) {

    }

}
