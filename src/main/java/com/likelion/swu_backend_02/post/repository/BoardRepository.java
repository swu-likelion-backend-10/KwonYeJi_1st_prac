package com.likelion.swu_backend_02.post.repository;

import com.likelion.swu_backend_02.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
