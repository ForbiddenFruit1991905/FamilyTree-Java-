package HW.familyTree.FamilyTree.HumanInfo;

import HW.familyTree.FamilyTree.enums.Gender;
import HW.familyTree.FamilyTree.enums.Relation;
import HW.familyTree.FamilyTree.methods.FamilyTree;

public class FamilyTreeExampleList {
    private FamilyTree familyTree;

    public FamilyTreeExampleList(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void getFamilyTreeList() {
        Human person1 = familyTree.addHuman(1, "Firstname_1_1", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Spouses);
        Human person2 = familyTree.addHuman(2, "Firstname_1_2", "Middlename_1_2", "Lastname_1", Gender.Female, Relation.Type.Spouses);
        Human person3 = familyTree.addHuman(3, "Firstname_2_1", "Middlename_2_1", "Lastname_2", Gender.Female, Relation.Type.Spouses);
        Human person4 = familyTree.addHuman(4, "Firstname_2_2", "Middlename_2_2", "Lastname_2", Gender.Female, Relation.Type.Spouses);
        Human person5 = familyTree.addHuman(5, "Firstname_3", "Middlename_3", "Lastname_3", Gender.Female, Relation.Type.Divorced);
        Human person6 = familyTree.addHuman(6, "Firstname_4", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
        Human person7 = familyTree.addHuman(7, "Firstname_5", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
        Human person8 = familyTree.addHuman(8, "Firstname_6", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Child);
        Human person9 = familyTree.addHuman(9, "Firstname_7", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Child);
        Human person10 = familyTree.addHuman(10, "Firstname_8", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Child);
    }

    public void printFamilyTree() {
            System.out.println(familyTree);
    }
}
