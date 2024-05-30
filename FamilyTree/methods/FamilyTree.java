package HW.familyTree.FamilyTree.methods;

import HW.familyTree.FamilyTree.HumanInfo.Human;
import HW.familyTree.FamilyTree.enums.Gender;
import HW.familyTree.FamilyTree.enums.Relation;
import java.util.*;

public class FamilyTree {

    private HashMap<Integer, Human> humans;
    private static Human human;
    private List<Human> familyList;
    private  Relation relation;
    private int count = 1;

    public FamilyTree() {
        humans = new HashMap<>();
        this.familyList = new ArrayList<>();
    }

    public Human addHuman(int id,
                          String firstname,
                          String middlename,
                          String lastname,
                          Gender gender,
                          Relation. Type relation
                          ) {
        while (humans.containsKey(count))
        count++;
        Human human = new Human(count, firstname, middlename, lastname, gender, relation);
        humans.put(count, human);
        return human;
    }
//    Поиск человека по ID
    public Human findHumanById(int idHuman) {
        for (Human human: humans.values()) {
            if(Objects.equals(human.getId(), idHuman)) {
                return human;
            }
        }
        return null;
    }

//    Удаление записи в древе
    public Human removeHuman(int id) {
        humans.remove(id);
        return human;
    }

//    Возвращаем список персон
    public HashMap<Integer, Human> getHumans() {
        return humans;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи: \n");
        for (Human human: humans.values()) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
