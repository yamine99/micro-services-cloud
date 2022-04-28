package eu.ensup.compteservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class UserRestService {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${me}")
    private String me;

    @GetMapping ("/myconfig")
    public Map<String, Object> myConfig(){

        Map<String, Object> params=new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        params.put("me", me);
        params.put("threadName", Thread.currentThread().getName());
        return params;
    }

}
