package HW.familyTree.FamilyTree.enums;



public class Relation {
    public enum Type {
        Spouses,
        Child,
        Divorced
    }

    private int id1, id2;
    private Type type;

    public Relation(int id0, int id1, Type type) {
        this.id1 = id1;
        this.id2 = id2;
        this.type = type;
    }

    public int getId1() {
        return id1;
    }

    public int getId2() {
        return id2;
    }

    public Type getType() {
        return type;
    }

    public Object selectRelation() {
        Relation.Type type = Type.Spouses;
        if (id1 == 0) {
            type = Type.Child;
        }
        return new Relation(id1, id2, type);
    }
}


