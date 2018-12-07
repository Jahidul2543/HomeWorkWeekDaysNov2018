public class SwitchStatment {

    public static void main (String [] args ) {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                    System.out.println("'tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;

            /*
            The default keyword specifies the code to run if there is no case match
            The default keyword does not need a break, because it's always the last statement in a switch block.
            */
            default:
                System.out.println("weekend");





        }


    }
}
