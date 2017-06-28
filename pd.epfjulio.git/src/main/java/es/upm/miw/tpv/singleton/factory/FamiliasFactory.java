package es.upm.miw.tpv.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FamiliasFactory {
    private static final FamiliasFactory ReferencesFactory = new FamiliasFactory();
    
    private Map<String, Integer> references;

    private int reference;
   
    FamiliasFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    
    public static FamiliasFactory getFactory (){
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
