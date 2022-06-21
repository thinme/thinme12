package slimeLand;
import java.util.Random;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    public int att;
    public Random random=new Random(); 

    public Warrior(String input_name, int input_hp,int input_mp, int input_att) {
        this.name = input_name;
        this.hp =input_hp;
        this.mp = input_mp;
        this.att = random.nextInt(15);

    }
    public void att_A(String input_name, int input_mp, int input_att){
        this.name = "벽력일섬";
        this.mp = this.mp-20;
        this.att = 30;
    }
    public void att_B(String input_name, int input_mp, int input_att){
        this.name = "내려찍기";
        this.mp = this.mp-15;
        this.att = 20;
    }
    public void skill(int skill){
        
    }
    public void dmg(int dmg) {
        this.hp = this.hp-dmg;
        System.out.println(this.name+"은" + dmg +"의 공격을 받았습니다.");
    }
    public int att(){
        System.out.println(this.name+"은"+att+"의 공격을 가했습니다.");
        return this.att;
    }
    
    public void info() {
        System.out.println("-----"+name+"------");
        System.out.println("hp ="+ this.hp);

    }
}
