package Abstraction;

public class People extends Message {

    String message;

    People(String m) {
        message = m;
    }

    @Override
    void message() {
        System.out.println(message);
    }

}
