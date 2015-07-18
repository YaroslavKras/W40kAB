package model.enums;

/**
 * Created by Dask on 13.07.2015.
 */
public enum SpaceMarinesCodexType {
    VANILLA_SPACE_MARINES_CODEX("SM", "Regular (vanilla) Space Marines Codex"),
    SPACE_WOLVES_CODEX("SW", "Space Wolves Codex"),
    DARK_ANGELS_CODEX("DA", "Dark Angels Codex"),
    BLOOD_ANGELS_CODEX("BA", "Blood Angels Codex");

    private String name;
    private String details;

    SpaceMarinesCodexType(String name, String details) {

        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public SpaceMarinesCodexType getByCode(String code){
        for (SpaceMarinesCodexType codexType : values()){
            if (codexType.getName().equals(code)){
                return codexType;
            }
        }
        throw new IllegalArgumentException(String.format("Codex not found by letters: %s", code));
    }
}
