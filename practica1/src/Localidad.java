

public class Localidad {

	private String nombre;
	private int[] posicion;
	private boolean esInteres;
	private PuntoDeInteres puntointeres;

	public Localidad(String nombre, boolean esInteres, PuntoDeInteres puntointeres) {
		this.nombre = nombre;
		posicion = [(int)Math.random(), (int)Math.random()];
		this.esInteres = esInteres;
		this.puntointeres = puntointeres;
	}

	
}
