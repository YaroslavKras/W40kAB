package model.roster;

import model.enums.Faction;
import model.enums.FOKType;

/**
 * Created by Dask on 18.07.2015.
 */
public class Roster {
    private int ptsLimit;
    private FOKType fokType;
    private Faction faction;

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
