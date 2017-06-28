package es.upm.miw.pd.abstractFactoryProductos;

import upm.jbb.IO;

public class ProductoA2 extends ProductoAbstractoA {

    @Override
    public void view() {
        IO.getIO().println("ProductoA2");
    }

}
