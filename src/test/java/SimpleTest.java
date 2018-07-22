import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class SimpleTest {

    @Test
    public void test1() {
        System.out.println("Test 1 works");
    }


    @Test
    public void test2() {
        System.out.println("Test 2 works");
    }


    @Test
    public void test3() {

        assertThat(1).isEqualTo(2);
    }
}