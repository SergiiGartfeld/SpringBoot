package com.sda.ja.twit_demo.repository;

import com.sda.ja.twit_demo.model.Wpis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WpisRepository extends JpaRepository<Wpis, Long> {
}
