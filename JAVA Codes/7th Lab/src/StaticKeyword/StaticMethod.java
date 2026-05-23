package StaticKeyword;

public class StaticMethod {

    int n1;
    int n2;
    static int add;

    StaticMethod(int a, int b) {
        n1 = a;
        n2 = b;
    }

    static int add(int a, int b) {
        return add = a + b;
    }

}
