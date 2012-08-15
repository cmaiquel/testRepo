package logica;

import java.util.ArrayList;
import java.util.Collections;

public class Directorio extends Nodo {

	private ArrayList<Nodo> hijos=new ArrayList<Nodo>();
	
	public Directorio(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean agregar(Nodo n) {
		if(hijos.contains(n))return false;
		return hijos.add(n);
	}

	public ArrayList<Nodo> buscarArchivos(String etiqueta){
		ArrayList<Nodo> buscados=new ArrayList<Nodo>();
		for(int i=0;i<hijos.size();i++){
			Nodo n=hijos.get(i);
			buscados.addAll(n.buscarArchivos(etiqueta));
            
		}
		return buscados;
	}

	@Override
	public boolean eliminar(Nodo n) {
		return hijos.remove(n);
	}

}
