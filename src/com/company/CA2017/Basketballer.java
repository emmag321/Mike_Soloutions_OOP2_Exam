package com.company.CA2017;

/**
 * Created by T00036644 on 06/10/2017.
 */
public class Basketballer {

    //Basketballer attributes
    private String name;
    private int age;
    private double height;

    //no argument constructor
    public Basketballer(){
        this("Unknown",0,0.0f);
    }

    //3 argument constructor
    public Basketballer(String name,int age,double height){
        setAge(age);
        setHeight(height);
        setName(name);
    }

    //toString method
    @Override
    public String toString() {
        return String.format(" Name:%20s\n Age:%12d years old\n Height:%10.2f m.\n\n",
                getName(),getAge(),getHeight());
    }

    //alternative toString method
    public String toString1() {
        return String.format("Name:%20s\nAge:%12d years old\nHeight:%20s\n\n",
                getName(),getAge(),Convert.converttofeet(getHeight()));
    }

    //accessor methods
    /** method to return the height value
     * @return the height of a basketballer object
     */
    public double getHeight() {
        return height;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }


    /** method to set the age value
     * @param age the age of a basketballer object
     */

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
