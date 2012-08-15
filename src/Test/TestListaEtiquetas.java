package Test;

import java.util.ArrayList;

import junit.framework.Assert;
import logica.Archivo;
import logica.Directorio;
import logica.ListaEtiquetas;
import logica.Nodo;

import org.junit.Test;


public class TestListaEtiquetas {

	@Test
	public void testAgregarEtiqueta(){

		ListaEtiquetas le=new ListaEtiquetas();
        le.agregar("Rock");		

		Assert.assertEquals("testAgregarEtiqueta -> se esperaba 6 y fue " + le.getSize(),
				6, le.getSize());
	}
	
	@Test
	public void testRemoverEtiqueta(){

		ListaEtiquetas le=new ListaEtiquetas();
        le.remover("Favoritos");		

		Assert.assertEquals("testRemoverEtiqueta -> se esperaba 4 y fue " + le.getSize(),
				4, le.getSize());
	}
	
	@Test
	public void testBuscar(){

		ListaEtiquetas le=new ListaEtiquetas();
        String e=le.buscar("Favoritos");		

		Assert.assertEquals("testBuscar -> se esperaba Favoritos y fue " + e,
				"Favoritos", e);
		
		e=le.buscar("Rock");
		
		Assert.assertEquals(null, e);
	}
	
	@Test
	public void testListarEtiquetas(){

		ListaEtiquetas le=new ListaEtiquetas();
        ArrayList<String> l=le.listarEtiquetas();		

		Assert.assertEquals("Beatles", l.get(0));
		
		Assert.assertEquals("NoGusta", l.get(4));
	}
	
	
}
