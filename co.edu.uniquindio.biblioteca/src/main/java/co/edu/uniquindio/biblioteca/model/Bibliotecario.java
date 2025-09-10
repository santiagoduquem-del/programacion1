package co.edu.uniquindio.biblioteca.model;

public class
Bibliotecario {

    private String nombre;
    private String id;
    private String telefono;
    private String salario;
    private String correoElectronico;

    public Bibliotecario(String nombre, String id, String telefono, String salario, String correoElectronico) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.salario = salario;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
