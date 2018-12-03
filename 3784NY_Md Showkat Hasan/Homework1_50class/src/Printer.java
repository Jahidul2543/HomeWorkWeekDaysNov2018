
public class Printer {

    String brand;
    String type;
    int model;

 public void printerInfo(){


     System.out.println();

     System.out.println("This "+brand+" is a "+type+" printer"+ " And Model is " + model);

    }

    public void printerBrand(){
        System.out.println("Brand Name : "+brand);
    }

    public void printerType(){
        System.out.println("Printer Type : "+type);
    }

    public void printerModel(){
        System.out.println("Printer Model is : "+model);
    }

    public static void main(String[]args){

        Printer x=new Printer();
        x.brand="Samsung";
        x.type="Dotmatrix";
        x.model=6700;

        Printer y=new Printer();
        y.brand="Dell";
        y.type="Inkjet";
        y.model=5700;

        x.printerInfo();
        x.printerBrand();
        x.printerType();
        x.printerModel();

        y.printerInfo();
        y.printerBrand();
        y.printerType();
        y.printerModel();





    }

}
