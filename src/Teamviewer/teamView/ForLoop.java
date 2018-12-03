package Teamviewer.teamView;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);


            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String t : cars) {
                System.out.println(t);


                for (int x=1;x<=10;++x){
                    System.out.println(x);


                    for (int iphone = 0; iphone < 10; ++iphone){
                        System.out.println(iphone);

                    }
                }
            }
        }

    }
}