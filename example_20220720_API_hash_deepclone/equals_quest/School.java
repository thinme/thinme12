package sec03.equals_quest;

public class School {
    //�ʵ�
    //private ���������� ���� Ŭ������������ ���ٰ���
    //public ��ΰ� ���ٰ���
    //default ���� ��Ű�������� ���� ����
    //protected ���� ��Ű�� + ��ӳ������� ���� ����
    //school.name= "���ؼ�" �ȵ�->privvate
    private String name;
    private int group;

    //������ Ŭ���� �̸��� ����
    //�����ε�(Ŭ������ ��Ÿ��) �������� �Ű������� ���� �پ��� Ÿ������ ����
    //�⺻������ ������(�Ű����� ����)1���� �ִ�(�Ⱥ��ϻ� ������ �Ǿ��ִ�)
    public School(String i_name, int i_group) {
        //this ���� ����� ��ü�� ��Ī> School��� Ŭ����
        //this.name= School�� �ʵ� name
        //this.group= School�� �ʵ� group
        this.name = i_name;
        this.group = i_group;

    }

    //�޼���
    //getter,setter ���� ���� ��ü�� ĸ��ȭ,������ ������̶�� ����� �޼��带 �� ���� ���ؼ�
    //�ܺο��� �ʵ尪�� �ٷ� ��ȸ�Ǵ� ������ �������ؼ� ��ü�� �����־�� �Ѵ�
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
