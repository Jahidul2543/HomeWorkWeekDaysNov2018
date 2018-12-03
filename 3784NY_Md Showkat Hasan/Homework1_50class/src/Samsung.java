
public class Samsung {


    int name;
    int price;
    int make;
    int model;

    public Samsung(int name,int price,int make,int model){
        this.name=name;
        this.price=price;
        this.make=make;
        this.model=model;
    }
    public void samsungInfo(){
        System.out.println("Samsung TV : " + name+ " Price: $," +price+ ", Make: "+make + ", Model: "+model);
    }
    public static void main(String[]args){

        Samsung Q900 = new Samsung(9,1499,2018, 8);
        Samsung Q9FN = new Samsung(9,2999,2018, 9);
        Samsung Q8FN = new Samsung(8,1599,2018, 9);
        Samsung Q7FN = new Samsung(7,1299,2018, 7);


        Q900.samsungInfo();
        Q9FN.samsungInfo();
        Q8FN.samsungInfo();
        Q7FN.samsungInfo();
    }


}


