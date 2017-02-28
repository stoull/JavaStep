public class ifelse {
    int i = 0;
    public ifelse(int originalI){
        this.i = originalI;
    }
    public static void main (String[] args){
        
        // Test While sentence
        ifelse kIF = new ifelse(10);
        System.out.println("Begin of the i is :" + kIF.i);
        while (kIF.i < 20){
            System.out.println("The i :" + kIF.i);
            kIF.i++;
        }
        System.out.println("End of while The i is :" + kIF.i);
        
        // 测试java5的快速遍历
        String [] names = {"Gunzi","ChangChun","Jim","Lucy","Gun"};
        int i=0;
        for (String name : names){
            System.out.println("The index" + i + "of name :" + name);
            i++;
        }
    }
}
