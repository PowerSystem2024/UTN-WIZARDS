package test;

import domain.BaseUsuarios;
import domain.Usuario;
import java.util.Scanner;
import menu.MenuAdministrador;
import menu.MenuInvitado;
import menu.MenuSocio;

public class BibliotecaTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BaseUsuarios baseUsuarios = new BaseUsuarios();
        boolean sesionIniciada = false;
        Usuario usuarioActual = null;

        System.out.println("\n--- Sistema de Biblioteca ---");

        while (true) {
            System.out.print("Ingrese su nombre de usuario (o escriba 'exit' para salir): ");
            String nombreUsuario = scanner.next();
            if (nombreUsuario.equalsIgnoreCase("exit")) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            System.out.print("Ingrese su contraseña (o escriba 'exit' para salir): ");
            String contrasena = scanner.next();
            if (contrasena.equalsIgnoreCase("exit")) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            usuarioActual = baseUsuarios.autenticarUsuario(nombreUsuario, contrasena);

            if (usuarioActual != null) {
                sesionIniciada = true;
                System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuarioActual.getNombre() + "!");
            } else {
                System.out.println("Credenciales incorrectas.");
                continue; // Volver al inicio del bucle
            }

            if (sesionIniciada) {
                switch (usuarioActual.getNivelUsuario()) {
                    case 1:
                        MenuAdministrador menuAdmin = new MenuAdministrador();
                        menuAdmin.mostrarMenuAdministrador();
                        break;
                    case 2:
                        MenuSocio menuSocio = new MenuSocio(usuarioActual);
                        menuSocio.mostrarMenuSocio();
                        break;
                    case 3:
                        MenuInvitado menuInvitado = new MenuInvitado();
                        menuInvitado.mostrarMenuInvitado();
                        break;
                    default:
                        System.out.println("Nivel de usuario no reconocido.");
                }
            }

            // Reiniciar sesión y usuario actual para el siguiente ciclo
            sesionIniciada = false;
            usuarioActual = null;

            // Preguntar si desea salir o continuar
            System.out.print("Escriba 'exit' para salir o presione Enter para continuar: ");
            scanner.nextLine(); // Limpiar el buffer
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("exit")) {
                System.out.println("Saliendo del sistema...");
                break;
            }
        }

        scanner.close();
    }
}
