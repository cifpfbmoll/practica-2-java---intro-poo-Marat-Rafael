package eu.cifpfbmoll.biblioteca;

import static eu.cifpfbmoll.biblioteca.Libro.anadirLibro;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroISBN;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroTitulo;
import static eu.cifpfbmoll.biblioteca.Libro.eliminarLibro;
import static eu.cifpfbmoll.biblioteca.Persona.anadirPersonalBiblioteca;
import static eu.cifpfbmoll.biblioteca.Persona.eliminarPersonal;
import static eu.cifpfbmoll.biblioteca.Persona.mostrarPersonal;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBiblioteca {

    public static void main(String[] args) {
        //creamos lista de personal para futuro uso
        ArrayList<Persona> listaPersonal1 = new ArrayList<>();

        //creamos biblioteca 
        Biblioteca B = new Biblioteca();

        //creamos lista de libros
        ArrayList<Libro> listaLibros1 = new ArrayList<>();

        //creamos lista del personal de la biblioteca
        ArrayList<Persona> P = new ArrayList<>();

        //creamos algunos libros para la biblioteca para probar
        // Libro  atributos : ISBN +  titulo + autor  + editorial + numCopias  + numCopiasDisponible 
        Libro l1 = new Libro("167545677", "Divina comedia", "Dante", "La Pajarita Roja", 15, 10);
        Libro l2 = new Libro("197545677", "Divina comedia", "Dante", "Algani Editorial", 55, 0);
        Libro l3 = new Libro("198545677", "Divina comedia", "Dante", "Editorial Denes", 55, 55);
        Libro l4 = new Libro("068364926", "Don Quijote de la Mancha 1", "Cervantes", "Andavira Editora", 55, 35);
        Libro l5 = new Libro("068364899", "Don Quijote de la Mancha 2", "Cervantes", "Andavira Editora", 55, 33);
        Libro l7 = new Libro("586305f97", "El idiota", "Dostoievski", "La Pajarita Roja", 15, 0);
        Libro l8 = new Libro("509365028", "El idiota", "Dostoievski", "Calambur Editorial", 15, 5);
        Libro l9 = new Libro("975689215", "Almas muertas", "Dostoievski", "La Pajarita Roja", 11, 1);
        Libro l10 = new Libro("587348122", "Lolita", "Nabokov", "La Pajarita Roja", 100, 0);
        Libro l20 = new Libro("683745554", "Romancero gitano", "Lorca", "Kraicon", 1000, 568);
        Libro l21 = new Libro("683745654", "Romancero gitano", "Lorca", "Algani Editorial", 1000, 955);
        Libro l22 = new Libro("898945677", "Romancero gitano", "Lorca", "Calambur Editorial", 95, 95);
        Libro l23 = new Libro("233364926", "Don Quijote de la Mancha 1", "Cervantes", "Calambur Editorial", 20, 0);
        Libro l24 = new Libro("235364899", "Don Quijote de la Mancha 2", "Cervantes", "Calambur Editorial", 20, 0);
        Libro l30 = new Libro("111122222", "Guerra y paz 1", "Tolstoi", "La Pajarita Roja", 20, 20);
        Libro l31 = new Libro("111133333", "Guerra y paz 2", "Tolstoi", "La Pajarita Roja", 20, 20);
        Libro l32 = new Libro("111144444", "Guerra y paz 3", "Tolstoi", "La Pajarita Roja", 20, 20);
        Libro l33 = new Libro("111155555", "Guerra y paz 4", "Tolstoi", "La Pajarita Roja", 20, 20);

        listaLibros1.add(l1);
        listaLibros1.add(l2);
        listaLibros1.add(l3);
        listaLibros1.add(l4);
        listaLibros1.add(l5);
        listaLibros1.add(l7);
        listaLibros1.add(l8);
        listaLibros1.add(l9);
        listaLibros1.add(l10);
        listaLibros1.add(l20);
        listaLibros1.add(l21);
        listaLibros1.add(l22);
        listaLibros1.add(l23);
        listaLibros1.add(l24);
        listaLibros1.add(l30);
        listaLibros1.add(l31);
        listaLibros1.add(l32);
        listaLibros1.add(l33);

        // creamos algunas personas para lista del personal
        Persona p1 = new Persona("Alex", "Bascota", "11111111x", "alex");
        Persona p2 = new Persona("Aaron", "Fernandez", "22222222x", "aaron");
        Persona p3 = new Persona("Jose Luis", "Saiz", "33333333x", "jose");
        Persona p4 = new Persona("Marc", "Aguilo", "44444444x", "marc");
        Persona p5 = new Persona("Joan", "Gila", "55555555x", "joan");

        // añadimos personal a la lista del personal
        listaPersonal1.add(p1);
        listaPersonal1.add(p2);
        listaPersonal1.add(p3);
        listaPersonal1.add(p4);
        listaPersonal1.add(p5);

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("");
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

                case 1: //añadir libro
                    anadirLibro(listaLibros1);
                    //anadirPersonalBiblioteca(listaPersonal1);                   
                    // probando otro metodo
                    break;

                case 2: // eliminar libro                   
                    eliminarLibro(listaLibros1);
                    //eliminarPersonal(listaPersonal1);
                    //probando otro metodo
                    break;

                case 3:// buscar libro por ISBN                   
                    buscarLibroISBN(listaLibros1);
                    //mostrarPersonal(listaPersonal1);
                    // probando otro metodo
                    break;

                case 4://buscar libro por titulo
                    buscarLibroTitulo(listaLibros1);
                    break;

                case 5:// mostrar todos libros
                    B.mostrarTodosLibros(listaLibros1);
                    break;

                case 6: // mostrar solo disponibles libros
                    B.mostrarLibrosDispinibles(listaLibros1);
                    break;

                case 7://salir
                    salir = true;
                    break;

                default:
                    System.out.println("Las opciones disponibles del 1 a 7 ");

            }//fin switch

        } while (salir == false); //fin do-while

    }// fin main

}// fin class
