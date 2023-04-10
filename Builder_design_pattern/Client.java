package Builder_design_pattern;

public class Client {
    public static void main(String[] args) {
//        Helper h = Student.getBuilder();
        Helper studentBuilder= Student.getBuilder();   // to get the helper from Student class
        Student student= studentBuilder
                .setPsp(91.08)
                .setEmail("rs@amazon.com")
                .setName("Rahuls")
                .setAge(27)
                .build();
//        Student k=new Student(name,email,psp,age);
        System.out.println(student);

//        Helper h=new Helper();
//        h.setAge(28);
//        h.setName("Rahul");
//        h.setPhone("9958084744");
//        h.setEmail("rahulsankla05@gmail.com");
//        h.setPsp(98.30);

//       Student s= new Student(h);

    }


}
