package HomeWorkWeekDaysNov2018;

import java.util.LinkedList;

public class PracticeLinkLIst {

    public static void main(String[] args) {

        LinkedList <String> ll = new LinkedList<String>();

        ll.add("Afnan");
        ll.add("Saeed");

        LinkedList <Integer> age = new LinkedList<Integer>();

        age.add(3);
        age.add(5);
        age.add(4);
        age.add(4);
        age.add(4);
        // LinkedList you can print the list by name
        // Other list types give Object memory address
        System.out.println(ll);
        System.out.println(age);
        System.out.println(age.get(3));
        // non generic LinkedList
        LinkedList gap = new LinkedList();
        gap.add("Afnan");
        gap.add(3);
        gap.add(3.5);
        System.out.println(gap);
        //iterating through LinkedList ll
        for(int i =0; i <ll.size();i++){
            System.out.println("Value returning after loop");
            System.out.println(ll.get(i));
            System.out.println("***********************");

        }


        System.out.println("|||||||||||||##################||||||||||||");
        // First Element of the list
        System.out.println("Retriving First value from list : "+gap.getFirst());
        //Adding First element in the list
        gap.addFirst("dss");
        // Adding last element in the LinkedList
        gap.addLast(89678);

        // set float value to String type
        gap.set(3,"Khan Shab");
        //Printing list by name
        System.out.println(gap);
        // remove first and last element
        gap.removeFirst();
        gap.removeLast();
        System.out.println("////////////////");
        System.out.println(gap);

        System.out.println("*********>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<*********");
        for(int i = 0; i < gap.size();i++){
            System.out.println(gap.get(i));

        }
        System.out.println("[][[][][][][[][][[]]");
        for(String i: ll){
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++");



    }


}
