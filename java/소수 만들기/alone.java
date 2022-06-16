
public class alone {

    public static void main(String[] arg){
        int[] number ={1,2,7,6,4};
        solution(number);
    }
    public static int solution(int[] nums) {
        int answer = -1;
    Allaylist<Integer> list=new Allaylist<Integer>();
    Allaylist<Integer> result=new Allaylist<Integer>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    result.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        for(int i=0; i<result.size; i++){
            int count=0;
                for(int j=1; j<=result.get(i); j++){
                    int a=list(i)%(j);
                        if(a==0){
                            count++;                          
                        }
                        if(a==2){
                            count=0;
                            list.add(result.get(i));
                        }
                         return count;
        }

    }
}
    private static int list(int i) {
        return 0;
    }
    }


