package Dear.darling;


public class Alien {

    private Computer com;


    public Alien(){
        System.out.println("alien constructor");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public void build(){
        System.out.println("working in Alien class");
        com.compile();
    }


}
