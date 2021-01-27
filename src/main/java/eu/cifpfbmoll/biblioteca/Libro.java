/*
Una clase llamada Libro. Concretamente debemos almacenar: 
ISBN, título, autor, editorial, nº de copias y nº copias disponibles. 
Para esta clase debes crear constructor vacío, constructor con todos los parámetros, 
constructor copia, toString, getters/setters (DTO) y un contador de libros 
(que llevará el control de los diferentes libros que hay en la aplicación). 
Debe haber un control en el setter de manera que el número de copias inicial nunca debe ser menos de 1. 
 */
package eu.cifpfbmoll.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    //declaramos objeto de escaner 'sc'
    private static Scanner sc = new Scanner(System.in);

    //atributos
    private static int contadorLibros;// estatico pertenece a todo la clase

    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisponible;

    //constructores
    // constructor vacio
    public Libro() {
        contadorLibros++;
    }

    //constructor con todos atributos
    public Libro(String ISBN, String titulo, String autor, String editorial) {
        contadorLibros++;

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    //constructor copia
    public Libro(Libro libro) {
        contadorLibros++;
        this.ISBN = libro.ISBN;
        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.editorial = libro.editorial;
    }

    // metodos getter y setter
    public static int getContadorLibros() {
        return contadorLibros;
    }

    public static void setContadorLibros(int contadorLibros) {
        Libro.contadorLibros = contadorLibros;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumCopias() {
        return numCopias;
    }

    // numero de copias inicial no puede ser menos que 1
    public void setNumCopias(int numCopias) {
        while (numCopias < 1) {
            System.out.println("Numero de copias inicial no puede ser menos que 1 ");
            numCopias = sc.nextInt();
        }
        this.numCopias = numCopias;
    }

    public int getNumCopiasDisponible() {
        return numCopiasDisponible;
    }

    public void setNumCopiasDisponible(int numCopiasDisponible) {
        this.numCopiasDisponible = numCopiasDisponible;
    }
    // metodo toString

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    // resto de  metodos
    /*
     Añadir libro. Solicitará los datos para crear un libro 
    y añadirá dicho libro a una lista de libros que recibirá como parámetro el método.
     */
    public static void anadirLibro(ArrayList<Libro> listaLibros) {
        // creamos objeto vacio 
        Libro nuevoLibro = new Libro();

        System.out.println("ISBN del libro: ");
        nuevoLibro.setISBN(sc.nextLine());

        System.out.println("Titulo del libro: ");
        nuevoLibro.setTitulo(sc.nextLine());

        System.out.println("Autor del libro: ");
        nuevoLibro.setAutor(sc.nextLine());

        System.out.println("Editorial del libro: ");
        nuevoLibro.setEditorial(sc.nextLine());

        System.out.println("Copias del libro: ");
        nuevoLibro.setNumCopias(sc.nextInt());

        System.out.println("Copias disponibles del libro: ");
        nuevoLibro.setNumCopiasDisponible(sc.nextInt());

        listaLibros.add(nuevoLibro);

    }// fin anadir nuevolibro

    /*
    Eliminar libro
    . Solicitará al usuario un ISBN , lo buscará y lo eliminará de la lista 
    que recibirá como parámetro el método.
    No se puede eliminar un libro que tiene reservas.
     */
    public static void eliminarLibro(ArrayList<Libro> listaLibros) {
        System.out.println("Escribe ISBN para borrar libro de la lista");
        String isbn = sc.nextLine();

        //recorremos listaArray con for
        for (int i = 0; i < listaLibros.size(); i++) {

            // si numero de copias  es igual a numero de copias disponible , quere decir que no hay reservas
            if (listaLibros.get(i).getNumCopias() == listaLibros.get(i).getNumCopiasDisponible()) {
                // buscamos si isbn introducido por usuario coincide con uno de lista
                if (listaLibros.get(i).getISBN().equals(isbn)) {
                    //si coincide - eliminamos
                    listaLibros.remove(i);
                }
            }
        }// fin for
    }// fin metodo eliminarLibro

    // Buscar libro por ISBN. Pedirá al usuario un ISBN, lo buscará en la lista que recibirá como parámetro el método. 
    // En caso de encontrarlo devolverá la posición en la que se encuentra, en caso contrario devolverá -1.
    public static int buscarLibroISBN(ArrayList<Libro> listaLibros) {

        System.out.println("Escribe ISBN para buscar: ");
        String isbn = sc.nextLine();
        int index = -1;
        // recoremos array con for
        for (int i = 0; i < listaLibros.size(); i++) {
            // si isbn de usuario coincide con getISBN
            if (listaLibros.get(i).getISBN().equals(isbn)) {
                // guardamos en index posicion
                index = i;
            }
        }
        return index;
    }// fin metodo buscarLibro

    /*
    Buscar libro por título. Pedirá al usuario un título, 
    lo buscará en la lista que recibirá como parámetro el método. 
    Mostrará cualquier libro que contenga la cadena buscada.
     */
    public static void buscarLibroTitulo(ArrayList<Libro> listaLibros) {
        Libro libro;
        //pedimos titulo para buscar
        System.out.println("Escribe un titulo para buscar: ");
        String titulo = sc.nextLine();

        // declaramos una nueva lista para guardar todos titulos que encontramos
        ArrayList<Libro> listaLibrosEncontrados = new ArrayList<Libro>();

        // recorremos array de libros que nos pasa como parametro
        for (int i = 0; i < listaLibros.size(); i++) {
            // si el titulo es equals a getTitulo
            if (listaLibros.get(i).getTitulo().equals(titulo)) {
                libro = listaLibros.get(i);
                listaLibrosEncontrados.add(libro);
            }
        }//fin for buscar libro y añadir  a lista

        for (int i = 0; i < listaLibrosEncontrados.size(); i++) {
            System.out.println(listaLibrosEncontrados.get(i).toString());
        }// fin mostrar libros de la lista que emos encontrado    

    }//fin buscarLibroTitulo



}// fin clase


/*
    static (pertenece a la clase)  vs instancia( pertenece al objeto creado)
   

*/
