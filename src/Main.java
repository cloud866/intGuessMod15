import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        private static Optional<String> checkGuess(int guess) {
            if (guess < 1 || guess > 5) {
                throw new IllegalStateException(); // проверяем на граничные условия
            } else {
                int result = new Random().nextInt(5) + 1; // генерируем рандом
                System.out.println(result);
                if (result == guess) { // делаем проверку
                    return Optional.of("Поздравляем! Вы угадали значение!");
                } else {
                    return Optional.empty();
                }
            }
        }
    }
}