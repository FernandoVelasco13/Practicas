public class Main {
	public static void main(String[] args) {

		SistemaNavegacion sistema = new SistemaNavegacion();
		Localidad uno = new Localidad("Puerto Bonito", true, ["Cine", "Playa"]);
		Localidad dos = new Localidad("Manzanillo", true, ["Comida"]);
		Localidad tres = new Localidad("Playa Alta", true, ["Comida", "Playa"]);
		Localidad cuatro = new Localidad("Centro", false, null);
		Localidad cinco = new Localidad("Buena Vista", false, null);

		sistema.agregaLocalidad(uno);
		sistema.agregaLocalidad(dos);
		sistema.agregaLocalidad(tres);
		sistema.agregaLocalidad(cuatro);
		sistema.agregaLocalidad(cinco);

	}
}
