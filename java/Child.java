import java.util.*;
class Parent{
void view()
{
System.out.println("this is parent cls method");
}}
class Child extends Parent{
void view(){
System.out.println("this is child cls methd");
}
public static void main(String args[])
{
Parent p=new Parent();
p.view();
Child p1=new Parent();
p1.view();
}}