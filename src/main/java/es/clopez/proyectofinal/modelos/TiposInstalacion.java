package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos_instalacion")
public class TiposInstalacion implements Serializable {

	private static final long serialVersionUID = -4229732694376342854L;

	@Id
	private int idTipo;
	private String tipoInstalacion;

	public TiposInstalacion() {
	}

	public TiposInstalacion(int idTipo, String tipoInstalacion) {
		this.idTipo = idTipo;
		this.tipoInstalacion = tipoInstalacion;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipoInstalacion() {
		return tipoInstalacion;
	}

	public void setTipoInstalacion(String tipoInstalacion) {
		this.tipoInstalacion = tipoInstalacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return String.format("TiposInstalacion [idTipo=%s, tipoInstalacion=%s]", idTipo, tipoInstalacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTipo, tipoInstalacion);
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
		TiposInstalacion other = (TiposInstalacion) obj;
		return idTipo == other.idTipo && Objects.equals(tipoInstalacion, other.tipoInstalacion);
	}

}
