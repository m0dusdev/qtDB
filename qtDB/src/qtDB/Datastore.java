package qtDB;


import java.util.ArrayList;
import java.util.HashMap;


/**
 * Singleton object holding the virtual runtime data structure of
 * the entire database
 */

public class Datastore {
    private static Datastore ourInstance = new Datastore();
    public static Datastore getInstance() {
        return ourInstance;
    }


    // data structure for our data holding all stores
    static java.util.List<HashMap <Object, Object>> stores = new ArrayList<>();

    private Datastore() {

    }
}
