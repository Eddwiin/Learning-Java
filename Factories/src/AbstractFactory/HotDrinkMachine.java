package AbstractFactory;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.*;

public class HotDrinkMachine {
    public enum AvailableDrink {
        Coffee, Tea
    }

    private Dictionary<AvailableDrink, IHotDrinkFactory> factories =
            new Hashtable<>();

    private List<HashMap<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() {
        Class<?> hotDrinkMachineClass = HotDrinkMachine.class;
        for (Class<?> type : hotDrinkMachineClass.getClasses()) {
            if (IHotDrinkFactory.class.isAssignableFrom(type) && !Modifier.isInterface(type.getModifiers())) {
                try {
                    Constructor<?> constructor = type.getConstructor();
                    IHotDrinkFactory instance = (IHotDrinkFactory) constructor.newInstance();
                    HashMap<String, IHotDrinkFactory> map = new HashMap();
                    map.put(type.getSimpleName().replace("Factory", ""), instance);
                    namedFactories.add(map);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public IHotDrink makeDrink() {
        System.out.println("Available drinks");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input != null
                    && input.matches("\\d+")
                    && Integer.parseInt(input) >= 0
                    && Integer.parseInt(input) < namedFactories.size()) {
                System.out.print("Specify amount: ");
                String amountInput = scanner.nextLine();
                if (amountInput != null
                        && amountInput.matches("\\d+")
                        && Integer.parseInt(amountInput) > 0) {
                    return namedFactories.get(Integer.parseInt(input)).get(input).prepare(Integer.parseInt(amountInput));
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }

}
