
package com.mycompany.school;

/**
 *
 * @author Omar
 */
public class Suber {
    String Name ;
    String Nationalty;
    int Age;
   

    public Suber() {
        
    }

    public Suber(String N, String Nat, int A) {
        Name = N;
        Nationalty = Nat;
        Age = A;
    }

    public void setName(String N) {
        Name = N;
    }

    
    public void setNationalty(String Nat) {
        Nationalty = Nat;
    }

    public void setAge(int A) {
        Age = A;
    }

    public String getName() {
        return Name;
    }

    public String getNationalty() {
        return Nationalty;
    }

    public int getAge() {
        return Age;
    }
    
    
    
}
