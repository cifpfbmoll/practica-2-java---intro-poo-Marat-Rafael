/*
Una clase llamada Persona. Concretamente debemos almacenar: nombre, apellidos, NIF, contrasenia. 
Para esta clase debes crear constructor con todos los parámetros, constructor copia, toString, getters/setters (DTO) 
y un control de la contrasenia que debe tener al menos 8 caracteres. 
Crea los métodos que consideres oportunos para poder añadir/eliminar personas que gestionarán la biblioteca (bibliotecarios).

 */
package eu.cifpfbmoll.biblioteca;

import java.util.Scanner;

public class Persona {
    
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
        while(contrasenia.length() < 8 ){
            System.out.println("Contraseña debe ser al menos de 8 caracteres");
            Scanner sc = new Scanner(System.in);
            contrasenia = sc.nextLine();
        }
        this.contrasenia = contrasenia;
    }
    
    
}
