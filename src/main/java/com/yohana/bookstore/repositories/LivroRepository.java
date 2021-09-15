package com.yohana.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yohana.bookstoredomain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
