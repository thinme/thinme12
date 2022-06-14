import java.util.HashSet;
class Hash {
    public int[] solution(int[] numbers) {
        int[] answer={};
        HashSet<Integer> arr= new HashSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]!=numbers[j]){
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        return answer;
    }
}

