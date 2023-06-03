package br.com.example.estopenapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "AuthorizationResponse")
public class AuthorizationResponseDto {

    private String accessToken;

    public AuthorizationResponseDto(String accessToken) {
        this.accessToken = accessToken;
    }

    public AuthorizationResponseDto() {

    }

    private AuthorizationResponseDto(Builder builder) {
        setAccessToken(builder.accessToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationResponseDto copy) {
        Builder builder = new Builder();
        builder.accessToken = copy.getAccessToken();
        return builder;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    public static final class Builder {
        private String accessToken;

        private Builder() {
        }

        public Builder accessToken(String val) {
            accessToken = val;
            return this;
        }

        public AuthorizationResponseDto build() {
            return new AuthorizationResponseDto(this);
        }
    }
}
