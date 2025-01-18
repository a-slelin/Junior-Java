public class D extends Exception {
    private String someData;

    public D(){
      super();
      someData = "";
    }

    public D(String message) {
      super(message);
      someData = "";
    }

    public D(String message, String someData){
      super(message);
      this.someData = someData;
    }


    public D(String message, String someData, Throwable cause){
      super(message, cause);
      this.someData = someData;
    }


}
