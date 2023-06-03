package br.com.example.estopenapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "SignUpRequest")
public class SignUpRequestDto {

    private String email;
    private String password;

    public SignUpRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public SignUpRequestDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String email;
        private String password;

        public Builder() {
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public SignUpRequestDto build() {
            return new SignUpRequestDto(email, password);
        }


    }
}
