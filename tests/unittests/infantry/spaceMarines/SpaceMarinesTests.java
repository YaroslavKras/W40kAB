package unittests.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;
import model.infantry.spaceMarines.SpaceMarineUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Created by Dask on 16.07.2015.
 */
public class SpaceMarinesTests {
    private static SpaceMarineUnit sut;

    @BeforeClass
    public static void setUp(){
        sut = new SpaceMarineUnit.SpaceMarineBuilder().createTacticalSpaceMarine().build();
    }

    @Test
    public void testSpaceMarineCreated() {
        assertNotNull(sut);
    }

    @Test
    public void testSpaceMarineCorrectFieldValues(){
        assertEquals(4, sut.getWeaponSkill());
        assertEquals(4, sut.getBallisticSkill());
        assertEquals(4, sut.getStrength());
        assertEquals(4, sut.getToughness());
        assertEquals(1, sut.getAttacks());
        assertEquals(3, sut.getArmourSave());
        assertEquals(8, sut.getLeadership());
        assertEquals(14, sut.getPtsValue());
        assertEquals(SpaceMarinesCodexType.VANILLA_SPACE_MARINES_CODEX,sut.getCodexType());
    }

    @Test
    public void testSergeantHasDifferentValues(){
        sut = new SpaceMarineUnit.SpaceMarineBuilder().createTacticalSpaceMarineSergeant().build();
        assertEquals(2, sut.getAttacks());
        assertEquals(9, sut.getLeadership());
    }

}
