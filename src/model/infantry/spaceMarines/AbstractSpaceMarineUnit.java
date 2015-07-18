package model.infantry.spaceMarines;

import model.enums.SpaceMarinesCodexType;
import model.infantry.AbstractInfantry;

/**
 * Created by Dask on 04.07.2015.
 */
public abstract class AbstractSpaceMarineUnit extends AbstractInfantry {
    private SpaceMarinesCodexType codexType;

    public AbstractSpaceMarineUnit(AbstractSpaceMarineBuilder builder) {
        super(builder);
        this.codexType = builder.codexType;
    }

    public SpaceMarinesCodexType getCodexType() {
        return codexType;
    }

    public static class AbstractSpaceMarineBuilder<T extends AbstractSpaceMarineBuilder> extends AbstractInfantryBuilder<AbstractSpaceMarineBuilder>{
        private SpaceMarinesCodexType codexType;

        public T withCodexType(SpaceMarinesCodexType codexType){
            this.codexType = codexType;
            return (T)this;
        }
    }
}
