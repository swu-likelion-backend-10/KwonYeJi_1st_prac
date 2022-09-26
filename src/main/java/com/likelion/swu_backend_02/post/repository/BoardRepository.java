package com.likelion.swu_backend_02.post.repository;

import com.likelion.swu_backend_02.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByNameContaining(String keyword);
}
