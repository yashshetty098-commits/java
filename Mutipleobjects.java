public class MultipleObjects {
    int value;

    public static void main(String[] args) {
        MultipleObjects obj1 = new MultipleObjects();
        MultipleObjects obj2 = new MultipleObjects();
        
        obj1.value = 100;
        obj2.value = 200;
        
        System.out.println("Object 1 Value: " + obj1.value);
        System.out.println("Object 2 Value: " + obj2.value);
    }
}
