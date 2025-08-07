# Name: Ethan Joshua Camingao
## Exploring Java String Methods

---

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

---

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

---

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

---

### Exercise 4: toUpperCase() and toLowerCase() - Changing Case

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
```

**Predicted Output:**
```
Uppercase: THIS IS A TEST
Lowercase: this is a test
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex4.png"/>

**Explanation:**

The toUpperCase() method converts all characters in the string to uppercase. Conversely, the toLowerCase() method converts all characters to lowercase. These methods are useful for case-insensitive comparisons.

---

### Exercise 5: indexOf() - Finding a Character or Substring

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);
    }
}
```

**Predicted Output:**
```
Index of 'fox': 16
Index of 'z': 37
Index of 'cat': -1
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex5.png"/>

**Explanation:**

The indexOf() method returns the starting index of the first occurrence of the specified character or substring. If the character or substring is not found, it returns -1. In our example, "fox" starts at index 16, and 'z' is at index *37*. Since "cat" does not appear in the string, its index is reported as -1.

---

### Exercise 6: equals() vs. equalsIgnoreCase() - Comparing Strings

**Code to run:**
```
public class StringLab {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);
    }
}
```

**Predicted Output:**
```
"Java".equals("java"): false
"Java".equals("Java"): true
"Java".equalsIgnoreCase("java"): true
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-String-Methods/blob/main/images/Ex6.png"/>

**Explanation:**

The equals() method compares two strings for exact equality, and it is case-sensitive. "Java" and "java" are not the same, so it returns false. equals() returns true when comparing "Java" and "Java". The equalsIgnoreCase() method, however, compares two strings without considering their case. Therefore, it returns true when comparing "Java" and "java".