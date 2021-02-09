
/*   Una clase llamada Biblioteca
Concretamente debemos almacenar:    nombre de la biblioteca, 
                                   lista de libros y 
                                    lista de personal que gestiona la biblioteca. 
Para esta clase debes crear constructor vacío, constructor con todos los parámetros, constructor copia, toString, getters/setters (DTO). 
Debe haber un control en el setter de manera que el nombre de la biblioteca empiece en mayúsculas.

Mostrar libros. Imprimirá por pantalla toda la lista de libros. (método instancia)
Mostrar libros disponibles. Solo imprime la lista de los libros disponibles. (método instancia)

 */
package eu.cifpfbmoll.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marat Rafael
 */
public class Biblioteca {

    //atributos
    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Persona> listaPersonal;
    private ArrayList<Usuario> listaUsuario;

    //constructores
    // constructor vacio
    public Biblioteca() {
    }
    //constructor con todos parametros

    /**
     *
     * @param nombre nombre de la biblioteca
     * @param listaLibros lista de libros que tiene la biblioteca
     * @param listaPersonal lista del personal que trabaja en la biblioteca
     */
    public Biblioteca(String nombre, ArrayList listaLibros, ArrayList listaPersonal) {
        this.nombre = nombre;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
    }

    //constructor copia 
    /**
     *
     * @param biblioteca pasamos como parametro una biblioteca para crear una
     * copia exacta
     */
    public Biblioteca(Biblioteca biblioteca) {
        this.nombre = biblioteca.nombre;
        this.listaLibros = biblioteca.listaLibros;
        this.listaPersonal = biblioteca.listaPersonal;
    }

    /**
     * nuevo constructor con todos atributos de antes y mas lista usuarios
     *
     * @param nombre nombre de la biblioteca
     * @param listaLibros ArrayList pasamos como parametro lista de libros
     * @param listaPersonal ArrayList pasamos como parametro lista de personal
     * @param listaUsuario ArrayList pasamos como parametro lista de los
     * usuarios
     */
    public Biblioteca(String nombre, ArrayList<Libro> listaLibros, ArrayList<Persona> listaPersonal, ArrayList<Usuario> listaUsuario) {
        this.nombre = nombre;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
        this.listaUsuario = listaUsuario;
    }
    // metodos getter/setter

    /**
     * @return ArrayList con lista de los usuarios
     */
    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    /**
     *
     * @param listaUsuario se establece nuevo ArrayList de los usuarios
     */
    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    /**
     *
     * @return devuelve nombre de la biblioteca
     */
    public String getNombre() {
        return nombre;
    }

    //control en el setter de manera que el nombre de la biblioteca empiece en mayúsculas.
    /**
     *
     * @param nombre se establece nombre de la biblioteca
     */
    public void setNombre(String nombre) {
        while (nombre.charAt(0) < 65 || nombre.charAt(0) > 90) {
            // comprobamos con la tabla ASCII A=65 Z=90
            System.out.println("Nombre debe empezar por mayuscula");
            Scanner sc = new Scanner(System.in);
            nombre = sc.nextLine();
        }
        this.nombre = nombre;
    }

    /**
     *
     * @return devuelve lista de libros que pertenece a la biblioteca
     */
    public ArrayList getListaLibros() {
        return listaLibros;
    }

    /**
     *
     * @param listaLibros se crea lista de libros para la biblioteca
     */
    public void setListaLibros(ArrayList listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     *
     * @return devuelve la lista del personal de la biblioteca
     */
    public ArrayList getListaPersonal() {
        return listaPersonal;
    }

    /**
     *
     * @param listaPersonal se crea lista del personal que trabaja en la
     * biblioteca
     */
    public void setListaPersonal(ArrayList listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    //toString
    @Override
    public String toString() {
        return "Biblioteca {" + "nombre=" + nombre + ", listaLibros=" + listaLibros + ", listaPersonal=" + listaPersonal + '}';
    }

    // resto de metodos
    //Mostrar libros. Imprimirá por pantalla toda la lista de libros. (método instancia)
    /**
     * este metodo permite visualisar todos libros de la biblioteca
     *
     * @param listaLibros pasamos como parametro lista de libros
     */
    public void mostrarTodosLibros(ArrayList<Libro> listaLibros) {
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println(listaLibros.get(i));
        }
    }

    //Mostrar libros disponibles. Solo imprime la lista de los libros disponibles. (método instancia)
    /**
     *
     * @param listaLibros pasamos como parametro una lista de libros y nos
     * muestra libros que estan disponible, si su cantidad es mas que zero
     */
    public void mostrarLibrosDispinibles(ArrayList<Libro> listaLibros) {
        //creamos un objeto de libro
        Libro libro;
        //recorremos array
        for (int i = 0; i < listaLibros.size(); i++) {
            // la posicion de lista con sus valores guardamos en objeto libro
            libro = listaLibros.get(i);
            // acedemos al valor de numero de copias disponibles
            if (libro.getNumCopiasDisponible() > 0) {
                // si valor es mas de 0 , hay disponibles, imprimimos con toString
                System.out.println(libro.toString());
            }
        }
    }
}
