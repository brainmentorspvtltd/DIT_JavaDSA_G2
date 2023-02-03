// ClassName it should be start with capital Letter e.g Student
// Noun e.g Student, Customer, Account, 
// Encapsulation = Binding Data and Methods into a single unit, this unit is called class.
class Student{
    // Member of a Class
    // Scope (Default Scope (with in the folder/package scope))
    // Data Hiding
    private int rollNo; // Instance Variable
    private String name;
    private boolean isValid(int rollNo){
        if(rollNo<=0){
            
           return false;
        }
        return true;
    }
    // private scope is with in the class.
    // public can be access with in and outside the package
    public void takeInput(int rollNo, String name){
        // Instance Variable = Local Variable
        //if(rollNo<=0){
            if(!isValid(rollNo)){
            System.out.println("Invalid Data");
            return ;
        }
        this.rollNo = rollNo;
        this.name = name;
    }
    public void print(){
        /*
         * this is a keyword , it hold the current calling object
         * reference
         */
        //System.out.println("Id "+this.rollNo);
        System.out.println("Id "+rollNo);
        System.out.println("Name "+name);
        System.out.println("**************************");
    }
}
public class ClassExample {
    public static void main(String[] args) {
        Student amit; // amit is a variable Student type (class)
        amit = new Student(); // Object (Instance)
        // amit.rollNo = -1001;
        // amit.name = "Amit";
        amit.takeInput(-1001,"Amit");
        amit.print();
        // System.out.println(amit.rollNo);
        // System.out.println(amit.name);
        Student shashi = new Student();
        shashi.takeInput(1002,"Shashi");
        // shashi.rollNo = 1002;
        // shashi.name = "Shashi";
        shashi.print();
        // new is a keyword to allocate a Memory

        // System.out.println(shashi.rollNo);
        // System.out.println(shashi.name);
    }
}
