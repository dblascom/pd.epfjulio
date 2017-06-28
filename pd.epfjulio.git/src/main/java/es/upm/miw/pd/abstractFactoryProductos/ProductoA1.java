package es.upm.miw.pd.abstractFactoryProductos;

import upm.jbb.IO;

public class ProductoA1 extends ProductoAbstractoA {

    @Override
    public void view() {
        IO.getIO().println("ProductoA1");
    }

}
