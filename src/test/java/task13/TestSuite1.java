package task13;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import session14.junit.suites.TestClass1;
import session14.junit.suites.TestClass2;


    @RunWith(Suite.class)

    @Suite.SuiteClasses({

            TestClass1.class,

            TestClass2.class

    })

    public class TestSuite1 {

    }

