package model.infantry;

import model.Unit;
import model.enums.Faction;
import model.enums.SpaceMarinesWargear;

import java.util.ArrayList;

/**
 * Created by Dask on 04.07.2015.
 */
public abstract class AbstractInfantry implements Unit{
    private String name;
    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int toughness;
    private int wounds;
    private int attacks;
    private int armourSave;
    private int leadership;
    private int ptsValue;
    private Faction unitFaction;
    private ArrayList<SpaceMarinesWargear> wargear;

    public AbstractInfantry(AbstractInfantryBuilder<model.infantry.spaceMarines.AbstractSpaceMarineUnit.AbstractSpaceMarineBuilder> builder) {
        this.name = builder.name;
        this.leadership = builder.leadership;
        this.armourSave = builder.armourSave;
        this.attacks = builder.attacks;
        this.wounds = builder.wounds;
        this.toughness = builder.toughness;
        this.strength = builder.strength;
        this.ballisticSkill = builder.ballisticSkill;
        this.weaponSkill = builder.weaponSkill;
        this.ptsValue = builder.ptsValue;
        this.unitFaction = builder.faction;
        this.wargear = builder.wargear;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    @Override
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

    @Override
    public Faction getUnitFaction() {
        return unitFaction;
    }

    public ArrayList<SpaceMarinesWargear> getWargear() {
        return wargear;
    }

    public static class AbstractInfantryBuilder <T extends AbstractInfantryBuilder>{
        private String name;
        private int weaponSkill;
        private int ballisticSkill;
        private int strength;
        private int toughness;
        private int wounds;
        private int attacks;
        private int armourSave;
        private int leadership;
        private int ptsValue;
        private Faction faction;
        private ArrayList<SpaceMarinesWargear> wargear = new ArrayList<SpaceMarinesWargear>();

        public T withName(String name){
            this.name = name;
            return (T)this;
        }

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

        public T withFaction(Faction faction){
            this.faction = faction;
            return (T) this;
        }

        public T withWargear(SpaceMarinesWargear wargear){
            this.wargear.add(wargear);
            return (T) this;
        }

        public T withWargear(ArrayList<SpaceMarinesWargear> wargear){
            this.wargear.addAll(wargear);
            return (T)this;
        }
     }
}
