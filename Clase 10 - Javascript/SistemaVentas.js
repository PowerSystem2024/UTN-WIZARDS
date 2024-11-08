class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template Literals: Nos permite insertar código dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: ${this._precio}`;
        }
        
    
} //Fin de laclase producto

class Orden{
    static contadorOdenes = 0;
    static getMAX_PRODUCTOS(){
        return;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); //Tenemos 2 tipos de sintaxis: 1
        }
        else{
            console.log('No se pueden agregar más productos');
        }
    } //Fin del método agregarProducto
calcularTotal(){
    let totalVenta = 0;
    for(let producto of this._productos){
        totalVenta += producto.precio;
    } //fin del ciclo for
    return totalVenta;
} //fin del metodo calcularTotal
    mostrarOrden(){
        let productosOrden = ' ';
        for(let producto of this._productos){
            productosOrden += '\n{ '+producto.toString()+' }';
        } //Fin del ciclo for
        console.log(`Orden: ${this._idOrden}, Total: ${this.calcularTotal()}, Productos: ${productosOrden}`);
    } //fin del metodo mostrar orden
}//Fin de la clase Orden

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Canmisa', 150);
let producto3 = new Producto('Cinturón', 50);
let orden1 = new Orden();
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();
