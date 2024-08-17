public class Ruta {

	private String[] localidades;
	private int id;
	private double[] distancias;

	public Ruta(String[] localidades, double[] distancias) {
		this.localidades = localidades;
		this.distancias = distancias;
		id = (int) Math.random();
	}

	public void setLocalidades(String[] localidades) {
		this.localidades = localidades;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDistancias(double[] distancias) {
		this.distancias = distancias;
	}

	public String[] getLocalidades() {
		return localidades;
	}

	public int getId() {
		return id;
	}

	public double[] getDistancias() {
		return distancias;
	}

	public double distanciaRuta() {
		double dT = 0;
		for(int i = 0; i < distancias.length; i++) {
			if(distancias[i] != 0)
				dT += distancias[i];
		}
		return dT;
	}

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
