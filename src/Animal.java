//Try see how work interface

public interface Animal{
    void breath();
    void go();
    void sex();
}

class Dog implements Animal {

    @Override
    public void breath(){
        System.out.println("Sobaka dishit nosom");
    }
    @Override
    public void go(){
        System.out.println("Sobaka 4 lapi");
    }
    @Override
    public void sex() {
        System.out.println("Sobaka suchki");
    }
}

class Wild {

    public static void main(String[] args) {
        Dog a = new Dog();
        a.breath();
        a.go();
        a.sex();
    }
}