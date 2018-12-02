public class Selenium {

    String difficulty;
    Boolean easy = true;
    int duration = 8;
    Boolean boring;
    int x;
    int y;



    public void studying() {
        System.out.println("The difficulty level is " + difficulty);

    }

    public void doHomework(){
        System.out.println("The difficulty level is " + duration);
        System.out.println("it become easy " + easy);
    }
    public static void main(String[] args) {

        Selenium obj1 = new Selenium();
        obj1.difficulty = "easy";


        Selenium obj2 = new Selenium();
        obj2.difficulty = "hard";

        obj1.studying();
        obj1.doHomework();

    }
}


