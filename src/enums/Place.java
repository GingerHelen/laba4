package enums;

public enum Place {
    GROUND("на земле"),
    PIGLETHOUSE("к дому Пятачка"),
    RABBITHOUSE("к дому Кролика"),
    CRISTOPHERHOUSE("к дому Кристофера Роббинса"),
    FOREST("по лесу"),
    NEXT("дальше"),
    DOORSTEP("у порога. "),
    POLE("поход на Полюс");
    private String seat;

    Place(String seat) {
        this.seat = seat;
    }

    public String toString() {
        return seat;
    }
}