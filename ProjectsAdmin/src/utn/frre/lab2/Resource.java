package utn.frre.lab2;

abstract class Resource {
    protected int id;
    protected String name;
    protected float cost;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected abstract float getCost();

    public Resource(int id, String name, float cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
