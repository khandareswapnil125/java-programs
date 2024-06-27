
//Write a Java Program to reverse a string without using String inbuilt 
function



public class ReverseString {

  public static String reverseString(String input) {
    char[] chars = input.toCharArray();
    int left = 0, right = chars.length - 1;

    // Loop till left and right pointers meet (<= for inclusive)
    while (left <= right) {
      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      left++;
      right--;
    }

    return new String(chars);
  }

  public static void main(String[] args) {
    String input = "Hello World!";
    String reversedString = reverseString(input);
    System.out.println("Original String: " + input);
    System.out.println("Reversed String: " + reversedString);
  }
}
