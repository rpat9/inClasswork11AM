package FunWithStrings;

public class FunWIthStrings {

  public static void main(String[] args) {
    String n = "This is a monday after the end of week 2";
    int charCount = n.length();
    String chars16TO30 = n.substring(16, 30); // Characters 16 to 29

    System.out.printf("There are %d characters in my string\n", charCount);
    System.out.printf("This is my substring: %s\n", chars16TO30);
    System.out.println(n.toUpperCase());

  }
}