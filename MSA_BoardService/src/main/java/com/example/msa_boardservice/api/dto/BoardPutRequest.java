package com.example.msa_boardservice.api.dto;

public record BoardPutRequest(
        String title,
        String content
) {
}
