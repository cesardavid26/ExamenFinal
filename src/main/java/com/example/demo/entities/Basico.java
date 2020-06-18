package com.example.demo.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@NamedQuery(name="Basico.findAll", query="SELECT b FROM Basico b")
@Data
public class Basico implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String documento;
    private String nombre;
    private String telefono;
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    private String genero;
    private Boolean embarazo;
    private String contactonombre;
    private String contactotelefono;
    private Boolean mas60;
    private Boolean menos15;
    private Boolean salud;
    @Basic(optional = false)
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "basico")
    private Cormobilidad cormobilidad;
    @JoinColumn(name = "eps", referencedColumnName = "id")
    @ManyToOne
    private Eps eps;
    @JoinColumn(name = "modalidad", referencedColumnName = "id")
    @ManyToOne
    private Modalidad modalidad;
    @JoinColumn(name = "tipo", referencedColumnName = "id")
    @ManyToOne
    private Tipo tipo;
    @OneToMany(mappedBy = "persona")
    private List<Registro> registroList;
}
