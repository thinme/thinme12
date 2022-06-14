public class solution {
    public static void main(String[] arg) {
        int price = 3;
        int money = 20;
        int count =4;
        System.out.println(Solution(price, money, count));
    }

    public static long Solution(int price, int money, int count) {
        long answer=0;
        long sum=0;

        for(int i=1; i<count+1; i++){
            sum+=price*i;
        }
        if(sum>money) {
            answer=sum-money;
        }
        return answer;
    }
    
}
