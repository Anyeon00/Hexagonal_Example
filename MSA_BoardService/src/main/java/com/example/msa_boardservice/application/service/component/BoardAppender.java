package com.example.msa_boardservice.application.service.component;

import com.example.msa_boardservice.application.domain.Board;
import com.example.msa_boardservice.application.port.out.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardAppender {

    private final BoardRepository boardRepository;

    public Long append(Board board) {
        return boardRepository.save(board);
    }
}
