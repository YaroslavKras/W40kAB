package model.enums;

/**
 * Created by Dask on 29.07.2015.
 */
public enum WargearType {
    RANGED_WEAPON("Light shooting weapon"),
    MELEE_WEAPON("Weapon used in HtH combat"),
    TERMINATOR_WEAPON("Allowed only to units wearing terminator armour"),
    HEAVY_WEAPON("Heavy shooting weapon"),
    SPECIAL_WEAPON("Special shooting weapon"),
    SPECIAL_ISSUE_WARGEAR("May take up to one of the following"),
    DREADNOUGHT_WEAPONS("Weapons used by dreadnoughts"),
    CHAPTER_RELICS("One Relic per army"),
    SPACE_MARINE_STANDARTS("Banners, etc."),
    SPACE_MARINE_VEHICLE_EQUIPMENT("Wargear for Space Marines vehicles");
    private String description;

    WargearType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
