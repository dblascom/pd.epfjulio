package es.upm.miw.tpv.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class ProductosFactory {
    private static final ProductosFactory ReferencesFactory = new ProductosFactory();
    
    private Map<String, Integer> references;

    private int reference;
   
    ProductosFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    
    public static ProductosFactory getFactory (){
        return ReferencesFactory;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
