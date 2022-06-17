public class lock {

    public static void main(String[] args){
        int number=145;
        
        DecimalToBinary( number);
    }
    public static int DecimalToBinary(int number) {
        int Binary_number=0;
        int count=0;
        while(number!=0){
            int remainder =number%2;
            double temp= Math.pow(10, count);
            Binary_number +=remainder*temp;
            number/=2;

            count++;
        }
        System.out.println(DecimalToBinary(number));
        return Binary_number;
     
       
    }
}
