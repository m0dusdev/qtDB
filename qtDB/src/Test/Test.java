package Test;
import java.util.HashMap;
import qtDB.Store;



public class Test {

    private Store dataStore = new Store();

    Test(){
        print();
    }

     private void print(){
        for (int i = 0; i < 10; i++) {
            dataStore.createField('d', new Car(20 + i, 30 + i).getWeight());
         }

        System.out.println(dataStore.printAllFields() + "\n");
    }

    public static void main(String[] args) {
      Test t =   new Test();
      t.print();
    }


    private class Car {
        int weight = 0, colour =0;



        Car(int weight, int colour){
            weight = weight;
            colour = colour;
        }

        String getWeight(){
            try {
                return this.getWeight();
            } catch(ClassCastException c) { return c.getLocalizedMessage();}
        }

        int getColour(){
            return this.colour;
        }

    }

}
