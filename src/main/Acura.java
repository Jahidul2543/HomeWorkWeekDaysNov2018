package main;

public class Acura {

    public static int totalCapacity;


    public  void setTotalCapacity(int totalCapacity) {
        Acura.totalCapacity = totalCapacity;

    }


    public int getTotalCapacity(){
        return totalCapacity;
    }

    public static void carIdentity() {
        System.out.println("This is what our cars have");
    }
    public static void main(String[] args) {

        Acura tlx = new Acura();
        tlx.setTotalCapacity(6);
        System.out.println("My TLX has " + tlx.getTotalCapacity() + " seats");


        Acura sfx = new Acura();
        sfx.setTotalCapacity(7);
        System.out.println("My SFX has" + sfx.getTotalCapacity() + "seats");

        Acura mxd = new Acura();
        mxd.setTotalCapacity(4);
        System.out.println("My mdx has" + mxd.getTotalCapacity() + "seats");

        Acura ntc = new Acura();
        ntc.setTotalCapacity(3);
        System.out.println("My ntc has" + ntc.getTotalCapacity() + "seats");

        Acura.carIdentity();


    }
}
