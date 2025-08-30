
package myfirstapp;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[]args){
        ArrayList<String>animals=new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("Accessing individual elements:");
        for(int i=0;i<animals.size();i++){
            System.out.print(animals.get(i));
            System.out.print(", ");
        }
        
    }
}
