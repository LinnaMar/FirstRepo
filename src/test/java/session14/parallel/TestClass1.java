package session14.parallel;

import org.junit.Test;

public class TestClass1 {

    @Test
    public void sleep5sec_1 () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test51");
    }

    @Test
    public void sleep5sec_2 () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test52");
    }

    @Test
    public void sleep5sec_3 () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test53");
    }

    @Test
    public void sleep5sec_4 () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test54");
    }

    @Test
    public void sleep5sec_5 () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test55");
    }
}

