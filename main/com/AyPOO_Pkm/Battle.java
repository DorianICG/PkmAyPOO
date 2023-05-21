package AyPOO_Pkm;

import java.util.ArrayList;

public class Battle {
    private ArrayList<Trainer> trainersBattle; //Solo pueden ser 2
    private boolean finishBattle = false;
    private int turnBattle;

    public Battle(ArrayList<Trainer> trainerBattle, int turnBattle) {
        this.trainersBattle = trainersBattle;
        this.turnBattle = turnBattle;
    }

    public Battle() {
    }

    public ArrayList<Trainer> getTrainersBattle() {
        return trainersBattle;
    }

    public boolean isFinishBattle() {
        return finishBattle;
    }

    public int getTurnBattle() {
        return turnBattle;
    }

    public void setTrainersBattle(ArrayList<Trainer> trainersBattle) {
        this.trainersBattle = trainersBattle;
    }

    public void setFinishBattle(boolean finishBattle) {
        this.finishBattle = finishBattle;
    }

    public void setTurnBattle(int turnBattle) {
        this.turnBattle = turnBattle;
    }
    
    
}
