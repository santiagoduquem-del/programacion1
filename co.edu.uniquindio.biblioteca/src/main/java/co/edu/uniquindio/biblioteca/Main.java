package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.biblioteca;
import co.edu.uniquindio.biblioteca.model.cliente;
import co.edu.uniquindio.biblioteca.model.libro;
import co.edu.uniquindio.biblioteca.model.Bibliotecario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        biblioteca biblioteca = inicializarDatos();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese la opción del menú");
            switch (opcion) {
                case 1:
                    String resultado = crearCliente(biblioteca);
                    System.out.println("Información del cliente: " + resultado);
                    break;
                case 2:
                    cliente cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("Ingrese la edad del cliente a validar");
                    String resultadoValidacion = validarEdadCliente(cliente, edad);
                    System.out.println("Resultado de la operación: " + resultadoValidacion);
                    break;
                case 3:
                    String infoLibro = crearLibro(biblioteca);
                    System.out.println("Información del libro: " + infoLibro);
                    break;
                case 4:
                    libro libro = obtenerLibro(biblioteca);
                    if(libro != null){
                        System.out.println("El libro encontrado es: " + libro.toString());
                    } else {
                        System.out.println("El libro no existe en la biblioteca.");
                    }
                    break;
                case 5:
                    String infoEmpleado = crearBibliotecario(biblioteca);
                    System.out.println("Información del empleado: " + infoEmpleado);
                    break;
                default:
                    break;
            }
        } while (opcion != 6);
    }

    private static String validarEdadCliente(cliente cliente, int edad) {
        if (cliente != null) {
            if (cliente.getEdad() == edad) {
                return "La edad del cliente es valida";
            } else {
                return "La edad del cliente no es valida";
            }
        } else {
            return "No se puede validar, el cliente no existe";
        }
    }

    private static cliente obtenerCliente(biblioteca biblioteca) {
        String idCliente = leerStringConsola("Ingrese la cédula del cliente a buscar");
        cliente clienteEncontrado = null;
        for (int i = 0; i < biblioteca.getListaClientes().size(); i++) {
            if (biblioteca.getListaClientes().get(i).getCedula().equals(idCliente)) {
                clienteEncontrado = biblioteca.getListaClientes().get(i);
                break;
            }
        }
        return clienteEncontrado;
    }

    private static libro obtenerLibro(biblioteca biblioteca) {
        String tituloLibro = leerStringConsola("Ingrese el título del libro a buscar");
        libro libroEncontrado = null;
        for (int i = 0; i < biblioteca.getListaLibros().size(); i++) {
            if (biblioteca.getListaLibros().get(i).getTitulo().equalsIgnoreCase(tituloLibro)) {
                libroEncontrado = biblioteca.getListaLibros().get(i);
                break;
            }
        }
        return libroEncontrado;
    }

    private static biblioteca inicializarDatos() {
        biblioteca biblioteca = new biblioteca("UQ");

        // Cliente inicial
        cliente cliente = new cliente();
        cliente.setNombre("Juan");
        cliente.setCedula("1094");
        cliente.setTelefono("87676768");
        cliente.setEdad(30);
        biblioteca.getListaClientes().add(cliente);

        // Libro inicial
        libro libro = new libro("El Quijote", "Cervantes", 500, 1605, "Editorial X");
        biblioteca.getListaLibros().add(libro);

        // Bibliotecario inicial
        Bibliotecario empleado = new Bibliotecario("Pedro", "B001", "123456", "1500000", "pedro@uq.edu.co");
        biblioteca.getListaBibliotecarios().add(empleado);

        return biblioteca;
    }

    public static String crearCliente(biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del cliente");
        String cedula = leerStringConsola("Ingrese la cédula del cliente");
        String telefono = leerStringConsola("Ingrese el teléfono del cliente");
        int edad = leerEntero("Ingrese la edad del cliente");

        cliente cliente = new cliente();
        cliente.setNombre(nombre);
        cliente.setCedula(cedula);
        cliente.setTelefono(telefono);
        cliente.setEdad(edad);

        biblioteca.getListaClientes().add(cliente);

        return cliente.toString();
    }

    public static String crearLibro(biblioteca biblioteca) {
        String titulo = leerStringConsola("Ingrese el título del libro");
        String autor = leerStringConsola("Ingrese el autor del libro");
        int paginas = leerEntero("Ingrese el número de páginas");
        int ano = leerEntero("Ingrese el año de publicación");
        String editorial = leerStringConsola("Ingrese la editorial");

        libro libro = new libro(titulo, autor, paginas, ano, editorial);
        biblioteca.getListaLibros().add(libro);

        return libro.toString();
    }

    public static String crearBibliotecario(biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del empleado");
        String id = leerStringConsola("Ingrese el ID del empleado");
        String telefono = leerStringConsola("Ingrese el teléfono del empleado");
        String salario = leerStringConsola("Ingrese el salario del empleado");
        String correo = leerStringConsola("Ingrese el correo electrónico del empleado");

        Bibliotecario empleado = new Bibliotecario(nombre, id, telefono, salario, correo);
        biblioteca.getListaBibliotecarios().add(empleado);

        return "Bibliotecario{" +
                "nombre='" + empleado.getNombre() + '\'' +
                ", id='" + empleado.getId() + '\'' +
                ", telefono='" + empleado.getTelefono() + '\'' +
                ", salario='" + empleado.getSalario() + '\'' +
                ", correoElectronico='" + empleado.getCorreoElectronico() + '\'' +
                '}';
    }

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    public static String leerStringConsola(String mensaje) {
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static void mostrarMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Validar edad del cliente");
        System.out.println("3 - Crear libro");
        System.out.println("4 - Validar libro");
        System.out.println("5 - Crear empleado");
        System.out.println("6 - Salir");
    }
}
