

public class Main {

    public static void main(String[] args) {

        Phone Galaxys9 = new Phone("galaxy s9","android8",6,12,128);
        Galaxys9.Speaks();

        Phone Galaxys8 = new Phone("galaxy s8","android8",6,8,64);
        Galaxys8.Speaks();

        Phone Galaxys7 = new Phone("galaxy s7","android6",5,5,64);
        Galaxys7.Speaks();

        Phone Galaxys6 = new Phone("galaxy s6","android5",5,5,64);
        Galaxys6.Speaks();

        Phone Galaxys5 = new Phone("galaxy s5","android4",4,5,64);
        Galaxys5.Speaks();


    }
    public static class Phone {
        static String name;
        static String type;
        static int size;
        static int camera;
        static int memory;

        public Phone(String name, String type, int size, int camera, int memory) {
            this.name = name;
            this.type = type;
            this.size = size;
            this.camera = camera;
            this.memory = memory;
        }
        public static void Speaks() {
            System.out.println("My name is " + name+ ", My os type is " + type + "," + "My screen size is " + size + " inch,  "+  "I have " + camera + " mega pixel,"+ "and My memory is " + memory+"gb" );
        }
    }
}
