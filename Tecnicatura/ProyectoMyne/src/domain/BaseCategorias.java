
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BaseCategorias {
    
    private static List<Categoria> categorias = inicializarCategorias();
    
    public static List<Categoria> inicializarCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        
        //Genalidades
        Categoria generalidades = new Categoria("Generalidades");
        generalidades.agregarSubCategoria("Bibliotecas");
        generalidades.agregarSubCategoria("Enciclopedias y libros de referencia general");
        generalidades.agregarSubCategoria("Periódicos y revistas");
        generalidades.agregarSubCategoria("Asociaciones, organizaciones y museos");
        generalidades.agregarSubCategoria("Medios de comunicación de masas, periodismo, publicidad");
        generalidades.agregarSubCategoria("Informática y tecnología de la información");
        generalidades.agregarSubCategoria("Generalidades del conocimiento");
        generalidades.agregarSubCategoria("Obras generales de consulta");
        generalidades.agregarSubCategoria("Publicaciones seriadas y periódicas");
        
        //Filosofía
        Categoria filosofia = new Categoria("Filosofía");
        filosofia.agregarSubCategoria("Metafísica");
        filosofia.agregarSubCategoria("Lógica");
        filosofia.agregarSubCategoria("Ética");
        filosofia.agregarSubCategoria("Estética");
        filosofia.agregarSubCategoria("Filosofía de la mente");
        filosofia.agregarSubCategoria("Filosofía del lenguaje");
        filosofia.agregarSubCategoria("Filosofía de la ciencia");
        filosofia.agregarSubCategoria("Filosofía política");
        filosofia.agregarSubCategoria("Filosofía de la religión");
        
        //Historia
        Categoria historia = new Categoria("Historia");
        historia.agregarSubCategoria("Geografía general");
        historia.agregarSubCategoria("Historia de Asia");
        historia.agregarSubCategoria("Historia de Europa");
        historia.agregarSubCategoria("Historia de América");
        historia.agregarSubCategoria("Historia de África");
        historia.agregarSubCategoria("Historia de Oceanía");
        historia.agregarSubCategoria("Historia Antigua");
        historia.agregarSubCategoria("Edad Media");
        historia.agregarSubCategoria("Historia  Moderna");
        
        //Ciencias Sociales
        Categoria cienciaSociales = new Categoria("Ciencias sociales");
        cienciaSociales.agregarSubCategoria("Estadísticas generales");
        cienciaSociales.agregarSubCategoria("Política");
        cienciaSociales.agregarSubCategoria("Economía");
        cienciaSociales.agregarSubCategoria("Derecho");
        cienciaSociales.agregarSubCategoria("Educación");
        cienciaSociales.agregarSubCategoria("Comercio internacional");
        cienciaSociales.agregarSubCategoria("Sociología");
        cienciaSociales.agregarSubCategoria("Antropología");
        cienciaSociales.agregarSubCategoria("Demografía");
        
        //Ciencias Naturales
        Categoria cienciaNaturales = new Categoria("Ciencias Naturales");
        cienciaNaturales.agregarSubCategoria("Matemáticas");
        cienciaNaturales.agregarSubCategoria("Física");
        cienciaNaturales.agregarSubCategoria("Química");
        cienciaNaturales.agregarSubCategoria("Astronomía");
        cienciaNaturales.agregarSubCategoria("Ciencias de la Tierra");
        cienciaNaturales.agregarSubCategoria("Biología");
        cienciaNaturales.agregarSubCategoria("Botánica");
        cienciaNaturales.agregarSubCategoria("Zoología");
        cienciaNaturales.agregarSubCategoria("Ecología");
        
        //Tecnología
        Categoria tecnologia = new Categoria("Tecnología");
        tecnologia.agregarSubCategoria("sin asignar");
        tecnologia.agregarSubCategoria("Ingeniería");
        tecnologia.agregarSubCategoria("Agricultura");
        tecnologia.agregarSubCategoria("Gestión y servicios auxiliares");
        tecnologia.agregarSubCategoria("sin asignar");
        tecnologia.agregarSubCategoria("Construcción");
        tecnologia.agregarSubCategoria("Electrónica");
        tecnologia.agregarSubCategoria("sin asignar");
        tecnologia.agregarSubCategoria("Transporte");
        
        //Industria y Negocios
        Categoria industriaNegocios = new Categoria("sin asignar");
        industriaNegocios.agregarSubCategoria("Contabilidad");
        industriaNegocios.agregarSubCategoria("Finanzas");
        industriaNegocios.agregarSubCategoria("Recursos humanos");
        industriaNegocios.agregarSubCategoria("Marketing");
        industriaNegocios.agregarSubCategoria("Economía industrial");
        industriaNegocios.agregarSubCategoria("sin asignar");
        industriaNegocios.agregarSubCategoria("Comercio electrónico");
        industriaNegocios.agregarSubCategoria("Turismo y hospitalidad");
        industriaNegocios.agregarSubCategoria("Inmobiliaria");
        
        //Arte y Deportes
        Categoria arteDeporte = new Categoria("Artes y Deportes");
        arteDeporte.agregarSubCategoria("Artes visuales");
        arteDeporte.agregarSubCategoria("Fotografía");
        arteDeporte.agregarSubCategoria("Música");
        arteDeporte.agregarSubCategoria("Danza");
        arteDeporte.agregarSubCategoria("Teatro");
        arteDeporte.agregarSubCategoria("Cine");
        arteDeporte.agregarSubCategoria("Literatura artística");
        arteDeporte.agregarSubCategoria("Arquitectura");
        arteDeporte.agregarSubCategoria("Deportes y recreación física");
        
        //Lenguaje
        Categoria lenguaje = new Categoria("Lenguaje");
        lenguaje.agregarSubCategoria("Linguistica general");
        lenguaje.agregarSubCategoria("Lenguas indoeuropeas");
        lenguaje.agregarSubCategoria("Lenguas romances");
        lenguaje.agregarSubCategoria("Lenguas germánicas");
        lenguaje.agregarSubCategoria("Lenguas eslavas");
        lenguaje.agregarSubCategoria("Lenguas semíticas");
        lenguaje.agregarSubCategoria("Lenguas sino-tibetanas");
        lenguaje.agregarSubCategoria("Lenguas africanas");
        lenguaje.agregarSubCategoria("Otros idiomas");
        
        //Literatura
        Categoria literatura = new Categoria("Literatura");
        literatura.agregarSubCategoria("Poesía");
        literatura.agregarSubCategoria("Drama");
        literatura.agregarSubCategoria("Ficción");
        literatura.agregarSubCategoria("Ensayos");
        literatura.agregarSubCategoria("Biografías y autobiografías");
        literatura.agregarSubCategoria("Literatura infantil y juvenil");
        literatura.agregarSubCategoria("Literatura de viajes");
        literatura.agregarSubCategoria("Literatura de fantasía y ciencia ficción");
        literatura.agregarSubCategoria("Crítica literaria");
        
        categorias.add(generalidades);
        categorias.add(filosofia);
        categorias.add(historia);
        categorias.add(cienciaSociales);
        categorias.add(cienciaNaturales);
        categorias.add(tecnologia);
        categorias.add(industriaNegocios);
        categorias.add(arteDeporte);
        categorias.add(lenguaje);
        categorias.add(literatura);

        return categorias;
    }
    
    // Método para dar de alta una nueva categoría
    public void darDeAltaCategoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la nueva categoría: ");
        String nombreCategoria = scanner.nextLine();

        // Verificar si la categoría ya existe
        if (buscarCategoriaPorNombre(nombreCategoria) != null) {
            System.out.println("Error: Ya existe una categoría con ese nombre.");
            return;
        }

        // Crear nueva categoría y agregar subcategorías
        Categoria nuevaCategoria = new Categoria(nombreCategoria);
        System.out.println("Ingrese las subcategorías para " + nombreCategoria + " (ingrese 'salir' para finalizar):");

        while (true) {
            System.out.print("Subcategoría: ");
            String subCategoria = scanner.nextLine();

            if (subCategoria.equalsIgnoreCase("salir")) {
                break;
            }
            nuevaCategoria.agregarSubCategoria(subCategoria);
        }

        categorias.add(nuevaCategoria);
        System.out.println("La categoría ha sido agregada exitosamente: " + nuevaCategoria);
    }
    
    // Método para modificar una categoría existente
    public void modificarCategoria() {
        Scanner scanner = new Scanner(System.in);

        // Mostrar las categorías disponibles
        System.out.println("Categorías disponibles:");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println((i + 1) + ". " + categorias.get(i).getNombre());
        }

        // Pedir al usuario que seleccione una categoría para modificar
        System.out.print("Seleccione el número de la categoría que desea modificar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Validar la opción seleccionada
        if (opcion < 1 || opcion > categorias.size()) {
            System.out.println("Opción no válida.");
            return;
        }

        Categoria categoriaSeleccionada = categorias.get(opcion - 1);

        // Submenú para modificar la categoría
        System.out.println("Opciones de modificación:");
        System.out.println("1. Cambiar nombre de la categoría");
        System.out.println("2. Agregar una nueva subcategoría");
        System.out.print("Seleccione una opción: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (seleccion) {
            case 1:
                // Cambiar el nombre de la categoría
                System.out.print("Ingrese el nuevo nombre de la categoría: ");
                String nuevoNombre = scanner.nextLine();
                categoriaSeleccionada.setNombre(nuevoNombre);
                System.out.println("Nombre de la categoría actualizado.");
                break;
                
            case 2:
                // Agregar una nueva subcategoría
                System.out.print("Ingrese el nombre de la nueva subcategoría: ");
                String nuevaSubCategoria = scanner.nextLine();
                categoriaSeleccionada.agregarSubCategoria(nuevaSubCategoria);
                System.out.println("Subcategoría agregada.");
                break;
                
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    public boolean darBajaCategoriaOSubcategoria() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Deseas dar de baja una categoría (1) o una subcategoría (2)?");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        
        if (opcion == 1) {
            // Baja de categoría
            System.out.println("Introduce el nombre de la categoría a eliminar:");
            String nombreCategoria = scanner.nextLine();
            for (Categoria categoria : categorias) {
                if (categoria.getNombre().equalsIgnoreCase(nombreCategoria)) {
                    categorias.remove(categoria);
                    System.out.println("Categoría eliminada: " + nombreCategoria);
                    return true;
                }
            }
            System.out.println("Categoría no encontrada.");
        } else if (opcion == 2) {
            // Baja de subcategoría
            System.out.println("Introduce el nombre de la categoría de la que deseas eliminar una subcategoría:");
            String nombreCategoria = scanner.nextLine();
            for (Categoria categoria : categorias) {
                if (categoria.getNombre().equalsIgnoreCase(nombreCategoria)) {
                    System.out.println("Introduce el nombre de la subcategoría a eliminar:");
                    String nombreSubCategoria = scanner.nextLine();
                    if (categoria.eliminarSubCategoria(nombreSubCategoria)) {
                        System.out.println("Subcategoría eliminada: " + nombreSubCategoria);
                        return true;
                    } else {
                        System.out.println("Subcategoría no encontrada.");
                    }
                }
            }
            System.out.println("Categoría no encontrada.");
        } else {
            System.out.println("Opción no válida.");
        }
        
        return false;
    }
    
   
    

    // Método auxiliar para buscar una categoría por nombre
    private static Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equalsIgnoreCase(nombre)) {
                return categoria;
            }
        }
        return null;
    }
    
    // Obtener categorías
    public static List<Categoria> getCategorias() {
        return categorias;
    }
    
    // Método para agregar una nueva categoría
    public static void agregarCategoria(String nombreCategoria) {
        categorias.add(new Categoria(nombreCategoria));
    }
    
    // Método para modificar una categoría existente
    public static boolean modificarCategoria(String nombreActual, String nuevoNombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equalsIgnoreCase(nombreActual)) {
                categoria.setNombre(nuevoNombre);
                return true; // Modificación exitosa
            }
        }
        return false; // Categoría no encontrada
    }
    
    // Método para eliminar una categoría existente
    public static boolean eliminarCategoria(String nombreCategoria) {
        return categorias.removeIf(categoria -> categoria.getNombre().equalsIgnoreCase(nombreCategoria));
    }
}
