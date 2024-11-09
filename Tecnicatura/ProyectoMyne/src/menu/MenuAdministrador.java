
package menu;

import domain.BaseCategorias;
import domain.BaseLibros;
import domain.BasePrestamos;
import domain.BaseUsuarios;
import java.util.Scanner;


public class MenuAdministrador {
    
    private Scanner scanner = new Scanner(System.in);
    private BaseUsuarios baseUsuarios;
    private BaseLibros baseLibros;
    private BaseCategorias baseCategorias;
    private BasePrestamos basePrestamos;
    
    
    // Constructor para inicializar baseUsuarios
    public MenuAdministrador() {
        this.baseUsuarios = new BaseUsuarios(); // Inicializa baseUsuarios aquí
        this.baseLibros = new BaseLibros();
        this.baseCategorias = new BaseCategorias();
        this.basePrestamos = new BasePrestamos();
        
    }
    

    public void mostrarMenuAdministrador() {
        int opcion;
        do {
            System.out.println("\n--- Menú Administrador ---");
            System.out.println("1 - Administración del sistema");
            System.out.println("2 - Consulta de libros");
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    administrarSistema();
                    break;
                case 2:
                    consultarLibros();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void administrarSistema() {
        int opcion;
        do {
            System.out.println("\n--- Administración del Sistema ---");
            System.out.println("1 - Usuarios y Socios");
            System.out.println("2 - Libros");
            System.out.println("3 - Categorías");
            System.out.println("4 - Solicitudes de Préstamo");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionarUsuarios();
                    break;
                case 2:
                    gestionarLibros();
                    break;
                case 3:
                    gestionarCategorias();
                    break;
                case 4:
                    gestionarSolicitudesPrestamo();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void gestionarUsuarios() {
        int opcion;
        do {
            System.out.println("\n--- Gestión de Usuarios y Socios ---");
            System.out.println("1 - Consulta de Usuarios");
            System.out.println("2 - Alta de Usuarios");
            System.out.println("3 - Modificación de Usuarios");
            System.out.println("4 - Baja de Usuarios");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de consulta de usuarios
                    baseUsuarios.mostrarUsuarios();
                    break;
                case 2:
                    // Llamada al método de alta de usuarios
                    baseUsuarios.darDeAltaUsuario();
                    break;
                case 3:
                    // Llamada al método modificar usuario
                    baseUsuarios.modificarUsuario();
                    break;
                case 4:
                    baseUsuarios.darDeBajaUsuario();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

//    private void modificarUsuarios() {
//        int opcion;
//        do {
//            System.out.println("\n--- Modificación de Usuarios ---");
//            System.out.println("1 - Modificación por nombre de usuario");
//            System.out.println("2 - Modificación por número de socio");
//            System.out.println("0 - Regresar");
//            System.out.print("Seleccione una opción: ");
//            opcion = scanner.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    // Llamada al método de modificación por nombre
//                    break;
//                case 2:
//                    // Llamada al método de modificación por número de socio
//                    break;
//                case 0:
//                    System.out.println("Regresando...");
//                    break;
//                default:
//                    System.out.println("Opción no válida. Intente de nuevo.");
//            }
//        } while (opcion != 0);
//    }

    private void eliminarUsuarios() {
        int opcion;
        do {
            System.out.println("\n--- Baja de Usuarios ---");
            System.out.println("1 - Baja por nombre de usuario");
            System.out.println("2 - Baja por número de socio");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de baja por nombre
                    break;
                case 2:
                    // Llamada al método de baja por número de socio
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void gestionarLibros() {
        int opcion;
        do {
            System.out.println("\n--- Gestión de Libros ---");
            System.out.println("1 - Alta de Libros");
            System.out.println("2 - Modificación de Libros");
            System.out.println("3 - Baja de Libros");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de alta de libros
                    baseLibros.darDeAltaLibro();
                    break;
                case 2:
                    // Llamada al método de modificación de libros
                    baseLibros.modificarLibro();
                    break;
                case 3:
                    // Llamada al método de baja de libros
                    baseLibros.darDeBajaLibro();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void gestionarCategorias() {
        // Implementación similar a gestionarLibros() para categorías
        int opcion;
        do {
            System.out.println("\n--- Gestión de Categorias ---");
            System.out.println("1 - Alta de Categorias");
            System.out.println("2 - Modificación de Categorias");
            System.out.println("3 - Baja de Categorias");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de alta de categoria
                    baseCategorias.darDeAltaCategoria();
                    break;
                case 2:
                    // Llamada al método de modificación de categoria
                    baseCategorias.modificarCategoria();
                    break;
                case 3:
                    // Llamada al método de baja de categoria
                    baseCategorias.darBajaCategoriaOSubcategoria();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
        
    }

    private void gestionarSolicitudesPrestamo() {
        // Implementación para manejar solicitudes de préstamo
        int opcion;
        do {
            System.out.println("\n--- Gestión de Prestamos de Libros ---");
            System.out.println("1 - Autorización de solicitudes");
            System.out.println("2 - Consulta de prestamos General");
            System.out.println("3 - Consulta de Libros prestados por usuario");
            System.out.println("4 - Recepción de devolucion de libro");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de consulta de usuarios
                    basePrestamos.autorizarPrestamo();
                    break;
                case 2:
                    // Llamada al método Consulta de prestamos General
                    basePrestamos.listarSolicitudesPendientes();
                    break;
                case 3:
                    // Llamada al método Consulta de Libros prestador por usuario
                    basePrestamos.consultarPrestamosPorUsuario();
                    break;
                case 4:
                    //Llamada al método de Recepcion de devolucion de libro
                    basePrestamos.recepcionDevolucion();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void consultarLibros() {
        int opcion;
        do {
            System.out.println("\n--- Consulta de Libros ---");
            System.out.println("1 - Consulta por Título");
            System.out.println("2 - Consulta por Autor");
            System.out.println("3 - Consulta por ISBN");
            System.out.println("4 - Consulta por CDJ");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Llamada al método de consulta por título
                    baseLibros.consultarLibroPorTitulo();
                    break;
                case 2:
                    // Llamada al método de consulta por autor
                    baseLibros.consultarLibroPorAutor();
                    break;
                case 3:
                    // Llamada al método de consulta por ISBN
                    baseLibros.consultarLibroPorIsbn();
                    break;
                case 4:
                    // Llamada al método de consulta por CDJ
                    baseLibros.consultarLibroPorCdj();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}
