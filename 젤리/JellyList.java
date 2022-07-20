public interface JellyList {

    String[] JellyList={"mango", "grape", "apple"};

    static  String[] viewJellyList(){
        for(int i=0; i>JellyList.length; i++){
            System.out.println("젤리목록을 출력합니다.");
            System.out.println(i+"번째 젤리는" +JellyList+"입니다.");

        }
        return  JellyList;
    }
}
