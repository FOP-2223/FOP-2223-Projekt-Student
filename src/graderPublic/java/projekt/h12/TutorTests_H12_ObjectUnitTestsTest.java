package projekt.h12;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class TutorTests_H12_ObjectUnitTestsTest {

    private Function<Integer, TestClass> testObjectFactory = TestClass::new;

    @Test
    public void testReferenceEquality() {


    }

    private static class TestClass {
        public int a;

        public TestClass(int a) {
            this.a = a;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestClass rhs)) {
                return false;
            }
            return a == rhs.a;
        }
    }

}
