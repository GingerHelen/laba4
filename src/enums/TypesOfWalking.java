package enums;

public enum TypesOfWalking {
    WALK("шагая"),
    RUN(" бежит"),
    CONTINUE(" продолжает путь");
    private final String typeOfWalking;

    TypesOfWalking(String typeOfWalking) {
        this.typeOfWalking = typeOfWalking;
    }

    public String toString() {
        return typeOfWalking;
    }
}
