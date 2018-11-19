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
        method1();
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

}
