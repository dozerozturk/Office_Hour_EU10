package week11.staticPractice;

public class StaticPractice {
    public static int a=10;
    public int b=20;

    public void method1(){
        System.out.println("this is not static method");
    }

    public static void method2(){
        System.out.println("this is static method");
        String[] names = new String[5];
    }
}
