public class InstanceCounter {
    private static int count = 6;
    protected static int getCount(){
        return count;
    }
    
    protected static void addInstance(){
        count = count++;
    }
    public InstanceCounter(){
        this.addInstance();
    }
    
    public static void main (String[] agrs){
        System.out.println("The instance count is:" + InstanceCounter.getCount());
        InstanceCounter counter = new InstanceCounter();
        System.out.println("CurrentCount :" + counter.count);
        for (int i = 0; i < 500; i++){
            InstanceCounter counta = new InstanceCounter();
        }
        System.out.println("Afte creat 500 new Counter, the oldCounter's count : " + counter.count);
    }
}
