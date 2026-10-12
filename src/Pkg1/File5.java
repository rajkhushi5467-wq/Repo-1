package Pkg1;

import Pkg2.User;

public class File5 {
    public Integer x = 20;
    public String a = "Khushi";

    //Static method (Return type )
    public User nonStaticReturnType1(){
        User user = new User();
        user.setAge(x);
       user.setName(a);
       return user;
    }
    //Non Static method (Return type)
    public String nonStaticReturnType2(){
        // System.out.println("Return non static method");
        int y = File4.staticReturnType1();
        System.out.println(y);
        return a;
    }
}
