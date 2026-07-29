/* Why do we need StringBuilder?
Strings are immutable. That means whenever you modify a string, Java creates a new object instead of changing the existing one. */

/* Creating a StringBuilder

There are three common ways.

1. Empty StringBuilder_____
StringBuilder sb = new StringBuilder();

2. With initial text________
StringBuilder sb = new StringBuilder("Java");
Output:
Java

3. With capacity_______
StringBuilder sb = new StringBuilder(50);
This reserves space for 50 characters.
append()

Adds text to the end.

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
    }
}
Output
Java Programming
------------------------------------------------
You can append different types too:

StringBuilder sb = new StringBuilder();

sb.append("Age : ");
sb.append(20);
sb.append(" ");
sb.append(true);

System.out.println(sb);

Output :-
Age : 20 true

--------------------------------------------------

insert()___
Adds text at a specific position.

StringBuilder sb = new StringBuilder("Jva");
sb.insert(1, "a");
System.out.println(sb);

Output
Java

-----------------------------------------------------
replace()___
Replaces characters between two indexes.

Syntax == replace(start, end, text)

Example

StringBuilder sb = new StringBuilder("Java");
sb.replace(0, 4, "Python");
System.out.println(sb);

Output
Python

Remember: The end index is exclusive, just like substring().

-------------------------------------------------------------
delete()
Deletes characters.

StringBuilder sb = new StringBuilder("Java Programming");
sb.delete(4, 16);
System.out.println(sb);

Output
Java
deleteCharAt()

Deletes one character._____

StringBuilder sb = new StringBuilder("Java");
sb.deleteCharAt(1);
System.out.println(sb);

Output
Jva

---------------------------------------------------------------

reverse()
Reverses the text.

StringBuilder sb = new StringBuilder("Java");
sb.reverse();
System.out.println(sb);

Output
avaJ

-----------------------------------------------------------------
setCharAt()
Changes one character.

StringBuilder sb = new StringBuilder("Java");
sb.setCharAt(0, 'K');
System.out.println(sb);

Output
Kava

------------------------------------------------------------------
charAt()
Reads a character.

StringBuilder sb = new StringBuilder("Programming");
System.out.println(sb.charAt(3));

Output
g

-------------------------------------------------------------------
length()
Returns the number of characters.

StringBuilder sb = new StringBuilder("Java");
System.out.println(sb.length());

Output
4

------------------------------------------------------------------
Capacity
A StringBuilder has a capacity, which is the amount of storage reserved before it needs to expand.

StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());

Output
16

By default, the capacity is 16 characters.
If you create it like this:

StringBuilder sb = new StringBuilder("Java");

Capacity becomes:
16 + length of "Java"
= 20

Check it:

System.out.println(sb.capacity());

Output
20

----------------------------------------------------------------
String                                 vs    StringBuilder
String	                               ||    StringBuilder
Immutable	                           ||    Mutable
Creates new object on modification     ||	 Modifies the same object
Slower for repeated changes	           ||    Faster for repeated changes
Thread-safe by design due to immutability || Not thread-safe

 */

/* 
coding question and output 
StringBuilder sb = new StringBuilder("Java");

sb.insert(4, " Programming");
sb.delete(0, 5);
sb.replace(0, 11, "Python");

System.out.println(sb); 

output--
Python

*/
