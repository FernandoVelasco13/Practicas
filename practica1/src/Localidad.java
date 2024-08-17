import java.lang.Math;

public class Localidad {

	private String nombre;
	private int[] posicion;
	private boolean esInteres;
	private PuntoDeInteres puntoInteres;

	public Localidad(String nombre, boolean esInteres, PuntoDeInteres puntoInteres) {
		this.nombre = nombre;
		posicion = new int[] {(int) Math.random(), (int) Math.random()};
		this.esInteres = esInteres;
		this.puntoInteres = puntoInteres;
	}

	public Localidad(String nombre, boolean esInteres) {
		this.nombre = nombre;
		posicion = new int[] {(int) Math.random(), (int) Math.random()};
		this.esInteres = esInteres;
		puntoInteres = null;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public void setEsInteres(boolean esInteres) {
		this.esInteres = esInteres;
	}

	public void setPuntoInteres(PuntoDeInteres puntoInteres) {
		this.puntoInteres = puntoInteres;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int[] getPosicion() {
		return this.posicion;
	}

	public boolean getEsInteres() {
		return this.esInteres;
	}

	public PuntoDeInteres getPuntoInteres() {
		return this.puntoInteres;
	}

	public boolean equals(Localidad localidad) {
		return nombre == localidad.getNombre() && posicion == localidad.getPosicion() && esInteres == localidad.getEsInteres() && puntoInteres.equals(localidad.getPuntoInteres());
	}
	
    public String toString(){
		return "La localidad " + nombre + "";
    }
	
}
