
package menu;

import domain.BaseLibros;
import java.util.Scanner;


public class MenuInvitado {
    private Scanner scanner = new Scanner(System.in);
    private BaseLibros baseLibros;
    
    public MenuInvitado(){
        this.baseLibros = new BaseLibros();
    }
    

    public void mostrarMenuInvitado() {
        int opcion;
        do {
            System.out.println("\n--- Menú Invitado ---");
            System.out.println("1 - Consulta de Libros");
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
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
