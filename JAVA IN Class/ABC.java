public class ABC{

int a;int b,res;
ABC(){
System.out.println("from const 1");
}
ABC(int a){
this();
res=a+b;
System.out.println("from const 2");
}
ABC(int a,int b,int c){
this(a,b);
res=res+c;
System.out.println("from const 3"+res);
}
public static void main(String args[]){

ABC a1=new ABC(2,3,4);


}
}
		
 