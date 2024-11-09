package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="deportes")
public class Deporte implements Serializable{
	private static final long serialVersionUID= -6567297175530353289L;


	@Id
	private int idDeporte;

	private String deporte;

	public Deporte() {
	}

	public Deporte(int idDeporte, String deporte) {
		this.idDeporte = idDeporte;
		this.deporte = deporte;
	}

	public int getIdDeporte() {
		return idDeporte;
	}

	public void setIdDeporte(int idDeporte) {
		this.idDeporte = idDeporte;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return String.format("Deporte [idDeporte=%s, deporte=%s]", idDeporte, deporte);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deporte, idDeporte);
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
		Deporte other = (Deporte) obj;
		return Objects.equals(deporte, other.deporte) && idDeporte == other.idDeporte;
	}

}
