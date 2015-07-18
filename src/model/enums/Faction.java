package model.enums;

/**
 * Created by Dask on 18.07.2015.
 */
public enum Faction {
    SPACE_MARINES("SM", "Space Marines"),
    IMPERIAL_GUARD("IG", "Imperial Guard"),
    GREY_KNIGHTS("GK", "Grey Knights"),
    SISTERS_OF_BATTLE("SoA", "Sisters of Battle"),
    CHAOS_SPACE_MARINES("CSM", "Chaos Space Marines"),
    CHAOS_DAEMONS("CD", "Chaos Daemons"),
    TAU("TAU", "Tau"),
    TYRANIDS("TYR", "Tyranids"),
    ELDAR("ELD", "Eldar"),
    DARK_ELDAR("DE", "Dark Eldar"),
    ORKS("ORK", "Orks"),
    NECRONS("NEC", "Necrons");

    private String code;
    private String description;

    Faction(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }
}
