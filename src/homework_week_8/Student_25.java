package homework_week_8;

class Student_25 {

    int id;
    String name;
    int age;

    Student_25(int i,String n){
        id=i;
        name=n;
    }
    Student_25(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }

    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student_25 s1= new Student_25(111,"Karan");
        Student_25 s2= new Student_25(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
