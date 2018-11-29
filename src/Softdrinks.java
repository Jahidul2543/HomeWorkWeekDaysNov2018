

public class Softdrinks {

    int a = 25;
    int b = 50;
    int c = a + b;
    int d = a - b;


        public void add(){
            System.out.println("Softdrink Add Count Result : " + c);
    }
        public void sub(){

            System.out.println("Softdrink Sub Count Result : " + d );
    }
                public static void main(String[]args){

                Softdrinks Mountaindew = new Softdrinks();
                Softdrinks Canadadry = new Softdrinks();

                Mountaindew.add();
                Canadadry.sub();

    }

}

