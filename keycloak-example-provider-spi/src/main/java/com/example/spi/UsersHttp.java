package com.example.spi;

import com.fasterxml.jackson.core.type.TypeReference;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.impl.client.CloseableHttpClient;
import org.keycloak.broker.provider.util.SimpleHttp;
import org.keycloak.component.ComponentModel;
import org.keycloak.connections.httpclient.HttpClientProvider;
import org.keycloak.models.KeycloakSession;

import java.util.List;
import java.util.UUID;

@Slf4j
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsersHttp
{

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
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getList";
        log.debug("[{}] [{}] Http Request ==> search: {}, first: {}, max: {}", traceId, url, search, first, max);
        SimpleHttp simpleHttp = SimpleHttp
                .doGet(url, httpClient)
                .authBasic(basicUsername, basicPassword)
                .socketTimeOutMillis(30000)
                .param("first", String.valueOf(first))
                .param("max", String.valueOf(max))
                ;
        if (search != null) {
            simpleHttp.param("search", search);
        }
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, simpleHttp.asString());
        return simpleHttp.asJson(new TypeReference<>() {});
    }

    @GET
    @Path("/count")
    @SneakyThrows
    public Integer getCount()
    {
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getCount";
        log.debug("[{}] [{}] Http Request ==> ", traceId, url);
        String count = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asString();
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, count);
        return Integer.valueOf(count);
    }

    @GET
    @Path("/{id}")
    @SneakyThrows
    public User getOneById(@PathParam("id") String id)
    {
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getOneById/"+id;
        log.debug("[{}] [{}] Http Request ==> id: {}", traceId, url, id);
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, response.asString());
        return response.asJson(User.class);
    }

    @SneakyThrows
    public User getOneByCode(String code)
    {
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getOneByCode/"+code;
        log.debug("[{}] [{}] Http Request ==> code: {}", traceId, url, code);
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, response.asString());
        return response.asJson(User.class);
    }

    @SneakyThrows
    public User getOneByName(String name)
    {
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getOneByName/"+name;
        log.debug("[{}] [{}] Http Request ==> name: {}", traceId, url, name);
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, response.asString());
        return response.asJson(User.class);
    }
    @SneakyThrows
    public User getOneByCodeOrName(String codename)
    {
        String traceId = UUID.randomUUID().toString();
        String url = baseUrl+"/getOneByCodeOrName/" + codename;
        log.debug("[{}] [{}] Http Request ==> codename: {}", traceId, url, codename);
        SimpleHttp.Response response = SimpleHttp.doGet(url, httpClient).authBasic(basicUsername, basicPassword).asResponse();
        if (response.getStatus() == 404) {
            throw new WebApplicationException(response.getStatus());
        }
        log.debug("[{}] [{}] Http Response <== {}", traceId, url, response.asString());
        return response.asJson(User.class);
    }
}
