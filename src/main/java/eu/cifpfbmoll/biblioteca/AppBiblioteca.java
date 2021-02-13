package eu.cifpfbmoll.biblioteca;

//import static eu.cifpfbmoll.biblioteca.Reserva.*;
//import static eu.cifpfbmoll.biblioteca.Libro.*;
//import static eu.cifpfbmoll.biblioteca.Usuario.*;
//import static eu.cifpfbmoll.biblioteca.Persona.*;
import java.util.ArrayList;

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
        // creamos ArrayList para las reservas 
        ArrayList<Reserva> listaReserva1 = new ArrayList();

        //creamos biblioteca con constructor con todos parametros , damos nombre y añadimos listaPersonal1 y listaLibro1, listaUsuarios
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Borja Moll", listaLibros1, listaPersonal1, listaUsuarios1, listaReserva1);

        // creamos algunos Usuarios de la biblioteca
        //public Usuario(String nombre, String apellido, String NIF, String contrasenia) 
        Usuario u1 = new Usuario("Aarón", "Fernández", "111", "aaron");
        Usuario u2 = new Usuario("Alex", "Baskota", "112", "alex");
        Usuario u3 = new Usuario("Jaume", "Fullana", "113", "jaume");
        Usuario u4 = new Usuario("Joan", "Gil", "114", "gil");
        Usuario u5 = new Usuario("Jose Luis", "Cardona ", "115", "jose");
        Usuario u6 = new Usuario("Josep", "Fayos", "116", "josep");
        Usuario u7 = new Usuario("Marc", "Aguilo", "117", "marc");
        Usuario u8 = new Usuario("Sergio", "Gonzalez", "118", "sergio");
        Usuario u9 = new Usuario("Tamara", "Fernandez", "119", "tamara");

        // añadimos Usuarios a la lista
        miBiblioteca.getListaUsuario().add(u1);
        miBiblioteca.getListaUsuario().add(u2);
        miBiblioteca.getListaUsuario().add(u3);
        miBiblioteca.getListaUsuario().add(u4);
        miBiblioteca.getListaUsuario().add(u5);
        miBiblioteca.getListaUsuario().add(u6);
        miBiblioteca.getListaUsuario().add(u7);
        miBiblioteca.getListaUsuario().add(u8);
        miBiblioteca.getListaUsuario().add(u9);

        //creamos algunos libros para la biblioteca para probar
        // Libro  atributos : ISBN +  titulo + autor  + editorial + numCopias  + numCopiasDisponible 
        Libro l1 = new Libro("001", "Divina comedia", "Dante", "La Pajarita Roja", 15, 10);
        Libro l2 = new Libro("002", "Divina comedia", "Dante", "Algani Editorial", 55, 0);
        Libro l3 = new Libro("003", "Divina comedia", "Dante", "Editorial Denes", 55, 55);
        Libro l4 = new Libro("004", "Don Quijote de la Mancha 1", "Cervantes", "Andavira Editora", 55, 35);
        Libro l5 = new Libro("111", "Don Quijote de la Mancha 2", "Cervantes", "Andavira Editora", 55, 33);
        Libro l7 = new Libro("112", "El idiota", "Dostoievski", "La Pajarita Roja", 15, 0);
        Libro l8 = new Libro("113", "El idiota", "Dostoievski", "Calambur Editorial", 15, 5);
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

        // creo unas reservas 
        Reserva r1 = new Reserva(u1, l1, "10/02/2021", "30/02/2021");
        Reserva r2 = new Reserva(u5, l5, "10/02/2021", "30/02/2021");
        Reserva r3 = new Reserva(u1, l2, "11/01/2001", "11/09/2020");
        Reserva r4 = new Reserva(u1, l30, "10/02/2021", "30/02/2021");
        Reserva r5 = new Reserva(u1, l31, "10/02/2021", "30/02/2021");
        Reserva r6 = new Reserva(u1, l32, "10/02/2021", "30/02/2021");

        //añadimos reservas en la lista de reservas
        miBiblioteca.getListaReserva().add(r1);
        miBiblioteca.getListaReserva().add(r2);
        miBiblioteca.getListaReserva().add(r3);
        miBiblioteca.getListaReserva().add(r4);
        miBiblioteca.getListaReserva().add(r5);
        miBiblioteca.getListaReserva().add(r6);
        
        Scanner sc = new Scanner(System.in);
        // para opciones del menu
        byte opcionUsuario;
        byte opcionAdmin;
        byte opcion;

        // boolean para salir
        boolean salir = false;
        boolean salirAdmin = false;
        boolean salirUsuario = false;
        
        do {
            System.out.println("");
            System.out.println("************MENU************");
            System.out.println("1.ADMINISTRADOR");
            System.out.println("2.USUARIO");
            System.out.println("0.SALIR");
            System.out.println("*****************************");
            System.out.println("");
            opcion = sc.nextByte();
            sc.nextLine();
            
            switch (opcion) {
                
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("********ADMINISTRADOR***********");
                        System.out.println("************MENU************");
                        System.out.println("    1.Añadir Libro");
                        System.out.println("    2.Eliminar Libro");
                        System.out.println("    3.Añadir Personal");
                        System.out.println("    4.Eliminar Personal");
                        System.out.println("    5.Mostrar Libros");
                        System.out.println("    6.Mostrar Personal");
                        System.out.println("    7.Añadir Usuario");
                        System.out.println("    8.Borrar Usuario");
                        System.out.println("    9.Buscar Usuario");
                        System.out.println("    10 Mostrar Reservas");
                        System.out.println("    0.Salir");
                        System.out.println("*****************************");
                        System.out.println("");
                        opcionAdmin = sc.nextByte();
                        sc.nextLine();
                        switch (opcionAdmin) {
                            case 1:
                                Libro.anadirLibro(miBiblioteca);
                                break;
                            case 2:
                                Libro.eliminarLibro(miBiblioteca);
                                break;
                            case 3:
                                Persona.anadirPersonalBiblioteca(listaPersonal1);                              
                                break;                                
                            case 4:
                                Persona.eliminarPersonal(listaPersonal1);
                                break;                            
                            case 5:
                                miBiblioteca.mostrarTodosLibros(listaLibros1);
                                break;                                
                            case 6:
                                Persona.mostrarPersonal(listaPersonal1);
                                break;
                            case 7:
                                Usuario.anadirUsuario(listaUsuarios1);
                                break;
                            case 8:
                                Usuario.borrarUsuario(listaUsuarios1);
                                break;
                            case 9:
                                byte opcionBuscar;
                                System.out.println("Como desea buscar usuario");
                                System.out.println("1 buscar por nombre");
                                System.out.println("2 buscar por apellido");
                                System.out.println("3 buscar por NIF");
                                opcionBuscar = sc.nextByte();
                                sc.nextLine();
                                switch (opcionBuscar) {
                                    case 1:
                                        Usuario.buscarUsuarioNombre(listaUsuarios1);
                                        break;
                                    case 2:
                                        Usuario.buscarUsuarioApellido(listaUsuarios1);
                                        break;
                                    case 3:
                                        Usuario.buscarUsuarioNif(listaUsuarios1);
                                }// fin switch buscar
                                break;
                            case 10:
                                Reserva.mostrarReservas(miBiblioteca);
                                break;
                            case 0:
                                salirAdmin = true;
                                break;
                            default:
                                System.out.println("Opciones disponibles de 0 a 10");
                            
                        }// fin switch opcionAdmin

                    } while (!salirAdmin);
                    // salir del menu admin

                    break;
                case 2:// menu Usuario
                    do {
                        System.out.println("");
                        System.out.println("    ***********USUARIO**********");
                        System.out.println("    ************MENU************");
                        System.out.println("    1.Mostrar todos libros");
                        System.out.println("    2.Mostrar solo libros disponibles");
                        System.out.println("    3.Reservar un libro");
                        System.out.println("    4.Devolver un libro");
                        System.out.println("    0 Volver");
                        opcionUsuario = sc.nextByte();
                        switch (opcionUsuario) {
                            case 1:
                                miBiblioteca.mostrarTodosLibros(listaLibros1);
                                break;
                            case 2:
                                miBiblioteca.mostrarLibrosDispinibles(listaLibros1);
                                break;
                            case 3:
                                Reserva.crearReserva(miBiblioteca);
                                break;
                            case 4:
                                Reserva.borrarReserva(miBiblioteca);
                                break;
                            case 0:
                                salirUsuario = true;
                                break;
                            default:
                                System.out.println("Opciones disponibles de 0 a 4");
                        }// fin switch opcionusuario

                    } while (!salirUsuario);
                    // fin menu Usuario
                    break;
                case 0:// salir
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros 1. Administrador, 2. usuario , 0 para salir");
            }
            
        } while (!salir);
        


    }// fin main

}// fin class
