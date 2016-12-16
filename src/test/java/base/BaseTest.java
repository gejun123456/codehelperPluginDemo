package base;

import com.codehelper.App;
import com.google.gson.Gson;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bruce.ge on 2016/12/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class BaseTest {
    private static Gson gson = new Gson();

    public static void printToJson(Object o){
        System.out.println(gson.toJson(o));
    }
}
