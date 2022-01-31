import java.io.*;
class jp2{ 
public static void main(String args[]){
String name="RANJITH";
int m1=50 , m2=55 , m3=70 , m4=55 , m5=80;
int total= m1+m2+m3+m4+m5;
float avg= total/5;
System.out.println(name);
System.out.println(total);
System.out.println(avg);
if(avg>=50){
System.out.print("Pass");}
else System.out.print("Fail");
}}