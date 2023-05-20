package AyPOO_Pkm;

import java.util.ArrayList;

public class Pokemon extends Interactable{
    private Type_Pokemon typePokemon;
    private ArrayList<Ability> attack = new ArrayList<Ability>(4);
    private int health;
    private int level;

    public Pokemon() {
    }

    public Pokemon(Type_Pokemon typePokemon, ArrayList<Ability> attack, int health, int level, int idObject, String nameObject) {
        super(idObject, nameObject);
        this.typePokemon = typePokemon;
        this.attack = attack;
        this.health = health;
        this.level = level;
    }

    public Pokemon(Type_Pokemon typePokemon, ArrayList<Ability> attack, int health, int level) {
        this.typePokemon = typePokemon;
        this.attack = attack;
        this.health = health;
        this.level = level;
    }

    public Type_Pokemon getTypePokemon() {
        return typePokemon;
    }

    public ArrayList<Ability> getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setTypePokemon(Type_Pokemon typePokemon) {
        this.typePokemon = typePokemon;
    }

    public void setAttack(ArrayList<Ability> attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
