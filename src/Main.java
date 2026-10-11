import Pkg1.File1;

import static Pkg1.File1.a;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        File1 f1 = new File1();
        System.out.println(f1.x);    //Non static variable calls with class object

        System.out.println(File1.a);  /// static variable calls with class name directly
    }
}