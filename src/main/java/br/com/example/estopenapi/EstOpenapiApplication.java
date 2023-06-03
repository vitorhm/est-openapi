package br.com.example.estopenapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		servers = {
				@Server(
						url = "http://localhost:8080",
						description = "Servidor local"
				),
				@Server(
						url = "http://my-prod-api.com.br",
						description = "Ambiente de produção"
				)
		},
		info = @Info(
				title = "Estudo OpenAPI"
		)
)
@SpringBootApplication
public class EstOpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstOpenapiApplication.class, args);
	}

}
