public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Roman");
        Human human2 = new Human("Eduard");
        Human human3 = new Human("Larisa");
        Human human4 = new Human("Michael");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}
