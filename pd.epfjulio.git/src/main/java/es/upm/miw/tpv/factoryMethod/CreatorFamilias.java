package es.upm.miw.tpv.factoryMethod;

public class CreatorFamilias extends Creator {
    @Override
    public Familia crearFamilia() {
        return new FamDesayunos();
    }

    @Override
    public String toString() {
        return "Creador de Familias";
    }

	@Override
	public Product crearProducto() {
		// TODO Auto-generated method stub
		return null;
	}
}
