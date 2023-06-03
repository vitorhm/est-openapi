package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.dto.ClientRequestDto;
import br.com.example.estopenapi.dto.ClientResponseDto;
import br.com.example.estopenapi.dto.ErrorDto;
import br.com.example.estopenapi.exception.CustomException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@Tag(name = "Gerenciamento de clientes", description = "Gerenciamento de clientes")
public class ClientController {

    @Operation(summary = "Cadastra um cliente")
    @PostMapping(produces = "application/json")
    public ResponseEntity<ClientResponseDto> add(@Valid @RequestBody ClientRequestDto usuarioDto) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Deleta um cliente")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Busca um cliente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class)))
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<ClientResponseDto> get(@PathVariable Long id) {

        if (id > 0) {
            throw new CustomException("Teste");
        }

        return ResponseEntity.ok().build();
    }

}
