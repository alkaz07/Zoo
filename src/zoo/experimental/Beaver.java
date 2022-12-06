package zoo.experimental;

public class Beaver {
    String name;
    String breed;
    static final String [] allColors = { "������", "������" , "����������", "�����", "���������" }; //����� ��� ���� ������ � �� ��������
    String color;

    public Beaver (String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;

    }

    public void action() {
        System.out.println(name + "���� �������");
    }

    public void getVoice() { //
        System.out.println(name);
        say();
    }

    public void say() {
        System.out.println("��� ��� ������?");
    }
    public void buildPlotina  ()
    {
        if(color.equals("������") || color.equals("����������")||color.equals("���������"))
            System.out.println(color + " " + name +"����� ��������� �������");
        else
            System.out.println(name + " �� ����� ������� ������� "+ breed);
    }
}




