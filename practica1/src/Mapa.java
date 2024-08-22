/**
 * <p>Clase para Mapa</p>
 */
public class Mapa {

	/* Las localidades del mapa */
	private Localidad[] localidades;

	/**
	 * Construye un mapa con las localidades que le pasemos.
	 * @param localidades Las localidades con las que haremos el mapa.
	 */
	public Mapa(Localidad[] localidades) {
		this.localidades = localidades;
	}

	/**
	 * Construye un mapa con un maximo de 7 localidades.
	 */
	public Mapa() {
		localidades = new Localidad[7];
	}

	/**
	 * Asigna nuevas localidades a nuestro mapa.
	 * @param localidades Las nuevas localidades a asignar.
	 */
	public void setLocalidades(Localidad[] localidades) {
		this.localidades = localidades;
	}

	/**
	 * Regresa las localidades de mapa.
	 * @return las localidades.
	 */
	public Localidad[] getLocalidades() {
		return localidades;
	}

	/**
	 * Metodo para agregar localidades a nuestro mapa.
	 * @param localidad La localidad a agregar.
	 */
	public void agregaLocalidad(Localidad localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i] == null) {
				localidades[i] = localidad;
				return;
			}
		}
	}

	/**
	 * Metodo para eliminar una localidad de nuestro mapa.
	 * @param localidad La localidad a eliminar.
	 */
	public void eliminaLocalidad(Localidad localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i].equals(localidad)) {
				localidades[i] = null;
				return;
			}
		}
	}

	/**
	 * Metodo para buscar una localidad en el mapa por su nombre.
	 * @param localidad El nombre de la localidad.
	 * @return La localidad si esta se encuentra.
	 *         <code>null</code> en otro caso.
	 */
	public Localidad buscaLocalidad(String localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i].getNombre() == localidad)
				return localidades[i];
		}
		return null;
	}

	/**
	 * Metodo para buscar el indice de una localidad.
	 * @param localidad La localidad a buscar.
	 * @return i el indice de la localidad.
	 *         -1 en otro caso.
	 */
	public int buscaLocalidad(Localidad localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i].equals(localidad))
				return i;
		}
		return -1;
	}

	/**
	 * Metodo para obtener la distancia entre dos localidades.
	 * @param i el indice de la primera localidad
	 * @param j el indice de la segunda localidad
	 * @return la distancia entre las localidades.
	 */
	public double distancia(int i, int j) {
		if(i == -1 || j == -1)
			return -1;
		int[] posicionI = localidades[i].getPosicion();
		int[] posicionJ = localidades[j].getPosicion();
		double d = Math.sqrt(Math.pow(posicionI[0] - posicionJ[0], 2) + Math.pow(posicionI[1] - posicionJ[1], 2));
		return d;
	}
	
}
