package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="actividades")
@NamedNativeQueries({
	@NamedNativeQuery(name="getInfoUsuario", query="select a from Actividades a"),
	@NamedNativeQuery(name="getActividadesPorDeporte", query="select * from Actividades a where a.deporteFk=:deporteFk"),
	@NamedNativeQuery(name="getActividadesPorDeporteYFecha", query="select * from Actividades a where a.deporteFk=:deporteFk and a.fechaActividad= :fechaActividad"),
	@NamedNativeQuery(name="getActividadesPorFecha", query="select * from Actividades a where a.fechaActividad= :fechaActividad"),
	@NamedNativeQuery(name="getActividadesPorCreador", query="select * from Actividades a where a.usuarioCreadorFk= :usuarioCreadorFk"),
})
public class Usuario implements Serializable {
	private static final long serialVersionUID = -6567297177530353288L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
	private int idActividad;

	@Column(name="apodo")
	private String apodo; 
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido1")
	private String primerApellido;
	@Column(name="apellido1")
	private String segundoApellido;
	
	public Usuario() {}
	
	
}
