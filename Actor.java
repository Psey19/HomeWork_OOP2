public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    String getName() {
        return null;
    }

    public Actor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
