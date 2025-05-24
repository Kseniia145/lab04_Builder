public class Main {
    public static void main(String[] args) {
        Builder builder = new StringBuilderCustom();
        String result = builder
                .append("Hello")
                .append(" is done")
                .insert(5, ", this task")
                .build();

        System.out.println(result); // Виведе: Hello, World
    }
}
