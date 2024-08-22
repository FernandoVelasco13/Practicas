import java.util.Arrays;
/**
 * Clase para los Puntos de interes.
 */
public class PuntoDeInteres {
	/* Las categorias que puede
	   tener un punto de interes */
	private Categoria[] categorias;
	/* Constructor que inicia nuestro arreglo con un tamano 3. */
	public PuntoDeInteres() {
		categorias = new Categoria[3];
	}

	/**
	 * Construye un punto de interes con unas categorias.
	 * @param categorias
	 */
	public PuntoDeInteres(Categoria[] categorias) {
		this.categorias = categorias;
	}
	/**
	 * Asigna nuevas categorias al punto de interes.
	 * @param categorias Las nuevas categorias a asignar.
	 */
	public void setCategorias(Categoria[] categorias) {
		this.categorias = categorias;
	}
	/**
	 * Regresa un arreglo con las categorias del punto de interes.
	 * @return categorias El arreglo de las categorias.
	 */
	public Categoria[] getCategorias() {
		return categorias;
	}
	/**
	 * Metodo auxiliar para encontrar el indice de una categoria.
	 * @param categoria La categoria a buscar.
	 * @return <code>i</code> el indice de la categoria.
	 *         <code>-1</code> en otro caso.
	 */
	private int buscarCategoria(Categoria categoria) {
		for(int i = 0; i < categorias.length; i++) {
			if(categorias[i] == categoria)
				return i;
		}
		return -1;
	}
	/**
	 * Metodo que agrega una nueva categoria a un punto de interes.
	 * @param categoria La categoria a agregar.
	 */
	public void agregaCategoria(Categoria categoria) {
		int indice = buscarCategoria(Categoria.NINGUNA);
		if(indice != -1)
			categorias[indice] = categoria;
	}
	/**
	 * Metodo que elimina una categoria de un punto de interes.
	 * @param categoria La categoria a eliminar.
	 */
	public void eliminaCategoria(Categoria categoria) {
		int indice = buscarCategoria(categoria);
		if(indice != -1)
			categorias[indice] = Categoria.NINGUNA;
	}
	/**
	 * Regresa una representacion en cadena de las categorias.
	 * @return una representacion de las categorias.
	 */
    public String toString() {
		return "Categorias: " + Arrays.toString(categorias);
	}
	
}
