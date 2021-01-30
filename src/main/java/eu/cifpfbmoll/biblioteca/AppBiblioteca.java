package eu.cifpfbmoll.biblioteca;

import static eu.cifpfbmoll.biblioteca.Libro.anadirLibro;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroISBN;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroTitulo;
import static eu.cifpfbmoll.biblioteca.Libro.eliminarLibro;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBiblioteca {

    public static void main(String[] args) {
        //creamos biblioteca 
        Biblioteca B = new Biblioteca();

        //creamos lista de libros
        ArrayList<Libro> listaLibros1 = new ArrayList<>();

        //creamos lista del personal de la biblioteca
        ArrayList<Persona> P = new ArrayList<>();
        
        //creamos algunos libros para la biblioteca
        //"Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
        Libro l1 = new Libro("123345677","Divina comedia", "Dante","Algani Editorial",55,45);
        Libro l2 = new Libro("068364926","Don Quijote de la Mancha 1", "Cervantes","Andavira Editora",55,35);
        Libro l3 = new Libro("068364899","Don Quijote de la Mancha 2", "Cervantes","Andavira Editora",55,33);
        Libro l7 = new Libro("586305f97","El idiota", "Dostoievski","La Pajarita Roja",15,0);
        Libro l8 = new Libro("509365028","El idiota", "Dostoievski","Calambur Editorial",15,5);
        Libro l9 = new Libro("975689215","Almas muertas", "Dostoievski","La Pajarita Roja",11,1);      
        Libro l10 = new Libro("587348122","Lolita", "Nabokov","La Pajarita Roja",100,88);
        Libro l20 = new Libro("683745554","Romancero gitano", "Lorca","Kraicon",1000,568);
        Libro l21 = new Libro("683745654","Romancero gitano", "Lorca","Algani Editorial",1000,1000);
        Libro l22 = new Libro("233364926","Don Quijote de la Mancha 1", "Cervantes","Calambur Editorial",20,0);
        Libro l23 = new Libro("235364899","Don Quijote de la Mancha 2", "Cervantes","Calambur Editorial",20,0);
        
        listaLibros1.add(l1);
        listaLibros1.add(l2);
        listaLibros1.add(l3);
        listaLibros1.add(l7);
        listaLibros1.add(l8);
        listaLibros1.add(l9);
        listaLibros1.add(l10);
        listaLibros1.add(l20);
        listaLibros1.add(l21);
        listaLibros1.add(l22);
        listaLibros1.add(l23);

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
            System.out.println("*****************************");
            System.out.println("");
            opcion = sc.nextByte();

            switch (opcion) {

                case 1:
                    anadirLibro(listaLibros1);
                    break;

                case 2:
                    eliminarLibro(listaLibros1);
                    break;

                case 3:
                    buscarLibroISBN(listaLibros1);
                    break;

                case 4:
                    buscarLibroTitulo(listaLibros1);
                    break;

                case 5:
                    B.mostrarTodosLibros(listaLibros1);
                    break;

                case 6:
                    B.mostrarLibrosDispinibles(listaLibros1);
                    break;

                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("Las opciones disponibles del 1 a 7 ");

            }//fin switch

        } while (salir == false); //fin do-while

    

}// fin main

}// fin class
