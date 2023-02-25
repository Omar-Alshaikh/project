
package com.mycompany.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *

 */
public class test {
    
    public ArrayList<quez>questionSet;

    /**
     *
     */
    public test(){
    questionSet = new ArrayList<quez>();
    String q = "what is the capital of saudi arabia? ";
    String[]a = {"makkah","jeddah","riyadh","dmmam"};
    questionSet.add(new quez(q,a,"riyadh"));
    
    q = "5+5= ";
    a = new String []{"10","12","23","22"};
    questionSet.add(new quez(q,a,"10"));
    
    q = "100-55= ";
     a = new String []{"50","45","40","55"};
    questionSet.add(new quez(q,a,"45"));
    
    Collections.shuffle(questionSet,new Random());
            
    }
    public void start(){
    Scanner scan = new Scanner(System.in);
    int numCorrect= 0;
    
    for (int question = 0 ; question < questionSet.size();question++){
        
        System.out.println(questionSet.get(question).getQuestion());
        int numChoices = questionSet.get(question).getChoices().size();
        for (int choice = 0; choice < numChoices;choice++){
            System.out.println((choice+1)+": "+ questionSet.get(question).getChoices().get(choice));
        }
            int studentAnswer = scan.nextInt();
            ArrayList<String> choiceSet = 
                    questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (studentAnswer == correctAnswerIndex +1 ){
                numCorrect++; 
            }
            
    }
    scan.close();
        System.out.println("you got "+numCorrect+"coorect answer");
}}
