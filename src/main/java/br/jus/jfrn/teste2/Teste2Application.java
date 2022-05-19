package br.jus.jfrn.teste2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan( basePackages = {"br.jus.jfrn"})
@EnableJpaRepositories({"br.jus.jfrn"})
@ComponentScan(basePackages = {"br.jus.jfrn"})
@SpringBootApplication
public class Teste2Application {

    public static void main(String[] args) {
        SpringApplication.run(Teste2Application.class, args);
    }

}
