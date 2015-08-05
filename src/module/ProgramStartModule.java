package module;

import model.enums.SpaceMarinesWargear;
import model.enums.SpecialRules;

/**
 * Created by Dask on 13.07.2015.
 */
public class ProgramStartModule {

    public static void main(String[] args) {
        for (SpaceMarinesWargear wargear : SpaceMarinesWargear.values()){
            System.out.println(wargear.getName() + ":\n" + "Type: " + wargear.getType().getDescription() + "\n" + "Special Rules:");
            for (SpecialRules specialRule : wargear.getSpecialRule()){
                System.out.println("\t" + specialRule.getName() + ":" +  "\t" + specialRule.getDescription() + "\n********************************************\n");
            }
            System.out.println("-----------------------------------------------\n");
        }
//        SpaceMarinesRoster roster = new SpaceMarinesRoster(2000, FOKType.BATTLE_FORGED_ARMY, Faction.SPACE_MARINES);
//        roster.createTacticalSquad();
//        roster.createTacticalSquad();
//        roster.createTacticalSquad();
//        roster.addTacticalMarine(2);
//        roster.addTacticalMarine(2);
//        roster.addTacticalMarine(2);
//        roster.addTacticalMarine(3);
//        roster.printRoster();
    }
}
