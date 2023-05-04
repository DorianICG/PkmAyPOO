package CodigoPrincipal;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Batalla {
    private ArrayList<Entrenador> entrenadoresBatalla; //Solo pueden ser 2
    private boolean batallaTerminada = false;
    private int turnoBatalla;

    public Batalla(ArrayList<Entrenador> entrenadoresBatalla, int turnoBatalla) {
        this.entrenadoresBatalla = entrenadoresBatalla;
        this.turnoBatalla = turnoBatalla;
    }

    public Batalla() {
    }
    
    
    
    public ArrayList<Entrenador> getEntrenadoresBatalla() {
        return entrenadoresBatalla;
    }

    public boolean isBatallaTerminada() {
        return batallaTerminada;
    }

    public int getTurnoBatalla() {
        return turnoBatalla;
    }

    public void setEntrenadoresBatalla(ArrayList<Entrenador> entrenadoresBatalla) {
        this.entrenadoresBatalla = entrenadoresBatalla;
    }

    public void setBatallaTerminada(boolean batallaTerminada) {
        this.batallaTerminada = batallaTerminada;
    }

    public void setTurnoBatalla(int turnoBatalla) {
        this.turnoBatalla = turnoBatalla;
    }
    
    
}
