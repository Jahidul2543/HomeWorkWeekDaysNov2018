package SteringM;

public class EnumTest {
     // An EnumTest
    enum Month{
        JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
         {
             //Driver class that contains an object of "Month" and
             // main().
             class Test {
                 Month month;
                 // constructor
                 public Test(Month month) {
                     this.month = month;

                 }
                 // Print a line about Month using switch
                 public void month(){
                     switch (month){
                         case JUNE:
                             System.out.println("June is hot");
                         case JULY:
                             System.out.println("July is very hot");
                         case AUGUST:
                             System.out.println("August is cool");
                         case SEPTEMBER:
                             System.out.println("September is cooler");
                         case OCTOBER:
                             System.out.println("October is fall");
                         case NOVEMBER:
                             System.out.println(" November is really cold");
                         case DECEMBER:
                             System.out.println("December is coldest");{
                             // Driver method

                             {
                                 String str = "June";
                                 Test t1 = new Test(Month.valueOf(str));
                                 t1.month();
                             }
                         }



                     }
                         }

                     }
                 }

             }

         }





