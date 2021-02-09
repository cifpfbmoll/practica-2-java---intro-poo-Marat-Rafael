/**
 * Una clase llamada Usuario. Concretamente debemos almacenar:
 *      nombre,
 *      apellidos,
 *      NIF,
 *      contraseña.
 * Para esta clase debes crear
 *      constructor con todos los parámetros,
 *      constructor copia,
 *      toString,
 *      getters/setters (DTO)
 * y un control de la contraseña que debe tener al menos 8 caracteres.
 * Crea los métodos que consideres oportunos para poder añadir/eliminar usuarios a la biblioteca.
 *
 */
package eu.cifpfbmoll.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marat Rafael
 */
public class Usuario extends Persona {

    public static Scanner sc = new Scanner(System.in);
    //creamos objeto del scaner
    /**
     * Atributos
     */
    private String nombre;
    private String apellido;
    private String NIF;
    private String contrasenia;

    /**
     * CONSTRUCTORES
     */
    //constructor vacio
    public Usuario() {
    }

    //constructor con todos atributos
    /**
     *
     * @param nombre nombre del usuario
     * @param apellido apellido delusuario
     * @param NIF nif del usuario
     * @param contrasenia contracenia del usuario
     */
    public Usuario(String nombre, String apellido, String NIF, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.contrasenia = contrasenia;
    }

    //constructor copia   
    /**
     *
     * @param usuario pasamo como parametro un usuario ya creado
     */
    public Usuario(Usuario usuario) {
        this.nombre = usuario.nombre;
        this.apellido = usuario.apellido;
        this.NIF = usuario.NIF;
        this.contrasenia = usuario.contrasenia;
    }

    /**
     *
     * @return devuelve nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre se establece nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return devuelve apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido se establece apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return devuelve NIF del usuario
     */
    public String getNIF() {
        return NIF;
    }

    /**
     *
     * @param NIF se establece NIF al usuario
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     *
     * @return devuelve la contraseña del usuario
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     *
     * @param contrasenia establece la contraseña para usuario la contraseña que
     * debe tener al menos 8 caracteres.
     */
    public void setContrasenia(String contrasenia) {
        while (contrasenia.length() < 8) {
            System.out.println("No sepuede establecer contraceña menor de 8 caracteres");
            contrasenia = sc.nextLine();
        }
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario {" + "nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", contrasenia=" + contrasenia + '}';
    }

    /**
     * METODOS Crea los métodos que consideres oportunos para poder
     * añadir/eliminar usuarios a la biblioteca.
     */
    /**
     * @param listaUsuarios pasamos como parametro ArrayList de usuarios durante
     * ejecucion del metodo rellenamos atributos del usuario posteriormente lo
     * añadimos a la lista
     */
    public static void anadirUsuario(ArrayList<Usuario> listaUsuarios) {
        // creamos variables para cada atributo del usuario
        System.out.println("Nombre del usuario nuevo: ");
        String nombreUsuario = sc.nextLine();

        System.out.println("Apellido del usuario nuevo: ");
        String apellidoUsuario = sc.nextLine();

        System.out.println("NIF del usuario nuevo: ");
        String nifUsuario = sc.nextLine();

        System.out.println("Contraseña para nuevo usuario: ");
        String contraseniaUsuario = sc.nextLine();

        //llamamos al metodo constructor y le pasamos todos parametros
        Usuario usuario = new Usuario(nombreUsuario, apellidoUsuario, nifUsuario, contraseniaUsuario);

        // guardamos usuario en la lista
        listaUsuarios.add(usuario);
        System.out.println("Nuevo usuario registrado.");
    }

    /**
     *
     * @param listaUsuarios pasamos como parametro ArrayList de usuarios
     * buscamos por el nombre
     */
    public void buscarUsuarioNombre(ArrayList<Usuario> listaUsuarios) {
        // declaramos un nuevo ArrayList donde guardmos todas personas con este nombre encontrado
        ArrayList<Usuario> listaEncontrados = new ArrayList<>();

        System.out.println("Escribe nombre del usuario que buscamos: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;
        int contador = 0;

        //recorremos arraylista
        for (int i = 0; i < listaUsuarios.size(); i++) {
            // en cada posicion de i acedemos al nombre y lo comparamos con nombre escrito por usuario
            if (listaUsuarios.get(i).getNombre().equalsIgnoreCase(nombreBuscado)) {
                contador++;
                encontrado = true;
                listaEncontrados.add(this);
            }
        }
        if (encontrado) {
            System.out.println("Usuarios con el nombre " + nombreBuscado + " :" + contador);
            for (int i = 0; i < listaEncontrados.size(); i++) {
                System.out.println(listaEncontrados.get(i).toString());
            }
        } else {
            System.out.println("No se uncuentra ningun suarios con el nombre " + nombreBuscado);
        }
    }//fin metodo buscarUsuarioNombre

    /**
     *
     * @param listaUsuarios pasamos como parametro un ArrayList de usuarios
     * buscamos por el apellido
     */
    public void buscarUsuarioApellido(ArrayList<Usuario> listaUsuarios) {
        //creamos un nuevo ArrayList para guardar todas personas encontradas
        ArrayList<Usuario> listaEncontrados = new ArrayList<>();

        System.out.println("Escribe apellido del usuario que buscamos: ");
        String apellidoBuscado = sc.nextLine();
        boolean encontrado = false;
        int contador = 0;

        //recorremos arraylista
        for (int i = 0; i < listaUsuarios.size(); i++) {
            // en cada posicion de i acedemos al apellido y lo comparamos con apellido escrito por usuario
            if (listaUsuarios.get(i).getApellido().equalsIgnoreCase(apellidoBuscado)) {
                contador++;
                encontrado = true;
                listaEncontrados.add(this);
            }
        }
        //si encontramos alguno mostramos cuantos encontramos y recorremos ArrayList de usuariosEncontrados
        if (encontrado) {
            System.out.println("Usuarios con el apellido " + apellidoBuscado + " :" + contador);
            for (int i = 0; i < listaEncontrados.size(); i++) {
                System.out.println(listaEncontrados.get(i).toString());
            }
        } else {
            System.out.println("No se uncuentra ningun suarios con el apellido " + apellidoBuscado);
        }
    }//fin metodo buscarUsuarioApellido

    /**
     *
     * @param listaUsuarios pasamos como parametro Arraylist de los usuarios y
     * buscamos por NIF
     */
    public void buscarUsuarioNif(ArrayList<Usuario> listaUsuarios) {
        // declaamos y iniciamos nuevo ArrayList para guardar aqui todos usuarios encontrados
        // en teoria NIF es unico, pero para evitar posibles errores 
        ArrayList<Usuario> listaEncontrados = new ArrayList<>();

        boolean encontrado = false;
        int contador = 0;

        System.out.println("Escribe NIF del usuario que buscamos: ");
        String nifBuscado = sc.nextLine();

        for (int i = 0; i < listaEncontrados.size(); i++) {
            if (listaEncontrados.get(i).getNIF().equalsIgnoreCase(nifBuscado)) {
                contador++;
                encontrado = true;
                listaEncontrados.add(this);
            }
        }
        if (encontrado) {
            System.out.println("Usuario con NIF " + nifBuscado + " : " + contador);
            for (int i = 0; i < listaEncontrados.size(); i++) {
                listaEncontrados.get(i).toString();
            }
        }
    }// fin metodo buscarUsuarioNif

    /**
     *
     * @param listaUsuarios pasamos como parametro lista de los usuarios para
     * eliminar usuario
     */
    public static void borrarUsuario(ArrayList<Usuario> listaUsuarios) {
        String nombreBorrar;
        String apellidoBorrar;
        String nifBorrar;
        boolean salir = false;

        //usamos switch para eligir como borramos  
        do {

            System.out.println("Para borrar usuario usamos: ");
            System.out.println("1. Nombre");
            System.out.println("2. Aapellido");
            System.out.println("3. NIF");
            System.out.println("4. Salir");
            byte option = sc.nextByte();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Introduce nombre del usuario a borrar: ");
                    nombreBorrar = sc.nextLine();
                    //llamamos a otro metodo borrar por nombre
                    borrarNombre(nombreBorrar, listaUsuarios);
                    break;
                case 2:
                    System.out.println("Introduce apellido del usuario a borrar: ");
                    apellidoBorrar = sc.nextLine();
                    //llamamos a otro metodo borrar por apellido
                    borrarApellido(apellidoBorrar, listaUsuarios);
                    break;
                case 3:
                    System.out.println("Introduce NIF del usuario a borrar: ");
                    nifBorrar = sc.nextLine();
                    // llamamos otro metodo 
                    borrarNif(nifBorrar, listaUsuarios);
                    break;
                case 4:
                    salir = true;
                    break;

            }// fin switch

        } while (salir);

    }//fin metodo borrarUsuario

    /**
     *
     * @param nombreBorrar pasamos como parametro nombre del usuario que
     * deseamos borrar
     * @param listaUsuarios pasamo como parametro ArrayList de los usuario donde
     * buscamos y borramos
     */
    public static void borrarNombre(String nombreBorrar, ArrayList<Usuario> listaUsuarios) {
        // creamos nuevo usuario para mostrar despues a quen borramos
        Usuario usuarioBorrado = new Usuario();
        boolean borrado = false;

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {
                usuarioBorrado = listaUsuarios.get(i);
                listaUsuarios.remove(i);
                borrado = true;
            }
        }
        if (borrado) {
            System.out.println(usuarioBorrado.toString());
            System.out.println("Borrado de la lista");
        } else {
            System.out.println("No podemos eliminar usuario que no esta en la lista");
        }
    }//fin metodo borrarNombre

    /**
     *
     * @param apellidoBorrar pasamos como parametro apellido del usuario para
     * borrar
     * @param listaUsuarios pasamos como parametro ArrayList donde estan todos
     * los usuario
     */
    public static void borrarApellido(String apellidoBorrar, ArrayList<Usuario> listaUsuarios) {
        // creamos nuevo usuario para mostrar despues a quen borramos
        Usuario usuarioBorrado = new Usuario();
        boolean borrado = false;

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getApellido().equalsIgnoreCase(apellidoBorrar)) {
                usuarioBorrado = listaUsuarios.get(i);
                listaUsuarios.remove(i);
                borrado = true;
            }
        }
        if (borrado) {
            System.out.println(usuarioBorrado.toString());
            System.out.println("Borrado de la lista");
        } else {
            System.out.println("No podemos eliminar usuario que no esta en la lista");
        }
    }//fin metodo borrarApellido

    public static void borrarNif(String nifBorrar, ArrayList<Usuario> listaUsuarios) {

        // creamos nuevo usuario para mostrar despues a quen borramos
        Usuario usuarioBorrado = new Usuario();

        boolean borrado = false;
        // recorremos array
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNIF().equalsIgnoreCase(nifBorrar)) {
                usuarioBorrado = listaUsuarios.get(i);
                listaUsuarios.remove(i);
                borrado = true;
            }
        }
        if (borrado) {
            System.out.println(usuarioBorrado.toString());
            System.out.println("Borrado de la lista");
        } else {
            System.out.println("No podemos eliminar usuario que no esta en la lista");
        }
    }// fin metodo borrarNif

    /**
     *
     * @param listaUsuarios pasamos como parametro lista de los usuarios y
     * mostramos todo contenido
     */
    public static void mostrarUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println(listaUsuarios.get(i).toString());
        }
    }// fin metodo mostrarUsuarios

}//fin class Usuario
