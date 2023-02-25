
package com.mycompany.school;

/**
 *
 * @author Omar
 */
public class Student extends Suber{
    
    int ID;
    int Level;
    int GBA;

    public Student() {
    }

    public Student(int Id, int Lvl, int gba, String N, String Nat, int A) {
        super(N, Nat, A);
        ID = Id;
        Level = Lvl;
        GBA = gba;
    }

    public void setID(int Id) {
        ID = Id;
    }

    public void setLevel(int Lvl) {
        Level = Lvl;
    }

    public void setGBA(int gba) {
        GBA = gba;
    }

    public int getID() {
        return ID;
    }

    public int getLevel() {
        return Level;
    }

    public int getGBA() {
        return GBA;
    }
    
    
    
    
}
