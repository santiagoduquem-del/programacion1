package co.edu.uniquindio.biblioteca.model;

public class libro {
    private String titulo;
    private String autor;
    private int paginas;
    private int anoPublicacion;
    private String editorial;

    public libro(){

    }

    // Constructor
    public libro(String titulo, String autor, int paginas, int anoPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anoPublicacion = anoPublicacion;
        this.editorial = editorial;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAnioPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas='" + paginas + '\'' +
                ", anoPublicacion='" + anoPublicacion + '\'' +
                ", editorial=" + editorial +
                '}';
    }
}

