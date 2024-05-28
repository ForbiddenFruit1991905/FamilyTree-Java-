package HW.familyTree.FamilyTree.methods;


import HW.familyTree.FamilyTree.HumanInfo.Human;
import HW.familyTree.FamilyTree.enums.Gender;
import HW.familyTree.FamilyTree.enums.Relation;


import java.util.*;


public class FamilyTree {
    /*
    список членов семьи ("контейнер" для людей)
    и
    методы, связанные с этип списком (добавление, поиск, вывод всего списка и т.д.)
     */
    private HashMap<Integer, Human> humans;
    private static Human human;
    private List<Human> familyList;
    private  Relation relation;
    public FamilyTree() {
        this.familyList = new ArrayList<>();
    }

    public Human addNewHuman(int id,
                           String firstname,
                           String middlename,
                           String lastname,
                           Gender gender,
                           Relation. Type relation,
                           int id_depth) {
        Human human = new Human(id, firstname, middlename, lastname, gender, relation, id_depth);
        return human;
    }

    public void addHuman(Human human) {
        familyList.add(human);
    }

    public Human findHumanById(int nameHuman) {
        for (Human human: familyList) {
            if(Objects.equals(human.getId(), nameHuman)) {
                return human;
            }
        }
        return null;
    }

    public Human getHuman(int id) {
        if (humans.containsKey(id) == false)
            return null;
        return humans.get(id);

    }
//    Возвращаем список персон
    public Collection<Human> getPersons() {
        return humans.values();
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
