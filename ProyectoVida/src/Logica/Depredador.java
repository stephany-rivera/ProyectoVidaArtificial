package Logica;

/**
 * abstraccion del depredador 
 * @author Michael Palacios Gaviria 201356132
 */
public class Depredador extends Thread {
    private double tasaReproduccion;
    private double tiempoBusquedaAlimento;
    private int posX;
    private int posY;
    /**
     * Obtiene el tasa de reproduccion
     * @return tasa de reproduccion del depredador
     */
    public double getTasaReproduccion() {
        return tasaReproduccion;
    }
    /**
     * Obtiene el tiempo que se demora en buscar de nuevo comida
     * @return tiempo de busqueda alimento 
     */
    public double getTiempoBusquedaAlimento() {
        return tiempoBusquedaAlimento;
    }
    /**
     * asigna una con respecto a que tanto se reproducen los depredadores
     * @param tasaReproduccion 
     */
    public void setTasaReproduccion(double tasaReproduccion) {
        this.tasaReproduccion = tasaReproduccion;
    }
    /**
     * asigana el tiempo que tomara en buscar de nuevo alimento el depredador
     * @param tiempoBusquedaAlimento
     */
    public void setTiempoBusquedaAlimento(double tiempoBusquedaAlimento) {
        this.tiempoBusquedaAlimento = tiempoBusquedaAlimento;
    }
    
    /**
     * Simula el movimiento del depredador 
     */
    public void movimiento(){};
    
    @Override
    public void run(){
        while(true){
            movimiento();
        }
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
    
}
