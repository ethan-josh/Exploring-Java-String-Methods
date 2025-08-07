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

The charAt(int index) method returns the character at the specified index. Remember that in Java, indexing starts at 0. Therefore, message.charAt(5) retrieves the character at the 6th position, which is the 'l'.


### Exercise 3: substring() - Extracting a Part of a String

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
    }
}
```

**Predicted Output:**
```
The extracted substring is: is
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex3.png"/>

**Explanation:**

The substring(int beginIndex, int endIndex) method extracts a new string from the original one. It starts at beginIndex and goes up to, but does not include, endIndex. So, statement.substring(5, 7) extracts the characters at index 5 and 6, which are "is".