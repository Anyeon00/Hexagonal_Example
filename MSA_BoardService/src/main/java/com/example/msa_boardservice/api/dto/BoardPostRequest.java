package com.example.msa_boardservice.api.dto;

public record BoardPostRequest(
        String title,
        String content
) {
}
