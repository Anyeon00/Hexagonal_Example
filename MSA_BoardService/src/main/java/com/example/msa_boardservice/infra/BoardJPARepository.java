package com.example.msa_boardservice.infra;

import com.example.msa_boardservice.infra.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJPARepository extends JpaRepository<BoardEntity, Long> {
}
