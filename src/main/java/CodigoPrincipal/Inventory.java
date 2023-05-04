
package CodigoPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private int capacity;
    private ArrayList<Interactable> objects;
    private ArrayList<Inventory> inventories = new ArrayList<Inventory>();
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
        int capacityNew;
        Scanner input = new Scanner(System.in);
        System.out.print("Please, give me a capacity of the backpack: ");
        capacityNew=input.nextInt();
        inventories.add(new Inventory(capacityNew));
    }
    
    public void printInventory()
    {
        int position;
        System.out.print("Join the position for print:" );
        Scanner input = new Scanner(System.in);
        position=input.nextInt();
        System.out.print("Max Capacity "+inventories.get(position).capacity+"\n");
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
        inventories.get(position).capacity = input.nextInt();
    }
    
    public void removeInventory()
    {
        int position;
        System.out.print("Join the position for delete:" );
        Scanner input = new Scanner(System.in);
        position=input.nextInt();
        inventories.remove(position);
    }
}
