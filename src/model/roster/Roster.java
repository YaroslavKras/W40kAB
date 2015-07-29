package model.roster;

import model.Unit;
import model.enums.FOKType;
import model.enums.Faction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dask on 18.07.2015.
 */
public class Roster {
    private int ptsLimit;
    private FOKType fokType;
    private Faction faction;
    private int entryNumber = 1;
    protected Map<Integer, ArrayList<? extends Unit>> unitEntries = new HashMap<Integer, ArrayList<? extends Unit>>();

    public Roster(int ptsLimit, FOKType fokType, Faction faction) {
        this.ptsLimit = ptsLimit;
        this.fokType = fokType;
        this.faction = faction;
    }

    public int getPtsLimit() {
        return ptsLimit;
    }

    public void setPtsLimit(int ptsLimit) {
        this.ptsLimit = ptsLimit;
    }

    public FOKType getFokType() {
        return fokType;
    }

    public void setFokType(FOKType fokType) {
        this.fokType = fokType;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public int getNextEmptyEntryNumber() {
        return entryNumber;
    }

    private int getAndIncrementEntryNubmer(){
        return entryNumber++;
    }

    private int getAndDecrementEntryNumber(){
        return entryNumber--;
    }

    public void addEntry(ArrayList<? extends Unit> newUnitEnty){
        Integer currentEntryNumber = getAndIncrementEntryNubmer();
        unitEntries.put(currentEntryNumber, newUnitEnty);
    }

    public void removeEntry(int entryNumber){
        if (entryNumber == unitEntries.size()){
            unitEntries.remove(entryNumber);
        } else if (entryNumber > 1 && entryNumber < unitEntries.size()){
            int lastUpdated = entryNumber;
            for (int key : unitEntries.keySet()){
                if (key > entryNumber){
                    if (key > lastUpdated) {
                        ArrayList<? extends Unit> unit = unitEntries.get(key);
                        unitEntries.replace(lastUpdated, unit);
                        lastUpdated = key;
                    } else {
                        ArrayList<? extends Unit> unit = unitEntries.get(key);
                        unitEntries.put(entryNumber, unit);
                        lastUpdated = key;
                    }
                }
                if (key == unitEntries.size()){
                    unitEntries.remove(key);
                }
            }
        }
        getAndDecrementEntryNumber();
    }

    public static <T extends Roster> T createNewRoster(int ptsLimit, FOKType type, Faction faction){
        switch (faction){
            case SPACE_MARINES:
                return (T) new SpaceMarinesRoster(ptsLimit,type, faction);
            case IMPERIAL_GUARD:
                return (T) new ImperialGuardRoster(ptsLimit, type, faction);
            case GREY_KNIGHTS:
            case SISTERS_OF_BATTLE:
            case CHAOS_SPACE_MARINES:
            case CHAOS_DAEMONS:
            case TAU:
            case TYRANIDS:
            case ELDAR:
            case DARK_ELDAR:
            case NECRONS:
                throw new IllegalArgumentException("NOT SUPPORTED");
        }
        throw new IllegalArgumentException("NOT SUPPORTED");
    }


}
