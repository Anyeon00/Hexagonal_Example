package com.example.msa_boardservice.application.port.out;

import com.example.msa_boardservice.application.domain.Board;
import com.example.msa_boardservice.application.port.in.dto.BoardWriteInfo;

import java.util.Optional;

public interface BoardRepository {

    Long save(Board board);

    Optional<Board> findById(Long boardId);

    Long update(Long boardId, BoardWriteInfo info);

    void delete(Long boardId);
}
