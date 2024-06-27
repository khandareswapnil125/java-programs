// Write a Java Program to reverse a string without using String inbuilt 
//function non static


public class ReverseString1
 {

  public String reverseString(String input) // Non-static method 
{ 
    char[] chars = input.toCharArray();
    int left = 0, right = chars.length - 1;

    // Iterate until left pointer reaches or crosses the right pointer
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
    ReverseString reverser = new ReverseString(); // Create object
    String input = "swapnil,khandare";
    String reversedString = reverser.reverseString(input); // Call on object
    System.out.println("Original String: " + input);
    System.out.println("Reversed String: " + reversedString);
  }
}
