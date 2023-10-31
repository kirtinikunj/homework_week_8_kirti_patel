package encapsulations_26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj =new Encapsulate();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollno(51);
        System.out.println("Prime's name : "+obj.getName());
        System.out.println("Prime's age : "+obj.getAge());
        System.out.println("Prime's rollno : "+obj.getRollno());
    }
}
