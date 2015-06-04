package com.decote.embbackend;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
	
	@Bean
    public DataSource dataSource()  {    

        URI dbUri;
        try {
            String username = "postgres";
            String password = "admin";
            String url = null;
            url = "jdbc:postgresql://localhost:5432/embriagados";
            String dbProperty = System.getenv("DATABASE_URL");
            System.out.println("Proper:"+dbProperty);
            if(dbProperty != null) {
                dbUri = new URI(dbProperty);

                username = dbUri.getUserInfo().split(":")[0];
                password = dbUri.getUserInfo().split(":")[1];
                url = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
            }     

            BasicDataSource basicDataSource = new BasicDataSource();
            basicDataSource.setUrl(url);
            basicDataSource.setUsername(username);
            basicDataSource.setPassword(password);
            return basicDataSource;

        } catch (URISyntaxException e) {
            //Deal with errors here.
        }
		return null;
    }
	

}
