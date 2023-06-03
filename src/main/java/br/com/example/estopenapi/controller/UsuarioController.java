package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.dto.UsuarioDto;
import br.com.example.estopenapi.exception.CustomException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@Tag(name = "Gerenciamento de usuarios", description = "Gerenciamento de usuários")
public class UsuarioController {

    @Operation(summary = "Cadastra um usuário")
    @PostMapping(produces = "application/json")
    public ResponseEntity<UsuarioDto> cadastro(@Valid @RequestBody UsuarioDto usuarioDto) {

        return ResponseEntity.ok(usuarioDto);
    }

    @Operation(summary = "Deleta um usuário")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Busca um usuário")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "500", content = @Content)
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<UsuarioDto> get(@PathVariable Long id) {

        if (id > 0) {
            throw new CustomException("Teste");
        }

        return ResponseEntity.ok().build();
    }

}
