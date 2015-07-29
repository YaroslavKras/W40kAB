package model.enums;

import com.sun.xml.internal.ws.api.server.SDDocument;

/**
 * Created by Dask on 29.07.2015.
 */
public enum  SpaceMarinesWargearList {
    BOLT_PISTOL(0, "Boltpistol", WargearType.RANGED_WEAPON, SpecialRules.PISTOL),
    FRAG_GRENADES_DEFAULT(0, "Frag Grenades", WargearType.RANGED_WEAPON, SpecialRules.GRENADE),
    KRAK_GRENADES_DEFAULT(0, "Krak Grenades", WargearType.RANGED_WEAPON, SpecialRules.GRENADE),
    BOLTGUN(0, "Boltgun", WargearType.RANGED_WEAPON, SpecialRules.RAPID_FIRE),
    STORM_BOLTER(5, "Storm Bolter", WargearType.RANGED_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    COMBI_WEAPON(10, "Combi- weapon", WargearType.RANGED_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    GRAV_PISTOL(15, "Grav Pistol", WargearType.RANGED_WEAPON,SpecialRules.PISTOL, SpecialRules.GRAVITON),
    PLASMA_PISTOL(5, "Plasma Pistol", WargearType.RANGED_WEAPON, SpecialRules.PISTOL, SpecialRules.GETS_HOT),
    CHAINSWORD(0, "Chainsword", WargearType.MELEE_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    LIGHTNING_CLAW(15, "Lightning Claw", WargearType.MELEE_WEAPON, SpecialRules.POWER_WEAPON, SpecialRules.SHRED, SpecialRules.SPECIALIST_WEAPON),
    POWER_SWORD(15, "Power Sword", WargearType.MELEE_WEAPON, SpecialRules.POWER_WEAPON),
    POWER_AXE(15, "Power Axe", WargearType.MELEE_WEAPON, SpecialRules.POWER_WEAPON, SpecialRules.UNWIELDY),
    POWER_MAUL(15, "Power Maul", WargearType.MELEE_WEAPON, SpecialRules.POWER_WEAPON, SpecialRules.CONCUSSIVE),
    POWER_LANCE(15, "Power Lance", WargearType.MELEE_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    POWER_FIST(25, "Power Fist", WargearType.MELEE_WEAPON, SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON),
    THUNDER_HAMMER(30, "Thunder Hammer", WargearType.MELEE_WEAPON, SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON, SpecialRules.CONCUSSIVE),
    TERMINATOR_COMBI_WEAPON(5, "Combi -flamer, -melta or -plasma", WargearType.TERMINATOR_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    TERMINATOR_LIGHTNING_CLAW(10, "Lightning Claw", WargearType.TERMINATOR_WEAPON, SpecialRules.POWER_WEAPON, SpecialRules.SHRED, SpecialRules.SPECIALIST_WEAPON),
    TERMINATOR_THUNDER_HAMMER(25, "Thunder Hammer", WargearType.TERMINATOR_WEAPON, SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON, SpecialRules.CONCUSSIVE),
    TERMINATOR_LIGHTNNING_CLAW_INSTEAD_OF_POWER_WEAPON(5,"Lightning Claw", WargearType.TERMINATOR_WEAPON, SpecialRules.POWER_WEAPON, SpecialRules.SHRED, SpecialRules.SPECIALIST_WEAPON ),
    TERMINATOR_STORM_SHIELD(5, "Storm Shield", WargearType.TERMINATOR_WEAPON, SpecialRules.NO_SPECIAL_RULE),
    TERMINATOR_POWER_FIST(10, "Power fist", WargearType.TERMINATOR_WEAPON, SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON),
    TERMINATOR_CHAINFIST(15, "Chainfist", WargearType.TERMINATOR_WEAPON,  SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON, SpecialRules.ARMOURBANE),
    TERMINATOR_THUNDER_HAMMER_INSTEAD_OF_POWER_WEAPON(15, "Thunder Hammer", WargearType.TERMINATOR_WEAPON, SpecialRules.UNWIELDY, SpecialRules.SPECIALIST_WEAPON, SpecialRules.CONCUSSIVE),
    HEAVY_BOLTER(10, "Heavy Bolter", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.THREE),
    HEAVY_FLAMER(10, "Heavy Flamer", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.TEMPLATE_WEAPON),
    MULTI_MELTA(10, "Multi-Melta", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE),
    MISSILE_LAUNCHER(15, "Missile Launcher", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE),
    FLAKK_MISSILE_FOR_LAUNCHER(10, "Flakk Missile for Launcher", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.SKYFIRE),
    PLASMA_CANNON(15, "Plasma Cannon", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE, SpecialRules.BLAST, SpecialRules.GETS_HOT),
    LASCANNON(20, "Lascannon", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE),
    GRAV_CANNON(35, "Grav-Cannon", WargearType.HEAVY_WEAPON, SpecialRules.HEAVY_WEAPON, SpecialRules.CONCUSSIVE, SpecialRules.GRAVITON, SpecialRules.SALVO, SpecialRules.THREE, SpecialRules.FIVE),
    FLAMER(5, "Flamer", WargearType.SPECIAL_WEAPON, SpecialRules.TEMPLATE_WEAPON, SpecialRules.ASSAULT),
    MELTAGUN(10, "Meltagun", WargearType.SPECIAL_WEAPON, SpecialRules.MELTA, SpecialRules.ASSAULT),
    GRAV_GUN(15, "Grav-gun", WargearType.SPECIAL_WEAPON, SpecialRules.GRAVITON, SpecialRules.CONCUSSIVE, SpecialRules.SALVO, SpecialRules.TWO, SpecialRules.FOUR),
    PLASMA_GUN(15, "Plasmagun", WargearType.SPECIAL_WEAPON, SpecialRules.RAPID_FIRE, SpecialRules.GETS_HOT),
    AUSPEX(5, "Auspex", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.NO_SPECIAL_RULE),
    MELTA_BOMBS(5, "Melta Bombs", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.MELTA, SpecialRules.GRENADE),
    TELEPORT_HOMER(5, "Teleport Homer", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.NO_SPECIAL_RULE),
    DIGITAL_WEAPONS(10, "Digital Weapons", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.NO_SPECIAL_RULE),
    JUMP_PACK(15, "Jump Pack", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.NO_SPECIAL_RULE),
    SPACE_MARINES_BIKE(20, "Space Marines Bike", WargearType.SPECIAL_ISSUE_WARGEAR, SpecialRules.NO_SPECIAL_RULE),
    TWIN_LINKED_AUTOCANNON(5, "Twin-linked Autocannon", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.TWO, SpecialRules.TWIN_LINKED),
    TWIN_LINKED_HEAVY_BOLTER(5, "Twin-linked Heavy Bolter", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.THREE, SpecialRules.THREE, SpecialRules.TWIN_LINKED),
    TWIN_LINKED_HEAVY_FLAMER(5, "Twin-linked Heavy Flamer", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE, SpecialRules.TEMPLATE_WEAPON, SpecialRules.TEMPLATE_WEAPON, SpecialRules.TWIN_LINKED),
    DREADNOUGHT_PLASMA_CANNON(5, "Plasma Cannon", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE, SpecialRules.BLAST, SpecialRules.GETS_HOT),
    ASSAULT_CANNON(10, "Assault Cannon", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.FOUR, SpecialRules.RENDING),
    TWIN_LINKED_LASCANNON(15, "Twin-linked Lascannon", WargearType.DREADNOUGHT_WEAPONS, SpecialRules.HEAVY_WEAPON, SpecialRules.ONE, SpecialRules.TWIN_LINKED),

    //TODO Relic special rules etc
    THE_PRIMARCHS_WRATH(20, "The Primarch`s Wrath", WargearType.CHAPTER_RELICS, SpecialRules.NO_SPECIAL_RULE),
    TEETH_OF_TERRA(35, "Teeth of Terra", WargearType.CHAPTER_RELICS, SpecialRules.NO_SPECIAL_RULE),
    THE_SHIELD_ETERNAL(50, "The Shield Eternal", WargearType.CHAPTER_RELICS, SpecialRules.NO_SPECIAL_RULE),
    THE_BURNING_BLADE(55, "The Burning Blade", WargearType.CHAPTER_RELICS, SpecialRules.NO_SPECIAL_RULE),
    THE_ARMOUR_INDOMITUS(60, "The Armour Indomitus", WargearType.CHAPTER_RELICS, SpecialRules.NO_SPECIAL_RULE),

    COMPANY_STANDART(15, "Company Standart", WargearType.SPACE_MARINE_STANDARTS, SpecialRules.NO_SPECIAL_RULE),
    CHAPTER_BANNER(25, "Chapter Standart", WargearType.SPACE_MARINE_STANDARTS, SpecialRules.NO_SPECIAL_RULE),
    STANDART_OF_THE_EMPEROR_ASCENDANDT(60, "Standart of the Emperor Ascendant", WargearType.SPACE_MARINE_STANDARTS, SpecialRules.NO_SPECIAL_RULE),

    DOZER_BLADE(5, "Dozer Blade", WargearType.SPACE_MARINE_VEHICLE_EQUIPMENT, SpecialRules.NO_SPECIAL_RULE),
    STORM_BOLTER_FOR_VEHICLE(5, "Storm Bolter", WargearType.SPACE_MARINE_VEHICLE_EQUIPMENT, SpecialRules.NO_SPECIAL_RULE),
    EXTRA_ARMOUR(10, "Extra Armour", WargearType.SPACE_MARINE_VEHICLE_EQUIPMENT, SpecialRules.NO_SPECIAL_RULE),
    HUNTER_KILLER_MISSILE(10, "Hunter-killer Missile", WargearType.SPACE_MARINE_VEHICLE_EQUIPMENT, SpecialRules.ONE_SHOT_ONLY);




    private int ptsValue;
    private String name;
    private WargearType type;
    private SpecialRules specialRule[];

    SpaceMarinesWargearList(int ptsValue, String name, WargearType type, SpecialRules ... specialRule) {
        this.ptsValue = ptsValue;
        this.name = name;
        this.type = type;
        this.specialRule = specialRule;
    }

    public int getPtsValue() {
        return ptsValue;
    }

    public String getName() {
        return name;
    }

    public WargearType getType() {
        return type;
    }

    public static SpaceMarinesWargearList getByName(String name){
        for (SpaceMarinesWargearList wargear : values()){
            if (wargear.getName().toLowerCase().equals(name.toLowerCase())){
                return wargear;
            }
        }
        throw new IllegalArgumentException("Wargear not found: " + name);
    }
}
