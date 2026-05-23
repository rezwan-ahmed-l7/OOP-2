package ThisKeyword;

public class Box {

    int length;
    int width;
    int height;
    int volume;

    public Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int Volume() {
        volume = length * width * height;
        return volume;
    }

    public void show() {
        System.out.println("Volume: " + Volume());
    }

}
