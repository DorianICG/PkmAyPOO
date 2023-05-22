package AyPOO_Pkm;

import Interfaces.Interactable;

import java.util.ArrayList;
import java.util.Scanner;

public class Backpack extends Inventory{

    /**
     *      CADA MOCHILA TENDRÁ SUS PROPIOS OBJETOS (ARREGLO)
     * */
    protected ArrayList<Object>objects;
    public Backpack() {

    }

    public Backpack(int capacity) {
        super(capacity);
        objects = new ArrayList<>();
    }
    @Override
    public void createIntentory() {
        int option =1,newID;
        String newNameObj, newTypeObj;
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
                System.out.print("object name: ");
                newNameObj = input.next();
                System.out.print("type object: ");
                newTypeObj = input.next();
                objects.add(new Object(newTypeObj,newID,newNameObj));
                System.out.print("\nCOMPLETED\n");
            }
        }while(option!=0);
    }
    @Override
    public void printInventory() {
        for(Object object: objects) {
            System.out.println("- "+object.getNameObject());
        }
    }

    public void modifyInventory() {
        Scanner input = new Scanner(System.in);
        System.out.print("Join the new capacity: ");
        setCapacity(input.nextInt());

    }

    public void removeInventory(ArrayList<Inventory> inventories) {
        objects = null;
        capacity = 0;
    }

    public boolean useAnObject(int idObjectUse){
        for(int i=0;i<objects.size();i++){
            if(idObjectUse==objects.get(i).getIdObject()){
                objects.get(i).useObject();
                objects.remove(i);
                return true;
            }
        }
        return false;
    }
}
