package model.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;
import model.enums.SpaceMarinesWargear;

import java.util.ArrayList;

/**
 * Created by Dask on 04.07.2015.
 */
public class SpaceMarineInfantryUnit extends AbstractSpaceMarineUnit {


    private SpaceMarineInfantryUnit(SpaceMarineBuilder builder) {
        super(builder);
    }

    public static class SpaceMarineBuilder extends AbstractSpaceMarineBuilder<SpaceMarineBuilder> {

        public SpaceMarineBuilder createTacticalSpaceMarine() {
            ArrayList<SpaceMarinesWargear> spaceMarinesWargear = new ArrayList<SpaceMarinesWargear>();
            addDefaultTacticalMarineGear(spaceMarinesWargear);

            return (SpaceMarineBuilder) this.withCodexType(SpaceMarinesCodexType.VANILLA_SPACE_MARINES_CODEX)
                    .withName("Tactical Space Marine")
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

        private void addDefaultTacticalMarineGear(ArrayList<SpaceMarinesWargear> spaceMarinesWargear) {
            spaceMarinesWargear.add(SpaceMarinesWargear.BOLTGUN);
            spaceMarinesWargear.add(SpaceMarinesWargear.BOLT_PISTOL);
            spaceMarinesWargear.add(SpaceMarinesWargear.CHAINSWORD);
            spaceMarinesWargear.add(SpaceMarinesWargear.FRAG_GRENADES_DEFAULT);
            spaceMarinesWargear.add(SpaceMarinesWargear.KRAK_GRENADES_DEFAULT);
        }

        public SpaceMarineBuilder createTacticalSpaceMarineSergeant() {
            return (SpaceMarineBuilder) createTacticalSpaceMarine().withAttacks(2).withLeadership(9).withName("Tactical Space Marine Sergeant");
        }

        public SpaceMarineInfantryUnit build() {
            return new SpaceMarineInfantryUnit(this);
        }

        public static SpaceMarineBuilder copyModel(SpaceMarineInfantryUnit model) {
            SpaceMarineBuilder builder = new SpaceMarineBuilder();
            return (SpaceMarineBuilder) builder.withCodexType(model.getCodexType())
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
    }
}
