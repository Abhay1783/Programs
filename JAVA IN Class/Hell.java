public class Hell{
int age;
int sal;

Hell(){
System.out.println("Haa Hum he hai default wale");
}

Hell(int age){
this.age=age;
System.out.println("Mai he hu dsura wala");
}

Hell(int age, long sal)
{
this.age=age;
this.sal=sal;

}

Hell(long age,int sal)
{
System.out.println("This is with argument");
this.age=age;
this.sal=sal;
//System.out.println(this);
}
public static void main(String a[]){
Hell obj1=new Hell(40,50000);
System.out.println(obj1.age+" "+obj1.sal);
Hell obj2=new Hell(50);
System.out.println(obj2.age);
}
}