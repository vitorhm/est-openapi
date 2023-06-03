package br.com.example.estopenapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
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
        ),
        security = {
                @io.swagger.v3.oas.annotations.security.SecurityRequirement(name = "bearerAuth")
        }
)
public class SwaggerConfiguration {
}
