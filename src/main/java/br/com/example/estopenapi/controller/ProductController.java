package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.dto.ProductDtoRequest;
import br.com.example.estopenapi.dto.ProductDtoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@Tag(name = "Gerenciamento de produtos", description = "Gerenciamento de produtos")
public class ProductController {

    @Operation(summary = "Cadastra um produto")
    @PostMapping
    public ResponseEntity<ProductDtoResponse> cadastro(@RequestBody ProductDtoRequest cadastroDto) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Busca um produto")
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDtoResponse> get(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Deleta um produto")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

}

