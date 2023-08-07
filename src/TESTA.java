class TESTA {
    public static void main(String[] args) {
//        A a = new A();
//        A.B b = a.new B();
//
//        a.i=3;
//        b.j=4;
//        int result = b.funB();
//        System.out.println(result);
        AIMP al = new AIMP();
//        A a = al;

        B b = new B();
//        b.fun(new A()  {
//            @Override
//            public void doSomeThing() {
//                System.out.println("niming do");
//            }
//        });
        b.fun(al);

    }
}
