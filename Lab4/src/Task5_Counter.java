 public class Task5_Counter {
    private static int staticCount = 0;   // Total count for all objects
    private int instanceCount = 0;        // Count for each object

    public Task5_Counter() {
        staticCount++;
        instanceCount++;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}

  class Test{
    public static void main(String[] args) {
        Task5_Counter obj1 = new Task5_Counter();
        Task5_Counter obj2 = new Task5_Counter();
        Task5_Counter obj3 = new Task5_Counter();

        System.out.println("Instance Count for obj1: " + obj1.getInstanceCount());
        System.out.println("Instance Count for obj2: " + obj2.getInstanceCount());
        System.out.println("Instance Count for obj3: " + obj3.getInstanceCount());

        System.out.println("Total Count of objects (staticCount): " + Task5_Counter.getStaticCount());
    }
}
