public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        }
    }

    public abstract double area();

    public void describe() {
        System.out.println(color + " shape with area: " + area());
    }
}
