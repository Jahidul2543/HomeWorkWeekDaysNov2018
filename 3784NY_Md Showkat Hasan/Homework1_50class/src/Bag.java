

public class Bag {

    String brand;
    int size;
    int price;

    public Bag() {
    }

    public Bag(String brand, String color) {
    }

    public Bag(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }


    public void bagInfo()

    {
        System.out.println( ("Bag Details : Bag Name :") + brand  + " Bag Size: " + size + " Bag Price : " + price);

    }

    public static void main(String[] args) {

        Bag polo = new Bag("Polo",  5, 50);
        Bag nike = new Bag("Nike",  4, 75);
        Bag airo = new Bag("Airo",  3, 25);
        Bag ae = new Bag("AE", 4, 65);
        Bag axe = new Bag("Axe",  6, 90);

        polo.bagInfo();
        nike.bagInfo();
        airo.bagInfo();
        ae.bagInfo();
        axe.bagInfo();


    }

}
