package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "correo")
public class Correo implements Serializable {

	private static final long serialVersionUID = 4923736685549730810L;
	@Id
	private int idCorreo;
	private int idUsuario;
	private String correo;

	public Correo() {
	}

	public Correo(int idCorreo, int idUsuario, String correo) {
		this.idCorreo = idCorreo;
		this.idUsuario = idUsuario;
		this.correo = correo;
	}

	public int getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return String.format("Correo [idCorreo=%s, idUsuario=%s, correo=%s]", idCorreo, idUsuario, correo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(correo, idCorreo, idUsuario);
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
		Correo other = (Correo) obj;
		return Objects.equals(correo, other.correo) && idCorreo == other.idCorreo && idUsuario == other.idUsuario;
	}

}
