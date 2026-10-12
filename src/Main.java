import Pkg1.*;
import Pkg2.User;

import static Pkg1.File1.a;
import static Pkg1.File4.staticReturnType1;


public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello and welcome!");
/*      FILE 1
        File1 f1 = new File1();
        System.out.println(f1.x);    //Non static variable calls with class object

        System.out.println(File1.a);  /// static variable calls with class name directly

 */
       /* //FILE 2
        File2 f2 = new File2(20,"Khushi"); //Data member initailze with constructor
        System.out.println(f2.x);
        System.out.println(f2.a);

        */

       /* //File3
        File3 f3 = new File3(20,"Khushi");
        File3.nonReturnType1();  //Static method calls with class name
       f3.nonReturnType2();        // non static method calls with class object

        */


        /*
        // FILE 4
        File4 f4 = new File4();
         int a = File4.staticReturnType1();  // static method : return typr method stores in return type value
         String str = f4.nonStaticReturnType2(); // non return type method stores in non return type value
         System.out.println(a);
         System.out.println(str);

         */


        //FILE 5

        File5 f5 = new File5();
       User user = f5.nonStaticReturnType1();
        System.out.println(user);
        String str = f5.nonStaticReturnType2();
        System.out.println(str);
    }
}