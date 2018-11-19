package sc916;

public class GitTest {

    public static void main(String[] args) {
        System.out.println("Hello git!");
        System.out.println("Hello git!");
        System.out.println("Hello git!");
        System.out.println("Hello git!");
        System.out.println("Hello git!");
        System.out.println("Hello git!");

        //添加方法
        method1();//静态只能调用静态
        new GitTest().method2();
    }

    public static void method1() {
        int i = 1;
        i += 10;
        System.out.println(i);
    }

    public void method2() {
        int i = 1;
        i += 10;
        System.out.println(i);
    }
    public void method3() {
        int i = 1;
        i += 10;
        method1();
        method2();//非静态可以调用所有
        System.out.println(i);
    }

}
