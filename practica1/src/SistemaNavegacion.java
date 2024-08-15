public class SistemaNavegacion {

	private Localidad[] mapa;
	private Ruta[] rutas;

	public SistemaNavegacion() {
		this.mapa = new Localidad[5];
		rutas = new Ruta[3];
	}

	public void agregaLocalidad(Localidad localidad) {
		int i = 0;
		while(i < mapa.length){
			if(mapa[i] == null) {
				mapa[i] = localidad;
				return;
			}
			i++;
		}
		System.out.println("No hay espacio para otra localidad.");
	}

	public void eliminaLocalidad(Localidad localidad) {
		int i = 0;
		while(i < mapa.length) {
			if(mapa[i] == localidad) {
				mapa[i] = null;
				return;
			}
			i++;
		}
		System.out.println("La localidad a eliminar no se encuentra.");
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

    public void imprimirMapa(){
	for(int i = 0; i < mapa.length; i++){
	    System.out.println(mapa[i].toString());
	}
    }
    
}
