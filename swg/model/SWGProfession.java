package swg.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This constant uniquely identifies a profession within SWG. The constant reads
 * the name of the profession and an ID which is just used at SWGCraft.org. This
 * type does not provide any methods to obtain profession specific data, any
 * such information is obtained from {@link SWGProfessionManager}.
 * 
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a> aka
 *         Chimaera.Zimoon
 */
public enum SWGProfession {

    // DO NOT AUTO-SORT this type: the order of the enums are Traders first,
    // alphabetical second, that is, auto-sort would spoil the Trader first

    /**
     * A constant which denotes <i>all&nbsp;</i> professions.
     */
    ALL("All", 0),

    // /**
    // * A constant for Trader - Domestic.
    // */
    // DOMESTIC("Trader - Domestic", 9),
    //
    // /**
    // * A constant for Trader - Engineer.
    // */
    // ENGINEER("Trader - Engineering", 11),
    //
    // /**
    // * A constant for Trader - Munitions.
    // */
    // MUNITIONS("Trader - Munitions", 10),
    //
    // /**
    // * A constant for Trader - Structures.
    // */
    // STRUCTURES("Trader - Structures", 8),
    //
    // /**
    // * A constant for Bounty Hunter.
    // */
    // ARCHITECT("Architect", 24),
    //
    // /**
    // * A constant for Bounty Hunter.
    // */
    // BH("Bounty Hunter", 2),
    //
    // /**
    // * A constant for Commando.
    // */
    // COMMANDO("Commando", 3),
    //
    // /**
    // * A constant for Entertainer.
    // */
    // ENTERTAINER("Entertainer", 4),
    //
    // /**
    // * A constant for Jedi.
    // */
    // JEDI("Jedi", 5),
    //
    // /**
    // * A constant for Medic.
    // */
    // MEDIC("Medic", 6),
    //
    // /**
    // * A constant for Officer.
    // */
    // OFFICER("Officer", 7),
    //
    // /**
    // * A constant for Smuggler.
    // */
    // SMUGGLER("Smuggler", 1),
    //
    // /**
    // * A constant for Spy.
    // */
    // SPY("Spy", 12);

    /**
     * A constant for Alliance Starfighter
     */
    ALLIANCESTARFIGHTER("Alliance Starfighter", 48),
    /**
     * A constant for Architect
     */
    ARCHITECT("Architect", 24),
    /**
     * A constant for Armorsmith
     */
    ARMORSMITH("Armorsmith", 20),
    /**
     * A constant for Artisan
     */
    ARTISAN("Artisan", 4),
    /**
     * A constant for Bio-Engineer
     */
    BIOENGINEER("Bio-Engineer", 19),
    /**
     * A constant for Bounty Hunter
     */
    BOUNTYHUNTER("Bounty Hunter", 28),
    /**
     * A constant for Brawler
     */
    BRAWLER("Brawler", 5),
    /**
     * A constant for Carbineer
     */
    CARBINEER("Carbineer", 9),
    /**
     * A constant for Chef
     */
    CHEF("Chef", 22),
    /**
     * A constant for Combat Medic
     */
    COMBATMEDIC("Combat Medic", 30),
    /**
     * A constant for Combat Prowess
     */
    COMBATPROWESS("Combat Prowess", 35),
    /**
     * A constant for Commando
     */
    COMMANDO("Commando", 29),
    /**
     * A constant for Crafting Mastery
     */
    CRAFTINGMASTERY("Crafting Mastery", 37),
    /**
     * A constant for Creature Handler
     */
    CREATUREHANDLER("Creature Handler", 18),
    /**
     * A constant for Dancer
     */
    DANCER("Dancer", 14),
    /**
     * A constant for Dark Force Rankings
     */
    DARKFORCERANKINGS("Dark Force Rankings", 45),
    /**
     * A constant for Defender
     */
    DEFENDER("Defender", 43),
    /**
     * A constant for Doctor
     */
    DOCTOR("Doctor", 16),
    /**
     * A constant for Droid Engineer
     */
    DROIDENGINEER("Droid Engineer", 25),
    /**
     * A constant for Enhanced Reflexes
     */
    ENHANCEDREFLEXES("Enhanced Reflexes", 36),
    /**
     * A constant for Enhancements
     */
    ENHANCEMENTS("Enhancements", 42),
    /**
     * A constant for Entertainer
     */
    ENTERTAINER("Entertainer", 1),
    /**
     * A constant for Fencer
     */
    FENCER("Fencer", 11),
    /**
     * A constant for Force Progression
     */
    FORCEPROGRESSION("Force Progression", 46),
    /**
     * A constant for Freelance Pilot
     */
    FREELANCEPILOT("Freelance Pilot", 50),
    /**
     * A constant for Healing
     */
    HEALING("Healing", 41),
    /**
     * A constant for Heightened Senses
     */
    HEIGHTENEDSENSES("Heightened Senses", 38),
    /**
     * A constant for Image Designer
     */
    IMAGEDESIGNER("Image Designer", 31),
    /**
     * A constant for Imperial Navy Pilot
     */
    IMPERIALNAVYPILOT("Imperial Navy Pilot", 49),
    /**
     * A constant for Light Force Rankings
     */
    LIGHTFORCERANKINGS("Light Force Rankings", 44),
    /**
     * A constant for Light Saber
     */
    LIGHTSABER("Light Saber", 39),
    /**
     * A constant for Marksman
     */
    MARKSMAN("Marksman", 6),
    /**
     * A constant for Medic
     */
    MEDIC("Medic", 3),
    /**
     * A constant for Merchant
     */
    MERCHANT("Merchant", 26),
    /**
     * A constant for Musician
     */
    MUSICIAN("Musician", 15),
    /**
     * A constant for Padawan
     */
    PADAWAN("Padawan", 34),
    /**
     * A constant for Pikeman
     */
    PIKEMAN("Pikeman", 13),
    /**
     * A constant for Pistoleer
     */
    PISTOLEER("Pistoleer", 8),
    /**
     * A constant for Politician
     */
    POLITICIAN("Politician", 33),
    /**
     * A constant for Powers
     */
    POWERS("Powers", 40),
    /**
     * A constant for Ranger
     */
    RANGER("Ranger", 17),
    /**
     * A constant for Rifleman
     */
    RIFLEMAN("Rifleman", 7),
    /**
     * A constant for Scout
     */
    SCOUT("Scout", 2),
    /**
     * A constant for Shipwright
     */
    SHIPWRIGHT("Shipwright", 47),
    /**
     * A constant for Smuggler
     */
    SMUGGLER("Smuggler", 27),
    /**
     * A constant for Species
     */
    SPECIES("Species", 51),
    /**
     * A constant for Squadleader
     */
    SQUADLEADER("Squadleader", 32),
    /**
     * A constant for Swordsman
     */
    SWORDSMAN("Swordsman", 12),
    /**
     * A constant for Tailor
     */
    TAILOR("Tailor", 23),
    /**
     * A constant for Teras Kasi Artist
     */
    TERASKASIARTIST("Teras Kasi Artist", 10),
    /**
     * A constant for Weaponsmith
     */
    WEAPONSMITH("Weaponsmith", 21);

    /**
     * The ID used at SWGCraft.org for this profession.
     */
    private final int swgcraftID;

    /**
     * The proper name for this profession.
     */
    private final String name;

    /**
     * Creates a new profession constant with the specified name and ID.
     * 
     * @param professionName the proper name for the profession
     * @param swgCraftID the ID at SWGCraft.org for the profession
     */
    private SWGProfession(String professionName, int swgCraftID) {
        name = professionName;
        swgcraftID = swgCraftID;
    }

    /**
     * Determines if the specified constant equals this constant. In particular,
     * this implementation returns {@code true} if {@code this == other || other
     * == ALL || this == ALL}.
     * 
     * @param other the other profession constant to check
     * @return {@code true} if the argument is considered equal
     */
    public boolean equalsProfession(SWGProfession other) {
        return (other == this || other == ALL || this == ALL);
    }

    /**
     * Returns the ID that is used at SWGCraft.org for this profession.
     * 
     * @return the SWGCraft ID
     */
    public int getID() {
        return swgcraftID;
    }

    /**
     * Returns the proper name for this profession.
     * 
     * @return the profession name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a commonly known abbreviation for this profession, or the full
     * name if no abbreviation is widely known. For Traders other than DE this
     * method invokes {@link #getNameShort()}.
     * 
     * @return an abbreviation for this profession, if any
     */
    public String getNameAbbr() {
        switch (swgcraftID) {
        case 8: // fall through to case 10
        case 9:
        case 10:
            return getNameShort();
        case 2:
            return "BH";
        case 4:
            return "Ent";
        case 11:
            return "DE";
        default:
            return name;
        }
    }

    /**
     * Returns a shorter name for the Trader professions, for all other
     * professions the full name is returned.
     * 
     * @return the shorter name for Traders
     */
    public String getNameShort() {
        if (name.startsWith("Tr")) return name.substring(9); // skip "Trader - "

        return name;
    }

    /**
     * Returns a profession constant for the specified SWGCraft ID.
     * 
     * @param id a SWGCraft ID
     * @return a profession constant
     * @throws IllegalArgumentException if the argument does not denote a
     *         profession
     */
    public static SWGProfession getFromID(int id) {
        for (SWGProfession p : values())
            if (p.getID() == id) return p;

        throw new IllegalArgumentException("Invalid id: " + id);
    }

    /**
     * Returns a profession constant for the proper name of a profession; also
     * the name from {@link #getNameShort()} is supported. If the argument is
     * invalid {@code null} is returned.
     * 
     * @param name a proper name for the profession
     * @return a profession constant, or {@code null}
     */
    public static SWGProfession getFromName(String name) {
        for (SWGProfession p : values())
            if (p.name.equals(name) || p.getNameShort().equals(name)) return p;

        return null;
    }

    /**
     * Returns a list with names of professions in SWG. If the boolean argument
     * is {@code false} the elements read the shortened names from
     * {@link #getNameShort()}, otherwise the elements read the full names of
     * the professions.
     * <p>
     * The order of the list is alphabetical but Traders first, the very first
     * element is "All".
     * 
     * @param fullName {@code true} if the elements should read the full name
     * @return a list of profession names
     */
    public static List<String> getNames(boolean fullName) {
        ArrayList<String> ret = new ArrayList<String>(13);
        for (SWGProfession p : values())
            ret.add(fullName
                    ? p.getName()
                    : p.getNameShort());

        // enum is sorted per creation order
        return ret;
    }
}
