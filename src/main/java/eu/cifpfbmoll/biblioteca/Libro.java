
package eu.cifpfbmoll.biblioteca;

import java.util.Scanner;

public class Libro {
    private static Scanner sc = new Scanner(System.in);
    //atributos
    private static int contadorLibros;
    
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisponible;
    
    //constructores
    // constructor vacio
    public Libro() {
    }
    //constructor con todos atributos
    public Libro(String ISBN, String titulo, String autor, String editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    //constructor copia
    public Libro(Libro libro) {
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
        while (numCopias<1){
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
    
    // metodo para añadir nuevo libro
    public static Libro anadirLibro(){
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
        
        return nuevoLibro;
    }// fin anadir nuevolibro
    
    // metodo para eliminar libro
    
    public static void eliminarLibro(){
        
        
        
    }
    
    
    
}// fin clase
