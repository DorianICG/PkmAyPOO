package AyPOO_Pkm;

public class Backpack extends Inventory{

    public Backpack() {
    }
    public boolean useObject(int idObjectUse){
        for(int i=0;i<super.getObjects().size();i++){
            if(idObjectUse==super.getObjects().get(i).getIdObject()){
                super.getObjects().remove(i);
                return true;
            }
        }
        return false;
    }
}
