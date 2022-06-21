package slimeLand;
import java.util.Random;

public class redslime {
    //필드값 (슬라임의 hp, att,)
    public String name;
    public int hp;
    public int att;
    public boolean isLive=true;
    public Random random= new Random();

    //레드슬라임 생성자( 슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체만들기)
    public redslime(String input_name, int input_hp, int input_att){
        this.name= "레드 슬라임";
        this.hp = 25;
        this.att = random.nextInt(20);
    }
    public void dmg(int dmg) {
        this.hp = this.hp-dmg;
        System.out.println(this.name+"은" + dmg +"의 공격을 받았습니다.");
    }

    public int att() {
        System.out.println(this.name+"은"+att+"의 공격을 가했습니다.");
        return this.att;
    }

    public void checkHp() {
        if(this.hp<1){
        System.out.println(this.hp+"가 0이되어"+this.name+"이 처치되었습니다.");
        this.isLive=false;
        this.hp=0;
        }
        

    }
    public void info() {
        System.out.println("앗"+this.name+"등장했다.");
    }
}
