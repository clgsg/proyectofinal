package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="actividades")
@NamedNativeQueries({
	@NamedNativeQuery(name="getActividades", query="select * from Actividades a"),
	@NamedNativeQuery(name="getActividadesPorDeporte", query="select * from Actividades a where a.fk_deporte=:deporteFk"),
	@NamedNativeQuery(name="getActividadesPorDeporteYFecha", query="select * from Actividades a where a.fk_deporte=:deporteFk and a.fecha= :fechaActividad"),
	@NamedNativeQuery(name="getActividadesPorFecha", query="select * from Actividades a where a.fecha= :fechaActividad"),
	@NamedNativeQuery(name="getActividadesPorCreador", query="select * from Actividades a where a.fk_usuario= :usuarioCreadorFk"),
})
public class Actividad implements Serializable {
	private static final long serialVersionUID = -6567297175530353288L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad")
	private int idActividad;

	@Column(name="fk_usuario")
	private int usuarioCreadorFk; // Creador de la actividad
	@Column(name="fk_deporte")
	private int deporteFk;
	@Column(name="fk_instalacion")
	private int instalacionFk;
	@Column(name="min_participantes")
	private int minParticipantes;
	@Column(name="max_participantes")
	private int maxParticipantes;
	@Column(name="comentarios")
	private String comentarios;
	@Column(name="fecha")
	private Timestamp fechaActividad;
		

	public Actividad() {
	}

	public Actividad(int idActividad, int usuarioCreadorFk, int deporteFk, int instalacionFk, int minParticipantes,
			int maxParticipantes, String comentarios, Timestamp fechaActividad) {
		this.idActividad = idActividad;
		this.usuarioCreadorFk = usuarioCreadorFk;
		this.deporteFk = deporteFk;
		this.instalacionFk = instalacionFk;
		this.minParticipantes = minParticipantes;
		this.maxParticipantes = maxParticipantes;
		this.comentarios = comentarios;
		this.fechaActividad = fechaActividad;
	}

	public int getIdActividad() {
		return idActividad;
	}

	/*public void setIdActividad(int id_actividad) {
		this.idActividad = id_actividad;
	}*/

	public int getUsuarioCreadorFk() {
		return usuarioCreadorFk;
	}

	public void setUsuarioCreadorFk(int usuarioCreadorFk) {
		this.usuarioCreadorFk = usuarioCreadorFk;
	}

	public int getDeporteFk() {
		return deporteFk;
	}

	public void setDeporteFk(int deporteFk) {
		this.deporteFk = deporteFk;
	}

	public int getInstalacionFk() {
		return instalacionFk;
	}

	public void setInstalacionFk(int instalacionFk) {
		this.instalacionFk = instalacionFk;
	}

	public int getMinParticipantes() {
		return minParticipantes;
	}

	public void setMinParticipantes(int minParticipantes) {
		this.minParticipantes = minParticipantes;
	}

	public int getMaxParticipantes() {
		return maxParticipantes;
	}

	public void setMaxParticipantes(int maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Timestamp getFechaActividad() {
		return fechaActividad;
	}

	public void setFechaActividad(Timestamp fechaActividad) {
		this.fechaActividad = fechaActividad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comentarios, deporteFk, fechaActividad, idActividad, instalacionFk, maxParticipantes,
				minParticipantes, usuarioCreadorFk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Actividad other = (Actividad) obj;
		return Objects.equals(comentarios, other.comentarios) && deporteFk == other.deporteFk
				&& Objects.equals(fechaActividad, other.fechaActividad) && idActividad == other.idActividad
				&& instalacionFk == other.instalacionFk && maxParticipantes == other.maxParticipantes
				&& minParticipantes == other.minParticipantes && usuarioCreadorFk == other.usuarioCreadorFk;
	}

	@Override
	public String toString() {
		return String.format(
				"Actividad [idActividad=%s, usuarioCreadorFk=%s, deporteFk=%s, instalacionFk=%s, minParticipantes=%s, maxParticipantes=%s, comentarios=%s, fechaActividad=%s]",
				idActividad, usuarioCreadorFk, deporteFk, instalacionFk, minParticipantes, maxParticipantes,
				comentarios, fechaActividad);
	}

}
