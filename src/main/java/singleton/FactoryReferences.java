package singleton;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
	
	private static FactoryReferences singleton = null;
	
    private Map<String, Integer> references;

    private int reference;

    private FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    
    public static FactoryReferences getFactory(){
    	if(FactoryReferences.singleton==null){
    		FactoryReferences.singleton = new FactoryReferences();
    }
    	return FactoryReferences.singleton;
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
