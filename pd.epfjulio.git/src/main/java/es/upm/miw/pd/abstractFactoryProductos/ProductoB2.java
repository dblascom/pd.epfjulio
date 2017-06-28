package es.upm.miw.pd.abstractFactoryProductos;

import upm.jbb.IO;

public class ProductoB2 extends ProductoAbstractoB {

    @Override
    public void view() {
        IO.getIO().println("ProductoB2");
    }

}
