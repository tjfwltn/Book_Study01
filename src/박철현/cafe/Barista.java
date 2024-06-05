package 박철현.cafe;

import java.util.Optional;

public interface Barista {
    Optional<String> makeCoffee(String requiredMenu);
}
