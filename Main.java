public class Main {
    public static void main(String[] args) {
        Shape s1 = new Triangle("Red", 6, 4);
        Shape s2 = new Square("Blue", 5);

        s1.describe();
        s2.describe();

        s2.setColor("Green");
        System.out.println("Square color changed to: " + s2.getColor());
    }
}
