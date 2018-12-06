package HomeWorkWeekDaysNov2018.revision;

public abstract class AbtractClass implements  InterfacePractice{

    // in abstract class at least one method has to abstract;

      byte num1 = 100;
      byte num2 = 100;

      int num3 = num1*num2;

      // we have to declasre abstract then there si no need of body;

    public abstract void  addition5();
    public void addition6(){

        System.out.println("The result is :"+num3);
      }

    @Override
    public void mrthodforabstractClass() {
        System.out.println("This method is from IntefeacePractice to complete in Abstract class");
        System.out.println("Because Implemending in AbstractClass");

    }
}
