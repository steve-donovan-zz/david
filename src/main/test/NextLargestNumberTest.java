import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NextLargestNumberTest {

    @Test
    public void test() {

        assertThat(NextLargestNumber.generateNextLargestNumber(12), is(21));
        assertThat(NextLargestNumber.generateNextLargestNumber(31), is(-1));
        assertThat(NextLargestNumber.generateNextLargestNumber(35), is(53));
        assertThat(NextLargestNumber.generateNextLargestNumber(322), is(-1));
        assertThat(NextLargestNumber.generateNextLargestNumber(263), is(326));
        assertThat(NextLargestNumber.generateNextLargestNumber(777), is(-1));
        assertThat(NextLargestNumber.generateNextLargestNumber(278), is(287));
    }
}
