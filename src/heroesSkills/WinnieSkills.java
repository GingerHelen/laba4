package heroesSkills;
import enums.*;
import heroThings.SomethingYouCanHeard;
import exceptions.*;

public interface WinnieSkills extends FairyCreature {
    String winnieAdvent();
    String winnieRun(Place location, TypesOfWalking walk);
    void heard(SomethingYouCanHeard thing);
    String winnieLikes();
    String winnieNotUnderstand();
    String think(String thought) throws NullStringException;
    String winnieSee(String subject);

}
