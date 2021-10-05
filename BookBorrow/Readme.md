# Question
There is a class Book, which has the attributes bookID, title and author. There are two categories of books, TextBooks and ReferenceBooks.<br/>
The text books can be borrowed by a user while the reference books cannot be. There is an extra attribute status (default value is Available) <br/>
and borrowedUser in the class TextBooks. There is an interface Borrowable which has methods checkIn and checkOut. The class Book implements<br/>
the Borrowable interface (Think and decide whether class Book is an abstract class or not).
<br/>
<br/>
The functionality of the checkIn and checkOut methods in TextBooks class is as follows:<br/>
checkIn : should set status attribute as Borrowed and should set the value of borrowedUser.<br/>
checkOut : should set status attribute as Available
<br/>
<br/>
The functionality of the checkIn and checkOut methods in ReferenceBooks class is as follows:<br/>
checkIn : display “Invalid”<br/>
checkOut : display “Cannot be borrowed”
<br/>
<br/>
Sample Input and Output:<br/>
1. Add Reference Book<br/>
2. Add Text Book<br/>
3. Check-Out<br/>
4. Check-In<br/>
5. List Books<br/>
6. Exit<br/>

<br/>

### Enter your choice: 1
Enter ID, Title and Author (Line by line)<br/>
101<br/>
Data Structures and Algorithms<br/>
Cormen

### Enter your choice: 2
Enter ID, Title and Author (Line by line)<br/>
102<br/>
Programming Ruby<br/>
Thomas

### Enter your choice: 5
ReferenceBook: 101: Data Structures and Algorithms: Cormen<br/>
TextBook: 102: Programming Ruby: Thomas: Available

### Enter your choice: 3
Enter Book ID: 101<br/>
Cannot be borrowed

### Enter your choice: 3
Enter Book ID: 102<br/>
Enter Username: Ram

### Enter your choice: 5
ReferenceBook: 101: Data Structures and Algorithms: Cormen<br/>
TextBook: 102: Programming Ruby: Thomas: Borrowed by Ram

### Enter your choice: 4
Enter Book ID: 102

### Enter your choice: 5
ReferenceBook: 101: Data Structures and Algorithms: Cormen<br/>
TextBook: 102: Programming Ruby: Thomas: Available

### Enter your choice: 6
