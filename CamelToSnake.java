 public class CamelToSnake {
    public static void main(String[] args) {
        String input = "camelCaseToSnake";
        String result = input.replaceAll("([A-Z])", "_$1").toLowerCase();
        System.out.println("Snake_case: " + result);
    }
} 
