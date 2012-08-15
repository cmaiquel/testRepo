package logica;

import java.util.ArrayList;

public class Cliente {

	/**
	 * @param args
	 */
	public void main(String[] args) {

		imprimir();
		
	}

	
	public boolean imprimir() {
		ListaEtiquetas le = new ListaEtiquetas();

		Directorio root = new Directorio("root");
		Directorio e = new Directorio("ejercicio");
		Archivo a = new Archivo("PennyLane.mp3");
		a.agregarEtiqueta(le.buscar("Gusta"));
		a.agregarEtiqueta(le.buscar("Favoritos"));
		a.agregarEtiqueta(le.buscar("Beatles"));
		Archivo b = new Archivo("SgtPeppers.mp3");
		b.agregarEtiqueta(le.buscar("NoGusta"));
		b.agregarEtiqueta(le.buscar("Covers"));
		Archivo c = new Archivo("IForgotToRemember.mp3");
		c.agregarEtiqueta(le.buscar("Favoritos"));
		c.agregarEtiqueta(le.buscar("Beatles"));

		e.agregar(a);
		e.agregar(b);
		e.agregar(c);
		root.agregar(e);

		ArrayList<Nodo> buscados;
		ArrayList<String> mis_etiquetas = le.listarEtiquetas();
		for (int j = 0; j < mis_etiquetas.size(); j++) {
			System.out.println(mis_etiquetas.get(j) + " : ");
			System.out.println();
			buscados = root.buscarArchivos(mis_etiquetas.get(j));
			for (int x = 0; x < buscados.size(); x++) {
				System.out.println("       " + buscados.get(x).getNombre());
				System.out.println();
			}
		}
		return true;
	}
	
}
