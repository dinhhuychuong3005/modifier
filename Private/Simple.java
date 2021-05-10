package Private;

public class Simple {
    public static void main(String[] args) {
        A obj1 = new A();
//        System.out.println(obj1.data);
//        obj1.msg();
    }
}
    class A{
        private int data = 40;
        private void msg(){
            System.out.println("Hello java");
        }
    }

