package racinggame.view;

public class OutputView {
    private static final String ERROR_MESSAGE = "[ERROR] 다시 입력해주세요.";

    public static void printError(){
        System.out.println(ERROR_MESSAGE);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
