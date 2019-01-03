package javamukesh;

/* 1.parent class should not have child class if we have want to declare
that perticular class as final class.
2.if we delare final in parent class (same as method) we can not  inheritance or extend child class.
3.to proveren inheritance , method overriding also*/
public final class Methodoverridingparent {
public void test(){
	System.out.println("this is parent method over riding");
}
}
