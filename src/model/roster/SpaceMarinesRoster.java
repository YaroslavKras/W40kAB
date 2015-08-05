package model.roster;

import model.Unit;
import model.enums.FOKType;
import model.enums.Faction;
import model.enums.SpaceMarinesWargear;
import model.infantry.spaceMarines.SpaceMarineInfantryUnit;
import model.infantry.spaceMarines.SpaceMarineInfantryUnit.SpaceMarineBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Dask on 19.07.2015.
 */
public class SpaceMarinesRoster extends Roster {
    private SpaceMarineBuilder infantryBuilder = new SpaceMarineBuilder();
    private SpaceMarineInfantryUnit spaceMarineInfantryUnit;

    public SpaceMarinesRoster(int ptsLimit, FOKType fokType, Faction faction) {
        super(ptsLimit, fokType, faction);
        spaceMarineInfantryUnit = infantryBuilder.build(); //TODO What?
    }


    public Map<Integer, ArrayList<? extends Unit>> getUnitEntries() {
        return unitEntries;
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
        this.addEntry((ArrayList<? extends Unit>) tacticalSquad);
        return tacticalSquad;
    }

    public List<SpaceMarineInfantryUnit> addTacticalMarine(int entryNumber){
        ArrayList<SpaceMarineInfantryUnit> targetSquad = (ArrayList<SpaceMarineInfantryUnit>) unitEntries.get(entryNumber);
        SpaceMarineInfantryUnit tacticalMarine = infantryBuilder.createTacticalSpaceMarine().build();
        targetSquad.add(tacticalMarine);
        return targetSquad;
    }

    public static SpaceMarineInfantryUnit addWargearToModel(SpaceMarineInfantryUnit unit, SpaceMarinesWargear wargear){
        int wargearPtsValue = wargear.getPtsValue();
        int newPtsValue = unit.getPtsValue() + wargearPtsValue;
        SpaceMarineInfantryUnit.SpaceMarineBuilder builder = SpaceMarineBuilder.copyModel(unit);
        builder = (SpaceMarineBuilder) builder.withPtsValue(newPtsValue).withWargear(wargear);
        return builder.build();
    }

    public static SpaceMarineInfantryUnit removeWargearFromModel(SpaceMarineInfantryUnit unit, SpaceMarinesWargear wargear){
        int wargearPtsValue = wargear.getPtsValue();
        int newPtsValue = unit.getPtsValue() - wargearPtsValue;
        unit.getWargear().remove(wargear);
        SpaceMarineInfantryUnit.SpaceMarineBuilder builder = SpaceMarineBuilder.copyModel(unit);
        builder = (SpaceMarineBuilder) builder.withPtsValue(newPtsValue);
        return builder.build();
    }

    public void printRoster(){
        for (int entryNumber: unitEntries.keySet()){
            ArrayList<? extends Unit> squad = unitEntries.get(entryNumber);
            System.out.println("Squad " + entryNumber);
            for (Unit unit : squad){
                System.out.println("\t" + unit.getName());
            }
        }
    }
}
