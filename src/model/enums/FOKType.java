package model.enums;

/**
 * Created by Dask on 18.07.2015.
 */
public enum  FOKType {
    UNBOUND_ARMY ("UA", "Army, that doesn`t follow any restrictions for Army Organisation Chart"),
    BATTLE_FORGED_ARMY("BFA", "Army that follow standart Organization Chart restrictions");
    private String code;
    private String description;

    FOKType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public FOKType getByCode(String code){
        for (FOKType type : values()){
            if (type.getCode().equals(code)){
                return type;
            }
        }
        throw new IllegalArgumentException(String.format("FOKType not found for code: %s", code));
    }
}
