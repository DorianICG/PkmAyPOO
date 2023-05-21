package AyPOO_Pkm;

import Interfaces.Interactable;
import java.util.ArrayList;

public class Pokemon implements Interactable {
    private Type_Pokemon typePokemon;
    private ArrayList<Ability> attack = new ArrayList<Ability>(4);
    private int health, level, idObject;
    private String namePkm;

    public Pokemon() {
    }

    public Pokemon(Type_Pokemon typePokemon, ArrayList<Ability> attack, int health, int level, int idObject, String namePkm) {
        this.typePokemon = typePokemon;
        this.attack = attack;
        this.health = health;
        this.level = level;
        this.idObject = idObject;
        this.namePkm = namePkm;
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

    public String getNameObject() {
        return namePkm;
    }

    @Override
    public int getIdObject() {
        return idObject;
    }

    public void setIdPkm(int idObject) {
        this.idObject = idObject;
    }

    public void setNamePkm(String namePkm) {
        this.namePkm = namePkm;
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

    public void setIdObject(int idObject) {
        this.idObject = idObject;
    }

    /**
     *      COMO AÚN FALTAN COSAS PREFIERO DECIR ÚNICAMENTE QUE LE POKEMON SALE AL
     *      CAMPO.
     * */
    public void useObject() {
        System.out.print(namePkm+" goes out to the battlefield.\n");
    }
}
