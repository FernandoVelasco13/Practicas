/**
 * <p>Clase para las Rutas</p>
 */
public class Ruta {

	/* Las localidades de la ruta */
	private String[] localidades;
	/* El identificar de la ruta */
	private int id;
	/* Las distancias de las localidades */
	private double[] distancias;

	/**
	 * Construye una ruta con localidades y distancias entre estas.
	 * @param localidades Las localidades de la ruta.
	 * @param distancias Las distancias entre las localidades.
	 */
	public Ruta(String[] localidades, double[] distancias) {
		this.localidades = localidades;
		this.distancias = distancias;
		id = (int) Math.random();
	}

	/**
	 * Asigna nuevas localidades a la ruta.
	 * @param localidades Las nuevas localidades de la ruta.
	 */
	public void setLocalidades(String[] localidades) {
		this.localidades = localidades;
	}

	/**
	 * Asigna un nuevo identificador a la ruta.
	 * @param id El nuevo identificar.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Asigna unas nuevas distancias.
	 * @param distancias Las nuevas distancias.
	 */
	public void setDistancias(double[] distancias) {
		this.distancias = distancias;
	}

	/**
	 * Regresa las localidades de la ruta.
	 * @return las localidades.
	 */
	public String[] getLocalidades() {
		return localidades;
	}

	/**
	 * Regresa el identificador de la ruta.
	 * @return el identificador.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Regresa las distancias entre las localidades.
	 * @return las distancias.
	 */
	public double[] getDistancias() {
		return distancias;
	}

	/**
	 * Regresa la distancia total de la ruta.
	 * @return la distancia total.
	 */
	public double distanciaRuta() {
		double dT = 0;
		for(int i = 0; i < distancias.length; i++) {
			if(distancias[i] != 0)
				dT += distancias[i];
		}
		return dT;
	}

	/**
	 * Metodo equals
	 * @param object el objeto a comparar.
	 * @return <code>true</code> si son el mismo
	 *         <code>false</code> en otro caso.
	 */
	public boolean equals(Object object) {
		if(object == null)
			return false;
		Ruta ruta = (Ruta) object;
		return this.localidades.equals(ruta.getLocalidades()) && this.id == ruta.getId() && this.distancias.equals(ruta.getDistancias());
	}

	/**
	 * Regresa una representacion de la ruta.
	 * @return una representacion de la ruta.
	 */
	public String toString() {
		String res = "La ruta esta compuesta de las siguientes localidades: ";
		int i = 0;
		for(int j = 1; j < localidades.length; j++) {
			res += "de " + localidades[i] + " a " + localidades[j] + ", con una distancia de: " + distancias[i] + " metros, ";
			i++;
		}
		return res + "con una distancia total de: " + distanciaRuta();
	}
		
}
