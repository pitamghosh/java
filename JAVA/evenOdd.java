
package myfirstapp;

public class evenOdd {
    public static void num(int number){
        if(number%2==0){
            System.out.println("it is a even number");
        }else{
           System.out.println("it is a odd number"); 
        }
    }
    public static void main(String[]args){
        num(10);
        num(5);
    }
}
