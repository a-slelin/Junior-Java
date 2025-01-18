package Switch;

public class D {
    public static void main(String[] args){
        int eventCode = 6010;

        int priorityLevel = switch (eventCode){
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0;
        };

        System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
    }
}
