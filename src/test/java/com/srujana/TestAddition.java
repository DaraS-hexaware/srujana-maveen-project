import com.srujana.Addition;
import org.junit.Test;
public class TestAddition
{
   @Test
   public void testAdd(){
        int a=10;
        int b=20;
        Addition add =new Addition();
        int addResult =add.addition(3,4);
        System.out.println(addResult);
    }
}