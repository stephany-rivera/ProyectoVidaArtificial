package Logica;

/**
 * abstraccion general para contruir ovejas 
 * @author Michael Steven Palacios 201356132
 */
public abstract class Oveja extends Thread {
    protected String tipo;
    protected double tasaReproduccion;
    protected double tiempoBusquedaAlimento;
    protected int posX;
    protected int posY;
    
    /**
     * Identifica al tipo de oveja a utilizar 
     * @return tipo de oveja
     */
    public String getTipo() {
        return tipo;
    }

    public double getTasaReproduccion() {
        return tasaReproduccion;
    }

    public double getTiempoBusquedaAlimento() {
        return tiempoBusquedaAlimento;
    }
    
    /**
     * Sirve para consultar coordenadas de la oveja
     * @return Posicion X actual
     */
    public int getPosX() {
        return posX;
    }
    /**
     * Sirve para consultar coordenadas de la oveja
     * @return Posicion Y actual
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Edita los valores de las coordenadas X y Y,
     */
    public abstract void movimiento();
    
    @Override
    public void run(){
        while(true){
            movimiento();
        }
    }
}
