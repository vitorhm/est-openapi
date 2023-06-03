package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.dto.ProdutoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@Tag(name = "Gerenciamento de produtos", description = "Gerenciamento de produtos")
public class ProdutosController {

    @Operation(summary = "Cadastra um produto")
    @PostMapping
    public ResponseEntity<ProdutoDto> cadastro(@RequestBody ProdutoDto cadastroDto) {

        return ResponseEntity.ok(cadastroDto);
    }

    @Operation(summary = "Busca um produto")
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> get(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Deleta um produto")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

}
