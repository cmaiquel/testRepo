package logica;

import java.util.ArrayList;
import java.util.Collections;

public class ListaEtiquetas {
     private ArrayList<String> l=new ArrayList<String>();
     
     public ListaEtiquetas(){
    	agregar("Gusta");
 		agregar("Favoritos");
 		agregar("Beatles");
 		agregar("NoGusta");
 		agregar("Covers");
     }
     
     public void agregar(String e){
    	 l.add(e);
     }
     
     public void remover(String e){
    	 l.remove(e);
     }
     
     public String buscar(String nombre){
    	 for(int x=0;x<l.size();x++){
    		 if(l.get(x).equals(nombre))
    			 return l.get(x);
    	 }
    	 return null;
     }
     
     public ArrayList<String> listarEtiquetas(){
    	   Collections.sort(l);
    	   return l;
     }
     
     public int getSize(){
    	 return l.size();
     }
     
}
