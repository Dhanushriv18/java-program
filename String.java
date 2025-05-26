public class Main {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Original Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Character at index 7: " + text.charAt(7));
        System.out.println("Substring (6 to 11): " + text.substring(6, 11));
        System.out.println("Replace 'World' with 'programmer': " + text.replace("World", "programmer"));
    }
}