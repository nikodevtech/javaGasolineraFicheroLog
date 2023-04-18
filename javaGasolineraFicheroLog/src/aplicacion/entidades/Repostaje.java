package aplicacion.entidades;

import java.time.LocalDate;

/**
 * Clase entidad Repostaje que representa a dicha entidad. Contiene sus atributos, constructores y los getter & setter 
 * para acceso a los atributos.
 * @author nico
 *
 */
public class Repostaje {

	//Atributos encapsulados
	private double litrosRepostados;	
	private double importeTotal;
	private String dniCliente; 
	private String matriculaVehiculoCliente;
	private LocalDate fechaRepostaje =  LocalDate.now();
	private int identificador;

	//Constructores con paso de parametros y vacío
	public Repostaje(double importeTotal, String dniCliente, String matriculaVehiculoCliente,double litrosRepostados, LocalDate fechaActual) {
		super();
		this.importeTotal = importeTotal;
		this.dniCliente = dniCliente;
		this.matriculaVehiculoCliente = matriculaVehiculoCliente;
		this.fechaRepostaje = fechaActual;
		this.litrosRepostados = litrosRepostados;
	}

	public Repostaje() {
		super();
	}
	
	//Getter and setter para mostrar/modificar los atributos encapsulados
	public LocalDate getFechaActual() {
		return fechaRepostaje;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getMatriculaVehiculoCliente() {
		return matriculaVehiculoCliente;
	}
	public void setMatriculaVehiculoCliente(String matriculaVehiculoCliente) {
		this.matriculaVehiculoCliente = matriculaVehiculoCliente;
	}
	public double getLitrosRepostados() {
		return litrosRepostados;
	}

	public void setLitrosRepostados(double litros) {
		this.litrosRepostados = litros;
	}
	public void setFechaActual(LocalDate fechaActual) {
		this.fechaRepostaje = fechaActual;
	}
	public int getIdentidicador() {
		return identificador;
	}
	public void SetIdentidicador(int id) {
		this.identificador=id;
	}

	//Sobre escritura toString del objeto para que no muestra la referencia en memoria al imprimir por consola
	@Override
	public String toString() {
		return "Repostaje [ id="+ identificador+", litrosRepostados=" + litrosRepostados + ", importeTotal=" + importeTotal + ", dniCliente="
				+ dniCliente + ", matriculaVehiculoCliente=" + matriculaVehiculoCliente + ", fechaActual=" + fechaRepostaje
				+ "]";
	}
}
