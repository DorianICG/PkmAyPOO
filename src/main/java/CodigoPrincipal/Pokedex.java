/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventory{

    public Pokedex() {
    }

    public Pokedex(int capacity) {
        super(capacity);
    }
    
    public Interactable pickPkm(){
        System.out.print("name of the pokemon searched: ");
        Scanner input = new Scanner(System.in);
        String nameSearch=input.next();
        for(Interactable pkm: super.getObjects())
        {
            if(pkm.getNameObject().equals(nameSearch)){
                return pkm;
            }
        }
        return null;
             
    }
}
