package test;

public abstract class Nokia implements PsionPhone{

    @Override
    public void makecall() {
        System.out.println("This will make call");

    }

    @Override
    public void text() {
        System.out.println("This will text");
    }
}
