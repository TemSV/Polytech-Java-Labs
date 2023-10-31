package test;

public class TestClass {
    @InvokeMethod(numberInvoking = 2)
    public void firstPublicMethod(int arg1) {
        System.out.println("firstPublicMethod that has arg " + arg1);
    }

    public void secondPublicMethod() {
        System.out.println("secondPublicMethod");
    }

    public void thirdPublicMethod() {
        System.out.println("thirdPublicMethod");
    }

    @InvokeMethod(numberInvoking = 3)
    protected void firstProtectedMethod(int arg1, int arg2) {
        System.out.println("firstProtectedMethod that has args " + arg1 + " " + arg2);
    }

    protected void secondProtectedMethod() {
        System.out.println("secondProtectedMethod");
    }

    protected void thirdProtectedMethod() {
        System.out.println("thirdProtectedMethod");
    }

    @InvokeMethod
    private void firstPrivateMethod(String str1, String str2) {
        System.out.println("FirstPrivateMethod that has args " + str1 + ' ' + str2);
    }

    private void secondPrivateMethod(String str) {
        System.out.println("secondPrivateMethod that has arg " + str);
    }
}
