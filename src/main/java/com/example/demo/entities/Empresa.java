package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "empresa")
@NamedQuery(name="Empresa.FindAll", query="SELECT e FROM Empresa e")
@Data
public class Empresa implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String endpoint;
    private boolean estado;
    private String code;
    @OneToMany(mappedBy = "empresa")
    private List<Tipo> tipoList;
}
