interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Tasksheet129 implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Put gorilla food into cage");
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Lather, rinse, repeat");
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk");
    }

    public static void main(String[] args) {
        Tasksheet129 gorilla = new Tasksheet129();
        
        gorilla.feed(true);
        gorilla.feed(false);
        
        gorilla.groom();
        
        gorilla.pet();
    }
}
