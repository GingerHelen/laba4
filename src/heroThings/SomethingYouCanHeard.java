package heroThings;

import heroes.Hero;

public abstract class SomethingYouCanHeard {
    public String name;
    private Hero owner;
    public SomethingYouCanHeard(String name, Hero owner){
        this.name = name;
        this.owner = owner;
    }
    private boolean isHeard = false;
    public void setHeardValue(boolean isHeard) {
        this.isHeard = isHeard;
    }
    public String getCondition(){
        if(isHeard) return this.getMovement();
        else return name + " не было услышано";
    }
    public String getOwner(String phrase){
        return phrase + owner.getName();
    }
    public abstract String getMovement();
}

