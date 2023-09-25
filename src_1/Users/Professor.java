package Users;

public class Professor extends Person {

    private String subjects[];
    
    //Constructor
    public Professor(String name, String lastName, String gender, int age) {
        super(name, lastName, gender, age);
    }    

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    
    @Override
    public String toString(){
        return (getName() + " " + getLastName());
    }
    
}
// Prueba git