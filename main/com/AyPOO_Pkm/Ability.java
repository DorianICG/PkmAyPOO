package AyPOO_Pkm;

public class Ability {
    private int damage;
    private String attackName;
    private Type_Pokemon typeAbility;

    public Ability(int damage, String attackName, Type_Pokemon typeAbility) {
        this.damage = damage;
        this.attackName = attackName;
        this.typeAbility = typeAbility;
    }

    public Ability() {
    }
    
    public int getDamage() {
        return damage;
    }

    public String getAttackName() {
        return attackName;
    }

    public Type_Pokemon getTypeAbility() {
        return typeAbility;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public void setTypeAbility(Type_Pokemon typeAbility) {
        this.typeAbility = typeAbility;
    }
    
    
    
}
