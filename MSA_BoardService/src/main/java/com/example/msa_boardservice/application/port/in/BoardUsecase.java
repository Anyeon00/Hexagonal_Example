package com.example.msa_boardservice.application.port.in;

import com.example.msa_boardservice.application.domain.Board;
import com.example.msa_boardservice.application.port.in.dto.BoardWriteInfo;

import java.util.Optional;

public interface BoardUsecase {
//    게시판 서비스 (Post Service)
//    게시글 작성, 조회, 수정, 삭제 API
//    게시글 목록 조회 API
//    데이터 저장: 게시글 관련 데이터만 저장 (e.g., posts 테이블)

    Long write(BoardWriteInfo info);

    Optional<Board> find(Long boardId);

    Long update(Long boardId, BoardWriteInfo info);

    void delete(Long boardId);
}
