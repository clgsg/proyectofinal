package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="participantes")
public class Participante implements Serializable {


	private static final long serialVersionUID = -2023753071884770815L;

	@Id
	private int idParticipante;

	private int idUsuarioParticipante;
	private int idActividad;

	public Participante() {
	}

	public Participante(int idParticipante, int idUsuarioParticipante, int idActividad) {
		this.idParticipante = idParticipante;
		this.idUsuarioParticipante = idUsuarioParticipante;
		this.idActividad = idActividad;
	}

	public int getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}

	public int getIdUsuarioParticipante() {
		return idUsuarioParticipante;
	}

	public void setIdUsuarioParticipante(int idUsuarioParticipante) {
		this.idUsuarioParticipante = idUsuarioParticipante;
	}

	public int getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	@Override
	public String toString() {
		return String.format("Participante [idParticipante=%s, idUsuarioParticipante=%s, idActividad=%s]",
				idParticipante, idUsuarioParticipante, idActividad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idActividad, idParticipante, idUsuarioParticipante);
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
		Participante other = (Participante) obj;
		return idActividad == other.idActividad && idParticipante == other.idParticipante
				&& idUsuarioParticipante == other.idUsuarioParticipante;
	}

}
