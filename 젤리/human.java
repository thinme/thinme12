public class human {
    public  String humanName;
    public  String JellyName;

    human(){
        this.humanName=" 알 수 없는";
    }

    human(String input_humanName){
        this.humanName=input_humanName;
    }
    public void eat() {
        System.out.println(this.humanName+" 이(가)" + this.JellyName+" 을 먹습니다.");
    }


}
