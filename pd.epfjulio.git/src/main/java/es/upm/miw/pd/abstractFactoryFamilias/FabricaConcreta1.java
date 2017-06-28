package es.upm.miw.pd.abstractFactoryFamilias;


public class FabricaConcreta1 extends FabricaAbstracta {

    @Override
    public FamiliaAbstractaA crearProductoA() {
        return new ProductoA1();
    }

    @Override
    public FamiliaAbstractaB crearProductoB() {
        return new FamBebidas();
    }

    @Override
    public String toString() {
        return "FabricaConcreta1";
    }

}
