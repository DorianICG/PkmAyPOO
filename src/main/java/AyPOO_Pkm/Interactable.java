package AyPOO_Pkm;

class Interactable {
    private int idObject;
    private String nameObject;

    public Interactable(int idObject, String nameObject) {
        this.idObject = idObject;
        this.nameObject = nameObject;
    }

    public Interactable() {
    }

    public int getIdObject() {
        return idObject;
    }

    public String getNameObject() {
        return nameObject;
    }
    
    public void setIdObject(int idObject) {
        this.idObject = idObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }
}
