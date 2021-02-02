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

/**
 *
 * @author Marat Rafael
 */
public class Usuario {

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
     * @return  devuelve apellido del usuario
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

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
        
        /**
         * METODOS
         */
        
    
}//fin class Usuario
