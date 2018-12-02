package main;

public abstract   class PsionPhone implements SymbianMobile {
    @Override
    public void makeCall() {
        System.out.println("call");
    }

    @Override
    public void sendtext() {
        System.out.println("msg");
    }
    // not implemented by PsionPhone
    public abstract void display();
}
