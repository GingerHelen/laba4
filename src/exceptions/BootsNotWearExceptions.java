package exceptions;

public class BootsNotWearExceptions extends RuntimeException {
    private final static String message = "Ошибка! Они не смогли надеть походные сапоги, экспедиция так и не началась...конец истории";
    public BootsNotWearExceptions() {
        super(message);
    }
}
