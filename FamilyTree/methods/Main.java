package HW.familyTree.FamilyTree;


import java.util.Scanner;

import HW.familyTree.FamilyTree.HumanInfo.FamilyTreeExampleList;
import HW.familyTree.FamilyTree.enums.Gender;
import HW.familyTree.FamilyTree.enums.Relation;
import HW.familyTree.FamilyTree.methods.FamilyTree;


public class Main {
    private static FamilyTree familyTree;

    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        FamilyTreeExampleList familyTreeList = new FamilyTreeExampleList(familyTree);
        familyTreeList.getFamilyTreeList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            getCommands();
            String command = scanner.nextLine();
            if (command.equals("2")) {
                System.out.println("Укажите id:");
                int id = scanner.nextInt();
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
                System.out.println("Укаите уникальный id 'глубины' дерева:");
                int id_depth = scanner.nextInt();
                System.out.println("Запись внесена в семейное древо ---> " + " id: " + id + ", имя: " + firstname + ", отчество: " + middlename + ", пол: " + gender + ", семейная связь: " + relation + ", глубина древа: " + id_depth);
//                familyTree.addNewHuman(id, firstname, middlename, lastname, gender, relation, id_depth);
            } else if (command.equals("1")) {
                familyTreeList.printFamilyTree();
            } else if (command.equals("4")) {
                System.out.println("Введите ID: ");
                int input = scanner.nextInt();
                System.out.println(familyTree.findHumanById(input));
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Такой команды нет");
                break;
            }
        }
    }

    private static void getCommands() {
        System.out.println("Выберите из списка необходимую комманду: ");
        System.out.println("1 - показать весь список");
        System.out.println("2 - добавить запись в семейное древо");
        System.out.println("3 - удалить запись из семейного древа");
        System.out.println("4 - найти человека по ID");
        System.out.println("quit - выход из приложения");
    }
}

