package com.example.finalporject.services;

import com.example.finalporject.models.dto.CategoryDto;
import org.springframework.http.ResponseEntity;

public interface CategoryService {
    ResponseEntity<?> saveCategory(CategoryDto categoryDto);
    ResponseEntity<?> getAll();
    ResponseEntity<?> delete(Long id, boolean active);
}
