package AyPOO_Pkm;

import Interfaces.Interactable;

public class Object implements Interactable {
    private String typeObject, nameObject;
    private int idObject;

    public Object() {
    }

    public Object(String typeObject, int idObject, String nameObject){
        this.idObject = idObject;
        this.nameObject = nameObject;
        this.typeObject = typeObject;
    }

    public int getIdObject() {
        return idObject;
    }


    public String getNameObject() {
        return nameObject;
    }

    public String getTypeObject() {
        return typeObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public void setIdObject(int idObject) {
        this.idObject = idObject;
    }

    public void setTypeObject(String typeObject) {
        this.typeObject = typeObject;
    }

    /**
     *
     *      COMO AÚN FALTAN COSAS, SE HA DECIDIDO POR SIMPLEMENTE IMPRIMIR UN MENSAJE
     *      DICIENDO QUE SE HA USADO EL OBJETO SATISFACTORIAMENTE.
     *
     */

    public void useObject() {
        System.out.print("you used the object succesfully!\n");
    }

    public String nameObjectSearch(){
        return nameObject;
    }
}
