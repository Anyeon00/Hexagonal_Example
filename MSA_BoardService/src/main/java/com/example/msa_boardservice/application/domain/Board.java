package com.example.msa_boardservice.application.domain;

import lombok.Getter;

@Getter
public class Board {

    private Long id;

    private String title;

    private String content;

    private Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    private Board(String title, String content) {
        this.title = title;
        this.content = content;

    }
    public static Board create(Long boardId, String title, String content) {
        return new Board(boardId, title, content);
    }
    public static Board create(String title, String content) {
        return new Board(title, content);
    }
}
