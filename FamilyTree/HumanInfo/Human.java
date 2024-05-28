package HW.familyTree.HumanInfo;

import HW.familyTree.enums.Gender;
import HW.familyTree.enums.Relation;

public class Human {
    // ссылки на объект
    private String firstname;
    private String lastname;
    private String middlename;
//    private List<Human> children;
//    private LocalDate birthDate;
    private Gender gender;
    private Relation.Type relation;
    private int id;
    private int id_depth; // уровень "глубины" дерева (бабушка, дедушка, мама, папа, дочь, сын)

    public Human(Gender gender) {
        this.gender = gender;
    }

    public Human(int id, String firstname, String middlename, String lastname, Gender gender, Relation.Type relation, int id_depth) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.relation = relation;
        this.id_depth = id_depth;
    }


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getId_depth() {
        return id_depth;
    }

    @Override
    public String toString() {
        return " id: " + id + ", имя: " + firstname + ", отчество: " + middlename + ", пол: " + gender + ", семейная связь: " + relation + ", глубина древа: " + id_depth /* + ", день рождения: " + birthDate */;
    }
}
