package Builder_design_pattern;

public class Student {
    private String name;
    private String email;
    private double psp;
    private int age;
    private String phone;
//    optimised Solution using getBuilder method//
// now here we're going to define getbuilder function//
    public static Helper getBuilder(){
        return new Helper();
    }

//creating object in student class //
//    Student(Helper h){
//// Now for validations : will put some conditions if it validated then create object otherwise throw exception//
//        if (h.getAge()>100){
//            throw new IllegalArgumentException();
//        }
//        if (h.getPhone().length()<10){
//            throw new IllegalArgumentException();
//        }
// if validated then below objects will be created

//    Optimised Solution Part//
        Student(Helper h){


            this.name=h.getName();
            this.age=h.getAge();
            this.email=h.getEmail();
            this.psp=h.getPsp();
            this.phone=h.getPhone();
    }
}
