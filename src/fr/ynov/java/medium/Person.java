package fr.ynov.java.medium;

public class Person {

    public String name;
    public int age;
    public String gender;
    public float height;
    public float weight;
    public Nationality nationality;

    public enum Nationality {FR, DE, IT}

    public Person(String name, int age, String gender, int height, int weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void PersonInfo(){
        System.out.println(" Name: "+ name + " Age: " + age + " Gender: " + gender + " Height: " + height + " Weight: " + weight + " Nationality: " + nationality);
    }

    public static void main(String[] args){
        Person one = new Person("Nom", 18, "Femme", 160, 50, Nationality.FR);
                one.PersonInfo();
    }
}
