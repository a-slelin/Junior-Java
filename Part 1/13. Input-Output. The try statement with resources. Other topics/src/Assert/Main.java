package Assert;
//Нужно внести изменения в конфигурацию

public class Main {

    public static void main(String[] args) {
        int age = 25;
        // Утверждение: возраст должен быть больше или равен 0
        assert age >= 0 : "Возраст не может быть отрицательным";

        String name = null;
        // Утверждение: имя не должно быть null
        assert name != null : "Имя не должно быть null";

        int x = 10;
        int y = 0;
        // Утверждение: деление на ноль недопустимо
        assert y != 0 : "Деление на ноль";
        int result = x / y; // Эта строка вызовет ArithmeticException, если y == 0, но assert будет сработан раньше
        System.out.println(result);
    }
}