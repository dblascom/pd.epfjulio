package es.upm.miw.pd.abstractFactoryFamilias;

import upm.jbb.IO;

public class ProductoB1 extends FamiliaAbstractaB {

    @Override
    public void view() {
        IO.getIO().println("ProductoB1");
    }

}
