package com.example.spi;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.SneakyThrows;
import org.apache.http.impl.client.CloseableHttpClient;
import org.keycloak.broker.provider.util.SimpleHttp;
import org.keycloak.component.ComponentModel;
import org.keycloak.connections.httpclient.HttpClientProvider;
import org.keycloak.models.KeycloakSession;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsersHttp {

    private final CloseableHttpClient httpClient;
    private final String baseUrl;
    private final String basicUsername;
    private final String basicPassword;

    public UsersHttp(KeycloakSession session, ComponentModel model)
    {
        this.httpClient = session.getProvider(HttpClientProvider.class).getHttpClient();
        this.baseUrl = model.get(Constants.BASE_URL);
        this.basicUsername = model.get(Constants.AUTH_USERNAME);
        this.basicPassword = model.get(Constants.AUTH_PASSWORD);
    }

    @GET
    @SneakyThrows
    public List<User> getList(@QueryParam("search") String search, @QueryParam("first") Integer first, @QueryParam("max") Integer max)
    {
        String url = baseUrl+"/getList";
        SimpleHttp simpleHttp = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword)
                .param("first", String.valueOf(++first))
                .param("max", String.valueOf(max));
        if (search != null) {
            simpleHttp.param("search", search);
        }
        return simpleHttp.asJson(new TypeReference<>() {});
    }

    @GET
    @Path("/count")
    @SneakyThrows
    public Integer getCount()
    {
        String url = baseUrl+"/getCount";
        String count = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asString();
        return Integer.valueOf(count);
    }

    @GET
    @Path("/{id}")
    @SneakyThrows
    public User getOneById(@PathParam("id") String id)
    {
        String url = baseUrl+"/getOneById/"+id;
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        return response.asJson(User.class);
    }

    @SneakyThrows
    public User getOneByCode(String code)
    {
        String url = baseUrl+"/getOneByCode/"+code;
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        return response.asJson(User.class);
    }

    @SneakyThrows
    public User getOneByName(String name)
    {
        String url = baseUrl+"/getOneByName/"+name;
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        return response.asJson(User.class);
    }
}
