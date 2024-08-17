
public class SistemaNavegacion {

	private Mapa mapa;
	private Ruta[] rutas;

	public SistemaNavegacion() {
		mapa = new Mapa();
		rutas = new Ruta[3];
	}

	public void altaLocalidad(String localidad) {
		Localidad a = mapa.buscaLocalidad(localidad);
		if(a != null){
			mapa.buscaLocalidad(localidad).setEsInteres(true);
			return;
		}
		System.out.println("La localidad a dar de alta como punto de interes no se encuentra en el mapa.");
	}

    public void bajaLocalidad(String localidad) {
		Localidad a = mapa.buscaLocalidad(localidad);
		if(a != null){
			mapa.buscaLocalidad(localidad).setEsInteres(false);
			return;
		}
		System.out.println("La localidad a dar de baja como punto de interes no se encuentra en el mapa.");
	}

	public void agregaRuta(Ruta ruta) {
		int i = 0;
		while(i < rutas.length) {
			if(rutas[i] == null) {
				rutas[i] = ruta;
				return;
				
			}
			i++;
		}
		System.out.println("Ya no hay mas espacio para las rutas.");
	}
    
}
