
package com.mycompany.school;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class quez {
    public String question;
    public ArrayList<String>choices;
    public String answer;
    public  quez(String question, String[]choices,String answer){
        this.question = question;
        this.choices = new ArrayList<String>();
        for (int i = 0; i<choices.length;i++){
            this.choices.add(choices[i]);
            
        }
    Collections.shuffle(this.choices);
    this.answer = answer;
    
    }
    public String getQuestion(){
    return question;
    }
    public ArrayList <String> getChoices(){
    return choices;
    }
    public String getAnswer(){
    return answer;
    }

    }


