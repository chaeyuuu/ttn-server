package com.ttn.demo.domain.letter.dao;

import com.ttn.demo.domain.letter.domain.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterRepository extends JpaRepository<Letter, Long> {
}
