import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        //Ex3: Создание репозитория
        System.out.println("Hello from Maks");
        //Ex4: GET-запрос
        RestAssured.useRelaxedHTTPSValidation();
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}