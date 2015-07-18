package model.infantry;

/**
 * Created by Dask on 04.07.2015.
 */
public abstract class AbstractInfantry {
    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int toughness;
    private int wounds;
    private int attacks;
    private int armourSave;
    private int leadership;
    private int ptsValue;

    public AbstractInfantry(AbstractInfantryBuilder builder) {
        this.leadership = builder.leadership;
        this.armourSave = builder.armourSave;
        this.attacks = builder.attacks;
        this.wounds = builder.wounds;
        this.toughness = builder.toughness;
        this.strength = builder.strength;
        this.ballisticSkill = builder.ballisticSkill;
        this.weaponSkill = builder.weaponSkill;
        this.ptsValue = builder.ptsValue;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    public int getPtsValue() {
        return ptsValue;
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }

    public int getStrength() {
        return strength;
    }

    public int getToughness() {
        return toughness;
    }

    public int getWounds() {
        return wounds;
    }

    public int getAttacks() {
        return attacks;
    }

    public int getArmourSave() {
        return armourSave;
    }

    public int getLeadership() {
        return leadership;
    }


    public static class AbstractInfantryBuilder <T extends AbstractInfantryBuilder>{
        private int weaponSkill;
        private int ballisticSkill;
        private int strength;
        private int toughness;
        private int wounds;
        private int attacks;
        private int armourSave;
        private int leadership;
        private int ptsValue;

        public T withWeaponSkill(int weaponSkill){
            this.weaponSkill = weaponSkill;
            return (T)this;
        }

        public T withBallisticSkill(int ballisticSkill){
            this.ballisticSkill = ballisticSkill;
            return (T)this;
        }
        public T withStrength(int strength){
            this.strength = strength;
            return (T)this;
        }

        public T withToughness(int toughness){
            this.toughness = toughness;
            return (T)this;
        }

        public T withWounds(int wounds){
            this.wounds = wounds;
            return (T)this;
        }

        public T withAttacks(int attacks){
            this.attacks = attacks;
            return (T)this;
        }

        public T withArmourSave(int save){
            this.armourSave = save;
            return (T)this;
        }

        public T withLeadership(int leadership){
            this.leadership = leadership;
            return (T)this;
        }

        public T withPtsValue(int ptsValue){
            this.ptsValue = ptsValue;
            return (T)this;
        }
     }
}
