package myfirstapp;

public class Array_1 {
    public static void main(String[]args){
        /*int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int m=5;
        int f=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 if(m==a[i][j]){
                 f=1;
            }
        }
       
    }
        if(f==1){
            System.out.println("Found");
        }else{
            System.out.println("NotFound");
        }*/
        
        
        
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=a[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                max=a[i][j];
            }
        }
        
        System.out.println("MAX:"+max);
    }
    
}
