# Number Hollow Diamond Pattern in Java

## Description
The `Number_Hallow_Diamond` program generates a hollow diamond pattern using the number `1`. The pattern consists of two mirrored triangular sections, forming a symmetrical diamond. The outer edges of each row contain the number `1`, while the inner spaces remain blank.

## Pattern Example (For n = 5)
```
    1
   1 1
  1   1
 1     1
1       1
 1     1
  1   1
   1 1
    1
```

## How the Code Works

### 1. Importing Scanner Class
```java
import java.util.Scanner;
```
The `Scanner` class is used to take input from the user. It allows the program to read integers entered via the keyboard.

### 2. Declaring the Main Class
```java
public class Number_Hallow_Diamond
```
Defines a public class named `Number_Hallow_Diamond` which contains the main logic for generating the pattern.

### 3. Taking User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n = s.nextInt();
```
- Creates a `Scanner` object `s` to read input.
- Prompts the user to enter an integer value `n`, which determines the size of the diamond.

### 4. Printing the Upper Half of the Diamond
```java
for(int i=0; i<=n; i++)
```
- This loop controls the rows of the upper half.
- It runs from `0` to `n`.

```java
for(int j=i; j<=n; j++)
    System.out.print(" ");
```
- Prints leading spaces for alignment.
- The number of spaces decreases as `i` increases.

```java
for(int j=1; j<i; j++)
```
- This loop handles the left side of the diamond.
- It prints `1` at the start and spaces in between.

```java
for(int j=1; j<=i; j++)
```
- This loop prints `1` at the end of the row, completing the structure.

### 5. Printing the Lower Half of the Diamond
```java
for(int i=0; i<=n; i++)
```
- This loop controls the rows of the lower half.
- It runs from `0` to `n`.

```java
for(int j=1; j<=i; j++)
    System.out.print(" ");
```
- Prints leading spaces, increasing as `i` increases.

```java
for(int j=i; j<n; j++)
```
- Prints `1` at the start and spaces in between.

```java
for(int j=i; j<=n; j++)
```
- Prints `1` at the end of the row, ensuring the hollow diamond structure.

### 6. Closing Scanner
```java
s.close();
```
- Closes the scanner object to free up system resources.

## Code
```java
package number_patterns;

import java.util.Scanner;

public class Number_Hallow_Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            int num = 1;
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                if(j==1)
                    System.out.print(num);
                else
                    System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                    System.out.print(num);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<=n;i++)
        {
            int num = 1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            {
                if(j==i)
                    System.out.print(num);
                else
                    System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                if(j==n)
                    System.out.print(num);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        s.close();
    }
}
```

## Explanation of Key Components

### Variables Used
- `Scanner s`: Used to read user input.
- `int n`: Stores the input value (size of the diamond).
- `int num = 1;`: Represents the number printed in the pattern.
- `i, j`: Loop control variables for iterating over rows and columns.

### Printing Statements
- `System.out.print(" ");` → Prints spaces for alignment.
- `System.out.print(num);` → Prints `1` at the required positions.
- `System.out.println();` → Moves to the next line after each row.

## Conclusion
This Java program effectively prints a hollow diamond pattern by utilizing nested loops and conditional checks. It demonstrates the use of the `Scanner` class for user input, structured `for` loops for pattern generation, and proper formatting to maintain the symmetry of the diamond shape.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Number_Hallow_Diamond.git
```
