
class Settergetter {
    String name;

    void setName( String name ) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public static void main( String[] args ) {
        Settergetter pojo = new Settergetter();
        pojo.setName("Toshiba");
        System.out.println("Settergetter.name: "+pojo.getName());
    }
}
