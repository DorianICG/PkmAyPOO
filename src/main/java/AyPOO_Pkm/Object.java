package AyPOO_Pkm;

public class Object extends Interactable{
    private String typeObject;

    public Object() {
    }

    public Object(String typeObject, int idObject, String nameObject) {
        super(idObject, nameObject);
        this.typeObject = typeObject;
    }

    public Object(String typeObject) {
        this.typeObject = typeObject;
    }

    public String getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(String typeObject) {
        this.typeObject = typeObject;
    }


}
