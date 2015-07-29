package model.enums;

/**
 * Created by Dask on 29.07.2015.
 */
public enum SpecialRules {
    ONE("1", "One"),
    TWO("2", "Two"),
    THREE("3", "Three"),
    FOUR("4", "Four"),
    FIVE("5", "Five"),
    SIX("6", "Six"),
    SEVEN("7", "Seven"),
    EIGHT("8", "Eight"),
    NINE("9", "Nine"),
    ACUTE_SENCES("Acute Sences", "If  a unit contains at least one model with this special rule,  and that unit arrives on a\n" +
            "random table edge (due to Outf lank,  or other special rules),  then you can re-roll to see\n" +
            "which table edge they arrive from."),
    ADAMANTIUM_WILL("Adamantium Will", "A unit that contains at least one model with this special rule receives a +1 bonus to Deny\n" +
            "the Witch tests."),
    AND_THEY_SHALL_KNOW_NO_FEAR("And They Shall Know No Fear", "A unit that contains at least one model with this special rule automatically passes Fear\n" +
            "and Regroup tests. When it Regroups, the unit does not make the 3\" Regroup move,  but\n" +
            "can instead move, shoot (or Run) and declare charges normally in that turn. Furthermore,\n" +
            "if  a unit containing one or more models with this special rule is caught by a Sweeping\n" +
            "Advance, they are not destroyed, but remain locked in combat instead."),
    ASSAULT("Assault", "Unit using weapon with this rule can charge afterwards"),
    ASSAULT_VEHICLE("Assault Vehicle", "Passengers disembarking from Access Points on a vehicle with this special rule can charge\n" +
            "on the turn they do so (even in a turn that the vehicle was destroyed, or in the following\n" +
            "turn) unless the vehicle arrived from Reserve that turn."),
    ARMOURBANE("Armourbane", "If a model has this special rule, or is attacking with a Melee weapon that has this special\n" +
            "rule, it rolls an additional D6 for armour penetration in close combat.\n" +
            "If a model makes a shooting attack with a weapon that has this special rule, it rolls an\n" +
            "additional D6 for armour penetration. In either case, this special rule has no effect against\n" +
            "non-vehicle models."),
    BLAST("Blast", "When firing a Blast weapon, models do not roll To Hit. Instead, just pick one enemy\n" +
            "model visible to the firer and place the 3\" blast marker with its hole entirely over the base\n" +
            "of  the target model, or its hull if the target is a vehicle. The hole at the\n" +
            "centre of  the marker must be within the weapon’s maximum range. You cannot place the\n" +
            "blast marker so that the base or hull of  any friendly model is even partially under it."),
    BLIND("Blind", "Any unit hit by one or more models or weapons with this special rule must take an\n"+
                  "Initiative test at the end of  the current phase.  If  the test is passed,  all is well – a shouted\n"+
                  "warning has caused the warriors to avert their gaze.  If  the Initiative test is failed,  all\n"+
                  "models in the unit are reduced to Weapon Skill and Ballistic Skill 1 until the end of  their\n"+
                  "next turn.  Should the attacking unit hit themselves,  we assume they are prepared and\n"+
                  "they automatically pass the test.  Any model that does not have an Initiative characteristic\n"+
                  "(for example,  non-Walker vehicles,  buildings etc.) is unaffected by this special rule."),
    BROTHERHOOD_OF_PSYKERS("Brotherhood of psykers/sorcerers", " unit containing at least one model with this special rule is a Psyker unit – if  no Mastery\n" +
            "Level is shown,  then that unit has a Mastery Level of  1.  Rules for generating and\n" +
            "manifesting psychic powers can be found in the Psychic phase section.  The unit follows\n" +
            "all the normal rules for Psykers,  with the following clarifications:\n" +
            "• When manifesting a psychic power,  this unit measures range and line of  sight f rom,\n" +
            "and uses the characteristics prof ile (if  required) of ,  any one model in the unit that has\n" +
            "the Brotherhood of  Psykers/Sorcerers special rule (controlling player’ s choice).\n" +
            "• If  this unit suf fers Perils of  the Warp,  or is hit by an attack that specif ically targets\n" +
            "Psykers,  the hits are Randomly Allocated amongst models with the Brotherhood of\n" +
            "Psykers/Sorcerers special rule.  If  a model with this special rule gains or loses a psychic\n" +
            "power,  all other models with this special rule in their unit also gain or lose that power."),
    BULKY("Bulky", "Bulky models count as two models for the purposes of  Transport Capacity."),
    VERY_BULKY("Very Bulky", "Very Bulky models count as three models for the purposes of  Transport Capacity."),
    EXTREMELY_BULKY("Extremely Bulky", "Extremely Bulky models count as five models for the purposes of  Transport Capacity."),
    BARRAGE("Barrage", "Barrage weapons can fire inderectly"),
    DEEP_STRIKE("Deep Strike", "Gives the ability to arrive from reserves via Deep Strike"),
    CONCUSSIVE("Concussive", "A model that suf fers one or more unsaved Wounds f rom a weapon with this special rule\n" +
            "is reduced to Initiative 1 until the end of  the following Assault phase."),
    COUNTER_ATTACK("Counter-attack", "If  a unit contains at least one model with this special rule,  and that unit is charged,  every\n" +
            "model with the Counter-attack special rule in the unit gets +1 Attack until the end of  the\n" +
            "phase.\n" +
            "If ,  when charged,  the unit was already locked in combat,  the Counter-attack special rule\n" +
            "has no effect."),
    DAEMON("Daemon", "Models with the Daemon special rule have a 5+ invulnerable save,  and also have the Fear\n" +
            "special rule."),
    DESTROYER_WEAPON("Destroyer Weapon", "If  a weapon has a D instead of  a Strength value in its prof ile,  it is a Destroyer weapon.  To\n" +
            "resolve a Destroyer weapon’ s attack,  roll To Hit as you would for a standard attack.  If  the\n" +
            "attack hits,  roll on the table above instead of  rolling To Wound or for armour penetration.\n" +
            "Most Destroyer Weapons have AP1 or AP2,  so armour saves are not typically allowed.\n" +
            "Cover saves and invulnerable saves can be taken against hits f rom a Destroyer weapon as\n" +
            "normal,  unless a Devastating Hit or Deathblow result is rolled.  For the purposes of\n" +
            "determining if  a Destroyer hit has the Instant Death special rule,  assume it has Strength\n" +
            "10.  Multiple Wounds/Hull Points inflicted by a Destroyer hit do not carry over to other\n" +
            "models in the unit (any excess are lost)."),
    ETERNAL_WARRIOR("Eternal Warrior", "If  a model with this special rule suffers an unsaved Wound f rom an attack that inflicts\n" +
            "Instant Death,  it only reduces its Wounds by 1,  instead of  automatically reducing its\n" +
            "Wounds to 0."),
    FEAR("Fear", "At the start of  each Fight sub-phase,  a unit in base contact with one or more enemy\n" +
            "models that cause Fear must take a Leadership test (called a Fear test) before any blows\n" +
            "are struck.  If  the test is passed,  all is well and there is no effect.  If  the test is failed,  the\n" +
            "unit succumbs to fear – all models in the unit have their Weapon Skill reduced to 1 for\n" +
            "the remainder of  that Fight sub-phase.  Note that a model that causes Fear is not itself\n" +
            "immune to Fear,  and will still need to take a Fear test if  it is base contact with any enemy\n" +
            "models that cause Fear."),
    FEARLESS("Fearless", "Units containing one or more models with the Fearless special rule automatically pass\n" +
            "Pinning,  Fear,  Regroup tests and Morale checks,  but cannot Go to Ground and cannot\n" +
            "choose to fail a Morale check due to the Our Weapons Are Useless rule.  If  a unit has Gone\n" +
            "to Ground and then gains the Fearless special rule,  all the effects of  Go to Ground are\n" +
            "immediately cancelled."),
    FEEL_NO_PAIN("Feel No Pain", "When a model with this special rule suffers an unsaved Wound,  it can make a special Feel\n" +
            "No Pain roll to avoid being wounded (this is not a saving throw and so can be used against\n" +
            "attacks that state that ‘no saves of  any kind are allowed’ ,  for example those inflicted by\n" +
            "Perils of  the Warp).\n" +
            "Feel No Pain saves may not be taken against Destroyer attacks or against unsaved\n" +
            "Wounds that have the Instant Death special rule.\n" +
            "Roll a D6 each time an unsaved Wound is suffered.  On a 4 or less,  you must take the\n" +
            "Wound as normal.  On a 5+,  the unsaved Wound is discounted – treat it as having been\n" +
            "saved.\n" +
            "If  a unit has the Feel No Pain special rule with a number in brackets afterwards – Feel No\n" +
            "Pain (6+),  for example – then the number in brackets is the D6 result needed to discount\n" +
            "the Wound."),
    FLEET("Fleet", "A unit composed entirely of  models with this special rule can re-roll one or more of  the\n" +
            "dice when determining Run moves and charge ranges (such as a single D6 f rom a charge\n" +
            "range roll,  for example)."),
    FLESHBANE("Fleshbane", "If  a model has this special rule,  or is attacking with a Melee weapon that has this special\n" +
            "rule,  they always Wound on a 2+ in close combat.\n" +
            "Similarly,  if  a model makes a shooting attack with a weapon that has this special rule,\n" +
            "they always Wound on a 2+.\n" +
            "In either case,  this special rule has no ef fect against vehicles or buildings."),
    FORCE("Force", "Any Psyker that has one or more weapons with this special rule knows the Force psychic\n" +
            "power in addition to any other powers they know: Force is a blessing psychic power that targets the Psyker and his unit.  All of\n" +
            "the targets’  weapons that have the Force special rule gain the Instant Death\n" +
            "special rule until the start of  your next Psychic phase. 1 Psychic Charge"),
    FURIOUS_CHARGE("Furious Charge", "In a turn in which a model with this special rule charges into combat,  it adds +1 to its\n" +
            "Strength characteristic until the end of  the Assault phase.  A model that has made a\n" +
            "disordered charge that turn receives no benef it f rom Furious Charge."),
    GETS_HOT("Gets Hot!", "When f iring a weapon that Gets Hot,  roll To Hit as normal.  For each To Hit roll of  1,  the\n" +
            "f iring model immediately suf fers a Wound (armour or invulnerable saves can be taken) –\n" +
            "this Wound cannot be allocated to any other model in the unit.  A character cannot make a\n" +
            "Look Out,  Sir attempt to avoid a Wound caused by the Gets Hot special rule.  A vehicle\n" +
            "instead rolls a D6 for each roll of  a 1 to hit.  On a roll of  a 1,  2 or 3 it suf fers a glancing hit."),
    GRAVITON("Graviton", "The roll needed To Wound when f iring a weapon with this special rule is always equal to\n" +
            "the armour save of  the target,  to a minimum of  6+.  For example,  when resolving a hit\n" +
            "against a model with a 3+ armour save,  you would need a 3+ To Wound.  When resolving\n" +
            "a hit against a vehicle,  roll a D6 for each hit instead of  rolling for armour penetration as\n" +
            "normal.  On a 1-5 nothing happens,  but on a 6,  the target suf fers an Immobilised result\n" +
            "and loses a Hull Point.  These weapons have no ef fect on buildings."),
    GRENADE("Grenade", "TODO DESCRIPTION"),
    HAMMER_OF_WRATH("Hammer of Wrath", "If  a model with this special rule ends its charge move in base or hull contact with an\n" +
            "enemy model,  it makes one additional Attack that hits automatically and is resolved at the\n" +
            "model’ s unmodif ied Strength with AP-.  This Attack does not benef it f rom any of  the\n" +
            "model’ s special rules (such as Furious Charge,  Rending etc.).  This Attack is resolved\n" +
            "during the Fight sub-phase at the Initiative 10 step,  but does not grant the model an\n" +
            "additional Pile In move.\n" +
            "If  a model with this special rule charges a building or vehicle,  the hit is resolved against\n" +
            "the Armour Value of  the facing the charging model is touching.  If  a model with this\n" +
            "special rule charges a building or vehicle that is a Transport or a Chariot,  the hit is\n" +
            "resolved against the building or vehicle,  not the occupants or the rider."),
    HATRED("Hatred", "This rule is of ten presented as Hatred (X) where X identif ies a specif ic type of  foe.  If  the\n" +
            "special rule does not specify a type of  foe,  then the unit has Hatred against everyone.  This\n" +
            "can refer to a Faction,  or a specif ic unit.  For example,  Hatred (Orks) means any model\n" +
            "with the Ork Faction,  whilst Hatred (Big Meks) means only Big Meks.  A model striking a\n" +
            "hated foe in close combat re-rolls all failed To Hit rolls during the f irst round of  each\n" +
            "close combat."),
    HAYWIRE("Haywire", "When a weapon with this special rule hits a vehicle,  roll a D6 to determine the ef fect\n" +
            "rather than rolling for armour penetration normally:\n" +
            "D6 - Result\n" +
            "1 - No ef fect\n" +
            "2-5 - Glancing hit\n" +
            "6 - Penetrating hit"),
    HEAVY_WEAPON("Heavy", "When shooting,  a model with a Heavy weapon shoots the number of  times indicated.  If  a\n" +
            "model carrying a Heavy weapon moved in the preceding Movement phase,  he can f ire it in\n" +
            "the Shooting phase but only as Snap Shots.  Remember that weapons with the Blast\n" +
            "special rule cannot f ire Snap Shots.  Models that shoot with Heavy weapons in the\n" +
            "Shooting phase cannot charge in the ensuing Assault phase."),
    HIT_AND_RUN("Hit & Run", "A unit that contains at least one model with this special rule that is locked in combat can\n" +
            "choose to leave close combat at the end of  any Assault phase.  If  the unit wishes to do so,\n" +
            "it must take an Initiative test.\n" +
            "If  the test is failed,  nothing happens and the models remain locked in the f ight.\n" +
            "If  the test is passed,  choose a direction – then roll 3D6.  As long as the distance rolled,  in\n" +
            "inches,  is suf f icient to allow the entire unit to move over 1\" away f rom all of  the enemy\n" +
            "units they are locked in combat with,  the unit breaks away f rom combat and must\n" +
            "immediately move a number of  inches in the chosen direction equal to the 3D6 result,\n" +
            "ignoring the models they were locked in combat with.  No Sweeping Advance rolls are\n" +
            "made.  Enemy units that are no longer locked in combat immediately Consolidate D6\".\n" +
            "A Hit & Run move is not slowed by dif f icult terrain,  but takes Dangerous Terrain tests as\n" +
            "normal.  It may not be used to move into base or hull contact with enemy units,  and\n" +
            "models instead stop 1\" away.  If  there are units with this rule on both sides who wish to\n" +
            "disengage,  roll-of f  to determine who goes f irst and then alternate disengaging them.  If  the\n" +
            "last of  these ends up no longer in combat,  it Consolidates instead."),
    IGNORES_COVER("Ignores cover", "Cover saves cannot be taken against Wounds,  glancing hits or penetrating hits caused by\n" +
            "weapons with the Ignores Cover special rule."),
    INSTANT_DEATH("Instant Death", "If  a model suffers an unsaved Wound f rom an attack with this special rule,  it is reduced to\n" +
            "0 Wounds and is removed as a casualty."),
    INDEPENDENT_CHARACTER("Independent Character", "Independent Characters can join other units.  They cannot,  however,  join units that\n" +
            "contain vehicles or Monstrous Creatures.  They can join other Independent Characters,\n" +
            "though,  to form a powerful multi-character unit!"),
    INFILTRATE("Infiltrate", "Units that contain at least one model with this special rule are deployed last,  af ter all\n" +
            "other units (f riend and foe) have been deployed.  If  both sides have Inf iltrators,  the\n" +
            "players roll-of f  and the winner decides who goes f irst,  then alternate deploying these\n" +
            "units."),
    INTERCEPTOR("Interceptor", "At the end of  the enemy Movement phase,  a weapon with the Interceptor special rule can\n" +
            "be f ired at any one unit that has arrived f rom Reserve within its range and line of  sight.  If\n" +
            "this rule is used,  the weapon cannot be f ired in the next turn,  but the f iring model can\n" +
            "shoot a dif ferent weapon if  it has one."),
    IT_WILL_NOT_DIE("It Will Not Die", "At the end of  each of  your turns,  roll a D6 for each of  your models with this special rule\n" +
            "that has less than its starting number of  Wounds or Hull Points,  but has not been \n" +
            "removed as a casualty or destroyed.  On a roll of  5+,  that model regains a Wound,  or Hull\n" +
            "Point,  lost earlier in the game."),
    JINK("Jink", "When a unit with any models with the Jink special rule is selected as a target for a\n" +
            "shooting attack,  you may declare that it will Jink.  The decision must be made before any\n" +
            "To Hit rolls have been made.  If  the unit Jinks,  all models in the unit with this special rule\n" +
            "gain a 4+ cover save until the start of  their next Movement phase,  but they can only f ire\n" +
            "Snap Shots until the end of  their next turn."),
    LANCE("Lance", "Weapons with the Lance special rule count vehicle Armour Values that are higher than 12\n" +
            "as 12."),
    MASTER_CRAFTED("Master-crafted", "Weapons with the Master-craf ted special rule allow the bearer to re-roll one failed roll To\n" +
            "Hit per turn with that weapon."),
    MIGHTY_BULWARK("Mighty Bulwark", "When a building with this special rule suf fers a penetrating hit,  there is a -1 modif ier to\n" +
            "the roll on the Building Damage table."),
    MELTA("Melta", "Ranged weapons with this special rule roll an additional D6 when rolling to penetrate a\n" +
            "vehicle’ s armour at half  range or less.  If  the weapon is more than half  its maximum range\n" +
            "away,  it rolls to penetrate as normal."),
    MISSILE_LOCK("Missile Lock", "A model with this special rule re-rolls failed To Hit rolls when shooting any weapon that\n" +
            "has the One Use Only special rule.\n" +
            "If  a model with this special rule is shooting a weapon that has both the One Use Only and\n" +
            "Blast special rules,  that shot will instead scatter D6\" rather than 2D6\"."),
    MONSTER_HUNTER("Monster Hunter", "A unit that contains at least one model with this special rule re-rolls all failed To Wound\n" +
            "rolls against Monstrous Creatures."),
    MOVE_THROUGH_COVER("Move Through Cover", "A unit that contains at least one model with this special rule rolls an extra D6 when\n" +
            "rolling to move through dif f icult terrain and is not slowed by charging through dif f icult\n" +
            "terrain.  In most circumstances,  this will mean that,  when moving,  the unit rolls 3D6 and\n" +
            "picks the highest roll.  Furthermore,  a model with the Move Through Cover special rule\n" +
            "automatically passes Dangerous Terrain tests."),
    NIGHT_VISION("Night Vision","A unit that contains at least one model with this special rule ignores the ef fects of  Night\n" +
            "Fighting."),
    ONE_USE_ONLY("One Use Only", "A weapon or ability with this special rule can only be used once during the course of  a\n" +
            "battle."),
    ONE_SHOT_ONLY("One Shot Only", "A weapon or ability with this special rule can only be used once during the course of  a\n" +
            "battle."),
    OUTFLANK("Outflank", "During deployment,  players can declare that any unit that contains at least one model\n" +
            "with this special rule is attempting to Outf lank the enemy.\n" +
            "When this unit arrives f rom Reserves,  but not Ongoing Reserve,  the controlling player\n" +
            "rolls a D6: on a 1-2,  the unit comes in f rom the table edge to the lef t of  their controlling\n" +
            "player’ s own table edge; on a 3-4,  they come on f rom the right; on a 5-6,  the player can\n" +
            "choose lef t or right.  Models move onto the table as described for other Reserves.\n" +
            "If  a unit with Inf iltrate deploys inside a Dedicated Transport,  they may Outf lank along\n" +
            "with their Transport."),
    PISTOL("Pistol", "Pistols are light enough to be carried and f ired one-handed,  but with limited range,\n" +
            "allowing a trooper to f ight in close combat with a pistol and sword or other melee weapon.\n" +
            "Pistols are ef fectively Assault 1 weapons.  A Pistol also counts as a close combat weapon in\n" +
            "the Assault phase."),
    PINNING("Pinning", "If  a non-vehicle unit suf fers one or more unsaved Wounds f rom a weapon with the\n" +
            "Pinning special rule,  it must take a Leadership test once the f iring unit has f inished its\n" +
            "shooting attacks for that phase.  This is called a Pinning test.\n" +
            "If  the unit fails the test,  it is Pinned and must immediately Go to Ground.  As the unit has\n" +
            "already taken its saves,  Going to Ground does not protect it against the f ire of  the Pinning\n" +
            "weapon that caused the test – it’ s too late!\n" +
            "As long as the test is passed,  a unit can be called upon to take multiple Pinning tests in a\n" +
            "single turn,  but only once for each unit shooting at them.  If  a unit has already Gone to\n" +
            "Ground,  no further Pinning tests are taken.\n" +
            "If  the special rules of  a unit specify that the unit can never be Pinned,  the unit\n" +
            "automatically passes Pinning tests.  Such units can still Go to Ground voluntarily if  they\n" +
            "wish."),
    POISONED("Poisoned", "If  a model has the Poisoned special rule,  or is attacking with a Melee weapon that has the\n" +
            "Poisoned special rule,  it always wounds on a f ixed number (generally shown in brackets),\n" +
            "unless a lower result would be required,  when attacking in close combat.  In addition,  if\n" +
            "the Strength of  the wielder (or the Poisoned weapon) is higher than the Toughness of  the\n" +
            "victim,  the wielder must re-roll failed rolls To Wound in close combat.\n" +
            "Similarly,  if  a model makes a shooting attack with a weapon that has the Poisoned special\n" +
            "rule,  it always wounds on a f ixed number (generally shown in brackets),  unless a lower\n" +
            "result would be required.  If  no number is shown in brackets,  the rule is Poisoned (4+).\n" +
            "Unless otherwise stated,  Poisoned weapons are treated as having a Strength of  1.  The\n" +
            "Poisoned special rule has no ef fect against vehicles."),
    POWER_OF_THE_MACHINE_SPIRIT("Power Of The Machine Spirit", "In a turn in which the vehicle neither moves Flat Out nor uses smoke launchers,  the\n" +
            "vehicle can f ire one more weapon at its full Ballistic Skill than normally permitted.  In\n" +
            "addition,  this weapon can be f ired at a dif ferent target unit to any other weapons,  subject\n" +
            "to the normal rules for shooting."),
    POWER_WEAPON("Power Weapon", "AP3"),
    PRECISION_SHOT("Precision Shot", "If  a model with this special rule rolls a 6 To Hit with a shooting weapon,  that shot is a\n" +
            "‘Precision Shot’ .\n" +
            "Wounds f rom Precision Shots are allocated against a model (or models) of  your choice in\n" +
            "the target unit,  as long as it is in range and line of  sight of  the f irer,  rather than following\n" +
            "the normal rules for Wound allocation.  A character that has a Precision Shot Wound\n" +
            "allocated to it can still make a Look Out,  Sir roll.\n" +
            "Note that Snap Shots and shots f rom weapons that scatter,  or do not roll To Hit,  can never\n" +
            "be Precision Shots."),
    PRECISION_STRIKE("Precision Strike", "If  a model with this special rule rolls a 6 To Hit with a Melee weapon,  that hit is a\n" +
            "‘Precision Strike’ .\n" + "Wounds f rom Precision Strikes are allocated against an engaged model (or models) of\n" +
            "your choice in the unit you are attacking,  rather than following the normal rules for\n" +
            "Wound allocation.  If  a Precision Strike Wound is allocated to a character,  they can still\n" +
            "make their Look Out,  Sir roll"),
    PREFERRED_ENEMY("Preferred Enemy", "This rule is of ten presented as Preferred Enemy (X) where X identif ies a specif ic type of\n" +
            "foe.  If  the special rule does not specify a type of  foe,  then everyone is a Preferred Enemy\n" +
            "of  the unit.  A unit that contains at least one model with this special rule re-rolls failed To\n" +
            "Hit and To Wound rolls of  1 if  attacking its Preferred Enemy.  This applies both to\n" +
            "shooting and close combat attacks."),
    PSYCHIC_PILOT("Psychic Pilot", "A vehicle with this special rule is a Psyker.  This rule is typically presented with a Mastery\n" +
            "Level,  shown in brackets – if  no Mastery Level is shown then that vehicle has a Mastery\n" +
            "Level of  1.  Rules for generating and manifesting psychic powers can be found in the\n" +
            "Psychic phase section.  The unit follows all the normal rules for generating and\n" +
            "manifesting psychic powers,  with the following clarif ication: the vehicle is considered to\n" +
            "have a Leadership characteristic of  10,  should this be needed in order to resolve any\n" +
            "psychic power or Perils of  the Warp."),
    PSYKER("Psyker", "A model with this special rule is a Psyker.  This rule is typically presented with a Mastery\n" +
            "Level,  shown in brackets – if  no Mastery Level is shown then that model has a Mastery\n" +
            "Level of  1.  Rules for generating and manifesting psychic powers can be found in the\n" +
            "Psychic phase section."),
    RAGE("Rage", "In a turn in which a model with this special rule charges into combat,  it gains +2 Attacks\n" +
            "for charging,  rather than +1.  A model that has made a disordered charge that turn receives\n" +
            "no benef it f rom Rage."),
    RAMPAGE("Rampage", "At the start of  any Fight sub-phase,  models with the Rampage special rule gain +D3\n" +
            "attacks if  the combat they are in contains more enemy models than f riendly models –\n" +
            "count all models locked in the combat,  not just those models that are engaged.  Roll once\n" +
            "to determine the number of  bonus Attacks all Rampaging models involved in that combat\n" +
            "receive that phase.  A model that has made a disordered charge that turn receives no\n" +
            "benef it f rom Rampage."),
    RAPID_FIRE("Rapid Fire", "A model armed with a Rapid Fire weapon can f ire two shots at a target up to half  the\n" +
            "weapon’ s maximum range away.  Alternatively,  it can instead f ire one shot at a target over\n" +
            "half  the weapon’ s range away,  up to the weapon’ s maximum range.\n" +
            "If  a unit shooting Rapid Fire weapons is found to be partially within half  range of  the\n" +
            "target,  the f iring models within half  range f ire two shots,  while those further away f ire\n" +
            "one.\n" +
            "Models that shoot with Rapid Fire weapons in the Shooting phase cannot charge in the\n" +
            "ensuing Assault phase."),
    RELENTLESS("Relentless", "Relentless models can shoot with Heavy,  Salvo or Ordnance weapons,  counting as\n" +
            "stationary,  even if  they moved in the previous Movement phase.  They are also allowed to\n" +
            "charge in the same turn they f ire Heavy,  Ordnance,  Rapid Fire or Salvo weapons."),
    RENDING("Rending", "If  a model has the Rending special rule,  or is attacking with a Melee weapon that has the\n" +
            "Rending special rule,  there is a chance that his close combat attacks will strike a critical\n" +
            "blow.  For each To Wound roll of  a 6,  the target automatically suf fers a Wound,  regardless\n" +
            "of  its Toughness.  These Wounds are resolved at AP2.\n" +
            "Similarly,  if  a model makes a shooting attack with a weapon that has the Rending special\n" +
            "rule,  a To Wound roll of  6 Wounds automatically,  regardless of  Toughness,  and is\n" +
            "resolved at AP2.\n" +
            "In either case,  against vehicles,  each armour penetration roll of  6 allows a further D3 to\n" +
            "be rolled,  with the result added to the total.  These hits are not resolved at AP2,  but are\n" +
            "instead resolved using the model/weapon’ s AP value."),
    REPEL_THE_ENEMY("Repel the Enemy", "Models disembarking f rom Access Points on a building can charge on the turn they do so,\n" +
            "even on a turn the building was destroyed."),
    SALVO("Salvo", "Salvo weapons are essentially more destructive Rapid Fire weapons.\n" +
            "Salvo weapons have two numbers on their prof ile (listed af ter their type) separated by a\n" +
            "‘ /’ .  A model armed with a Salvo weapon can move and f ire at a target up to half  its\n" +
            "maximum range away.  In this case,  the number of  shots is equal to the f irst number.  If\n" +
            "the model has not moved,  it can instead f ire a greater number of  shots at a target up to\n" +
            "the weapon’ s maximum range.  In this case,  the number of  shots is equal to the second\n" +
            "number.\n" +
            "Models that shoot with Salvo weapons in the Shooting phase cannot charge in the\n" +
            "ensuing Assault phase."),
    SENTRY_DEFENCE_SYSTEM("Sentry Defence System", "A building with this special rule can use automated f ire against enemy units,  even if  it is\n" +
            "unoccupied.  In addition,  enemy units can shoot at and charge a building with this special\n" +
            "rule,  even if  it is unoccupied."),
    SHRED("Shred", "If  a model has the Shred special rule,  or is attacking with a Melee weapon that has the\n" +
            "Shred special rule,  it re-rolls failed To Wound rolls in close combat.\n" +
            "Similarly,  if  a model makes a shooting attack with a weapon that has the Shred special\n" +
            "rule,  it re-rolls its failed To Wound rolls."),
    SHROUDED("Shrouded", "A unit that contains at least one model with this special rule counts its cover save as being\n" +
            "2 points better than normal.  Note that this means a model with the Shrouded special rule\n" +
            "always has a cover save of  at least 5+,  even if  it’ s in the open.\n" +
            "Cover save bonuses f rom the Shrouded and Stealth special rules are cumulative (to a\n" +
            "maximum of  a 2+ cover save)."),
    SCOUT("Scout", "Af ter both sides have deployed (including Inf iltrators),  but before the f irst\n" +
            "player begins his f irst turn,  a unit containing at least one model with this\n" +
            "special rule can choose to redeploy.  If  the unit is Infantry,  Artillery,  a Walker\n" +
            "or a Monstrous Creature,  each model can redeploy anywhere entirely within 6\"\n" +
            "of  its current position.  If  it is any other unit type,  each model can instead\n" +
            "redeploy anywhere entirely within 12\" of  its current position.  During this\n" +
            "redeployment,  Scouts can move outside the owning player’ s deployment zone,\n" +
            "but must remain more than 12\" away f rom any enemy unit.  A unit that makes\n" +
            "a Scout redeployment cannot charge in the f irst game turn.  A unit cannot\n" +
            "embark or disembark as part of  a Scout redeployment."),
    SKILLED_RIDER("Skilled Rider", "A unit that contains at least one model with this special rule automatically passes\n" +
            "Dangerous Terrain tests,  and receives +1 to its Jink cover saves (other cover saves are\n" +
            "unaf fected)."),
    SKYFIRE("Skyfire", "A model with this special rule,  or that is f iring a weapon with this special rule,  f ires using\n" +
            "its normal Ballistic Skill when shooting at Flyers,  Flying Monstrous Creatures and\n" + "Skimmers,  but it can only f ire Snap Shots against other targets."),
    SLOW_AND_PURPOSEFUL("Slow And Purposeful", "A unit that contains at least one model with this special rule cannot Run,  Turbo-boost,\n" +
            "move Flat Out,  perform Sweeping Advances or f ire Overwatch.  However,  they can shoot\n" +
            "with Heavy,  Salvo and Ordnance weapons,  counting as stationary even if  they moved in\n" +
            "the previous Movement phase.  They are also allowed to charge in the same turn they f ire\n" +
            "Heavy,  Ordnance,  Rapid Fire or Salvo weapons."),
    SMASH("Smash", "All of  the close combat attacks,  except Hammer of  Wrath attacks,  of  a model with this\n" +
            "special rule are resolved at AP2 (unless it’ s attacking with an AP1 weapon).  Additionally,\n" +
            "when it makes its close combat attacks,  it can choose instead to make a single Smash\n" +
            "Attack.  If  it does so,  roll To Hit as normal,  but resolve the Attack at double the model’ s\n" +
            "Strength (to a maximum of  10).  Furthermore,  a model making a Smash Attack can re-roll\n" +
            "its armour penetration rolls,  but must abide by the second result"),
    SNIPER("Sniper", "If  a weapon has the Sniper special rule,  or is f ired by a model with the Sniper special rule,\n" +
            "and rolls a 6 To Hit,  that shot is a ‘Precision Shot’ .  Wounds f rom Precision Shots are\n" +
            "allocated against a model (or models) of  your choice in the target unit,  as long as it is in\n" +
            "range and line of  sight of  the f irer,  rather than following the normal rules for Wound\n" +
            "allocation.  A character that has a Precision Shot Wound allocated to it can still make a\n" +
            "Look Out,  Sir roll.  Note that Snap Shots can never be Precision Shots.\n" +
            "If  a weapon has the Sniper special rule,  or is f ired by a model with the Sniper special rule,\n" +
            "its shooting attacks always wound on a To Wound roll of  4+,  regardless of  the victim’ s\n" +
            "Toughness.  In addition,  any To Wound roll of  a 6 is resolved at AP2.\n" +
            "Against vehicles,  shooting attacks f rom weapons and models with the Sniper special rule\n" +
            "count as Strength 4."),
    SOUL_BLAZE("Soulblaze", "If  a unit suf fers one or more unsaved Wounds f rom an attack with this special rule,  it is\n" +
            "set ablaze and continues to burn – mark it with a coin or counter as a reminder.\n" +
            "At the end of  each turn,  roll a D6 for each unit with a Soul Blaze counter on it.  On a 3 or\n" +
            "less,  the f lames die out and the unit is no longer ablaze – remove your reminder counter.\n" +
            "On a 4+,  the unit takes D3 Strength 4 AP5 hits with the Ignores Cover special rule.  These\n" +
            "Wounds are Randomly Allocated.  A unit cannot have more than one Soul Blaze counter\n" +
            "on it at a time."),
    SPECIALIST_WEAPON("Specialist Weapon","A model f ighting with this weapon does not receive +1 Attack for f ighting with two\n" +
            "weapons unless it is armed with two or more Melee weapons with the Specialist Weapon\n" +
            "rule."),
    SPLIT_FIRE("Split Fire", "When a unit that contains at least one model with this special rule shoots,  one model in\n" +
            "the unit can shoot at a dif ferent target to the rest of  his unit.  Once this shooting attack\n" +
            "has been resolved,  resolve the shooting attacks made by the rest of  the unit.  These must\n" +
            "be at a dif ferent target,  which cannot be a unit forced to disembark as a result of  the Split\n" +
            "Firing unit’ s initial shooting attack."),
    STEALTH("Stealth", "A unit that contains at least one model with this special rule counts its cover saves as\n" +
            "being 1 point better than normal.  Note that this means that a model with the Stealth\n" +
            "special rule always has a cover save of  at least 6+,  even if  it is in the open.  This rule is\n" +
            "of ten presented as Stealth (X) where X indicates a specif ic type of  terrain,  such as Stealth\n" +
            "(Woods) or Stealth (Ruins).  If  this is the case,  the unit only gains the benef it whilst it is\n" +
            "in terrain of  the specif ied type.\n" +
            "Cover save bonuses f rom the Shrouded and Stealth special rules are cumulative (to a\n" +
            "maximum of  a 2+ cover save)."),
    STRAFING_RUN("Strafing Run", "When shooting Assault,  Heavy,  Rapid Fire or Salvo weapons at Artillery,  Beasts,  Bikes,\n" +
            "Cavalry,  Infantry,  Monstrous Creatures and vehicles without the Flyer or Skimmer type,\n" +
            "this vehicle has +1 Ballistic Skill."),
    STRIKEDOWN("Strikedown", "Any non-vehicle model that suf fers one or more unsaved Wounds or passes one or more\n" +
            "saving throws against an attack with the Strikedown special rule moves as if  it is in\n" +
            "dif f icult terrain until the end of  its next turn.  It is a good idea to mark af fected models\n" +
            "with counters or coins so that you remember."),
    STUBBORN("Stubborn", "When a unit that contains at least one model with this special rule takes Morale checks or\n" +
            "Pinning tests,  they ignore any negative Leadership modif iers.  If  a unit is both Fearless\n" +
            "and Stubborn,  it uses the rules for Fearless instead."),
    SUPERSONIC("Supersonic", "A Supersonic vehicle that moves Flat Out must move at least 18\" and can move up to 36\"."),
    SWARMS("Swarms", "If ,  when allocating Wounds to a unit with the Swarms special rule,  two or more models\n" +
            "could be chosen as the closest enemy,  the closest enemy is always the model with the\n" +
            "least number of  Wounds.  If  a model with the Swarm special rule suf fers an unsaved\n" +
            "Wound f rom a Blast (any size) or Template weapon,  each unsaved Wound is multiplied to\n" +
            "two unsaved Wounds unless that Wound has the Instant Death special rule.  However,  a\n" +
            "unit entirely composed of  models with the Swarm special rule is not slowed by dif f icult\n" +
            "terrain,  but must test for Dangerous Terrain as normal."),
    TANK_HUNTER("Tank Hunter", "A unit that contains at least one model with this special rule re-rolls failed armour\n" +
            "penetration rolls against vehicles (both with shooting and in close combat) and can\n" +
            "choose to re-roll glancing hits,  in an attempt to instead get a penetrating hit – but the\n" +
            "second result must be kept."),
    TEMPLATE_WEAPON("Template Weapon", "Template weapons have the Ignores Cover,  Wall of  Death and No Escape special rules.\n" +
            "Wounds inf licted by template weapons are allocated following the normal rules.  Template\n" +
            "weapons cannot f ire Snap Shots."),
    TORRENT("Torrent", "A weapon with this special rule is treated like any other Template weapon,  but when\n" +
            "f iring it in the Shooting phase,  place the template so that the narrow end is within 12\" of\n" +
            "the weapon and the wide end is no closer to the weapon than the narrow end."),
    TWIN_LINKED("Twin-linked", "Twin-linked weapons don’ t get more shots than normal ones,  but they give you a better\n" +
            "chance of  hitting with them.  If  a shooting weapon has the twin-linked special rule,  or is\n" +
            "described in a model’ s wargear entry as twin-linked,  it re-rolls all failed To Hit rolls."),
    TWO_HANDED("Two-Handed", "A model attacking with this weapon never receives +1 Attack for f ighting with two Melee\n" +
            "weapons."),
    UNWIELDY("Unwieldy", "A model attacking with this weapon Piles In and f ights at Initiative step 1,  unless it is a\n" +
            "Monstrous Creature or a Walker."),
    VECTOR_DANCER("Vector Dancer", "A model with this special rule can make an additional pivot on the spot of  up to 90° at the\n" +
            "end of  its move.  A model that uses this extra pivot cannot move Flat Out in the following\n" +
            "Shooting phase."),
    VECTOR_STRIKE("Vector Strike", "When Swooping or Zooming,  this model may savage its prey.  At the end of  the Movement\n" +
            "phase,  nominate one enemy unit not locked in combat that the model has moved over\n" +
            "that turn.  That unit takes 1 hit (if  the unit is an enemy Flyer in Zoom mode,  or an enemy\n" +
            "Swooping Flying Monstrous Creature,  it instead takes D3 hits).  Unless stated otherwise,\n" +
            "Vector Strike hits are resolved at the model’ s unmodif ied Strength and AP2,  using\n" +
            "Random Allocation.  These hits have the Ignores Cover special rule.  These hits do not\n" +
            "benef it f rom any of  the model’ s special rules,  such as Furious Charge,  Poisoned,  Rending\n" +
            "etc.  Against vehicles,  these hits are resolved against the target’ s side armour.\n" +
            "A model that made a Vector Strike in its Movement phase counts as having already f ired\n" +
            "one weapon in its following Shooting phase.  However,  any additional weapons it f ires that\n" +
            "turn can choose a dif ferent target to that of  the Vector Strike."),
    VORTEX("Vortex", "A weapon with this special rule is a Destroyer weapon and uses a blast marker of  some\n" +
            "type (e.g.  blast,  large blast,  massive blast,  etc).  Place the appropriate marker,  roll for\n" +
            "scatter and apply damage.  For determining Wound allocation,  always assume the shot is\n" +
            "coming f rom the centre of  the marker,  in the same manner as a Barrage weapon.\n" +
            "The marker for a Vortex weapon is not removed f rom play af ter damage has been\n" +
            "resolved.  Leave it in play on the tabletop.  The marker is impassable terrain as long as it\n" +
            "remains in play.\n" +
            "At the beginning of  every subsequent player turn,  the marker scatters 2D6\" (use the little\n" +
            "arrow if  you roll a Hit!).  If  a double is rolled,  the marker is removed f rom play instead.\n" +
            "Any unit under the marker’ s new location is hit.  Apply damage as described above."),
    ZEALOT("Zealot", "A unit containing one or more models with the Zealot special rule automatically passes\n" +
            "Pinning,  Fear and Regroup tests and Morale checks,  but cannot Go to Ground and cannot\n" +
            "choose to fail a Morale check due to the Our Weapons Are Useless rule.  If  a unit gains the\n" +
            "Zealot special rule when it has Gone to Ground,  all the ef fects of  Go to Ground are\n" +
            "immediately cancelled.\n" +
            "In addition,  units containing one or more models with the Zealot special rule re-roll all\n" +
            "failed To Hit rolls during the f irst round of  each close combat – they do not get to re-roll\n" +
            "failed To Hit rolls in subsequent rounds."),
    NO_SPECIAL_RULE("--", "No special rules");
    private String name;
    private String description;

    SpecialRules(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public static SpecialRules getByName(String name){
        for (SpecialRules specialRule : values()){
            if (specialRule.getName().toLowerCase().equals(name.toLowerCase())){
                return specialRule;
            }
        }
        throw new IllegalArgumentException("Special rule not found: " + name);
    }
}
