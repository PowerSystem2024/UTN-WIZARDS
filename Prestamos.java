//CLASE PRESTAMOS

package domain;

import java.time.LocalDate;


public class Prestamos {
    
    //Atributos 
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;
    
    //Constructor
    public Prestamos(Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion, boolean devuelto) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }

    public Libro getLibro() {
        return this.libro;
    }

//    public void setLibro(Libro libro) {
//        this.libro = libro;
//    }

    public LocalDate getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isDevuelto() {
        return this.devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamos{usuario=").append(usuario.getNombre());
        sb.append(", libro=").append(libro.getTitulo());
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append(", devuelto=").append(devuelto);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
