public class D {
    public static void main(String[] args) {
        int month = 4;
        String season;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summery";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                throw new RuntimeException("Doesn't exist");
        }

        System.out.println("April is " + season + ".");
    }
}
