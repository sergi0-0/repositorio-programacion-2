
package hola;
public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    public Vector3D suma(Vector3D b) {
        return new Vector3D(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D normalizar() {
        double m = this.magnitud();
        if (m == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(x / m, y / m, z / m);
    }
    public double productoPunto(Vector3D b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    public Vector3D productoCruz(Vector3D b) {
        return new Vector3D(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
