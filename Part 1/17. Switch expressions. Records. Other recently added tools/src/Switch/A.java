package Switch;

public class A {
    public static void main(String[] args){
        int priorityLevel;
        int eventCode = 6010;

        switch (eventCode){
            case 1000:
            case 1205:
            case 8900:
                priorityLevel = 1;
                break;
            case 2000:
            case 6010:
            case 9128:
                priorityLevel = 2;
                break;
            case 1002:
            case 7023:
            case 9300:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 0;
        }

        System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
    }
}
