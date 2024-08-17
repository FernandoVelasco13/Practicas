
public class PuntoDeInteres {
	private Categoria[] categorias;

	public PuntoDeInteres() {
		categorias = new Categoria[3];
	}

	public void setCategorias(Categoria[] categorias) {
		this.categorias = categorias;
	}

	public Categoria[] getCategorias() {
		return categorias;
	}

	public int buscarCategoria(Categoria categoria) {
		for(int i = 0; i < categorias.length; i++) {
			if(categorias[i] == categoria)
				return i;
		}
		return -1;
	}

	public void agregaCategoria(Categoria categoria) {
		int indice = buscarCategoria(Categoria.NINGUNA);
		if(indice != -1)
			categorias[indice] = categoria;
	}

	public void eliminaCategoria(Categoria categoria) {
		int indice = buscarCategoria(categoria);
		if(indice != -1)
			categorias[indice] = Categoria.NINGUNA;
	}
}
