
public class Mapa {

	private Localidad[] localidades;

	public Mapa(Localidad[] localidades) {
		this.localidades = localidades;
	}

	public Mapa() {
		localidades = new Localidad[7];
	}

	public void setLocalidades(Localidad[] localidades) {
		this.localidades = localidades;
	}

	public Localidad[] getLocalidades() {
		return localidades;
	}

	public void agregaLocalidad(Localidad localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i] == null) {
				localidades[i] = localidad;
				return;
			}
		}
	}

	public void eliminaLocalidad(Localidad localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i].equals(localidad)) {
				localidades[i] = null;
				return;
			}
		}
	}

	public Localidad buscaLocalidad(String localidad) {
		for(int i = 0; i < localidades.length; i++) {
			if(localidades[i].getNombre() == localidad)
				return localidades[i];
		}
		return null;
	}

	public double distancia(int i, int j) {
		int[] posicionI = localidades[i].getPosicion();
		int[] posicionJ = localidades[j].getPosicion();
		double d = Math.sqrt(Math.pow(posicionI[0] - posicionJ[0], 2) + Math.pow(posicionI[1] - posicionJ[1], 2));
		return d;
	}
	
}
