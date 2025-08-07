# Name: Ethan Joshua Camingao
## Exploring Java String Methods


### Exercise 1: length() - Finding the String's Size

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);
    }
}
```
**Predicted Output:**
```
The length of the string is: 14
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex1.png"/>

**Explanation:**

The `length()` method returns the number of characters in the string, including spaces and punctuation. In "Hello, Cadets!", there are 14 characters, so the method returns the integer 14


### Exercise 2: charAt() - Accessing a Character

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);
    }
}
```

**Predicted Output:**
```
The character at index 5 is: l
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex2.png"/>

**Explanation:**

The charAt(int index) method returns the character at the specified index. Remember that in Java, indexing starts at 0. Therefore, message.charAt(5) retrieves the character at the 6th position, which is the space ' '.