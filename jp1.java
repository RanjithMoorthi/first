import java.io.*;
class jp1{
public static void main(String args[]) 

{






 /*DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter a number");
String s;
s=in.readLine();
int rows = Integer.parseInt(s);
for ( int i=1; i<=rows; i++)
{ for( int j=1; j<=i; j++){
 System.out.print("* ");}
System.out.println();} */



        for (int i=0; i<5; i++)
        { for(int j=5-i; j>1; j--)
        { 
            System.out.print(" ");
        }
        for (int j=0; j<=i; j++){
            System.out.print("* ");
        }
            System.out.println();    

        }



  for( int i=1; i<=4; i++)

    { for (int j=0; j<i; j++)
 
        { System.out.print(" "); }

          for (int k=0; k<5-i; k++)


           { System.out.print("* "); }
           System.out.println();}

 







}}