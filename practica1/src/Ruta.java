public class Ruta {

	private String[] localidades;
	private int id;
	private double distancia;

	public Ruta(String[] localidades, double distancia) {
		this.localidades = localidades;
		this.distancia = distancia;
		id = (int) Math.random();
	}
		
}
