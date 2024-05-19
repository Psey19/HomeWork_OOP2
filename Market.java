import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> actorList = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошёл в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " покинул магазин");
            actorList.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorList.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actorList) {
            if (!actor.isMakeOrder()) {
                actor.isMakeOrder = true;
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actorList) {
            if (actor.isMakeOrder()) {
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseQueue = new ArrayList<>();
        for (Actor actor : actorList) {
            if (actor.isTakeOrder()) {
                releaseQueue.add(actor);
                System.out.println(actor.getName() + " покинул очередь");
            }
        }
        releaseFromMarket(releaseQueue);
    }
}
