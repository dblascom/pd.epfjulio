package es.upm.miw.tpv.factoryMethod;

import es.upm.miw.tpv.entities.FamDesayunos;

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
