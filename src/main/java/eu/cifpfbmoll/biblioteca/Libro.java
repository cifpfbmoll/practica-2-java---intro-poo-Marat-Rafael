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

/**
 *
 * @author Marat Rafael
 */
public class Libro {

    //declaramos objeto static de escaner 'sc'
    private static Scanner sc = new Scanner(System.in);

    //atributos
    private static int contadorLibros; // contador  global de todos los libros
    // estatico pertenece a todo la clase

    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisponible;

    //CONSTRUCTORES
    /**
     * constructor vacio
     */
    public Libro() {
        contadorLibros++; // contador global de libros
    }

    //constructor con todos atributos
    /**
     *
     * @param ISBN
     * @param titulo
     * @param autor
     * @param editorial
     * @param numCopias
     * @param numCopiasDisponibles
     */
    public Libro(String ISBN, String titulo, String autor, String editorial, int numCopias, int numCopiasDisponibles) {
        contadorLibros++; // contador global de todos libros

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numCopias = numCopias;
        this.numCopiasDisponible = numCopiasDisponibles;
    }

    //constructor copia
    /**
     *
     * @param libro pasamos como parametro un objeto para hacer copia de el
     */
    public Libro(Libro libro) {
        contadorLibros++; // contador global de todos libros

        this.ISBN = libro.ISBN;
        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.editorial = libro.editorial;
        this.numCopias = libro.numCopias;
        this.numCopiasDisponible = libro.numCopiasDisponible;
    }

    // metodos getter y setter
    /**
     *
     * @return devuelve contador de libros, es estatico , comun para todos
     */
    public static int getContadorLibros() {
        return contadorLibros;
    }

    /**
     *
     * @param contadorLibros se establece contador de libros
     */
    public static void setContadorLibros(int contadorLibros) {
        Libro.contadorLibros = contadorLibros;
    }

    /**
     *
     * @return devuelve ISBN del libro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     *
     * @param ISBN se establece un ISBN para un libro
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     *
     * @return devuelve titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo se establece un titulo para libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return devuelve autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     *
     * @param autor se establece autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *
     * @return devuelve editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     *
     * @param editorial se establece editorial del libro
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     *
     * @return devuelve numero de copias
     */
    public int getNumCopias() {
        return numCopias;
    }

    /**
     *
     * @param numCopias se establece numero de copias, no acepta numeros menor
     * que uno
     */
    public void setNumCopias(int numCopias) {
        while (numCopias < 1) {
            System.out.println("Numero de copias inicial no puede ser menos que 1 ");
            numCopias = sc.nextInt();
        }
        this.numCopias = numCopias;
    }

    /**
     *
     * @return devuelve numero de copias disponibles
     */
    public int getNumCopiasDisponible() {
        return numCopiasDisponible;
    }

    /**
     *
     * @param numCopiasDisponible se establece numero de copias dicponibles
     */
    public void setNumCopiasDisponible(int numCopiasDisponible) {
        this.numCopiasDisponible = numCopiasDisponible;
    }
    // metodo toString

    @Override
    public String toString() {
        return "Libro { " + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", numCopias=" + numCopias + ", numCopiasDisponible=" + numCopiasDisponible + '}';
    }

    // resto de  metodos
    /*
     Añadir libro. Solicitará los datos para crear un libro 
    y añadirá dicho libro a una lista de libros que recibirá como parámetro el método.
     */
    /**
     *
     * @param listaLibros pasamos como parametro un ArrayList de listado de
     * libros durante ejecucion del metodo se rellena atributos del libro, y
     * añade este libro a la lista que pasamos como parametro
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
        sc.nextLine();

        listaLibros.add(nuevoLibro);
        System.out.println(nuevoLibro.toString());
        System.out.println("Añadido con exito.");

    }// fin metodo anadir nuevolibro

    /*
    Eliminar libro
    . Solicitará al usuario un ISBN , lo buscará y lo eliminará de la lista 
    que recibirá como parámetro el método.
    No se puede eliminar un libro que tiene reservas.
     */
    /**
     *
     * @param listaLibros pasamos como parametro un ArrayList de listado de
     * libros primero comprobamos que numero de libro es igual a copias
     * disponibles si es asi , elimina libro de la lista que le pasamos como
     * parametro
     */
    public static void eliminarLibro(ArrayList<Libro> listaLibros) {
        System.out.println("Escribe ISBN para borrar libro de la lista");
        String isbn = sc.nextLine();
        boolean encontrado = false;
        int index = -1;
        Libro libroBorrado = new Libro();
        //nuevo objeto Libro, usamos para mostrar que libro esta borrado

        //recorremos listaArray con for
        for (int i = 0; i < listaLibros.size(); i++) {

            // si numero de copias  es igual a numero de copias disponible , quere decir que no hay reservas
            if (listaLibros.get(i).getNumCopias() == listaLibros.get(i).getNumCopiasDisponible()) {
                // buscamos si isbn introducido por usuario coincide con uno de lista
                if (listaLibros.get(i).getISBN().equals(isbn)) {
                    encontrado = true; //encontamos
                    index = i;
                    libroBorrado = listaLibros.get(index); //copiamos libro para mostrar al usuario 
                    //si coincide - eliminamos
                    listaLibros.remove(i);
                }
            }
        }// fin for
        // mostramos mensaje si libro esta eliminado o no
        if (encontrado) {
            System.out.println(libroBorrado.toString());
            System.out.println("Eliminado con exito.");
        } else {
            System.out.println("No encontramos libro con ISBN indicado: " + isbn);
        }

    }// fin metodo eliminarLibro

    // Buscar libro por ISBN. Pedirá al usuario un ISBN, lo buscará en la lista que recibirá como parámetro el método. 
    // En caso de encontrarlo devolverá la posición en la que se encuentra, en caso contrario devolverá -1.
    /**
     *
     * @param listaLibros pasamos como parametro un ArrayList de listado de
     * libros donde buscamos libro
     * @return devuelve index del libro dentro de la lista si no se encuentra
     * devuelve -1 pedimos al usuario ISBN y buscamos en la lista
     */
    public static int buscarLibroISBN(ArrayList<Libro> listaLibros) {
        boolean encontrado = false;
        System.out.println("Escribe ISBN para buscar: ");
        String isbn = sc.nextLine();
        int index = -1;
        // recoremos array con for
        for (int i = 0; i < listaLibros.size(); i++) {
            // si isbn de usuario coincide con getISBN
            if (listaLibros.get(i).getISBN().equals(isbn)) {
                // guardamos en index posicion
                index = i;
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println(listaLibros.get(index).toString());
        } else {
            System.out.println("No encontrado libro con ISBN indicado " + isbn);
        }
        return index;
    }// fin metodo buscarLibro

    /*
    Buscar libro por título. Pedirá al usuario un título, 
    lo buscará en la lista que recibirá como parámetro el método. 
    Mostrará cualquier libro que contenga la cadena buscada.
     */
    /**
     *
     * @param listaLibros pasamos como parametro un ArrayList de listado de
     * libros preguntamos al usuario titulo del libro y lo buscamos
     */
    //conteins
    public static void buscarLibroTitulo(ArrayList<Libro> listaLibros) {
        boolean encontrado = false;
        //creamos nuevo objeto vacio libro
        Libro libro;
        //pedimos titulo para buscar
        System.out.println("Escribe un titulo para buscar: ");
        String titulo = sc.nextLine();

        // declaramos una nueva lista para guardar todos titulos que encontramos
        ArrayList<Libro> listaLibrosEncontrados = new ArrayList<Libro>();

        // recorremos array de libros que nos pasa como parametro
        for (int i = 0; i < listaLibros.size(); i++) {
            // si el titulo del usuario es equals a getTitulo
            if (listaLibros.get(i).getTitulo().equals(titulo)) {
                //lo guardamos en objeto libro
                libro = listaLibros.get(i);
                //añadimos a la lista
                listaLibrosEncontrados.add(libro);
                encontrado = true;

            }
        }//fin for buscar libro y añadir a lista
        if (!encontrado) {
            System.out.println("No encontrado este titulo");
        }

        // 'for' mostramos libros encontrados, que tenemos guardados en array
        for (int i = 0; i < listaLibrosEncontrados.size(); i++) {
            System.out.println(listaLibrosEncontrados.get(i).toString());
        }// fin mostrar libros de la lista que emos encontrado    

    }//fin metodo buscarLibroTitulo

    /**
     * metodo para comprobar si isnb existe en la lista de libros de miBiblioteca
     * @param isbnLibroBuscado
     * @param listaLibros
     * @return true o false
     */
    public static boolean buscarLibroIsbnBoolean(String isbnLibroBuscado, ArrayList<Libro> listaLibros) {
        // recorremos array
        for (int i = 0; i < listaLibros.size(); i++) {
            // devolvemos true si coincide isbn indicado con del la lista
            if(listaLibros.get(i).getISBN().equalsIgnoreCase(isbnLibroBuscado)){
                return true;
            }       
        }
        return false;
    }// fin metodo

}// fin clase

/*
    static (pertenece a la clase)  vs instancia( pertenece al objeto creado)
   
 */
