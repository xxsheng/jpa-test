package jpa.test;

public class Test1 {

    private final static Test1 test1 = new Test1();

    public static int count1;

    public static int count2=0;
    static {
        count1 = -1;
        System.out.println("count1x" + test1.count1);
        System.out.println("count2x" + test1.count2);
    }




    public Test1() {
        count1++;
        count2++;
    }

    public static Test1 getInstance() {
        return test1;
    }

}

class Test2 {
    public static void main(String[] args) {
//        Test1 instance = Test1.getInstance();
//        System.out.println("testcount1:" + instance.count1);
//        System.out.println("testcount2:" + instance.count2);
//        System.out.println("----");

        String abc = "123";
        int i = Integer.parseInt(abc);
    }

    void test1(String abc) {

    }
}
