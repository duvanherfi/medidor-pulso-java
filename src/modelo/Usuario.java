
package modelo;


public class Usuario {
    //Atributos
    private String nombres;
    private String apellidos;
    private int edad;
    private int peso;
    private String usuario;
    private String contraseña;
    private int id=1;
    //Constructor

    public Usuario(String nombres, String apellidos, int edad, int peso, String usuario, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    // Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
}
