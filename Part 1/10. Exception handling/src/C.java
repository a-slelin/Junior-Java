public class C extends Exception {
    private int detail;

    C(int detail){
        this.detail = detail;
    }

    @Override
    public String toString(){
        return "Exception C with " + detail + ".";
    }
}
