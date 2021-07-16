package colon.cancer.diagnosis.system;

public abstract class Person {
    private String name;
    private int Age;
    private char Gender;

    public Person() {
        
    }

    
    public Person(String name, int Age, char Gender) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
    }
    
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
    
    
}