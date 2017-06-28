package es.upm.miw.tpv.factoryMethod;

public class CreatorProductos extends Creator {
    @Override
    public Product crearProducto() {
        return new Product2();
    }

    @Override
    public String toString() {
        return "Creador de Producto2";
    }
}
