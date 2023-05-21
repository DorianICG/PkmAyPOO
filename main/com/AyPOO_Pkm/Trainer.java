package AyPOO_Pkm;

import java.util.ArrayList;

public class Trainer {
    private int trainerID;
    private String trainerName;
    private ArrayList<Pokemon> pokemonsBattle;
    private Backpack bag;

    public Trainer(int trainerID, String trainerName, ArrayList<Pokemon> pokemonesBattle, Backpack bag) {
        this.trainerID = trainerID;
        this.trainerName = trainerName;
        this.pokemonsBattle = pokemonsBattle;
        this.bag = bag;
    }

    public Trainer() {
    }

    public int getTrainerID() {
        return trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public ArrayList<Pokemon> getPokemonsBatalla() {
        return pokemonsBattle;
    }

    public Backpack getBag() {
        return bag;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setPokemonsBattle(ArrayList<Pokemon> pokemonsBattle) {
        this.pokemonsBattle = pokemonsBattle;
    }

    public void setBag(Backpack bag) {
        this.bag = bag;
    }
}
