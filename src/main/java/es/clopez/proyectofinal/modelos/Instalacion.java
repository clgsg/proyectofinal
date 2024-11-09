package es.clopez.proyectofinal.modelos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="instalaciones")
public class Instalacion implements Serializable {

	private static final long serialVersionUID = -8806477198938244169L;

	@Id
	private int idInstalacion;

	private String tipoVia;
	private String nombreVia;
	private String numVia;
	private int tipoInstalacion;
	private String alumbrado;
	private String nombreInstalacion;

	public Instalacion() {
	}

	public Instalacion(int idInstalacion, String tipoVia, String nombreVia, String numVia, int tipoInstalacion,
			String alumbrado, String nombreInstalacion) {
		this.idInstalacion = idInstalacion;
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numVia = numVia;
		this.tipoInstalacion = tipoInstalacion;
		this.alumbrado = alumbrado;
		this.nombreInstalacion = nombreInstalacion;
	}

	public int getIdInstalacion() {
		return idInstalacion;
	}

	public void setIdInstalacion(int idInstalacion) {
		this.idInstalacion = idInstalacion;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getNumVia() {
		return numVia;
	}

	public void setNumVia(String numVia) {
		this.numVia = numVia;
	}

	public int getTipoInstalacion() {
		return tipoInstalacion;
	}

	public void setTipoInstalacion(int tipoInstalacion) {
		this.tipoInstalacion = tipoInstalacion;
	}

	public String getAlumbrado() {
		return alumbrado;
	}

	public void setAlumbrado(String alumbrado) {
		this.alumbrado = alumbrado;
	}

	public String getNombreInstalacion() {
		return nombreInstalacion;
	}

	public void setNombreInstalacion(String nombreInstalacion) {
		this.nombreInstalacion = nombreInstalacion;
	}

	@Override
	public String toString() {
		return String.format(
				"Instalacion [idInstalacion=%s, tipoVia=%s, nombreVia=%s, numVia=%s, tipoInstalacion=%s, alumbrado=%s, nombreInstalacion=%s]",
				idInstalacion, tipoVia, nombreVia, numVia, tipoInstalacion, alumbrado, nombreInstalacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumbrado, idInstalacion, nombreInstalacion, nombreVia, numVia, tipoInstalacion, tipoVia);
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
		Instalacion other = (Instalacion) obj;
		return Objects.equals(alumbrado, other.alumbrado) && idInstalacion == other.idInstalacion
				&& Objects.equals(nombreInstalacion, other.nombreInstalacion)
				&& Objects.equals(nombreVia, other.nombreVia) && Objects.equals(numVia, other.numVia)
				&& tipoInstalacion == other.tipoInstalacion && Objects.equals(tipoVia, other.tipoVia);
	}

}
