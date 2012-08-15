package logica;

import java.util.ArrayList;

public class Archivo extends Nodo {

	public ArrayList<String> etiquetas=new ArrayList<String>();
	
	public Archivo(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public boolean agregarEtiqueta(String e){
		return etiquetas.add(e);
	}
	
	public boolean eliminarEtiqueta(String e){
		return etiquetas.remove(e);
	}

	@Override
	public boolean agregar(Nodo n) {
		// TODO Auto-generated method stub
		return false;
	}

	public Nodo buscar(String etiqueta) {
		if(etiquetas.contains(etiqueta))return this;
		return null;
	}

	@Override
	public boolean eliminar(Nodo n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Nodo> buscarArchivos(String etiqueta) {
		ArrayList<Nodo> buscado=new ArrayList<Nodo>();
		Nodo n=this.buscar(etiqueta);
		if(n!=null)
		buscado.add(n);
		return buscado;
	}

}
