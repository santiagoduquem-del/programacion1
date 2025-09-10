package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class biblioteca {

    private String nombre;

    private ArrayList<cliente> listaClientes = new ArrayList<>();
    private ArrayList<libro> listaLibros = new ArrayList<>();
    private ArrayList<Bibliotecario> listaBibliotecarios = new ArrayList<>();

    public biblioteca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<libro> getListaLibros() {
        return listaLibros;
    }

    public ArrayList<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }
}
