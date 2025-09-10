package co.edu.uniquindio.biblioteca.model;

public class prestamo {
    private int numeroPrestamo;
    private String fechaPrestamo;
    private String fechaEntrega;
    private String descripcion;



    prestamo(int numeroPrestamo, String fechaPrestamo, String fechaEntrega, String descripcion){
        this.numeroPrestamo=numeroPrestamo;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEntrega=fechaEntrega;
        this.descripcion=descripcion;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
