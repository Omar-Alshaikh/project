
package com.mycompany.school;

/**
 *
         */
public class Teacher extends Suber{
    
    
    String Subject;
    int salary;

    public Teacher() {
    }

    public Teacher(String Subject, int salary, String N, String Nat, int A) {
        super(N, Nat, A);
        this.Subject = Subject;
        this.salary = salary;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return Subject;
    }

    public int getSalary() {
        return salary;
    }
    
    
    
}
