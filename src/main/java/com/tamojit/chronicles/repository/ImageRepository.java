package com.tamojit.chronicles.repository;

import com.tamojit.chronicles.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
