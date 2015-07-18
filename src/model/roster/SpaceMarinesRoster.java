package model.roster;

import model.Unit;
import model.enums.FOKType;
import model.enums.Faction;
import model.infantry.spaceMarines.SpaceMarineInfantryUnit;
import model.infantry.spaceMarines.SpaceMarineInfantryUnit.SpaceMarineBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dask on 19.07.2015.
 */
public class SpaceMarinesRoster extends Roster {
    private SpaceMarineBuilder infantryBuilder = new SpaceMarineBuilder();
    private SpaceMarineInfantryUnit spaceMarineInfantryUnit;
    private Map<Integer, List<? extends Unit>> unitEntries = new HashMap<Integer, List<? extends Unit>>();
    private int entryNumber = 1;

    public SpaceMarinesRoster(int ptsLimit, FOKType fokType, Faction faction) {
        super(ptsLimit, fokType, faction);
        spaceMarineInfantryUnit = infantryBuilder.build();
    }

    private int getAndIncrementEntryNubmer(){
        return entryNumber++;
    }

    public Map<Integer, List<? extends Unit>> getUnitEntries() {
        return unitEntries;
    }

    private int getAndDecrementEntryNumber(){
        return entryNumber--;
    }

    private boolean valideUnitType(Unit unit){
        return unit.getUnitFaction() == Faction.SPACE_MARINES;
    }

    public List<SpaceMarineInfantryUnit> createTacticalSquad(){
        List<SpaceMarineInfantryUnit> tacticalSquad = new ArrayList<SpaceMarineInfantryUnit>();
        for (int i = 0; i < 4; i++) {
            SpaceMarineInfantryUnit tacticalMarine = infantryBuilder.createTacticalSpaceMarine().build();
            tacticalSquad.add(tacticalMarine);
        }
        SpaceMarineInfantryUnit tacticalMarineSergeant = infantryBuilder.createTacticalSpaceMarineSergeant().build();
        tacticalSquad.add(tacticalMarineSergeant);
        return tacticalSquad;
    }

    public List<SpaceMarineInfantryUnit> addTacticalMarine(int entryNumber){
        List<SpaceMarineInfantryUnit> targetSquad = (List<SpaceMarineInfantryUnit>) unitEntries.get(entryNumber);
        SpaceMarineInfantryUnit tacticalMarine = infantryBuilder.createTacticalSpaceMarine().build();
        targetSquad.add(tacticalMarine);
        return targetSquad;
    }

    public void  addEntryToRoster(List<? extends Unit> newUnitEnty){
        Integer currentEntryNumber = getAndIncrementEntryNubmer();
        unitEntries.put(currentEntryNumber, newUnitEnty);
    }
}
