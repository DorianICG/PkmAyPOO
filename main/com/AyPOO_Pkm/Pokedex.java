package AyPOO_Pkm;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex extends Inventory{

    /**
     *      INICIAMOS UN ARRAY VACÍA PARA IR AGREGANDO POKEMONS A LA POKEDEX
     * */
    protected ArrayList<Pokemon>pokemons;
    public Pokedex() {
    }

    public Pokedex(int capacity) {
        super(capacity);
        pokemons=new ArrayList<>();
    }

    @Override
    public void createIntentory() {
        int option,newID, newHealth, newLevel;
        Type_Pokemon newTypePkm;
        String newNamePkm;
        ArrayList<Ability>newAbilities=new ArrayList<>(4);
        Scanner input = new Scanner(System.in);
        do{
            do{
                System.out.print("Select a option\n1-create an object\n0- exit");
                option=input.nextInt();
                if(option>1||option<0)
                    System.out.print("ERROR\n");
            }while (option>1||option<0);
            if(option==1){
                System.out.print("ID: ");
                newID = input.nextInt();
                System.out.print("pokemon name: ");
                newNamePkm = input.next();
                System.out.print("type pokemon: ");
                newTypePkm = Type_Pokemon.valueOf(input.next());
                System.out.print("health pokemon: ");
                newHealth = input.nextInt();
                System.out.print("level pokemon: ");
                newLevel = input.nextInt();
                objects.add(new Pokemon(newTypePkm,newAbilities,newHealth,newLevel,newID,newNamePkm));
                System.out.print("\nCOMPLETED\n");
            }
        }while(option!=0);
    }

    @Override
    public void printInventory() {
        for(Pokemon pokemon: pokemons){
            System.out.println("- "+pokemon.getNameObject());
        }
    }

    public Pokemon pickPkm(){
        System.out.print("name of the pokemon searched: ");
        Scanner input = new Scanner(System.in);
        String nameSearch=input.next();
        for(Pokemon pkm: pokemons)
        {
            if(pkm.getNameObject().equals(nameSearch)) {
                pkm.useObject();
                return pkm;
            }
        }
        return null;
    }
}
