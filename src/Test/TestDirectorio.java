package Test;

import java.util.ArrayList;

import junit.framework.Assert;
import logica.Archivo;
import logica.Directorio;
import logica.ListaEtiquetas;
import logica.Nodo;

import org.junit.Test;


public class TestDirectorio {

	@Test
	public void testBuscarArchivo(){

		Directorio root=new Directorio("root");
		Directorio e=new Directorio("ejercicio");
		Archivo a=new Archivo("PennyLane.mp3");
		e.agregar(a);
		root.agregar(e);

		ListaEtiquetas le=new ListaEtiquetas();
		String etiqueta=le.buscar("Favoritos");
		a.agregarEtiqueta(etiqueta);

		ArrayList<Nodo> r=root.buscarArchivos(etiqueta);

		Assert.assertEquals("testBuscarArchivo -> se esperaba PennyLane.mp3 y fue " + r.get(0).getNombre(),
				"PennyLane.mp3", r.get(0).getNombre());
	}
	
	@Test
	public void testAgregarNodo(){
		
		Directorio root=new Directorio("root");
		Directorio e=new Directorio("ejercicio");
		
		boolean result=root.agregar(e);

		Assert.assertEquals(true, result);
		
		result=root.agregar(e);
		
		Assert.assertEquals(false, result);
		
	}
	
	@Test
	public void testEliminarNodo(){
		
		Directorio root=new Directorio("root");
		Directorio e=new Directorio("ejercicio");
		
		root.agregar(e);

		root.eliminar(e);
		
		boolean result=root.agregar(e);
		
		Assert.assertEquals(true, result);
		
	}
}
