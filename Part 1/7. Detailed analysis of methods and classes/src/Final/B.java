package Final;

final class B {
    private int intValue;
    final private String stringValue;

    B(int intValue, String stringValue){
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    void setIntValue(int intValue) {
        this.intValue = intValue;
    }

//    void setStringValue(String stringValue){
//        this.stringValue = stringValue;
//    }
}

//class NewClass extends MyClass {
//
//}