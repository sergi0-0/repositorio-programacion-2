package practica3;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida(int vidas) {
        this.numeroDeVidas = vidas;
    }
    public void actualizaRecord() {
        if (this.numeroDeVidas > record) {
            record = this.numeroDeVidas;
            System.out.println("Nuevo record: " + record + " vidas restantes!");
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
