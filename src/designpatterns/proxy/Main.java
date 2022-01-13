package designpatterns.proxy;

public class Main {

    public static void main(String[] args) {
        University university = new UniversityProxy("errado");
        System.out.println("Login Incorreto");
        System.out.println(university.getInstitutionName());
        System.out.println(university.getCourseName());
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        university = new UniversityProxy("correto");
        System.out.println("Login válido");
        System.out.println(university.getInstitutionName());
        System.out.println(university.getCourseName());
    }

}
