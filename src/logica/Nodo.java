package logica;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Nodo{

	private String nombre;
	
	
	public Nodo(String n){
		nombre=n;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public abstract boolean agregar(Nodo n);
	public abstract boolean eliminar(Nodo n);
	public abstract ArrayList<Nodo> buscarArchivos(String etiqueta);
	
	
}
