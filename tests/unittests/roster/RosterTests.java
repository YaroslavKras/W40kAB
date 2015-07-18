package unittests.roster;

import model.Unit;
import model.enums.FOKType;
import model.enums.Faction;
import model.roster.ImperialGuardRoster;
import model.roster.Roster;
import model.roster.SpaceMarinesRoster;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Dask on 19.07.2015.
 */
public class RosterTests {
    private static Roster sut;

    @BeforeClass
    public static void setUp(){
        sut = new Roster(1000, FOKType.BATTLE_FORGED_ARMY, Faction.SPACE_MARINES);
    }

    @Test
    public void rosterCreated(){
        assertNotNull(sut);
    }

    @Test
    public void testFactoryWillReturnSpaceMarinesRosterClass(){
        assertTrue(sut.createNewRoster(100, FOKType.UNBOUND_ARMY, Faction.SPACE_MARINES) instanceof SpaceMarinesRoster);
    }

    @Test
    public void testFactoryWillNotReturnImperialGuardRosterClass(){
        assertFalse(sut.createNewRoster(1000, FOKType.UNBOUND_ARMY, Faction.SPACE_MARINES) instanceof ImperialGuardRoster);
    }

    @Test
    public void testSpaceMarinesRosterProperties(){
        SpaceMarinesRoster roster = sut.createNewRoster(100, FOKType.UNBOUND_ARMY, Faction.SPACE_MARINES);
        roster.addEntryToRoster(roster.createTacticalSquad());
        assertNotNull(roster);
        Map<Integer, List<? extends Unit>> unitEntries = roster.getUnitEntries();
        assertNotNull(unitEntries.get(1));
        roster.addEntryToRoster(roster.createTacticalSquad());
        roster.addTacticalMarine(2);
        assertTrue(unitEntries.get(1).size() < unitEntries.get(2).size());
        assertTrue(unitEntries.get(2).size() == 6);
    }
}
