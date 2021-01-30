
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

public class Biblioteca {

    //atributos
    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Persona> listaPersonal;

    //constructores
    // constructor vacio
    public Biblioteca() {
    }
    //constructor con todos parametros

    public Biblioteca(String nombre, ArrayList listaLibros, ArrayList listaPersonal) {
        this.nombre = nombre;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
    }

    //constructor copia 
    public Biblioteca(Biblioteca biblioteca) {
        this.nombre = biblioteca.nombre;
        this.listaLibros = biblioteca.listaLibros;
        this.listaPersonal = biblioteca.listaPersonal;
    }

    // metodos getter/setter
    public String getNombre() {
        return nombre;
    }

    //control en el setter de manera que el nombre de la biblioteca empiece en mayúsculas.
    public void setNombre(String nombre) {
        while (nombre.charAt(0) < 65 || nombre.charAt(0) > 90) {
            // comprobamos con la tabla ASCII A=65 Z=90
            System.out.println("Nombre debe empezar por mayuscula");
            Scanner sc = new Scanner(System.in);
            nombre = sc.nextLine();
        }
        this.nombre = nombre;
    }

    public ArrayList getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    //toString
    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", listaLibros=" + listaLibros + ", listaPersonal=" + listaPersonal + '}';
    }

    // resto de metodos
    //Mostrar libros. Imprimirá por pantalla toda la lista de libros. (método instancia)
    public void mostrarTodosLibros(ArrayList <Libro> listaLibros) {
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println(listaLibros.get(i));
        }
    }

    //Mostrar libros disponibles. Solo imprime la lista de los libros disponibles. (método instancia)
    public void mostrarLibrosDispinibles(ArrayList <Libro> listaLibros) {
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
