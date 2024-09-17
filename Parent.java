class Parent {
    int salary= 10000;

    void ComapanyName(){
        System.out.println("Comapny Name is: Company A");
    }
}
class Child extends Parent {
    int benefits = 1000000;

    void    DepartmentName(){
        System.out.println("Department is: IT Department ");
    }
}
class InheritanceDemo{
    public static void main(String[] args){
        Child child = new Child();
        child.ComapanyName();
        child.DepartmentName();
        System.out.println("Salary: " + child.salary);
        System.out.println("Benefits: " + child.benefits);
    }

}
