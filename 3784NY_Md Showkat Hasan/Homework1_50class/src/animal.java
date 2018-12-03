public class animal {


    public static void main(String[] args) {

        Animal Cat = new Animal("goga", "Cat", 4, 2,4);
        Cat.Speak();

        Animal Dog = new Animal("katy", "Dog", 4, 2,7);
        Dog.Speak();

        Animal Cow = new Animal("john", "Cow", 4, 2, 8);
        Cow.Speak();

        Animal Goat = new Animal("kiki", "Goat", 4, 2, 6);
        Goat.Speak();

        Animal Horse = new Animal("steve", "Horse", 4, 2,10);
        Horse.Speak();


    }

    public static class Animal {
        static String name;
        static String type;
        static int legs;
        static int eyes;
        static int age;

        public Animal(String name, String type, int legs,int eyes, int age) {
            this.name = name;
            this.type = type;
            this.legs = legs;
            this.eyes = eyes;
            this.age = age;
        }

        public static void Speak() {
            System.out.println("My name is " + name + ", I am " + type + ", i have " + legs+" legs"+", i have " + eyes + " eyes" + ",I am "+ age + " years old");
        }
    }

}