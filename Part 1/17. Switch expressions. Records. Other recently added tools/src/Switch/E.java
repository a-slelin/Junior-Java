package Switch;

public class E {
    public static void main(String[] args){
        boolean flag;
        int eventCode = 9300;

        int priorityLevel = switch (eventCode){
            case 1000, 1205, 8900 -> {
                flag = false;
                yield 1;
            }
            case 2000, 6010, 9128 -> {
                flag = false;
                yield 2;
            }
            case 1002, 7023, 9300 -> {
                flag = true;
                yield 3;
            }
            default -> {
                flag = false;
                yield 0;
            }
        };


        System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
        if(flag) System.out.println("Опасность");
    }
}
