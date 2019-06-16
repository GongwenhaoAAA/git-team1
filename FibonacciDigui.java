public class FibonacciDigui {
    public static int digui(int i){
        if (i==1||i==2){
            return 1;
        }
        return digui(i-1)+digui(i-2);
    }

    public static void main(String[] args) {
        System.out.println("斐波拉契数列的前20个数为：");
        for (int j=1;j<=20;j++){
            System.out.print(digui(j)+"\t");
        }
    }
}
