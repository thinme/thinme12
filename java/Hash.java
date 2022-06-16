import java.util.*;

class Hash {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6};   
        solution(number);
    }
    public static TreeSet <Integer> solution(int[] numbers){
        TreeSet<Integer> arr= new TreeSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                 arr.add(numbers[i]+numbers[j]);

                
            }
        }
        return arr;
    }
    
}

