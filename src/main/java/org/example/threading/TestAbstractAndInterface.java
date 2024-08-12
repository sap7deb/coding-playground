package org.example.threading;

public class TestAbstractAndInterface extends TestAbstract implements TestInterface{
//    @Override
//    public void test2() {
//        System.out.println("Child Test 2");
//    }

    @Override
    public void testPublic(){
        super.testPublic();
        System.out.println("Child Public");
    }
    @Override
    public void test() {
       // TestInterface.super.test();
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        TestAbstract anInterface = new TestAbstractAndInterface();
      //  anInterface.test();
       // anInterface.test2();
        anInterface.testPublic();
    }
}
