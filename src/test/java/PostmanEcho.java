import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {

    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
                 given()
                .baseUri("https://postman-echo.com")
                .body("123") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("123"));
    }
}
