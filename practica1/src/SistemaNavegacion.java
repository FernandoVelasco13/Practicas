/**
 * <p>Clase para el Sistema de navegacion.</p>
 */
public class SistemaNavegacion {

	/* Mapa */
	private Mapa mapa;
	/* Rutas */
	private Ruta[] rutas;

	/**
	 * Construye un sistema de navegacion con 3 rutas como limite.
	 */
	public SistemaNavegacion() {
		mapa = new Mapa();
		rutas = new Ruta[3];
	}

	/**
	 * Construye un sistema de navegacion con un mapa dado.
	 * @param mapa el mapa para el sistema.
	 */
	public SistemaNavegacion(Mapa mapa) {
		this.mapa = mapa;
		rutas = new Ruta[3];
	}

	/**
	 * Metodo que da de alta una localidad como punto de interes.
	 * @param localidad El nombre de la localidad a la cual dar de alta.
	 */
	public void altaLocalidad(String localidad) {
		Localidad a = mapa.buscaLocalidad(localidad);
		if(a != null){
			mapa.buscaLocalidad(localidad).setEsInteres(true);
			return;
		}
		System.out.println("La localidad a dar de alta como punto de interes no se encuentra en el mapa.");
	}

	/**
	 * Metodo que da de baja una localidad como punto de interes.
	 * @param localidad El nombre de la localidad a la cual dar de baja.
	 */
    public void bajaLocalidad(String localidad) {
		Localidad a = mapa.buscaLocalidad(localidad);
		if(a != null){
			mapa.buscaLocalidad(localidad).setEsInteres(false);
			return;
		}
		System.out.println("La localidad a dar de baja como punto de interes no se encuentra en el mapa.");
	}

	/**
	 * Metodo que agrega una ruta.
	 * @param ruta La ruta a agregar.
	 */
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

	public void eliminaRuta(Ruta ruta) {
		int i = 0;
		while(i < rutas.length) {
			if(rutas[i].equals(ruta)) {
				rutas[i] = null;
				return;
			}
			i++;
		}
		System.out.println("La ruta a eliminar no existe.");
	}
    
}
