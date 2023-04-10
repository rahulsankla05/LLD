package Builder_design_pattern;

public class Helper {
    private String name;
    private String email;
    private double psp;
    private int age;
    private String phone;
//    here we're creating "build method" in Helper class & validation params as well//
    public Student build(){
//        here replace h.get by this.get for builder//
        if (this.getAge()>100){
            throw new IllegalArgumentException();
        }
        if (this.getPhone()!=null && this.getPhone().length()<10){
            throw new IllegalArgumentException();
        }
// just pass "this" in new student object as Helper//
        return new Student(this);
    }

    public String getName() {
        return name;
    }
// replace void by Helper to call build method //
    public Helper setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Helper setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Helper setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Helper setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Helper setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
/*
BDP
 */