package model.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;
import model.enums.SpaceMarinesWargearList;

import java.util.ArrayList;

/**
 * Created by Dask on 04.07.2015.
 */
public class SpaceMarineInfantryUnit extends AbstractSpaceMarineUnit {


    private SpaceMarineInfantryUnit(SpaceMarineBuilder builder) {
        super(builder);
    }

    public static class SpaceMarineBuilder extends AbstractSpaceMarineBuilder<SpaceMarineBuilder>{

        public SpaceMarineBuilder createTacticalSpaceMarine(){
            ArrayList<SpaceMarinesWargearList> spaceMarinesWargear = new ArrayList<SpaceMarinesWargearList>();
            addDefaultTacticalMarineGear(spaceMarinesWargear);

             return (SpaceMarineBuilder)this.withCodexType(SpaceMarinesCodexType.VANILLA_SPACE_MARINES_CODEX)
                    .withWeaponSkill(4)
                    .withBallisticSkill(4)
                    .withStrength(4)
                    .withToughness(4)
                    .withWounds(1)
                    .withAttacks(1)
                    .withArmourSave(3)
                    .withLeadership(8)
                    .withPtsValue(14)
                    .withWargear(spaceMarinesWargear);
        }

        private void addDefaultTacticalMarineGear(ArrayList<SpaceMarinesWargearList> spaceMarinesWargear) {
            spaceMarinesWargear.add(SpaceMarinesWargearList.BOLTGUN);
            spaceMarinesWargear.add(SpaceMarinesWargearList.BOLT_PISTOL);
            spaceMarinesWargear.add(SpaceMarinesWargearList.CHAINSWORD);
            spaceMarinesWargear.add(SpaceMarinesWargearList.FRAG_GRENADES_DEFAULT);
            spaceMarinesWargear.add(SpaceMarinesWargearList.KRAK_GRENADES_DEFAULT);
        }

        public SpaceMarineBuilder createTacticalSpaceMarineSergeant(){
            return (SpaceMarineBuilder)createTacticalSpaceMarine().withAttacks(2).withLeadership(9);
        }

        public SpaceMarineInfantryUnit build(){
            return new SpaceMarineInfantryUnit(this);
        }

        public static SpaceMarineBuilder copyModel(SpaceMarineInfantryUnit model){
            SpaceMarineBuilder builder = new SpaceMarineBuilder();
            return (SpaceMarineBuilder)builder.withCodexType(model.getCodexType())
                    .withWeaponSkill(model.getWeaponSkill())
                    .withBallisticSkill(model.getBallisticSkill())
                    .withStrength(model.getStrength())
                    .withToughness(model.getToughness())
                    .withWounds(model.getWounds())
                    .withAttacks(model.getAttacks())
                    .withArmourSave(model.getArmourSave())
                    .withLeadership(model.getLeadership())
                    .withPtsValue(model.getPtsValue())
                    .withWargear(model.getWargear());
        }

        public SpaceMarineInfantryUnit addWargearToModel(SpaceMarinesWargearList wargear, SpaceMarineInfantryUnit model){
            int wargearPtsValue = wargear.getPtsValue();
            int newPtsValue = model.getPtsValue() + wargearPtsValue;
            SpaceMarineInfantryUnit.SpaceMarineBuilder builder = SpaceMarineBuilder.copyModel(model);
            SpaceMarineBuilder infantryBuilder = (SpaceMarineBuilder) builder.withPtsValue(newPtsValue).withWargear(wargear);
            return infantryBuilder.build();
        }
    }
}
