package unittests.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;
import model.enums.SpaceMarinesWargear;
import model.infantry.spaceMarines.SpaceMarineInfantryUnit;
import model.roster.SpaceMarinesRoster;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
/**
 * Created by Dask on 16.07.2015.
 */
public class SpaceMarinesTests {
    private static SpaceMarineInfantryUnit sut;

    @BeforeClass
    public static void setUp(){
        sut = new SpaceMarineInfantryUnit.SpaceMarineBuilder().createTacticalSpaceMarine().build();
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
        assertEquals(1, sut.getWounds());
        assertEquals(3, sut.getArmourSave());
        assertEquals(8, sut.getLeadership());
        assertEquals(14, sut.getPtsValue());
        assertEquals(SpaceMarinesCodexType.VANILLA_SPACE_MARINES_CODEX,sut.getCodexType());
    }

    @Test
    public void testSergeantHasDifferentValues(){
        sut = new SpaceMarineInfantryUnit.SpaceMarineBuilder().createTacticalSpaceMarineSergeant().build();
        assertEquals(2, sut.getAttacks());
        assertEquals(9, sut.getLeadership());
    }

    @Test
    public void testUnitWargearIsPresent(){
        assertTrue(sut.getWargear() != null);
        assertTrue(sut.getWargear().size() > 0);
        assertTrue(sut.getWargear().size() == 5);
    }

    @Test
    public void testSpaceMarineHasNessecaryDefaultWargear(){
        ArrayList<SpaceMarinesWargear> wargear = sut.getWargear();
        assertTrue(wargear.contains(SpaceMarinesWargear.BOLT_PISTOL));
        assertTrue(wargear.contains(SpaceMarinesWargear.BOLTGUN));
        assertTrue(wargear.contains(SpaceMarinesWargear.FRAG_GRENADES_DEFAULT));
        assertTrue(wargear.contains(SpaceMarinesWargear.KRAK_GRENADES_DEFAULT));
        assertTrue(wargear.contains(SpaceMarinesWargear.CHAINSWORD));
    }

    @Test
    public void testAddingWargearToModel(){
        assertTrue(sut.getPtsValue() == 14);
        sut = SpaceMarinesRoster.addWargearToModel(sut, SpaceMarinesWargear.MELTAGUN);
        assertTrue(sut.getPtsValue() == 24);
        assertTrue(sut.getWargear().contains(SpaceMarinesWargear.MELTAGUN));
    }

    @Test
    public void testRemovingWargearFromModel(){
        assertTrue(sut.getPtsValue() == 14);
        sut = SpaceMarinesRoster.addWargearToModel(sut, SpaceMarinesWargear.MELTAGUN);
        assertTrue(sut.getPtsValue() == 24);
        assertTrue(sut.getWargear().contains(SpaceMarinesWargear.MELTAGUN));
        sut = SpaceMarinesRoster.removeWargearFromModel(sut, SpaceMarinesWargear.MELTAGUN);
        assertTrue(sut.getPtsValue() == 14);
        assertFalse(sut.getWargear().contains(SpaceMarinesWargear.MELTAGUN));
    }
}
