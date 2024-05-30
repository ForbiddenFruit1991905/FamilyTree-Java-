package HW.familyTree.FamilyTree.methods;

import HW.familyTree.FamilyTree.HumanInfo.Human;
import java.util.*;

public class FamilyTree {
    private Human human;
    private List<Human> familyList;

    public FamilyTree() {
        this.familyList = new ArrayList<>();
    }

//    Запись о новом члене семьи
    public void addHuman(Human human) {
        familyList.add(human);
    }

//    Поиск человека по ID
    public Human findHumanById(int idHuman) {
        for (Human human: familyList) {
            if(Objects.equals(human.getId(), idHuman)) {
                return human;
            }
        }
        return null;
    }

//    Удаление записи в древе
    public Human removeHuman(int id) {
        familyList.remove(id-1);
        return human;
    }

//    Возвращаем список персон
    public List<Human> getFamilyList() {
        return familyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи: \n");
        for (Human human: familyList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
