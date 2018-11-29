
class Constructoruse {

    private int x;

    private Constructoruse(){
        System.out.println("Constructor Called");
        x = 5;
    }

    public static void main(String[] args){
        Constructoruse obj = new Constructoruse();
        System.out.println("Value of x = " + obj.x);
    }
}