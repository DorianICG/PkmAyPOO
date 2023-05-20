package AyPOO_Pkm;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    private int capacity;
    private ArrayList<Interactable> objects;
    public Inventory() {
    }

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.objects = new ArrayList<Interactable>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Interactable> getObjects() {
        return objects;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setObjects(ArrayList<Interactable> objects) {
        this.objects = objects;
    }

    public void createInventory()
    {
        int capacityNew, option =1,newID;
        String newNameObj;
        Scanner input = new Scanner(System.in);
        System.out.print("Please, write the capacity of the backpack: ");
        capacityNew=input.nextInt();
        do{
            do{
                System.out.print("Select a option\n1-enter an object\n0- exit");
                option=input.nextInt();
                if(option>1||option<0)
                    System.out.print("ERROR\n");
            }while (option>1||option<0);
            if(option==1){
                System.out.print("ID: ");
                newID = input.nextInt();
                System.out.print("object name: ");
                newNameObj = input.next();
                objects.add(new Interactable(newID,newNameObj));
                System.out.print("\nCOMPLETED\n");
            }
        }while(option!=0);
    }
    
    public void printInventory()
    {
        int position;
        System.out.print("Join the position for print:" );
        Scanner input = new Scanner(System.in);
        position=input.nextInt();
        System.out.print("Max Capacity :"+capacity+"\n");
        for(Interactable interact: objects){
            System.out.print("- "+interact.getNameObject()+".\n");
        }
    }
    
    public void modifyInventory()
    {
        int position;
        System.out.print("Join the position for modify:" );
        Scanner input = new Scanner(System.in);
        position=input.nextInt();
        System.out.print("Join the new capacity:" );
        capacity = input.nextInt();
    }
    
    public void removeInventory(ArrayList inventories)
    {
        int position;
        System.out.print("Join the position for delete:" );
        Scanner input = new Scanner(System.in);
        position=input.nextInt();
        inventories.remove(position);
    }

    public boolean check(int id)
    {
        for(Interactable object: objects)
        {
            if(object.getIdObject()==id) return true;
        }
        return false;
    }

    public boolean check(String name)
    {
        for(Interactable object: objects)
        {
            if(object.getNameObject().equals(name)) return true;
        }
        return false;
    }
}
