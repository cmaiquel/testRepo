package Test;

import junit.framework.Assert;
import logica.Cliente;

import org.junit.Test;

public class TestCliente {
	
	@Test
	public void testImprimir(){
		 Cliente c=new Cliente();
			
			 boolean actual=c.imprimir();
			Assert.assertEquals(true,actual);
	}

}
