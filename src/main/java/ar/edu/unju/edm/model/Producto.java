package ar.edu.unju.edm.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Producto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	private Long idProd;
	@Column
	private String nombreProd;
	@Column
	private int cantidadProd;
	@Column
	private String descripcionProd;
	@Column
	private double costo;
	@Column
	private String disponibilidad;
	
	public Producto() {
		
	}

	public Producto(Long idProducto, String nombreProducto, int cantidadProducto, String descripcionProducto, double costo,
			String disponibilidad) {
		super();
		this.idProd = idProducto;
		this.nombreProd = nombreProducto;
		this.cantidadProd = cantidadProducto;
		this.descripcionProd = descripcionProducto;
		this.costo = costo;
		this.disponibilidad = disponibilidad;
	}

	public Long getIdProducto() {
		return idProd;
	}

	public void setIdProducto(Long idProducto) {
		this.idProd = idProducto;
	}

	public String getNombreProducto() {
		return nombreProd;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProd = nombreProducto;
	}

	public int getCantidadProducto() {
		return cantidadProd;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProd = cantidadProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProd;
	}

	public void setDescripcionProduto(String descripcionProducto) {
		this.descripcionProd = descripcionProducto;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}