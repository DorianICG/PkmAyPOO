package AyPOO_Pkm;

import Interfaces.Interactable;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Inventory{
    protected int capacity;
    protected ArrayList<Interactable> objects = new ArrayList<>();
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

    public abstract void createIntentory();
    public abstract void printInventory();


}
