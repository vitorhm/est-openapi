package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.dto.AuthorizationResponseDto;
import br.com.example.estopenapi.dto.SignUpRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Tag(name = "Autorização de usuário", description = "Criação e autorização de usuário")
@SecurityRequirements({})
public class AuthorizationController {

    @Operation(summary = "Cadastra um usuário")
    @PostMapping("/signup")
    public ResponseEntity<AuthorizationResponseDto> signUp(@RequestBody SignUpRequestDto signUpRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Autoriza um usuário")
    @PostMapping("/authorize")
    public ResponseEntity<AuthorizationResponseDto> authorize(@RequestBody SignUpRequestDto signUpRequestDto) {
        return ResponseEntity.ok(
                AuthorizationResponseDto.builder()
                        .accessToken(UUID.randomUUID().toString())
                        .build()
        );
    }

}
