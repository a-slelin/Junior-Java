public class G {
    public static void main(String[] args) {
        int i;
        int num = 0XFFFFFFE;
        for(i = 0; i < 4; ++i){
            num <<= 1;
            System.out.println(num);
        }
    }
}
