package com.gour.priyanshu.dao;

import java.util.List;

import com.gour.priyanshu.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {
	// R.T findByVariableNameCondition(params)
	
	//select * from booktab where bauth=?
	List<Book> findByAuthor(String authorName);
}
