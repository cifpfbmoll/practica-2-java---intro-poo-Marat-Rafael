/*
Al incluir los usuarios serán estos los que reserven los libros. 
Piensa, que actualmente un usuario no puede reservar un libro si el usuario tiene más de 5 libros reservados, 
previamente tiene que devolverlos, por tanto, tu programa debe permitir la reserva y devolución de libros, 
así como listado de reservas realizadas por un usuario de la biblioteca. 
 */
package eu.cifpfbmoll.biblioteca;

//import static eu.cifpfbmoll.biblioteca.Libro.*;
//import static eu.cifpfbmoll.biblioteca.Usuario.*;
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
    private int id;
    private Usuario usuario = new Usuario(); // si no iniciamos puede haver error null exception
    private Libro libro = new Libro();
    private String fechaReserva;
    private String fechaDevolucion;

    /**
     * constructor vacio
     */
    public Reserva() {
        IDreserva++;
        id = IDreserva;
    }

    /**
     *
     * @param fechaReserva
     * @param fechaDevolucion
     * @param libro
     * @param usuario
     */
    public Reserva(Usuario usuario, Libro libro, String fechaReserva, String fechaDevolucion) {
        this.id = IDreserva;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
        IDreserva++;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Reserva " + id + " { " + "usuario=" + usuario + ", libro=" + libro + ", fechaReserva=" + fechaReserva + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

    public static void crearReserva(Biblioteca miBiblioteca) {
        //***************nif usuario
        String nifUsuario = pedirNifUsuario(miBiblioteca);

        // al saber nif comprobamos cuantas reservas tiene
        boolean permiso = controlReserva(nifUsuario, miBiblioteca);
        // si no tiene permiso salta mesaje 
        if (!permiso) {
            System.out.println("Tiene mas de 5 reservas actuales no puede hacer mas");
        } else {
            // si tiene permiso siguimos con creacion de la reserva
            //*************** Libro
            String isbnLibro = pedirIsbnLibro(miBiblioteca);

            // indicamos fecha del inicio
            System.out.println("La fecha de hoy: ");
            String fechaReserva = sc.nextLine();

            //indicamos fecha del final
            System.out.println("Fecha para devolver libro: ");
            String fecheDevolver = sc.nextLine();

            // creamos nueva instancia del usuario
            Usuario usuarioReserva;
            // le aplicamos metodo que nos devuelve objeto Usuario existente de miBiblioteca
            usuarioReserva = confirmarUsuario(nifUsuario, miBiblioteca);

            // creamos nueva instancia de libro
            Libro libroReserva;
            // al libro aplicamos metodo que devuelve libro de la lista de libros de miBiblioteca
            libroReserva = confirmarLibro(isbnLibro, miBiblioteca);

            // usamos todos datos para crear nueva instancia de Reserva
            Reserva reserva = new Reserva(usuarioReserva, libroReserva, fechaReserva, fecheDevolver);
            miBiblioteca.getListaReserva().add(reserva);

        }

    }//fin metodo creaReserva

    /**
     * Devuelve objeto usuario a partir del nif
     *
     * @param nifUsuario
     * @param miBiblioteca
     * @return
     */
    public static Usuario confirmarUsuario(String nifUsuario, Biblioteca miBiblioteca) {
        // variable para listaUsuarios de miBiblioteca
        ArrayList<Usuario> listaUsuarios = miBiblioteca.getListaUsuario();
        //un nuevo objeto usuariovacio donde copiamos datos si usuario existe
        Usuario usuarioConfirmado = new Usuario();
        boolean encontrado = false;

        for (int i = 0; i < listaUsuarios.size(); i++) {
            // con for acedemos a cada elemento de listaUsuarios de mi biblioteca y comprobamos nif
            if (listaUsuarios.get(i).getNIF().equalsIgnoreCase(nifUsuario)) {
                encontrado = true;
                // guardamos usuario de la lista en variable usuarioConfirmado
                usuarioConfirmado = miBiblioteca.getListaUsuario().get(i);
            }
        }
        return usuarioConfirmado;
    }// fin metodo ConfirmarUsuario

    /**
     * devuelve objeto libro apartir de isbn
     *
     * @param ISBN
     * @param miBiblioteca
     * @return
     */
    public static Libro confirmarLibro(String ISBN, Biblioteca miBiblioteca) {
        //creamos nuevo libro vacio, para despues copiar aqui datos de la lista
        Libro libroConfirmado = new Libro();
        boolean encontrado = false;
        // creamos variable para la lista de libros
        ArrayList<Libro> listaLibros = miBiblioteca.getListaLibros();

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getISBN().equalsIgnoreCase(ISBN)) {
                encontrado = true;
                libroConfirmado = listaLibros.get(i);
            }
        }

        return libroConfirmado;
    }// fin metodo confirmarLibro

    public static void mostrarReservas(Biblioteca miBiblioteca) {
        ArrayList<Reserva> listaReservas = miBiblioteca.getListaReserva();
        for (int i = 0; i < listaReservas.size(); i++) {
            System.out.println(listaReservas.get(i).toString());
        }

    }//fin mostrarReservas

    public void buscarReservaUsuarioNombre(String nombreUsuario, Biblioteca miBiblioteca) {
        int contador = 0;
        // creamos arraylist para reservas de mibiblioteca
        ArrayList<Reserva> listaReserva = miBiblioteca.getListaReserva();

        //nuevo objeto de resera para gurdar reserva encontrada
        Reserva reservaEncontrada = new Reserva();

        //ArrayList para gurdar reservas encontradas
        ArrayList<Reserva> listaReservaEncontrada = new ArrayList();
        //
        boolean encontrado = false;

        // recorremos arraylist
        for (int i = 0; i < listaReserva.size(); i++) {
            // si el nombre de usuario coincide 
            if (listaReserva.get(i).getUsuario().getNombre().equalsIgnoreCase(nombreUsuario)) {
                encontrado = true;
                contador++;
                // objeto Reserva que encontramos guardamos en objeto reserva
                reservaEncontrada = listaReserva.get(i);
                // este objeto metemos en la lista de Reservas Encontradas
                listaReservaEncontrada.add(this);
            }

        }
        if (encontrado) {
            System.out.println("Con el nombre del usuario: " + nombreUsuario + " encontramos " + contador + " reserva/s");
            for (int i = 0; i < listaReservaEncontrada.size(); i++) {
                System.out.println(listaReservaEncontrada.get(i).toString());

            }
        } else {
            System.out.println("Con el nombre del usuario " + nombreUsuario + " no encontramos ninguna reserva");
        }

    }// fin metodo buscarReservaNombreUsuario

    /**
     * un metodo para pedir NIF del usuario, hasta que no introduce nif que
     * existe en la biblioteca
     *
     * @param miBiblioteca pasamos como parametro objeto de Biblioteca
     * mibiblioteca, que contiene lista de usuarios
     * @return
     */
    public static String pedirNifUsuario(Biblioteca miBiblioteca) {
        // variable para gurdar nif del usuario
        String nifUsuario = "";

        // variable donde guardamos lista de Usuarios desde miBiblioteca
        ArrayList<Usuario> listaUsuarios = miBiblioteca.getListaUsuario();
        // boolean para usar como salida del bucle
        boolean nifUsuarioExiste = false;

        do {
            System.out.println("NIF del usuario");
            nifUsuario = sc.nextLine();
            // llamamos al metodo para comprobar si usuario existe
            if (Usuario.buscarUsuarioNifBoolean(nifUsuario, miBiblioteca)) {
                nifUsuarioExiste = true;
            }

        } while (!nifUsuarioExiste);
        // devolvemos Nif , ya sabemos que este nif esta en la lista de Usuarios
        return nifUsuario;
    }// fin pedir NifUsuario

    /**
     * metodo para pedir isbn del libro que existe en la lista
     *
     * @param miBiblioteca
     * @return
     */
    public static String pedirIsbnLibro(Biblioteca miBiblioteca) {
        // variable para guardar isbn del libro para reservar
        String isbnLibro = "";
        // ArrayList para guardar lista de librod de la biblioteca
        ArrayList<Libro> listaLibros = miBiblioteca.getListaLibros();
        //boolean para usar como salida del bucle
        boolean isnbExiste = false;

        do {
            System.out.println("ISBN del libro");
            isbnLibro = sc.nextLine();
            // llamamos al metodo para comprobar que el libro  existe en la lista 
            if (Libro.buscarLibroIsbnBoolean(isbnLibro, listaLibros)) {
                isnbExiste = true;
            }
        } while (!isnbExiste);
        //
        return isbnLibro;
    }// fin metodo pedirisbnlibro

    /**
     * metodo devuelve false si hay mas de 5 reservas por usuario
     *
     * @param nifUsuario
     * @param miBiblioteca
     * @return
     */
    public static boolean controlReserva(String nifUsuario, Biblioteca miBiblioteca) {
        int contadorReservas = 0;
        ArrayList<Reserva> listaReservas = miBiblioteca.getListaReserva();
        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getUsuario().getNIF().equalsIgnoreCase(nifUsuario)) {
                contadorReservas++;
            }
        }
        if (contadorReservas >= 5) {
            return false;
        } else {
            return true;
        }
    }// fin metodo controlReserva

    public static void borrarReserva(Biblioteca miBiblioteca) {
        //creamos un objeto de la Reserva para mostrar la reserva que borramos
        Reserva reservaBorrar = new Reserva();
        
        // pedimos id para borrar
        System.out.println("Indica ID de la reserva para borrar");
        int idBorrar = sc.nextInt();

        ArrayList<Reserva> listaReserva = miBiblioteca.getListaReserva();
        for (int i = 0; i < listaReserva.size(); i++) {
            // como es un numero usamos == para comparar
            if (listaReserva.get(i).getId() == idBorrar) {
                reservaBorrar = listaReserva.get(i);
                System.out.println(reservaBorrar.toString());
                System.out.println("Estas seguro que desea borrar reserva " + idBorrar + " ?");
                System.out.println("1 - si borramos");
                System.out.println("0 - no volvemos");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        listaReserva.remove(i);
                        
                        System.out.println("Reserva "+idBorrar+" borrado con exito");
                        break;
                    case 2:
                        break;
                }

            }
        }
    }//fin metodo borrarReserva
    
}// fin clase Reserva
