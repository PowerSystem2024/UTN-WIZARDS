
package domain;

import java.text.Normalizer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BaseLibros {
    
    
    private List<Libro> libros;
    private List<Prestamos> prestamos;
    private Usuario usuarioActual;
    
    public BaseLibros() {
        this.prestamos = new ArrayList<>();
        this.libros = new ArrayList<>();
        // Agregar libros a la lista inicial
        cargarLibros();
    }
     // Método para establecer el usuario actual
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    

    
    // Método para precargar los libros en la lista
    private void cargarLibros() {
        libros.add(new Libro("Guia Practica de Bibliotecas Publicas", "Laura Mendoza", "010", "9781234567001"));
        libros.add(new Libro("Enciclopedia Visual del Mundo", "Roberto Soto", "020", "9781234567002"));
        libros.add(new Libro("El Periodismo Moderno", "Carolina Perez", "030", "9781234567003"));
        libros.add(new Libro("Metafisica: Mas Alla de los Sentidos", "Martin Lopez", "110", "9781234567011"));
        libros.add(new Libro("Logica y Pensamiento Crítico", "Ana Gutiérrez", "120", "9781234567012"));
        libros.add(new Libro("Etica en el Siglo XXI", "Javier Núñez", "130", "9781234567013"));
        libros.add(new Libro("Geografia Global", "María Torres", "210", "9781234567021"));
        libros.add(new Libro("Estadisticas y Analisis de Datos", "Juan Morales", "310", "9781234567031"));
        libros.add(new Libro("Matematicas Avanzadas", "Franco Cardozo", "410", "9781234567041"));
        libros.add(new Libro("Avances en Medicina Genomica", "Isabel Fernández", "510", "9781234567051"));
        libros.add(new Libro("Contabilidad para Emprendedores", "Rodrigo Sánchez", "610", "9781234567061"));
        libros.add(new Libro("Arte Contemporaneo en America Latina", "Daniela Martínez", "710", "9781234567071"));
        libros.add(new Libro("Linguistica Aplicada", "Andrea López", "810", "9781234567081"));
        libros.add(new Libro("Poesia Contemporanea", "Elena Díaz", "910", "9781234567091"));
    }
    
    // Método para dar de alta un nuevo libro
    public void darDeAltaLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del nuevo libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del nuevo libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el CDJ del nuevo libro: ");
        String cdj = scanner.nextLine();
        System.out.print("Ingrese el ISBN del nuevo libro: ");
        String isbn = scanner.nextLine();

        // Verificar si el libro ya existe en la lista para evitar duplicados por ISBN
        if (buscarLibroPorISBN(isbn) != null) {
            System.out.println("Error: Ya existe un libro con ese ISBN.");
        } else {
            Libro nuevoLibro = new Libro(titulo, autor, cdj, isbn);
            libros.add(nuevoLibro);
            System.out.println("El libro ha sido dado de alta exitosamente: " + nuevoLibro);
        }
    }

    // Método de búsqueda de libro por ISBN
    private Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getISBN().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // Método para modificar un libro según el criterio de búsqueda
    public void modificarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el criterio para modificar el libro:");
        System.out.println("1. Título");
        System.out.println("2. Autor");
        System.out.println("3. ISBN");
        System.out.println("4. CDJ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        Libro libroEncontrado = null;
        
        switch(opcion) {
            case 1:
                System.out.print("Ingrese el título del libro: ");
                String titulo = scanner.nextLine();
                libroEncontrado = buscarLibroPorTitulo(titulo);
                break;
            case 2:
                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();
                libroEncontrado = buscarLibroPorAutor(autor);
                break;
            case 3:
                System.out.print("Ingrese el ISBN del libro: ");
                String isbn = scanner.nextLine();
                libroEncontrado = buscarLibroPorISBN(isbn);
                break;
            case 4:
                System.out.print("Ingrese el CDJ del libro: ");
                String cdj = scanner.nextLine();
                libroEncontrado = buscarLibroPorCDJ(cdj);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
            System.out.println("Ingrese los nuevos datos del libro:");
            System.out.print("Nuevo título: ");
            libroEncontrado.setTitulo(scanner.nextLine());
            System.out.print("Nuevo autor: ");
            libroEncontrado.setAutor(scanner.nextLine());
            System.out.print("Nuevo CDJ: ");
            libroEncontrado.setCDJ(scanner.nextLine());
            System.out.print("Nuevo ISBN: ");
            libroEncontrado.setISBN(scanner.nextLine());
            System.out.println("El libro ha sido modificado con éxito.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    // Métodos de búsqueda de libro
    private Libro buscarLibroPorTitulo(String titulo) {
        String tituloNormalizado = removerAcentos(titulo).toLowerCase();
        
        for (Libro libro : libros) {
            String tituloLibroNormalizado = removerAcentos(libro.getTitulo()).toLowerCase();
            if (tituloLibroNormalizado.equals(tituloNormalizado)) {
                return libro;
            }
        }
        return null;
    }
    
    private Libro buscarLibroPorAutor(String autor) {
        String autorNormalizado = removerAcentos(autor).toLowerCase();

        for (Libro libro : libros) {
            String autorLibroNormalizado = removerAcentos(libro.getAutor()).toLowerCase();
            if (autorLibroNormalizado.equals(autorNormalizado)) {
                return libro;
            }
        }
        return null;
    }
    
    // Método para eliminar acentos
    private String removerAcentos(String input) {
        String normalizado = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalizado.replaceAll("\\p{M}", ""); // Elimina los diacríticos
    }
    
//    private Libro buscarLibroPorISBN(String isbn) {
//        for (Libro libro : libros) {
//            if (libro.getISBN().equals(isbn)) {
//                return libro;
//            }
//        }
//        return null;
//    }
    
    private Libro buscarLibroPorCDJ(String cdj) {
        for (Libro libro : libros) {
            if (libro.getCDJ().equalsIgnoreCase(cdj)) {
                return libro;
            }
        }
        return null;
    }
    
    // Método para dar de baja un libro
    public void darDeBajaLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el CDJ o ISBN del libro que desea dar de baja: ");
        String identificador = scanner.nextLine();

        // Buscar y eliminar el libro si existe
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getCDJ().equals(identificador) || libro.getISBN().equals(identificador)) {
                libros.remove(libro);
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido dado de baja exitosamente.");
                libroEncontrado = true;
                break;
            }
        }

        if (!libroEncontrado) {
            System.out.println("No se encontró un libro con el CDJ o ISBN ingresado.");
        }
    }
    
    // Método para mostrar todos los libros
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
                System.out.println("-------------------------");
            }
        }
    }
    
    // Método para agregar un nuevo libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado exitosamente.");
    }
    
   
    
    // Método para modificar un libro por título
    public void modificarLibroPorTitulo(String titulo, String nuevoTitulo, String nuevoAutor, String nuevoCDJ, String nuevoISBN) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            libro.setCDJ(nuevoCDJ);
            libro.setISBN(nuevoISBN);
            System.out.println("Libro modificado exitosamente.");
        }
    }
    
    // Método para eliminar un libro por título
    public void eliminarLibroPorTitulo(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado exitosamente.");
        }
    }
    
    // Método de acceso para obtener todos los libros
    public List<Libro> getLibros() {
        return libros;
    }
    
    //Método Constultar libros por titulo
    public void consultarLibroPorTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro que desea consultar: ");
        String titulo = scanner.nextLine();

        Libro libroEncontrado = buscarLibroPorTitulo(titulo);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);
        } else {
        System.out.println("No se encontró ningún libro con el título \"" + titulo + "\".");
        }
    }
    
    //Consutlar libros por autor
    public void consultarLibroPorAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del autor que desea consultar: ");
        String autor = scanner.nextLine();

        Libro libroEncontrado = buscarLibroPorAutor(autor);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);
        } else {
        System.out.println("No se encontró ningún libro con el Autor \"" + autor + "\".");
        }
    }
    
    //Consultar libros por CDJ
    public void consultarLibroPorCdj() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre el CDJ que desea consultar: ");
        String cdj = scanner.nextLine();

        Libro libroEncontrado = buscarLibroPorCDJ(cdj);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);
        } else {
        System.out.println("No se encontró ningún libro con el cdj \"" + cdj + "\".");
        }
    }
    
    //Consultar libros por Isbn
    public void consultarLibroPorIsbn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre el ISBN que desea consultar: ");
        String isbn = scanner.nextLine();

        Libro libroEncontrado = buscarLibroPorISBN(isbn);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);
        } else {
        System.out.println("No se encontró ningún libro con el ISBN \"" + isbn + "\".");
        }
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
    
    // Método para solicitar préstamo de libros por título
    public void solicitarPrestamoPorTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro que desea solicitar: ");
        String titulo = scanner.nextLine();

        // Buscar el libro por título
        Libro libroEncontrado = buscarLibroPorTitulo(titulo);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);

            // Confirmación de préstamo
            System.out.print("¿Desea solicitar el préstamo de este libro? (S/N): ");
            String confirmacion = scanner.nextLine();
            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("Solicitud de préstamo cancelada.");
                return;
            }

            // Ingreso de fechas de préstamo y devolución
            System.out.print("Ingrese la fecha de préstamo (AAAA-MM-DD): ");
            LocalDate fechaPrestamo = LocalDate.parse(scanner.nextLine());
            System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
            LocalDate fechaDevolucion = LocalDate.parse(scanner.nextLine());

            // Crear y agregar el préstamo a la lista
            Prestamos nuevoPrestamo = new Prestamos(usuarioActual, libroEncontrado, fechaPrestamo, fechaDevolucion, false);
            prestamos.add(nuevoPrestamo);

            // Mensaje de éxito
            System.out.println("¡Préstamo realizado con éxito!");
            System.out.println("Libro prestado: " + libroEncontrado.getTitulo() + ", Fecha de Devolución: " + fechaDevolucion);
        } else {
        System.out.println("No se encontró ningún libro con el título \"" + titulo + "\".");
        }
        
    }
    
    // Método para solicitar préstamo de libros por Autor
    public void solicitarPrestamoPorAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el autor del libro que desea solicitar: ");
        String autor = scanner.nextLine();

        // Buscar el libro por Autor
        Libro libroEncontrado = buscarLibroPorAutor(autor);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);

            // Confirmación de préstamo
            System.out.print("¿Desea solicitar el préstamo de este libro? (S/N): ");
            String confirmacion = scanner.nextLine();
            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("Solicitud de préstamo cancelada.");
                return;
            }

            // Ingreso de fechas de préstamo y devolución
            System.out.print("Ingrese la fecha de préstamo (AAAA-MM-DD): ");
            LocalDate fechaPrestamo = LocalDate.parse(scanner.nextLine());
            System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
            LocalDate fechaDevolucion = LocalDate.parse(scanner.nextLine());

            // Crear y agregar el préstamo a la lista
            Prestamos nuevoPrestamo = new Prestamos(usuarioActual, libroEncontrado, fechaPrestamo, fechaDevolucion, false);
            prestamos.add(nuevoPrestamo);

            // Mensaje de éxito
            System.out.println("¡Préstamo realizado con éxito!");
            System.out.println("Libro prestado: " + libroEncontrado.getAutor() + ", Fecha de Devolución: " + fechaDevolucion);
        } else {
            System.out.println("No se encontró ningún libro del autor \"" + autor + "\".");
        }
    }
    
    
    // Método para solicitar préstamo de libros por Cdj
    
    public void solicitarPrestamoPorCdj() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el CDJ del libro que desea solicitar: ");
        String cdj = scanner.nextLine();

        // Buscar el libro por CDJ
        Libro libroEncontrado = buscarLibroPorCDJ(cdj);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);

            // Confirmación de préstamo
            System.out.print("¿Desea solicitar el préstamo de este libro? (S/N): ");
            String confirmacion = scanner.nextLine();
            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("Solicitud de préstamo cancelada.");
                return;
            }

            // Ingreso de fechas de préstamo y devolución
            System.out.print("Ingrese la fecha de préstamo (AAAA-MM-DD): ");
            LocalDate fechaPrestamo = LocalDate.parse(scanner.nextLine());
            System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
            LocalDate fechaDevolucion = LocalDate.parse(scanner.nextLine());

            // Crear y agregar el préstamo a la lista
            Prestamos nuevoPrestamo = new Prestamos(usuarioActual, libroEncontrado, fechaPrestamo, fechaDevolucion, false);
            prestamos.add(nuevoPrestamo);

            // Mensaje de éxito
            System.out.println("¡Préstamo realizado con éxito!");
            System.out.println("Libro prestado: " + libroEncontrado.getCDJ() + ", Fecha de Devolución: " + fechaDevolucion);
        } else {
            System.out.println("No se encontró ningún libro con el CDJ \"" + cdj + "\".");
        }
    }
    
    
    // Método para solicitar préstamo de libros por Isbn
    
    public void solicitarPrestamoPorIsbn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro que desea solicitar: ");
        String isbn = scanner.nextLine();

        // Buscar el libro por ISBN
        Libro libroEncontrado = buscarLibroPorISBN(isbn);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado);

            // Confirmación de préstamo
            System.out.print("¿Desea solicitar el préstamo de este libro? (S/N): ");
            String confirmacion = scanner.nextLine();
            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("Solicitud de préstamo cancelada.");
                return;
            }

            // Ingreso de fechas de préstamo y devolución
            System.out.print("Ingrese la fecha de préstamo (AAAA-MM-DD): ");
            LocalDate fechaPrestamo = LocalDate.parse(scanner.nextLine());
            System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
            LocalDate fechaDevolucion = LocalDate.parse(scanner.nextLine());

            // Crear y agregar el préstamo a la lista
            Prestamos nuevoPrestamo = new Prestamos(usuarioActual, libroEncontrado, fechaPrestamo, fechaDevolucion, false);
            prestamos.add(nuevoPrestamo);

            // Mensaje de éxito
            System.out.println("¡Préstamo realizado con éxito!");
            System.out.println("Libro prestado: " + libroEncontrado.getISBN() + ", Fecha de Devolución: " + fechaDevolucion);
        } else {
            System.out.println("No se encontró ningún libro con el ISBN \"" + isbn + "\".");
        }
    }
}

