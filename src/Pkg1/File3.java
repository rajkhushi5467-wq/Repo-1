package Pkg1;

public class File3 {
    public int x ;
    public static String a ;

    //By default constructor
    public File3(){}

    //By Prameterized Constructor
    public File3(int x,String a){
        this.x = x;
        this.a = a;
    }

    //Static method (non return type )
     public static void nonReturnType1(){
        System.out.println("Non Return static method");
     }
    //Non Static method (non return type)
    public void nonReturnType2(){
        System.out.println("non return non static method");
    }
}
