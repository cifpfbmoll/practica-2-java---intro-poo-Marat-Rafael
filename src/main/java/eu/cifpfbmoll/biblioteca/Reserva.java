/*
Al incluir los usuarios serán estos los que reserven los libros. 
Piensa, que actualmente un usuario no puede reservar un libro si el usuario tiene más de 5 libros reservados, 
previamente tiene que devolverlos, por tanto, tu programa debe permitir la reserva y devolución de libros, 
así como listado de reservas realizadas por un usuario de la biblioteca. 
 */
package eu.cifpfbmoll.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Marat Rafael
 */
public class Reserva {

    public static Scanner sc = new Scanner(System.in);

    //atributos
    private static int IDreserva;
    private Usuario usuario = new Usuario(); // si no iniciamos puede haver error null exception
    private Libro libro = new Libro();
    private String fechaReserva;
    private String fechaDevolucion;

    /**
     * constructor vacio
     */
    public Reserva() {
        IDreserva++;
    }

    /**
     *
     * @param fechaReserva
     * @param fechaDevolucion
     * @param libro
     * @param usuario
     */
    public Reserva( Usuario usuario, Libro libro, String fechaReserva, String fechaDevolucion ) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
        IDreserva++;
    }

    public static int getIDreserva() {
        return IDreserva;

    }

    public static void setIDreserva(int IDreserva) {
        Reserva.IDreserva = IDreserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Reserva { " + "usuario=" + usuario + ", libro=" + libro + ", fechaReserva=" + fechaReserva + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

    public static void crearReserva(ArrayList <Reserva> listaReservas) {
        System.out.println("NIF del usuario");
        String nifUsuario = sc.nextLine();

        System.out.println("ISBN del libro");
        String isbnLibro = sc.nextLine();

        System.out.println("La fecha de hoy: ");
        String fechaReserva = sc.nextLine();

        System.out.println("Fecha para devolver libro: ");
        String fecheDevolver = sc.nextLine();
        
        // como buscar en la lista de la biblioteca desde aqui ? para buscar usuario en su lista y libro en su lista      
        // instancia de miBiblioteca esta en AppBiblioteca
        Usuario usuario = new Usuario();
               
        Libro libro = new Libro();
        
        Reserva reserva = new Reserva();
        
    }

}
