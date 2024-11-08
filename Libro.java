//CLASE LIBROS

package domain;

public class Libro {
    //Atributos del libros
    private String titulo;
    private String autor;
    private String cdj;
    private String isbn;
    
    //Constructor para inicializar los atributos del libro
    public Libro(String titulo, String autor, String cdj, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.cdj = cdj;
        this.isbn = isbn;
    }
    
    //Getters y Setters

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCDJ() {
        return this.cdj;
    }

    public void setCDJ(String CDJ) {
        this.cdj = CDJ;
    }

    public String getISBN() {
        return this.isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }
    
    //Método toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros{titulo = ").append(titulo);
        sb.append(", autor = ").append(autor);
        sb.append(", CDJ = ").append(cdj);
        sb.append(", ISBN = ").append(isbn);
        sb.append('}');
        return sb.toString();
    }
    
    
}
