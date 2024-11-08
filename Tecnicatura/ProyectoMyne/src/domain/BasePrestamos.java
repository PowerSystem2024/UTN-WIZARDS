
package domain;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class BasePrestamos {
    private List<Libro> libros ; //Lista de libros disponibles para préstamos
    private List<Prestamos> prestamos; //Lista de préstamos realizados en la biblioteca
    private Usuario usuarioActual; // Usuario que actualmente está usando el sistema

    // Constructor para inicializar la lista de libros y préstamos
    public BasePrestamos() {
        this.libros = new ArrayList<>(); // Inicializa la lista de libros como vacía
        this.prestamos = new ArrayList<>(); // Inicializa la lista de préstamos como vacía
        precargarPrestamos(); // Llama al método para precargar algunos préstamos de ejemplo
    }
    

    // Método para precargar préstamos con datos de ejemplo
    private void precargarPrestamos() {
        
        List<Usuario> usuarios = new BaseUsuarios().getUsuario(); // Obtiene la lista de usuarios de la clase BaseUsuarios
        List<Libro> libros = new BaseLibros().getLibros();// Obtiene la lista de libros de la clase BaseLibros
        
        // Verifica que ambas listas tengan al menos un elemento para evitar errores
        if (!usuarios.isEmpty() && !libros.isEmpty()) {
            // Creamos tres préstamos de ejemplo utilizando los primeros usuarios y libros de cada lista
            // Primer préstamo: el primer usuario "Administrador" toma el primer libro
            prestamos.add(new Prestamos(usuarios.get(0), libros.get(0), LocalDate.now(), LocalDate.now().plusWeeks(2), false)); // No autorizado
            // Segundo préstamo: el segundo usuario "Franco" toma el segundo libro
            prestamos.add(new Prestamos(usuarios.get(1), libros.get(1), LocalDate.now(), LocalDate.now().plusWeeks(3), false)); // No autorizado
            // Tercer préstamo: el tercer usuario "Guest" toma el tercer libro
            prestamos.add(new Prestamos(usuarios.get(2), libros.get(2), LocalDate.now(), LocalDate.now().plusWeeks(1), false)); // No autorizado
            // Nota: Todos los préstamos precargados están marcados como no autorizados (false)
        }
    }
    
    // Método para listar solicitudes pendientes de autorización
    public void listarSolicitudesPendientes() {
        // Filtra la lista de préstamos para obtener solo los que no han sido devueltos
        List<Prestamos> pendientes = prestamos.stream()
                .filter(prestamo -> !prestamo.isDevuelto())  // Filtra préstamos que no están devueltos
                .collect(Collectors.toList()); // Guarda los préstamos filtrados en una lista

        // Verifica si la lista de pendientes está vacía
        if (pendientes.isEmpty()) {
            System.out.println("No hay solicitudes pendientes de autorización.");
        } else {
            System.out.println("Solicitudes de préstamos pendientes:");
            // Recorre la lista de pendientes y muestra cada solicitud con su índice
            for (int i = 0; i < pendientes.size(); i++) {
                System.out.println(i + " - " + pendientes.get(i)); // Muestra índice y detalles del préstamo
            }
        }
    }
    
    // Método para autorizar un préstamo según el índice de la lista de solicitudes pendientes
    public void autorizarPrestamo() {
        listarSolicitudesPendientes(); // Muestra la lista de préstamos pendientes al usuario

        Scanner scanner = new Scanner(System.in);// Inicializa un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el índice del préstamo a autorizar: ");
        int index = scanner.nextInt();// Lee el índice ingresado por el usuario
        
        // Filtra la lista de préstamos para obtener solo los que no han sido devueltos
        List<Prestamos> pendientes = prestamos.stream() 
                .filter(prestamo -> !prestamo.isDevuelto()) // Filtra préstamos que no se han devuelto
                .collect(Collectors.toList());// Almacena los préstamos filtrados en una lista
        
        // Verifica que el índice esté dentro de los límites de la lista de pendientes
        if (index >= 0 && index < pendientes.size()) {
            Prestamos prestamo = pendientes.get(index); // Obtiene el préstamo pendiente seleccionado por el usuario según el índice
            prestamo.setDevuelto(true); // Marca el préstamo como devuelto/autorizado           
            System.out.println("Préstamo autorizado para: " + prestamo.getUsuario().getNombre()); // Muestra un mensaje de confirmación de autorización del préstamo
        } else {
            System.out.println("Índice de préstamo inválido."); // Muestra un mensaje de error si el índice ingresado es inválido
        }
    }
    
    // Método para consultar libros prestados por usuario
    public void consultarPrestamosPorUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine(); // Lee el nombre del usuario
        // Filtra la lista de préstamos para obtener solo los préstamos hechos al usuario indicado
        List<Prestamos> prestamosUsuario = prestamos.stream()
                .filter(prestamo -> prestamo.getUsuario().getNombre().equalsIgnoreCase(nombreUsuario))
                .collect(Collectors.toList());
        // Verifica si la lista de préstamos del usuario está vacía
        if (prestamosUsuario.isEmpty()) {
            System.out.println("No se encontraron préstamos para el usuario: " + nombreUsuario);
        } else {
            System.out.println("Préstamos del usuario " + nombreUsuario + ":");
            // Recorre la lista de préstamos del usuario y muestra cada préstamo
            for (Prestamos prestamo : prestamosUsuario) {
                System.out.println(prestamo); // Imprime los detalles del préstamo
            }
        }
    }
    
    // Método para recibir la devolución de un libro
    public void recepcionDevolucion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine(); // Lee el nombre del usuario
        
        // Filtra los préstamos pendientes de devolución para el usuario especificado
        List<Prestamos> prestamosUsuario = prestamos.stream()
                .filter(prestamo -> prestamo.getUsuario().getNombre().equalsIgnoreCase(nombreUsuario) && !prestamo.isDevuelto())
                .collect(Collectors.toList());
        // Verifica si el usuario tiene préstamos pendientes
        if (prestamosUsuario.isEmpty()) {
            System.out.println("No hay préstamos pendientes para el usuario: " + nombreUsuario);
            return;
        }
        // Muestra los libros prestados al usuario
        System.out.println("Libros prestados al usuario " + nombreUsuario + ":");
        for (int i = 0; i < prestamosUsuario.size(); i++) {
            System.out.println(i + " - " + prestamosUsuario.get(i).getLibro().getTitulo());
        }
        // Pide al usuario seleccionar el índice del libro que quiere devolver
        System.out.print("Seleccione el índice del libro a devolver: ");
        int index = scanner.nextInt();
        // Verifica que el índice ingresado sea válido
        if (index >= 0 && index < prestamosUsuario.size()) {
            Prestamos prestamo = prestamosUsuario.get(index);
            prestamo.setDevuelto(true); // Marca el préstamo como devuelto
            System.out.println("Devolución registrada: " + prestamo.getLibro().getTitulo());
        } else {
            System.out.println("Índice de libro inválido.");
        }
    }

    // Método para mostrar todos los préstamos
    public List<Prestamos> getPrestamos() {
        return prestamos;
    }
    
    // Método para establecer el usuario actual
    public void setUsuarioActual(Usuario usuario) {
        this.usuarioActual = usuario;
    }

    // Método para consultar y mostrar libros sin devolver para el usuario actual
    public List<Prestamos> consultarLibrosSinDevolver() {
        List<Prestamos> librosSinDevolver = new ArrayList<>();

        // Recorre la lista de préstamos y verifica si el usuario coincide y el libro no ha sido devuelto
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuarioActual) && !prestamo.isDevuelto()) {
                librosSinDevolver.add(prestamo);
            }
        }

        // Mostrar los resultados
        if (librosSinDevolver.isEmpty()) {
            System.out.println("No tienes libros pendientes de devolución.");
        } else {
            System.out.println("Libros sin devolver:");
            for (Prestamos prestamo : librosSinDevolver) {
                System.out.println("Libro: " + prestamo.getLibro().getTitulo() + ", Fecha de Devolución: " + prestamo.getFechaDevolucion());
            }
        }
    
        return librosSinDevolver;
    }
        
}
