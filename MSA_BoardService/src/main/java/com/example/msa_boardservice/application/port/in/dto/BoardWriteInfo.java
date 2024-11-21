package com.example.msa_boardservice.application.port.in.dto;

public record BoardWriteInfo(
        String title,
        String content
) {
    public static BoardWriteInfo create(String title, String content) {
        return new BoardWriteInfo(title, content);
    }
}
