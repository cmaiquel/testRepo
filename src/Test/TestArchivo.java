package Test;

import java.util.ArrayList;

import junit.framework.Assert;
import logica.Archivo;
import logica.Directorio;
import logica.ListaEtiquetas;
import logica.Nodo;

import org.junit.Test;


public class TestArchivo {

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
		
		Directorio e=new Directorio("ejercicio");
		Archivo a=new Archivo("PennyLane.mp3");
		
		boolean result=a.agregar(e);

		Assert.assertEquals(false, result);
		
	}
	
	@Test
	public void testEliminarNodo(){
		
		Directorio e=new Directorio("ejercicio");
		Archivo a=new Archivo("PennyLane.mp3");
		
		a.agregar(e);
		
		boolean result=a.eliminar(e);
		
		Assert.assertEquals(false, result);
		
	}
	
	@Test
	public void testBuscar(){

		Archivo a=new Archivo("PennyLane.mp3");

		ListaEtiquetas le=new ListaEtiquetas();
		String etiqueta=le.buscar("Favoritos");
		a.agregarEtiqueta(etiqueta);

		Nodo n=a.buscar(etiqueta);

		Assert.assertEquals("testBuscar -> se esperaba PennyLane.mp3 y fue " + a.getNombre(),
				"PennyLane.mp3", a.getNombre());
		etiqueta=le.buscar("Beatles");
		n=a.buscar(etiqueta);
		
		Assert.assertEquals(null, n);
		
	}
	
	@Test
	public void testEliminarEtiqueta(){

		Archivo a=new Archivo("PennyLane.mp3");

		ListaEtiquetas le=new ListaEtiquetas();
		String etiqueta=le.buscar("Favoritos");
		a.agregarEtiqueta(etiqueta);

		Nodo n=a.buscar(etiqueta);

		Assert.assertEquals("testEliminarEtiqueta -> se esperaba PennyLane.mp3 y fue " + a.getNombre(),
				"PennyLane.mp3", a.getNombre());
		a.eliminarEtiqueta(etiqueta);
		n=a.buscar(etiqueta);
		
		Assert.assertEquals(null, n);
		
	}
	
	
}
