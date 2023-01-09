package heroesSkills;
import exceptions.NullStringException;
import heroes.Hero;
import enums.*;
public interface FairyCreature {
    String getName();
    void setLocation(Place location);
    void farewell(Hero hero1, Hero hero2);
    void meeting(Hero hero1, Hero hero2);
    String helping(Hero hero1, Hero hero2);
    void activity(Place location, String activity);
    String talkAbout(String subjectOfTalking, Hero hero) throws NullStringException;
    String startedWalking(Place location);
}
