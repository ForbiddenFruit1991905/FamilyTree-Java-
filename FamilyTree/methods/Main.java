package HW.familyTree.FamilyTree.methods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import HW.familyTree.FamilyTree.HumanInfo.Human;
import HW.familyTree.FamilyTree.enums.Gender;
import HW.familyTree.FamilyTree.enums.Relation;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();

        Human person1 = new Human(1, "Firstname_1_1", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Spouses);
        familyTree.addHuman(person1 );
        Human person2 = new Human(2, "Firstname_1_2", "Middlename_1_2", "Lastname_1", Gender.Female, Relation.Type.Spouses);
        familyTree.addHuman(person2);
        Human person3 = new Human(3, "Firstname_2_1", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Spouses);
        familyTree.addHuman(person3);
        Human person4 = new Human(4, "Firstname_2_2", "Middlename_2_2", "Lastname_2", Gender.Female, Relation.Type.Spouses);
        familyTree.addHuman(person4);
        Human person5 = new Human(5, "Firstname_3", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Divorced);
        familyTree.addHuman(person5);
        Human person6 = new Human(6, "Firstname_4", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
        familyTree.addHuman(person6);
        Human person7 = new Human(7, "Firstname_5", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
        familyTree.addHuman(person7);
        Human person8 = new Human(8, "Firstname_6", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Child);
        familyTree.addHuman(person8);
        Human person9 = new Human(9, "Firstname_7", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Child);
        familyTree.addHuman(person9);
        Human person10 = new Human(10, "Firstname_8", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Child);
        familyTree.addHuman(person10);

        person2.addKinder(person6);
        person4.addKinder(person7);
        person4.addKinder(person8);
        person4.addKinder(person9);
        person6.addKinder(person10);

        try {
            familyTree.saveToFile("tree.txt");
            System.out.println("Семейное древо сохранено.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FamilyTree loadedFamilyTree = FamilyTree.loadFromFile("tree.txt");
            System.out.println("Произведена выгрузка семейного древа \n" + loadedFamilyTree);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            getCommands();
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Укажите id:");
                String id = String.valueOf(Integer.parseInt(scanner.nextLine()));
                System.out.println("Укажете имя:");
                String firstname = scanner.nextLine();
                System.out.println("Укажете отчество:");
                String middlename = scanner.nextLine();
                System.out.println("Укажете фамилию:");
                String lastname = scanner.nextLine();
                System.out.println("Введите Male или Female");
                Gender gender = Gender.valueOf(scanner.nextLine());
                System.out.println("Укажите тип родственной связи Spouses/Child/Divorced:");
                Relation.Type relation = Relation.Type.valueOf(scanner.nextLine());
                System.out.println("Запись внесена в семейное древо ---> " + " id: " + id + ", имя: " + firstname + ", отчество: " + middlename + ", фамилия: " + lastname + ", пол: " + gender + ", семейная связь: " + relation);
                familyTree.addHuman(new Human(Integer.parseInt(id), firstname, middlename, lastname, gender, relation));
                try {
                    familyTree.saveToFile("tree.txt");
                    System.out.println("Семейное древо сохранено.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    FamilyTree loadedFamilyTree = FamilyTree.loadFromFile("tree.txt");
                    System.out.println("Произведена выгрузка семейного древа \n" + loadedFamilyTree);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else if (command.equals("2")) {
                System.out.println(familyTree);
            } else if (command.equals("3")) {
                System.out.println("Введите ID: ");
                int input = scanner.nextInt();
                System.out.println(familyTree.findHumanById(input));
            } else if (command.equals("4")) {
                System.out.println("Введите ID для удаления: ");
                int del_human = scanner.nextInt();
                familyTree.removeHuman(del_human);
                System.out.println("Запись удалена");
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Такой команды нет");
            }
        }
        scanner.close();

////           Сохранение дерева в файл
//        try {
//            familyTree.saveToFile("tree.txt");
//            System.out.println("Семейное древо сохранено.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        Загрузка дерева из файла
//        try {
//            FamilyTree loadedFamilyTree = FamilyTree.loadFromFile("tree.txt");
//            System.out.println("Произведена выгрузка семейного древа \n" + loadedFamilyTree);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }

    private static void getCommands() {
        System.out.println("Выберите из списка необходимую комманду: ");
        System.out.println("1 - добавить запись в семейное древо");
        System.out.println("2 - показать весь список");
        System.out.println("3 - найти человека по ID");
        System.out.println("4 - удалить запись из семейного древа");
        System.out.println("quit - выход из приложения");
    }
}


