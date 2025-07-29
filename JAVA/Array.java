//import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        // int age = 30;
        // int physics = 40;
        // int math = 50;
        // int computer = 90;
        // OR

        int[] marks = new int[4]; // declaring an array of size 4
        marks[0] = 40; // assigning values to the array
        marks[1] =50;
        marks[2]= 90;
        marks[3] =30;
        // System.out.println(marks[0]); // accessing the first element of the array
        // System.out.println(marks[1]); // accessing the second element of the array
        // System.out.println(marks[2]); // accessing the third element of the array
        // System.out.println(marks[3]); // accessing the fourth element of the array
        // System.out.println(marks.length); 


        // //short Array
        // System.out.println(marks[0]);
        // Arrays.sort(marks); 
        // System.out.println(marks[0]);//For Sorting we import java.util.Arrays; 

        //int[] marks1 = {40, 50, 90, 30}; // declaring and initializing an array


                           //2D Array
        int[][] marks2 = {{40,90,50},{80,30,100}};
        System.out.println(marks2[0][0]); // accessing the first element of the first array
        System.out.println(marks2[0][1]); // accessing the second element of the
        System.out.println(marks2[1][1]); // accessing the first element of the first array
    }
}
