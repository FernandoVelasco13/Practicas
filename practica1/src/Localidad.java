import java.lang.Math;

/**
 * <p>Clase para Localidades</p>
 */
public class Localidad {

	/* Nombre de la localidad */
	private String nombre;
	/* Posicion de la localidad */
	private int[] posicion;
	/* Si es un punto de interes */
	private boolean esInteres;
	/* Los puntos de interes de la localidad */
	private PuntoDeInteres puntoInteres;

	/**
	 * Constructor para cuando una localidad es punto de interes.
	 */
	public Localidad(String nombre, boolean esInteres, PuntoDeInteres puntoInteres) {
		this.nombre = nombre;
		posicion = new int[] {(int) Math.random(), (int) Math.random()};
		this.esInteres = esInteres;
		this.puntoInteres = puntoInteres;
	}

	/**
	 * Constructor para cuando una localidad no es punto de interes.
	 */
	public Localidad(String nombre, boolean esInteres) {
		this.nombre = nombre;
		posicion = new int[] {(int) Math.random(), (int) Math.random()};
		this.esInteres = esInteres;
		puntoInteres = new PuntoDeInteres();
	}

	/**
	 * Asigna un nuevo nombre.
	 * @param nombre el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Asigna una nueva posicion.
	 * @param posicion La nueva posicion
	 */
	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	/**
	 * Asigna si es un punto de interes.
	 * @param esInteres
	 */
	public void setEsInteres(boolean esInteres) {
		this.esInteres = esInteres;
	}

	/**
	 * Asigna nuevo punto de interes a la localidad.
	 * @param puntoInteres
	 */
	public void setPuntoInteres(PuntoDeInteres puntoInteres) {
		this.puntoInteres = puntoInteres;
	}

	/**
	 * Regresa el nombre de la localidad
	 * @return el nombre de la localidad
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Regresa la posicion de la localidad
	 * @return la posicion de la localidad.
	 */
	public int[] getPosicion() {
		return this.posicion;
	}

	/**
	 * Regresa si la localidad es punto de interes o no.
	 * @return si es o no de interes.
	 */
	public boolean getEsInteres() {
		return this.esInteres;
	}

	/**
	 * Regresa las categorias de este punto de interes.
	 * @return el punto de interes.
	 */
	public PuntoDeInteres getPuntoInteres() {
		return this.puntoInteres;
	}

	/**
	 * Metodo para saber si un objeto es igual a la localidad.
	 * @param object El objeto a comparar
	 * @return <code>true</code> si es el mismo.
	 *         <code>false</code> en otro caso.
	 */
	public boolean equals(Object object) {
		if(object == null)
			return false;
		Localidad localidad = (Localidad) object;
		return this.nombre == localidad.getNombre() && this.posicion == localidad.getPosicion() && this.esInteres == localidad.getEsInteres() && this.puntoInteres.equals(localidad.getPuntoInteres());
	}

	/**
	 * Regresa una representacion de una localidad.
	 * @return una representacion de una localidad.
	 */
    public String toString(){
		return "La localidad " + nombre;
    }
	
}
