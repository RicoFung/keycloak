package com.example.client.controller;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/logout")
    public Object logout(HttpServletRequest request) throws ServletException {
        keycloakSessionLogout(request);
        tomcatSessionLogout(request);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", "true");
        result.put("data", "Logout Success!");
        return result;
    }

    private void keycloakSessionLogout(HttpServletRequest request) {
        RefreshableKeycloakSecurityContext c = getKeycloakSecurityContext(request);
        KeycloakDeployment d = c.getDeployment();
        c.logout(d);
    }

    private void tomcatSessionLogout(HttpServletRequest request) throws ServletException {
        request.logout();
    }

    private RefreshableKeycloakSecurityContext getKeycloakSecurityContext(HttpServletRequest request) {
        return (RefreshableKeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
    }
}
