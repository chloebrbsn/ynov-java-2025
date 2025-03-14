package fr.ynov.java.medium;

import java.time.Duration;
import java.util.Date;

public class Person {

    public String name;
    public int birthDate;
    public String gender;
    public float height;
    public float weight;
    public Nationality nationality;

    public enum Nationality {FR, DE, IT}

    public Person(String name, int birthDate, String gender, int height, int weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void PersonInfo(){
        System.out.println(" Name: "+ name + " Age: " + PersonAge() + " Gender: " + gender + " Height: " + height + " Weight: " + weight + " Nationality: " + nationality);
    }

    public int PersonAge(){

        Date today = new Date();
        Date birthdate = new Date(2001, 1, 1);

        int age = new Date(birthdate.getTime() - today.getTime()).getYear();
        return age;
    }

    public static void main(String[] args){
        Person one = new Person("Nom", 2001-1-1, "Femme", 160, 50, Nationality.FR);
        one.PersonAge();
        one.PersonInfo();

    }
}
