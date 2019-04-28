package max.com;

public class FruitJava {
    String fruitName;
    String description;

    @Override
    public String toString() {
        return "FruitJava(" + fruitName + "," + description + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FruitJava) {
            FruitJava another = (FruitJava) obj;
            return fruitName.equals(another.fruitName) && description.equals(another.description);
        }
        return false;
    }
}
