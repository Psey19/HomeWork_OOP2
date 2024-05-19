public class Human extends Actor {
    @Override
    String getName() {
        return super.name;
    }

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {

    }

    @Override
    public void setTakeOrder(boolean takeOrder) {

    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
