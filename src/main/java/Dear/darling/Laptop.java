package Dear.darling;

public class Laptop implements Computer{
    public Laptop(){
        System.out.println("laptop constructor");
    }
    public void compile(){
        System.out.println("compiling from laptop");
    }
}
