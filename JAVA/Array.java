
package myfirstapp;

public class Array {
    public static void main(String[]args){
        String[] a={"cat","Dog","Cow"};
        /*a[1]="Horse";
        System.out.println(a[1]);*/
        /*System.out.println(a[1]);
        System.out.println(a.length);*/
        
        
        /*for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }*/
        
        
        int[][]number={{1,2,3,4},{5,6,7,8}};
        /*number[1][2]=10;
        System.out.println(number[1][2]);
        //System.out.println(number[1][3]);*/


        for(int i=0;i<number.length;++i){
            for(int j=0;j<number[i].length;++j){
                System.out.println(number[i][j]);
            }
        }
    }
}
