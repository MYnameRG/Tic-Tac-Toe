**❌⭕ Tic-Tac-Toe**

A console-based two-player Tic-Tac-Toe game implemented in Java.
Developed by Rohit Gupta

**🎮 Overview**

Tic-Tac-Toe is a classic 3×3 grid game where two players take turns marking spaces with X or O.
The first player to align three of their marks **horizontally**, **vertically**, or **diagonally** wins the game.

This Java implementation runs in the console and:

1. Draws a dynamic ASCII-based 3×3 grid
2. Takes player input interactively
3. Detects wins in rows, columns, or diagonals
4. Declares a tie when all spots are filled

**⚙️ Features**

✅ Two-player turn-based gameplay
✅ Console-based board display using ASCII art
✅ Input positions labeled A–I for easy referencing
✅ Automatic win and tie detection
✅ Screen refreshes dynamically after each move
✅ No external libraries required

**🧠 Game Logic**

The game board is represented as a 2D character array (char[][] blocks) of size 11×11.

1. | and - are used to draw grid lines.
2. Each playable position is labeled from A to I.
3. Players choose a label (like A, B, C, …) to place their mark (X or O).

After every move:

1. The screen is cleared using escape codes.
2. The updated grid is displayed.
3. The program checks:
   
    All rows → XCheckRow(), OCheckRow()
   
    All columns → XCheckColumn(), OCheckColumn()
   
    Both diagonals → XCheckDiagonal(), OCheckDiagonal()

If a match of three is found, that player wins.

If all 9 moves are completed with no winner, the game declares a tie.

<img width="1190" height="608" alt="image" src="https://github.com/user-attachments/assets/4f3a68ca-8446-489f-b664-74455eb751ee" />

**🏗️ Program Flow**

1. Initialize Board:

The grid is created using Boundry(), XBorder(), and YBorder().

2. Assign Positions:

Each playable position (A–I) is labeled using AddPosition().

3. Game Loop (9 Turns Max)

  a. Player1() asks for X input.
  
  b. Checks if Player 1 won using XCheckRow/Column/Diagonal.
  
  c. If not, Player2() takes turn and win is checked using OCheck*().

4. Result Display:

  a. Winner is displayed immediately after the winning move.
    
  b. If all turns are used without a winner, a “Tie” message is shown.

**💻 How to Run:**

**Requirements**

1. Java 8+

2. Command line or terminal that supports escape sequences (\033\143)

3. Steps

  a. Save the file as **Tictactoe.java**
  
  b. Compile the program:
  
  javac Tictactoe.java

  c. Run the program:
  
  java Tictactoe

<img width="1066" height="878" alt="image" src="https://github.com/user-attachments/assets/89e6c5e7-59e6-4a30-9bb2-4144491acc0b" />
