package Domain;
import java.util.Date;

// La clase Cliente extiende de Persona, lo que significa que hereda las propiedades y métodos de Persona.
public class Cliente extends Persona {
    // Atributo único de cada cliente, un identificador que se incrementa automáticamente.
    private int idCliente;

    // Atributo estático que sirve para llevar la cuenta de los IDs asignados a los clientes.
    private static int idClienteContador;

    // Fecha en la que se registró el cliente.
    private Date fechaRegistro;

    // Indica si el cliente es VIP (Very Important Person), es decir, si tiene un estatus especial.
    private boolean vip;

    // Constructor de la clase Cliente. Recibe los datos de fechaRegistro, vip, y los heredados de la clase Persona (nombre, género, edad, dirección).
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        // Llama al constructor de la clase base (Persona) para inicializar esos atributos.
        super(nombre, genero, edad, direccion);

        // Asigna un nuevo ID al cliente incrementando el contador estático.
        this.idCliente = ++Cliente.idClienteContador;

        // Establece la fecha de registro.
        this.fechaRegistro = fechaRegistro;

        // Indica si es VIP.
        this.vip = vip;
    }

    // Devuelve el ID del cliente.
    public int getIdCliente() {
        return this.idCliente;
    }

    // Devuelve la fecha de registro del cliente.
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    // Permite cambiar la fecha de registro.
    public void setFechaRegistro(Date fech) {
        fechaRegistro = fech;
    }

    // Devuelve si el cliente es VIP.
    public boolean isVip() {
        return this.vip;
    }

    // Permite cambiar el estado de VIP del cliente.
    public void setVip(boolean bool) {
        this.vip = bool;
    }

    // Sobrescribe el método toString para proporcionar una representación en texto del objeto Cliente.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente); // Añade el ID del cliente al String.
        sb.append(", fechaRegistro=").append(fechaRegistro); // Añade la fecha de registro al String.
        sb.append(", vip=").append(vip); // Añade el estatus de VIP al String.
        sb.append(", ").append(super.toString()); // Llama al método toString de la clase Persona para añadir los atributos heredados.
        sb.append('}');
        return sb.toString(); // Devuelve la cadena de texto completa que representa al objeto Cliente.
    }
}
