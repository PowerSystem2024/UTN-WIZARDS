
package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BaseUsuarios {
    private List<Prestamos> prestamos; // Lista para almacenar los préstamos de usuarios
    private List<Usuario> usuarios; // Lista de usuarios registrados en el sistema
    private Usuario usuarioActual; // Usuario actualmente usando el sistema
    
    // Constructor para inicializar la lista de usuarios
    public BaseUsuarios() {
        this.usuarios = getUsuario(); // Llama al método getUsuario para cargar los usuarios al crear una instancia
    }
    // Método estático que retorna una lista de usuarios precargada
    public static List<Usuario> getUsuario(){
        List<Usuario> usuarios = new ArrayList<>(); // Crea una lista vacía de usuarios
        usuarios.add(new Usuario("Administrador", "1234", 1, "45234234")); // Añade un usuario administrador
        usuarios.add(new Usuario("Franco", "5678", 2, "23436435")); // Añade un usuario de nivel 2
        usuarios.add(new Usuario("Guest", "9101", 3, "43542345")); // Añade un usuario invitado de nivel 3
        return usuarios; // Retorna la lista de usuarios precargada
    }  
    
    
    // Método para mostrar todos los usuarios
    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) { // Verifica si la lista de usuarios está vacía
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios registrados:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario); // Muestra la información de cada usuario usando toString()
                System.out.println("-------------------------"); // Añade una separación entre usuarios
            }
        }
    }
    
    // Método para dar de alta un nuevo usuario
    public void darDeAltaUsuario() {
        Scanner scanner = new Scanner(System.in);
        // Solicita el nombre del nuevo usuario
        System.out.print("Ingrese el nombre: "); 
        String nombre = scanner.nextLine();
        // Solicita la contraseña del nuevo usuario
        System.out.print("Ingrese la contraseña: "); 
        String contraseña = scanner.nextLine();
        // Solicita el nivel de usuario: 1 para Administrador, 2 para Socio, 3 para Invitado
        System.out.print("Ingrese el nivel de usuario (1-Administrador, 2-Socio, 3-Invitado): ");
        int nivel = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        // Solicita el DNI del usuario
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();

        // Revisa si el DNI ya está registrado en la lista de usuarios
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                System.out.println("El usuario con DNI " + dni + " ya está registrado.");
                return; // Termina el método si el usuario ya existe
            }
        }
        
        // Si el DNI no existe, añade el nuevo usuario a la lista
        usuarios.add(new Usuario(nombre, contraseña, nivel, dni));
        System.out.println("Usuario " + nombre + " dado de alta exitosamente.");
    }
    
    // Método para modificar un usuario existente
    public void modificarUsuario() {
        Scanner scanner = new Scanner(System.in);
        // Solicita el DNI del usuario que se desea modificar
        System.out.print("Ingrese el DNI del usuario que desea modificar: ");
        String dni = scanner.nextLine();
        
        // Busca el usuario en la lista según el DNI ingresado
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                usuarioEncontrado = usuario;
                break; // Sale del bucle cuando encuentra al usuario
            }
        }
        
        // Verifica si el usuario fue encontrado
        if (usuarioEncontrado == null) {
            System.out.println("No se encontró un usuario con DNI: " + dni);
            return; // Termina el método si no se encuentra el usuario
        }
        
        // Muestra los datos actuales del usuario encontrado
        System.out.println("Usuario encontrado: " + usuarioEncontrado);
        
        // Solicita los nuevos datos y permite mantener los datos actuales si se presiona Enter
        System.out.print("Ingrese el nuevo nombre (o presione Enter para mantenerlo): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            usuarioEncontrado.setNombre(nuevoNombre);
        }
        
        System.out.print("Ingrese la nueva contraseña (o presione Enter para mantenerla): ");
        String nuevaContraseña = scanner.nextLine();
        if (!nuevaContraseña.isEmpty()) {
            usuarioEncontrado.setContraseña(nuevaContraseña);
        }
        
        System.out.print("Ingrese el nuevo nivel de usuario (1-Administrador, 2-Socio, 3-Invitado, o presione Enter para mantenerlo): ");
        String nivelInput = scanner.nextLine();
        if (!nivelInput.isEmpty()) {
            int nuevoNivel = Integer.parseInt(nivelInput);
            usuarioEncontrado.setNivelUsuario(nuevoNivel);
        }
        
        // Confirma que los cambios se realizaron con éxito
        System.out.println("Usuario modificado exitosamente: " + usuarioEncontrado);
    }
    
    //Método para dar de baja a un usuario
    public void darDeBajaUsuario() {
        Scanner scanner = new Scanner(System.in);
        // Solicita el DNI del usuario que se desea dar de baja
        System.out.print("Ingrese el DNI del usuario que desea dar de baja: ");
        String dni = scanner.nextLine();
        
        // Utiliza un iterador para recorrer la lista y eliminar el usuario por DNI
        Iterator<Usuario> iterator = usuarios.iterator();
        boolean usuarioEncontrado = false;
        
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getDni().equals(dni)) {
                iterator.remove(); // Elimina el usuario de la lista
                usuarioEncontrado = true;
                System.out.println("El usuario con DNI " + dni + " ha sido dado de baja exitosamente.");
                break; // Sale del bucle una vez que se encuentra y elimina el usuario
            }
        }
        
        // Mensaje en caso de que el usuario no exista en la lista
        if (!usuarioEncontrado) {
        System.out.println("No se encontró un usuario con DNI: " + dni);
        }
    }
    
    //Método para agregar un usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado exitosamente.");
    }
    
    // Método para buscar un usuario por nombre
    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado.");
        return null;
    }
    
  
    
    // Método para eliminar un usuario por nombre
    public void eliminarUsuarioPorNombre(String nombre) {
        Usuario usuario = buscarUsuarioPorNombre(nombre);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado exitosamente.");
        }
    }
    
    // Método de acceso para obtener todos los usuarios (en caso de necesitarlos en otras clases)
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    public Usuario autenticarUsuario(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContraseña().equals(contrasena)) {
                return usuario;
            }
        }
        return null;
    }
    
    
    // Método para establecer el usuario actual
    public void setUsuarioActual(Usuario usuario) {
        this.usuarioActual = usuario;
    }

    
   
}

    
