package com.example.msa_boardservice.application.service;

import com.example.msa_boardservice.application.port.out.BoardRepository;
import com.example.msa_boardservice.application.domain.Board;
import com.example.msa_boardservice.application.port.in.BoardUsecase;
import com.example.msa_boardservice.application.port.in.dto.BoardWriteInfo;
import com.example.msa_boardservice.application.service.component.BoardAppender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService implements BoardUsecase {

    private final BoardRepository boardRepository;

    private final BoardAppender boardAppender;
//    private final BoardReader boardReader;
//    private final BoardUpdater boardUpdater;
//    private final BoardDeleter boardDeleter;

    @Override
    @Transactional
    public Long write(BoardWriteInfo info) {
        Long save = boardAppender.append(Board.create(info.title(), info.content()));
        return save;
    }

    @Override
    public Optional<Board> find(Long boardId) {
//        return boardReader.read(boardId);
        return boardRepository.findById(boardId);
    }

    @Override
    @Transactional
    public Long update(Long boardId, BoardWriteInfo info) {
//        return boardUpdater.update(boardId, info);
        return boardRepository.update(boardId, info);
    }

    @Override
    @Transactional
    public void delete(Long boardId) {
//        boardDeleter.delete(boardId);
        boardRepository.delete(boardId);
    }
}
