/*
Una clase llamada Persona. 
Concretamente debemos almacenar: 
            nombre, 
            apellidos, 
            NIF, 
            contraseña. 
Para esta clase debes crear constructor con todos los parámetros, constructor copia, toString, 
getters/setters (DTO) y un control de la contraseña que debe tener al menos 8 caracteres. 

Crea los métodos que consideres oportunos para poder añadir/eliminar personas que gestionarán la biblioteca (bibliotecarios).

 */
package eu.cifpfbmoll.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    //declaramos objeto static de escaner 'sc'
    private static Scanner sc = new Scanner(System.in);

    //atributos
    private String nombre;
    private String apellido;
    private String NIF;
    private String contrasenia;

    //constructores
    //constructor vacio
    public Persona() {
    }

    //constructor con todos atributos
    public Persona(String nombre, String apellido, String NIF, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.contrasenia = contrasenia;
    }

    //constructor copia   
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
        this.NIF = persona.NIF;
        this.contrasenia = persona.contrasenia;
    }

    //metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    //contraseña que debe tener al menos 8 caracteres.
    public void setContraseña(String contrasenia) {
        while (contrasenia.length() < 8) {
            System.out.println("Contraseña debe ser al menos de 8 caracteres");
            contrasenia = sc.nextLine();
        }
        this.contrasenia = contrasenia;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", contrasenia=" + contrasenia + '}';
    }

    //Crea los métodos que consideres oportunos para poder añadir/eliminar personas que gestionarán la biblioteca (bibliotecarios).
    // metodo para añadir objeto Persona en listaPersonas del clase Biblioteca
    // para esto tenemos que pasar como parametro listaPersonas
    public static void anadirPersonalBiblioteca(ArrayList<Persona> listaPersonas) {

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Apellido: ");
        String apellido = sc.nextLine();

        System.out.println("NIF: ");
        String nif = sc.nextLine();

        System.out.println("Contrasenia: ");
        String contrasenia = sc.nextLine();

        //creamos objeto persona apartid de los datos introducidos
        Persona persona = new Persona(nombre, apellido, nif, contrasenia);

        // lo almacenamos en el array
        listaPersonas.add(persona);
        System.out.println("Añadimos a la lista del personal: ");
        System.out.println(persona.toString());

    }// fin metodo aladirPersonal

    // metodo para eliminar objeto Persona de la listaPersonas de la clase Biblioteca
    // para esto tenemos que pasar como parametro listaPersonas
    public static void eliminarPersonal(ArrayList<Persona> listaPersonal) {
        String nom = "";
        int opcion;// opcion para switch
        boolean salir = false; // para poder salir
        boolean encontrado = false; // para ver si  hemos encontrado la persona
        
        //nuevo objeto Persona, aqui guardamos la  persona si encontramos, para mostrar despues
        Persona p = new Persona(); 

        //Para eliminar el personal de la lista primero tenemos que buscar lo en la lista
        do {
            System.out.println("****************************************");
            System.out.println("Borrar persona de la lista del personal");
            System.out.println("Buscamos si esta en la lista por: ");
            System.out.println("    1. Nombre: ");
            System.out.println("    2. Apellido: ");
            System.out.println("    3. NIF: ");
            System.out.println("    4. Cancelar ");
            System.out.println("****************************************");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (opcion) {
                case 1:// por nombre
                    System.out.println("Introduce nombre que buscamos: ");
                    nom = sc.nextLine();
                    //sc.nextLine();
                    

                    // recorremos array
                    for (int i = 0; i < listaPersonal.size(); i++) {

                        //acedemos a getNombre, si es igual al introducido por usuario
                        if (listaPersonal.get(i).getNombre().equalsIgnoreCase(nom)) {
                            p = listaPersonal.get(i); //guardamos persona pada despues poder mostrar
                            listaPersonal.remove(i);    //borramos de lalista                                                  
                            encontrado = true;
                        }
                    }
                    if (encontrado) {    // si encontrado = true
                        System.out.print("Eliminado con exito ");
                        System.out.println(p.toString());//mostramos a quen hemos borrado

                    } else {
                        //si no se encuentra este nombre muestra mensaje
                        System.out.println("La persona con el nombre " + nom + " no se encuentra en la lista");
                    }

                    break;

                case 2: // por apellido

                    System.out.println("Introduce apellido que buscamos: ");
                    String apell= sc.nextLine();
                    // recorremos array
                    for (int i = 0; i < listaPersonal.size(); i++) {
                        //acedemos a getApellido, si es igual al introducido por usuario
                        if (listaPersonal.get(i).getApellido().equalsIgnoreCase(apell)) {
                            p = listaPersonal.get(i); // guardamos la persona que emos encontrado
                            listaPersonal.remove(i);
                            encontrado = true;
                        }
                    }
                    if (encontrado) {    // si encontrado = true
                        System.out.print("Eliminado con exito ");
                        System.out.println(p.toString());//mostramos a quen hemos borrado

                    } else {
                        //si no se encuentra este nombre muestra mensaje
                        System.out.println("La persona con el nombre " + apell + " no se encuentra en la lista");
                    }

                    break;

                case 3:// buscamos por nif

                    System.out.println("Introduce NIF que buscamos: ");
                    String nif = sc.nextLine();
                    // recorremos array
                    for (int i = 0; i < listaPersonal.size(); i++) {
                        //acedemos a getNIF, si es igual al introducido por usuario
                        if (listaPersonal.get(i).getNIF().equalsIgnoreCase(nif)) {
                            p = listaPersonal.get(i); // guardamos la persona en variable
                            listaPersonal.remove(i);    // borramos de la lista
                            encontrado = true; //encontrado
                        }
                    }
                    if (encontrado) {    // si encontrado = true
                        System.out.print("Eliminado con exito ");
                        System.out.println(p.toString());//mostramos a quen hemos borrado

                    } else {
                        //si no se encuentra este nombre muestra mensaje
                        System.out.println("La persona con el nombre " + nif + " no se encuentra en la lista");
                    }

                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opciones disponibles de 1 a 4");
            }
        } while (!salir);
        // fin do-while

    }// fin metodo borrarPersonal
    
    public static void mostrarPersonal(ArrayList <Persona> listaPersonal){
        for (int i = 0; i < listaPersonal.size(); i++) {
            System.out.println(listaPersonal.get(i).toString());
            
        }
    }

}
