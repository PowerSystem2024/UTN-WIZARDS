
package menu;

import domain.BaseLibros;
import domain.BasePrestamos;

import domain.Usuario;

import java.util.Scanner;


public class MenuSocio {
    private Scanner scanner = new Scanner(System.in);
    private BaseLibros baseLibros;
    private BasePrestamos basePrestamos;
    private Usuario usuarioActual;
    
    
    
    public MenuSocio(Usuario usuarioActual){
        this.baseLibros = new BaseLibros();
        this.basePrestamos = new BasePrestamos();
        
        
        this.usuarioActual = usuarioActual;
        this.baseLibros.setUsuarioActual(usuarioActual);
        this.basePrestamos.setUsuarioActual(usuarioActual);
    }

    public void mostrarMenuSocio() {
        int opcion;
        do {
            System.out.println("\n--- Menú Socio ---");
            System.out.println("1 - Consulta de Libros");
            System.out.println("2 - Préstamos de Libros");
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarLibros();
                    break;
                case 2:
                    gestionarPrestamos();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
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

    private void gestionarPrestamos() {
        int opcion;
        do {
            System.out.println("\n--- Gestión de Préstamos de Libros ---");
            System.out.println("1 - Consulta de libros sin devolver");
            System.out.println("2 - Solicitud de préstamo de libros");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de consulta de libros sin devolver
                    basePrestamos.consultarLibrosSinDevolver();
                    break;
                case 2:
                    solicitarPrestamoLibros();
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void solicitarPrestamoLibros() {
        int opcion;
        do {
            System.out.println("\n--- Solicitud de Préstamo de Libros ---");
            System.out.println("1 - Solicitud por Título");
            System.out.println("2 - Solicitud por Autor");
            System.out.println("3 - Solicitud por ISBN");
            System.out.println("4 - Solicitud por CDJ");
            System.out.println("0 - Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamada al método de solicitud por título
                    baseLibros.solicitarPrestamoPorTitulo();
                    break;
                case 2:
                    // Llamada al método de solicitud por autor
                    baseLibros.solicitarPrestamoPorAutor();
                    break;
                case 3:
                    // Llamada al método de solicitud por ISBN
                    baseLibros.solicitarPrestamoPorIsbn();
                    break;
                case 4:
                    // Llamada al método de solicitud por CDJ
                    baseLibros.solicitarPrestamoPorCdj();
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
