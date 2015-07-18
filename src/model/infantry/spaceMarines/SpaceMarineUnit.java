package model.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dask on 04.07.2015.
 */
public class SpaceMarineUnit extends AbstractSpaceMarineUnit {


    private SpaceMarineUnit(SpaceMarineBuilder builder) {
        super(builder);
    }

    public static class SpaceMarineBuilder extends AbstractSpaceMarineBuilder<SpaceMarineBuilder>{

        public SpaceMarineBuilder createTacticalSpaceMarine(){
             return (SpaceMarineBuilder)this.withCodexType(SpaceMarinesCodexType.VANILLA_SPACE_MARINES_CODEX)
                    .withWeaponSkill(4)
                    .withBallisticSkill(4)
                    .withStrength(4)
                    .withToughness(4)
                    .withWounds(1)
                    .withAttacks(1)
                    .withArmourSave(3)
                    .withLeadership(8)
                    .withPtsValue(14);
        }

        public SpaceMarineBuilder createTacticalSpaceMarineSergeant(){
            return (SpaceMarineBuilder)createTacticalSpaceMarine().withAttacks(2).withLeadership(9);
        }

        public List<SpaceMarineUnit> createTacticalSquad(){
            List<SpaceMarineUnit> tacticalSquad = new ArrayList<SpaceMarineUnit>();
            for (int i = 0; i < 5; i++) {
                SpaceMarineUnit tacticalMarine = new SpaceMarineUnit(createTacticalSpaceMarine());
                tacticalSquad.add(tacticalMarine);
            }
            SpaceMarineUnit tacticalMarineSergeant = new SpaceMarineUnit(createTacticalSpaceMarineSergeant());
            tacticalSquad.add(tacticalMarineSergeant);
            return tacticalSquad;
        }

        public SpaceMarineUnit build(){
            return new SpaceMarineUnit(this);
        }
    }
}
