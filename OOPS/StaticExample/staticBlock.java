package OOPS.StaticExample;

public class staticBlock {
    static int a = 4;
    static int b;

    // will only run once when the first object is created or the class is loaded for the first time
    static {
        System.out.println("Wr are inside static block...");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock obj1 = new staticBlock();
        System.out.println(a + " " + b);

        staticBlock.b += 100;
        System.out.println(b);

        staticBlock obj2 = new staticBlock();
        System.out.println(a + " " + b);
    }
}
