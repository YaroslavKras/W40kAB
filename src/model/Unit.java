package model;

import model.enums.Faction;

/**
 * Created by Dask on 19.07.2015.
 */
public interface Unit {
    public Faction getUnitFaction();
    public String getName();
    public int getPtsValue();
}
