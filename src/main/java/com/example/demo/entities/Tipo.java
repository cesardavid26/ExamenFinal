package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@NamedQuery(name="Tipo.FindAll", query="SELECT t FROM Tipo t")
@Data
public class Tipo implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String descripcion;
    @JoinColumn(name = "empresa", referencedColumnName = "id")
    @ManyToOne
    private Empresa empresa;
    @OneToMany(mappedBy = "tipo")
    private List<Basico> basicoList;
}
