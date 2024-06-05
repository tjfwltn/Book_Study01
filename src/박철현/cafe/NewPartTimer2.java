package 박철현.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NewPartTimer2 implements Barista {
    private List<String> recipe = new ArrayList<>();

    public Optional<String> makeCoffee(String requiredMenu) {
        return recipe.stream()
                .filter(menu -> menu.contains(requiredMenu))
                .findFirst();
    }
}
