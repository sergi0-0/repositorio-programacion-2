package practica4;
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figura de color: " + color;
    }

    public abstract double area();
    public abstract double perimetro();
}
