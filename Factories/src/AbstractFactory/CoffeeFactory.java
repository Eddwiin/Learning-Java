package AbstractFactory;

public class CoffeeFactory implements IHotDrinkFactory{
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour " + amount + " ml, add cream and sugar, enjoy!");
        return new Coffee();
    }
}
