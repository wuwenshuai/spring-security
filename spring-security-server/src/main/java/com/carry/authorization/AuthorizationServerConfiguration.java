package com.carry.authorization;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //配置客户端
        clients.
                inMemory()//使用内存设置
                .withClient("client")//client_id
                .secret("secret")//client_secret
                .authorizedGrantTypes("authorization_code")//授权类型
                .scopes("app")//授权范围
                .redirectUris("http://www.funtl.com");
    }
}
