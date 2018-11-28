package utn.frre.lab2;

public class Programmer extends Resource {
    @Override
    public float getCost() {
        return super.cost;
    }

    public Programmer(int id, String name, float cost) {
        super(id, name, cost);
    }
}
