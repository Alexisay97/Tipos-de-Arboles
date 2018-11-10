/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_arboles;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class new_and_read {
   
        public static ArrayList<Arboles>arboles = new ArrayList();
    
    public static String nuevo_arbol(String nom, String fam, String tipo, String zona){
        
        Arboles a = new Arboles();
        
        a.nombre = nom;
        a.familia = fam;
        a.tipoArbol = tipo;
        a.zona = zona;
        
        new_and_read.arboles.add(a);
        
        return null;
    }
    
    public static new_and_read mostrar(){
        System.out.println(" Nombre .. Familia .. Tipo de Arbol .. Zona \n\n");
        arboles.forEach((Arboles e)->{
        System.out.println(e.nombre +" | "+ e.familia +" | "+ e.tipoArbol +" | "+e.zona);
        });
        
    return null;
    }
    
    
    
}
