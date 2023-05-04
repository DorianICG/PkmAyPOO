/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoPrincipal;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokemon extends Interactable{
    private Tipo_Pokemon tipoPokemon;
    private ArrayList<Habilidad> ataques;
    private int vida;
    private int nivel;

    public Pokemon() {
    }

    public Pokemon(Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel, int idObject, String nameObject) {
        super(idObject, nameObject);
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }

    public Pokemon(Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel) {
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }

    public Tipo_Pokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public ArrayList<Habilidad> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setTipoPokemon(Tipo_Pokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setAtaques(ArrayList<Habilidad> ataques) {
        this.ataques = ataques;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
