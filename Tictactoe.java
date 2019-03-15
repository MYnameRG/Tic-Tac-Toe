import java.util.Scanner;

class Tictactoe
{
static int x_length;
static int y_length;

Tictactoe()
{
x_length=11;
y_length=11;
}

static void Boundry(char blocks[][])
{
for(int i=0;i<x_length;i++)
{
for(int j=0;j<y_length;j++)
{
blocks[i][j]=' ';
}
}
}

static void YBorder(char blocks[][])
{
for(int i=0;i<x_length;i++)
{
for(int j=0;j<y_length;j++)
{
if(j==((int)(y_length/4)+1) || j==((int)(y_length/2)+2))
blocks[i][j]='|';
}
}
}

static void XBorder(char blocks[][])
{
for(int i=0;i<x_length;i++)
{
for(int j=0;j<y_length;j++)
{
if(i==((int)(x_length/4)+1) || i==((int)(x_length/2)+2))
blocks[i][j]='-';
}
}
}

static void Player1(char blocks[][])
{
char value,pos;
Scanner s = new Scanner(System.in);
System.out.print("Player 1's turn is going on (Put X): ");
value=s.next().charAt(0);
System.out.println();
System.out.print("Position to Put X (Put A-I): ");
pos=s.next().charAt(0);
for(int i=1;i<x_length;i=i+4)
{
for(int j=1;j<y_length;j=j+4)
{
if(blocks[i][j]==pos)
blocks[i][j]=value;
}
}
}

static void Player2(char blocks[][])
{
char value,pos;
Scanner s = new Scanner(System.in);
System.out.print("Player 2's turn is going on (Put O): ");
value=s.next().charAt(0);
System.out.println();
System.out.print("Position to Put O (Put A-I): ");
pos=s.next().charAt(0);
for(int i=1;i<x_length;i=i+4)
{
for(int j=1;j<y_length;j=j+4)
{
if(blocks[i][j]==pos)
blocks[i][j]=value;
}
}
}

static int XCheckColumn(char blocks[][])
{
int count=0;
for(int i=1;i<10;i=i+4)
{
count=0;
for(int j=1;j<10;j=j+4)
{
if(blocks[j][i]=='X') count++;
}
if(count==3)
{
return 1;
}
}
return 0;
}

static int XCheckRow(char blocks[][])
{
int count=0;
for(int i=1;i<10;i=i+4)
{
count=0;
for(int j=1;j<10;j=j+4)
{
if(blocks[i][j]=='X') count++;
}
if(count==3)
{
return 1;
}
}
return 0;
}

static int XCheckDiagonal(char blocks[][])
{
int count=0,j=9;
for(int i=1;i<10;i=i+4)
{
if(blocks[i][i]=='X')
count++;
}
if(count==3) return 1;

count=0;
for(int i=1;i<10;i=i+4)
{
if(blocks[i][j]=='X')
{
j=j-4;
count++;
}
}
if(count==3) return 1;

return 0;
}

static int OCheckDiagonal(char blocks[][])
{
int count=0,j=9;
for(int i=1;i<10;i=i+4)
{
if(blocks[i][i]=='O')
count++;
}
if(count==3) return 1;

count=0;
for(int i=1;i<10;i=i+4)
{
if(blocks[i][j]=='O')
{
j=j-4;
count++;
}
}
if(count==3) return 1;

return 0;
}

static int OCheckRow(char blocks[][])
{
int count=0;
for(int i=1;i<10;i=i+4)
{
count=0;
for(int j=1;j<10;j=j+4)
{
if(blocks[i][j]=='O') count++;
}
if(count==3)
{
return 1;
}
}
return 0;
}

static int OCheckColumn(char blocks[][])
{
int count=0;
for(int i=1;i<10;i=i+4)
{
count=0;
for(int j=1;j<10;j=j+4)
{
if(blocks[j][i]=='O') count++;
}
if(count==3)
{
return 1;
}
}
return 0;
}

static void Display(char blocks[][])
{
for(int i=0;i<x_length;i++)
{
for(int j=0;j<y_length;j++)
{
System.out.print(blocks[i][j]);
}
System.out.println();
}
}

static void AddPosition(char blocks[][])
{
int k=65;
for(int i=1;i<=9;i=i+4)
{
for(int j=1;j<=9;j=j+4)
{
blocks[i][j]=(char)k;
k++;
}
}
}

public static void main(String[] args)
{
int t=9,count=0,count1=0;
Tictactoe t1 = new Tictactoe();
char blocks[][] = new char[x_length][y_length];
t1.Boundry(blocks);
t1.YBorder(blocks);
t1.XBorder(blocks);
t1.AddPosition(blocks);
while(t--!=0){
System.out.print("\033\143");
t1.Display(blocks);
t1.Player1(blocks);
if(t1.XCheckRow(blocks)==1 || t1.XCheckColumn(blocks)==1 || t1.XCheckDiagonal(blocks)==1){
System.out.print("\033\143");
t1.Display(blocks);
System.out.println("Player 1 Win...");
break;}
else{count++;}

System.out.print("\033\143");
t1.Display(blocks);
t1.Player2(blocks);
if(t1.OCheckRow(blocks)==1 || t1.OCheckColumn(blocks)==1 || t1.OCheckDiagonal(blocks)==1){
System.out.print("\033\143");
t1.Display(blocks);
System.out.println("Player 2 Win...");
break;}
else{count1++;}

if(count==4 || count1==4){
System.out.print("\033\143");
t1.Display(blocks);
System.out.println("It Will Be a Tie..");
break;}
}
}
}
