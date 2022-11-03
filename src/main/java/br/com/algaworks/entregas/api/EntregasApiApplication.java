package br.com.algaworks.entregas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EntregasApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntregasApiApplication.class, args);
    }

}
