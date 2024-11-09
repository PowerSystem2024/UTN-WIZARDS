//CLASE CATEGORÍA

package domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    //Atributos para la categoria (Caracteristicas)
    private String nombre; //nombre de la categoría principal
    private List<String> subCategorias; //Lista de SubCategorias
    
    //Constructor de la clase categoria
    public Categoria(String nombre) {
        this.nombre = nombre;
        this.subCategorias = new ArrayList<>();
    }
    
    //Método para agregar subcategorías a una categoría
    public void agregarSubCategoria(String subCategoria){
        this.subCategorias.add(subCategoria);
    }
    
    public boolean eliminarSubCategoria(String subCategoria) {
        if (subCategorias.remove(subCategoria)) {
            return true; // Subcategoría eliminada
        }
        return false; // Subcategoría no encontrada
    }
    
    //GETTERS Y SETTERS
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSubCategorias() {
        return this.subCategorias;
    }

    public void setSubCategorias(List<String> subCategorias) {
        this.subCategorias = subCategorias;
    }
    
    //toString
    //StringBuilder (visto en la clase 9)
    //Creamos el toString() personalizado para que muestre bien formateada la información de la categoria
    //Usamos StringBuilder, que es más eficiente que concatenar con el operador + en bucles
    @Override
    public String toString() {
        //Creamo un objeto StringBuilder llamado sb que se encargará de construir el texto final
        StringBuilder sb = new StringBuilder(); //StringBuilder sin texto inicial, listo para agregar información
        //Usamos append para agregar el nombre de la categoría y un salto de línea
        sb.append("Categoria: ").append(nombre).append("\nSubcategorías:\n");//Con el metodo append vamos agregando las cedanas y atributos
        //Bucle for-each para recorrer la lsita de subcategorías y añadir cada una al texto
        for (String subCat : subCategorias){
            sb.append("- ").append(subCat).append("\n");//Formato de lsita para subcategorías
        }
        return sb.toString();// Convertimos el contenido de StringBuilder en una cadena y lo devolvemos 
        
    }

    
    
    
    
    
}
