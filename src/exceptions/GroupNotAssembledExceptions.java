package exceptions;

public class GroupNotAssembledExceptions extends RuntimeException {
    private final static String message = "Ошибка! Кто-то еще не пришел, экспедиция не может быть начата...конец истории";
    public GroupNotAssembledExceptions() {
        super(message);
    }
}
