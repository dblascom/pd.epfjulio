package es.upm.miw.pd.abstractFactoryFamilias;

import upm.jbb.IO;

public class ProductoA1 extends FamiliaAbstractaA {

    @Override
    public void view() {
        IO.getIO().println("ProductoA1");
    }

}
