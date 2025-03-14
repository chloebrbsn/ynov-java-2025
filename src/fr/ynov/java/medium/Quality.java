package fr.ynov.java.medium;

public class Quality {

    public Integer id = 2 ;
    public String name = "first";

    public static void main(String[] args) {
        Quality q = new Quality();
        Quality q2 = new Quality();

        System.out.println(q.id == q2.id);
        System.out.println(q.name == q2.name);

        System.out.println(q.id.equals(q2.id));
        System.out.println(q.name.equals(q2.name));
    }
}
