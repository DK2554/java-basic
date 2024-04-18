package study_class;

public class Student {
    String name;
    int age;
    int grade;
    //학생클래스에서 정의한 변수는 필드(멤버변수)

    @Override
    public String toString(){
        return "이름:"+ name + "나이"+ age + "성적"+ grade;
    }

}
