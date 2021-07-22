package com.getJob.onlinebookstrore.repo;

import com.getJob.onlinebookstrore.model.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel ="categories",path="book-category")
public interface bookCategoryRepo extends JpaRepository<category,Long > {


}
