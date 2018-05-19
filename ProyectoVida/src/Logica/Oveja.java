package Logica;

/**
 * abstraccion general para contruir ovejas
 * @author Michael Steven Palacios
 */
public abstract class Oveja extends Thread {
    protected String tipo;
    protected double tasaReproduccion;
    protected double tiempoBusquedaAlimento;
    protected int posX;
    protected int posY;

    public String getTipo() {
        return tipo;
    }

    public double getTasaReproduccion() {
        return tasaReproduccion;
    }

    public double getTiempoBusquedaAlimento() {
        return tiempoBusquedaAlimento;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    /*
    Recordar que para implementar el movimiento, se indican posiciones en X y Y
    */
    public abstract void movimiento();
}
