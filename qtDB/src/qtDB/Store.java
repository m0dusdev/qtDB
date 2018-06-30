package qtDB;

import java.util.Collections;
import java.util.HashMap;

// Executes functions on the KeyValue store qtDB datastore
public class Store {


    // given a fields key , return that field
    public Object search(java.util.List <java.util.List <HashMap <String, HashMap<?,?>>>> store) {

        return null;
    }



    // Create a table
    public void createField(Object o1, Object o2) {
        HashMap<Object, Object> field = new HashMap<>();

        field.put(o1, o2);

        Datastore.stores.add(field);
    }

    // remove a given store
    public void removeField(String[] search) {
        for (HashMap<?, ?> table : Datastore.stores) {
            if (table.containsKey(search[3])) {
                table.clear();
                System.out.println(table.toString());
            }

        }
    }

    // clear all fields
    public void removeAll() {
        Datastore.stores.clear();
        System.out.println(Datastore.stores.toString());

    }

    // print all fields
    public String printAllFields() {
        return Datastore.stores
                        .toString()
                        .replace('[', ' ')
                        .replace(']', ' ')
                        .replace('{', ' ')
                        .replace('}', ' ');
    }




}
