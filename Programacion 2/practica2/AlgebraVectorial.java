package hola;
public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;
    public AlgebraVectorial() {
        this(0, 0, 0);
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double productoPunto(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    public AlgebraVectorial productoCruz(AlgebraVectorial b) {
        return new AlgebraVectorial(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }
    public boolean esPerpendicular(AlgebraVectorial b) {
        return this.productoPunto(b) == 0;
    }
    public boolean esParalelo(AlgebraVectorial b) {
        AlgebraVectorial cruz = this.productoCruz(b);
        return cruz.magnitud() == 0;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / Math.pow(b.magnitud(), 2);
        return new AlgebraVectorial(b.x * escalar, b.y * escalar, b.z * escalar);
    }
    public double componenteEn(AlgebraVectorial b) {
        return this.productoPunto(b) / b.magnitud();
    }
    public AlgebraVectorial suma(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    public AlgebraVectorial resta(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x - b.x, this.y - b.y, this.z - b.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
