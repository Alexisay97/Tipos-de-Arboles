/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_arboles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Tipos_Arboles {

    /**
     * @param args the command line arguments
     */
    ArrayList<Arboles>arboles = new ArrayList();
    
    public static void main(String[] args) {
        int op ;
       
        String nom,fam,tipo,zona;
        Arboles a = new Arboles();
        Scanner scs = new Scanner(System.in);
        
        
                        
        try{
            
            do{
                
                menu.menu();    
                op = scs.nextInt();
        
        switch(op){
        
            case 1:
                nom = scs.nextLine();
                System.out.println("Ingrese el nombre del arbol: ");nom=scs.nextLine();
                System.out.println("Ingrese el la familia del arbol: ");fam = scs.nextLine();
                System.out.println("Ingrese el tipo de arbol: ");tipo = scs.nextLine();
                System.out.println("Ingrese la zona del arbol: ");zona = scs.nextLine();
                
                new_and_read.nuevo_arbol(nom, fam, tipo, zona);
               
                System.out.flush();
                break;
            case 2:
                System.out.println("Mostrando Lista de arboles: ");
                new_and_read.mostrar();
            break;    
            
            case 3:
                System.out.println(" <-----  ADIOS  ----->");
                System.exit(0);
            
        }
            System.out.println(" Presione 1 si desea continuar ");
            op = scs.nextInt();
        }while(op == 1);
        }catch(Exception ex){
            System.out.println(" Ha ingresado una opcion Invalida: ");
            
        }
            System.out.println(" Presione cualquier tecla para continuar: ");
            System.err.close();
            System.exit(0);
    }
    
}
