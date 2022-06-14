import java.util.*;

class Hash {
    public static void main(String[] args){

     
        
        
    }
    public TreeSet <Integer> solution(int[] numbers){
        TreeSet<Integer> arr= new TreeSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                arr.add(numbers[i]+numbers[j]);

                
            }
        }
        return arr;
    }
    
}

