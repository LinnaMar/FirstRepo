package session14.junit.suites;

import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TestClass1 {

    @Test
    public void suite1Test1() {
        System.out.println("suite1_test1");
    }

    @Test
    public void suite1Test2() {
        System.out.println("suite1_test2");
    }

    @Test
    public void suite1Test5() {
        fail("This test is supposed to fail");
    }
}
