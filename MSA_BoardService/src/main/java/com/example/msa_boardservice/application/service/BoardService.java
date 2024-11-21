package com.example.msa_boardservice.application.service;

import com.example.msa_boardservice.application.port.out.BoardRepository;
import com.example.msa_boardservice.application.domain.Board;
import com.example.msa_boardservice.application.port.in.BoardUsecase;
import com.example.msa_boardservice.application.port.in.dto.BoardWriteInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService implements BoardUsecase {

    private final BoardRepository boardRepository;

    @Override
    @Transactional
    public Long write(BoardWriteInfo info) {
        Long save = boardRepository.save(
                Board.create(info.title(), info.content()));
        return save;
    }

    @Override
    public Optional<Board> find(Long boardId) {
        return boardRepository.findById(boardId);
    }

    @Override
    @Transactional
    public Long update(Long boardId, BoardWriteInfo info) {
        return boardRepository.update(boardId, info);
    }

    @Override
    @Transactional
    public void delete(Long boardId) {
        boardRepository.delete(boardId);
    }
}
