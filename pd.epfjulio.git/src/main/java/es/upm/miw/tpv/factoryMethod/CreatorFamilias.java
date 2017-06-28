package es.upm.miw.tpv.factoryMethod;

public class CreatorFamilias extends Creator {
    @Override
    public Familia crearFamilia() {
        return new FamDesayunos();
    }

    @Override
    public String toString() {
        return "Creador de Producto1";
    }
}
