package heroThings;
import heroes.*;

public class Song extends SomethingYouCanHeard {
    private static final String name = "песня";
    public Song(Hero owner){
        super(name, owner);
    }
    public String getMovement(){
        return "Звучит песня. ";
    }
    public String getOwner(Hero owner, String phrase){
        return  phrase + owner.getName() + ". ";
    }
}
