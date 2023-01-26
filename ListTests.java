import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
    @Test
    public void testFilter() {

        ArrayList<String> input1 = new ArrayList<String>();

        ListExamples test = new ListExamples();

        input1.add("rice");
        input1.add("beans");
        // System.out.println(myStr1.compareTo(myStr2));
        assertEquals(ListExamples.filter(input1, test.checkString("beans")));
    }

    @Test
    public void testMerge() {
        ArrayList<String> input1 = new ArrayList<String>();
        ArrayList<String> input2 = new ArrayList<String>();

        input1.add("a");
        input1.add("b");

        input2.add("c");
        input2.add("d");
        input2.add("e");

        ArrayList<String> output = new ArrayList<String>();
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        output.add("e");

        assertEquals(ListExamples.merge(input1, input2), output);
    }
}
