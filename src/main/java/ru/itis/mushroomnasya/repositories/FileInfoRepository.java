package ru.itis.mushroomnasya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.mushroomnasya.models.FileInfo;

public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageFileName(String storageFileName);
}
