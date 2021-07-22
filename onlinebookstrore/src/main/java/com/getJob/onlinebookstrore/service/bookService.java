package com.getJob.onlinebookstrore.service;

import com.getJob.onlinebookstrore.model.book;
import com.getJob.onlinebookstrore.repo.bookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class bookService {
    private final bookRepo brepo;

    @Autowired
    public bookService(bookRepo brepo) {
        this.brepo = brepo;
    }

//    public book addBook(book bk){
//        return brepo.save(bk);
//    }
//
//    public List<book> findAllBook(){
//        return brepo.findAll();
//    }

}
