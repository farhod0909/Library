package com.example.library.repository;

import com.example.library.entity.MyFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileRepository extends JpaRepository<MyFileEntity, Long> {
    Optional<MyFileEntity> findByUidAndDeletedFalse(String uid);
    Boolean existsByUid(String uid);
}
