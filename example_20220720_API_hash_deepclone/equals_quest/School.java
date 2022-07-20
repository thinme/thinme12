package sec03.equals_quest;

public class School {
    //필드
    //private 접근제한자 같은 클래스내에서만 접근가능
    //public 모두가 접근가능
    //default 같은 패키지내에서 접근 가능
    //protected 같은 패키지 + 상속내에서만 접근 가능
    //school.name= "이준석" 안됨->privvate
    private String name;
    private int group;

    //생성자 클래스 이름과 동일
    //오버로딩(클래스의 스타일) 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는)1개는 있다(안보일뿐 생성은 되어있다)
    public School(String i_name, int i_group) {
        //this 제일 가까운 객체를 지칭> School라는 클래스
        //this.name= School의 필드 name
        //this.group= School의 필드 group
        this.name = i_name;
        this.group = i_group;

    }

    //메서드
    //getter,setter 쓰는 이유 객체의 캡슐화,데이터 입출력이라는 기능의 메서드를 잘 쓰기 위해서
    //외부에서 필드값을 바로 조회또는 수정을 막기위해서 객체는 닫혀있어야 한다
    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setGroup(int i_group) {
        this.group = i_group;
    }

    public void setName(String i_name) {
        this.name = i_name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof School) {
            School School_1 = (School) obj;
            if (group == School_1.getGroup() && name.equals(School_1.getName())) {
                return true;
            }
        }
        return false;
    }
}
