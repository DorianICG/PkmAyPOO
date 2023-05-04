
package CodigoPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex extends Inventory{

    public Pokedex() {
    }

    public Pokedex(int capacity) {
        super(capacity);
        super.createInventory();
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
