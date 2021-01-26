
package eu.cifpfbmoll.biblioteca;

import java.util.Scanner;

public class AppBiblioteca {
    

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int opcion;
    boolean salir = false;
        
                
        
        do {   
            System.out.println("************MENU************");
            System.out.println("1.Añadir Libro");
            System.out.println("2.Eliminar Libro");
            System.out.println("3.Buscar Libro por ISBN");
            System.out.println("4.Buscar Libro por titulo");
            System.out.println("5.Mostrar Libros");
            System.out.println("6.Mostrar Libros disponibles");
            System.out.println("7.Salir");
            
        } while (salir==false);

    }
    
}
