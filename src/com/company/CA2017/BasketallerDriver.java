package com.company.CA2017;

import javax.swing.*;

/**
 * Created by T00036644 on 06/10/2017.
 */
public class BasketallerDriver {
    public static void main(String[] args) {
        //Basketballer player1 = new Basketballer("LeBron James", 32,2.03);
        //JOptionPane.showMessageDialog(null,player1.toString());

        String name;
        int age;
        double height;

        //create array of objects
        Basketballer [] team = new Basketballer[5];

        //hard coded Basketballer array for test purposes
        team[0]=new Basketballer("LeBron James",32,2.03);
        team[1]=new Basketballer("Michael Jordan",35,2.03);
        team[2]=new Basketballer("Larry Bird",23,2.01);
        team[3]=new Basketballer("Scottie Pipen",25,2.06);
        team[4]=new Basketballer("Charles Barkley",19,2.01);

        //System.out.println(Convert.converttofeet(2.03));
/*
        //loop to create Basketballer objects from user inputs and populate array
        for (int x=0; x<=4; x++){
            name=JOptionPane.showInputDialog("Enter Name");
            age=Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
            height=Double.parseDouble(JOptionPane.showInputDialog("Enter height in metres"));
            team[x]=new Basketballer(name, age, height);
        }  */


        //invoke method to display team
        display(team);
        display2(team);
        display3(team);

        //invoke method to return the tallest player
        Basketballer tallestPlayer= selectTallestPlayer(team);

        System.out.println(tallestPlayer.toString1());

    }


    /** Class method to return the tallest BasketBaller
     *
     * @param team an array of BasketBallers
     * @return the tallest Basketballer
     */
    private static Basketballer selectTallestPlayer(Basketballer[] team) {
        Basketballer tallestPlayer;
        tallestPlayer=team[0];
        for(Basketballer b:team){
            if (b.getHeight() > tallestPlayer.getHeight()){
                tallestPlayer=b;
            }
        }

        return tallestPlayer;

    }

    public static void display(Basketballer[] team){

        JTextArea jta = new JTextArea("Team:\n\n");
        for (int x=0; x<=4; x++){
            jta.append(team[x].toString());
        }

        JOptionPane.showMessageDialog(null,jta);

    }
    public static void display3(Basketballer[] team){

        JTextArea jta = new JTextArea("Team:\n\n");
        for (int x=0; x<=4; x++){
            jta.append(team[x].toString1());
        }

        JOptionPane.showMessageDialog(null,jta);

    }
    public static void display2(Basketballer[] team){

        JTextArea jta = new JTextArea("Team:\n\n");
        for (int x=0; x<=4; x++){
            jta.append("Name: " + team[x]. getName()+"\n");
            jta.append("Age: " + team[x]. getAge()+" years old\n");
            jta.append("Name: " + Convert.converttofeet(team[x]. getHeight())+"\n\n");
        }

        JOptionPane.showMessageDialog(null,jta);

    }



}
