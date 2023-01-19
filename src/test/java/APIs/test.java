package APIs;

import com.google.gson.Gson;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import okhttp3.*;
import org.json.JSONObject;
import org.junit.Test;
import org.testng.Assert;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class test {

    private String baseSwagUrl = "https://petstore.swagger.io/v2";
    private String basePlanetUrl = "https://swapi.dev/api";
    int jsonObjid = 0;

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(basePlanetUrl)
            .setContentType(ContentType.JSON)
            .setBasePath("/planets/1")
            .build();

    RequestSpecification requestSpecificationSwagger = new RequestSpecBuilder()
            .setBaseUri(baseSwagUrl)
            .setContentType(ContentType.JSON)
            .setBasePath("/store/order/1")
            .build();

    ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(2000L))
            .build();

    @Test
    public void restAssurTest () {

        given()
                .spec(requestSpecification)
        .when()
                .get() //ту  вместо Гет можно указать другой запрос, напр .post()
        .then()   // тут ми пишемо, що саме ми перевіряємо, напр. статус код 200
                .spec(responseSpecification)
                .body("climate", equalTo ("arid"));

    }

    @Test

    public void SimplRestAssTest () {

        given()
                .spec(requestSpecification)
        .when()
                .get()
        .then()
                .spec(responseSpecification)
                .body("residents", hasItem("https://swapi.dev/api/people/62/"));
    }

    @Test
    public void jsonObjTest () throws IOException {


        JSONObject jsonObject = new JSONObject();

       jsonObject.put ("id", jsonObjid); // вверху этого документа я указала jsonObjid = 0
        jsonObject.put ("complete", false);

        String jsonObject1 = new Gson().toJson(jsonObject); // Преобразование другого формата в джей-сон

        RequestBody requestBody = RequestBody.create(jsonObject1.getBytes(StandardCharsets.UTF_8)); // сюда передаем именно преобразованный jsonObject1 указанный строкой выше
        // Само requestBody в этом конкр.тесте мы нее используем, но надо использовать, если б мы писали запрос POST. (ниже мы юзаем ГЕТ, которій не надо прописывать)

        Request request = new Request.Builder()
                .url(baseSwagUrl + "/pet/2")
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();

        int code = response.code();
        System.out.println(response.code());
        Assert.assertEquals(code, 200);

    }


    @Test
    public void okHttpTest () throws IOException {

        Order order = new Order();
        order.setId(2);
        order.setPetId(0);
        order.setQuantity(0);
        order.setShipDate("2023-01-15T09:17:39.841Z");
        order.setStatus("placed");
        order.setComplete(true);  //  все эти данные я взяла из сваггера, из параметров

        String jsonObject = new Gson().toJson(order);

        RequestBody requestBody = RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));

        Request request = new Request.Builder()
                .url(baseSwagUrl + "/pet/2")  // конец урла, который в каждом запросе отличается, надо отделять от начала и вставлять в скобки
                //.post(requestBody) если удалить этот Пост, по уолч.идет метод Гет
               // .header("content type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();

        int code = response.code();
        System.out.println(response.code());
        Assert.assertEquals(code, 200 );

    }

    @Test
    public void okhttpUserTest () throws IOException {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put ("id", 0);
        jsonObject.put ("username", "Igor");
        jsonObject.put ("firstName", "Anna");
        jsonObject.put ("lastName", "Ino");
        jsonObject.put ("email", "mmm@gmail.com");
        jsonObject.put ("password", "123456yui");
        jsonObject.put ("phone", "123456789");
        jsonObject.put ("userStatus", 0);

/*      User user = new User();
        user.setId(0);
        user.setUsername("user1");
        user.setFirstName("Diana");
        user.setLastName("Zub");
        user.setEmail("new@new.com");
        user.setPassword("11111");
        user.setPhone("12345678");
        user.setUserStatus(0); */

        String jsonObject1 = new Gson().toJson(jsonObject);

        RequestBody requestBody = RequestBody.create(jsonObject1.getBytes(StandardCharsets.UTF_8));

        Request request = new Request.Builder()
                .url(baseSwagUrl + "/user")
                .post(requestBody)
                .build();

       OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();


        int code = response.code();
        System.out.println(response.code());
        Assert.assertEquals(code, 200);
    }

   @Test
    public void okhttpPetTest () throws IOException {

        Pet pet = new Pet();
        pet.setId (1);
        pet.setStatus("sold");

       String jsonObject = new Gson().toJson(pet);

       RequestBody requestBody = RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));

       Request request = new Request.Builder()
               .url(baseSwagUrl + "/pet/findByStatus")
               .build();

       OkHttpClient client = new OkHttpClient();

       Call call = client.newCall(request);

       Response response = call.execute();

       int code = response.code();

       System.out.println(code);
       Assert.assertEquals(code, 200);

    }

    @Test
    public void deletPetTest () throws IOException {

        Pet pet1 = new Pet();
        pet1.setId (1);

        String jsonObject = new Gson().toJson(pet1);

        RequestBody requestBody = RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));

        Request request = new Request.Builder()
                .url(baseSwagUrl + "/pet/1")
                .delete()
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute(); // эта команда связана с IOException

        int code = response.code();

        System.out.println(code);
        Assert.assertEquals(code, 200);

    }



}
