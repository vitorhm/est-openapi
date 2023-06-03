package br.com.example.estopenapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Error", description = "Error Schema")
public class ErrorDto {

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
