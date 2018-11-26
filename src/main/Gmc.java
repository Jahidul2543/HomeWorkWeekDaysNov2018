package main;

public class Gmc {

    public static void main(String[]args) {
    Ford tofael = new Ford();
    tofael.setDriveWaySize(6);
        System.out.println("tofels drive way" + tofael.getDriveWaySize());


       Ford arif = new Ford();
         arif.setDriveWaySize(7);
        System.out.println("lalal" + arif.getDriveWaySize());

       System.out.println("lalala"+ tofael.getDriveWaySize() );
        int totalSize = tofael.getDriveWaySize() + arif.getDriveWaySize();
        System.out.println(totalSize);
        Ford.buildDriveWay();



    }

}
