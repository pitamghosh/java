public class Casting {
    public static void main(String[] args) {
       //Casting
       double price=500.00;
       double tax=10;
       double finaslPrice=price+tax;
       System.out.println(finaslPrice);
       
                        //explisit castring
       int p=500;
       int fp=p+(int)10.0;
       System.out.println(fp);
    }
}
