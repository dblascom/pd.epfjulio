package es.upm.miw.pd.abstractFactoryFamilias;

public class FabricaConcreta2 extends FabricaAbstracta {

    @Override
    public FamiliaAbstractaA crearProductoA() {
        return new ProductoA2();
    }

    @Override
    public FamiliaAbstractaB crearProductoB() {
        return new ProductoB2();
    }

    @Override
    public String toString() {
        return "FabricaConcreta2";
    }

}
