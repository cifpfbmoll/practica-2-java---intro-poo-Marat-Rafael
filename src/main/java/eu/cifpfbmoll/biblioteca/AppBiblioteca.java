package eu.cifpfbmoll.biblioteca;

import static eu.cifpfbmoll.biblioteca.Libro.anadirLibro;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroISBN;
import static eu.cifpfbmoll.biblioteca.Libro.buscarLibroTitulo;
import static eu.cifpfbmoll.biblioteca.Libro.eliminarLibro;
import static eu.cifpfbmoll.biblioteca.Usuario.anadirUsuario;
import static eu.cifpfbmoll.biblioteca.Usuario.borrarUsuario;
import static eu.cifpfbmoll.biblioteca.Usuario.mostrarUsuarios;
import java.util.ArrayList;
//import static eu.cifpfbmoll.biblioteca.Persona.anadirPersonalBiblioteca;
//import static eu.cifpfbmoll.biblioteca.Persona.eliminarPersonal;
//import static eu.cifpfbmoll.biblioteca.Persona.mostrarPersonal;

//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author administrador
 */
public class AppBiblioteca {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //creamos nuevo ArrayList para almacenar los usuarios
        ArrayList<Usuario> listaUsuarios1 = new ArrayList<>();

        // declaramos lista del personal para añadir dentro de la biblioteca
        ArrayList<Persona> listaPersonal1 = new ArrayList<>();
        //creamos lista de libros para añadir a la biblioteca
        ArrayList<Libro> listaLibros1 = new ArrayList<>();
        //creamos biblioteca con constructor con todos parametros , damos nombre y añadimos listaPersonal1 y listaLibro1
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Borja Moll", listaLibros1, listaPersonal1);

        // creamos algunos usuarios de la biblioteca
        Usuario u1 = new Usuario("Aarón", "Fernández", "111", "aaron");
        Usuario u2 = new Usuario("Alex", "Baskota", "112", "alex");
        Usuario u3 = new Usuario("Jaume", "Fullana", "113", "jaume");
        Usuario u4 = new Usuario("Joan", "Gil", "114", "gil");
        Usuario u5 = new Usuario("Jose Luis", "Cardona ", "115", "jose");
        Usuario u6 = new Usuario("Josep", "Fayos", "116", "josep");
        Usuario u7 = new Usuario("Marc", "Aguilo", "117", "marc");
        Usuario u8 = new Usuario("Sergio", "Gonzalez", "118", "sergio");
        Usuario u9 = new Usuario("Tamara", "Fernandez", "119", "sergio");

        // añadimos usuarios a la lista
        listaUsuarios1.add(u1);
        listaUsuarios1.add(u2);
        listaUsuarios1.add(u3);
        listaUsuarios1.add(u4);
        listaUsuarios1.add(u5);
        listaUsuarios1.add(u6);
        listaUsuarios1.add(u7);
        listaUsuarios1.add(u8);
        listaUsuarios1.add(u9);

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

        miBiblioteca.getListaLibros().add(l1);
        miBiblioteca.getListaLibros().add(l2);
        miBiblioteca.getListaLibros().add(l3);
        miBiblioteca.getListaLibros().add(l4);
        miBiblioteca.getListaLibros().add(l5);
        miBiblioteca.getListaLibros().add(l7);
        miBiblioteca.getListaLibros().add(l8);
        miBiblioteca.getListaLibros().add(l9);
        miBiblioteca.getListaLibros().add(l10);
        miBiblioteca.getListaLibros().add(l20);
        miBiblioteca.getListaLibros().add(l21);
        miBiblioteca.getListaLibros().add(l22);
        miBiblioteca.getListaLibros().add(l23);
        miBiblioteca.getListaLibros().add(l24);
        miBiblioteca.getListaLibros().add(l30);
        miBiblioteca.getListaLibros().add(l31);
        miBiblioteca.getListaLibros().add(l32);
        miBiblioteca.getListaLibros().add(l33);

        // creamos algunas personas para lista del personal
        Persona p1 = new Persona("Alex", "Bascota", "11111111x", "alex");
        Persona p2 = new Persona("Aaron", "Fernandez", "22222222x", "aaron");
        Persona p3 = new Persona("Jose Luis", "Saiz", "33333333x", "jose");
        Persona p4 = new Persona("Marc", "Aguilo", "44444444x", "marc");
        Persona p5 = new Persona("Joan", "Gila", "55555555x", "joan");

        // añadimos personal a la lista del personal
        miBiblioteca.getListaPersonal().add(p1);
        miBiblioteca.getListaPersonal().add(p2);
        miBiblioteca.getListaPersonal().add(p3);
        miBiblioteca.getListaPersonal().add(p4);
        miBiblioteca.getListaPersonal().add(p5);

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
            sc.nextLine();

            switch (opcion) {

                case 1: //añadir libro
                    anadirLibro(miBiblioteca.getListaLibros());
                    //anadirPersonalBiblioteca(listaPersonal1);  //probando anadir personal
                    //anadirUsuario(listaUsuarios1); //probando anadirUsuario

                    break;

                case 2: // eliminar libro                   
                    eliminarLibro(miBiblioteca.getListaLibros());
                    //eliminarPersonal(listaPersonal1); //probando eliminarPersonal
                    //borrarUsuario(listaUsuarios1); //probando borrarUsuario

                    break;

                case 3:// buscar libro por ISBN                   
                    buscarLibroISBN(miBiblioteca.getListaLibros());
                    //mostrarPersonal(listaPersonal1);

                    break;

                case 4://buscar libro por titulo
                    buscarLibroTitulo(miBiblioteca.getListaLibros());
                    break;

                case 5:// mostrar todos libros
                    miBiblioteca.mostrarTodosLibros(miBiblioteca.getListaLibros());
                    //mostrarUsuarios(listaUsuarios1);
                    break;

                case 6: // mostrar solo disponibles libros
                    miBiblioteca.mostrarLibrosDispinibles(miBiblioteca.getListaLibros());
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
