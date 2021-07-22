package com.getJob.onlinebookstrore.repo;

import com.getJob.onlinebookstrore.model.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepo extends JpaRepository<book,Long> {
}
