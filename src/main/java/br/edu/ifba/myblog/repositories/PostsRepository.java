package br.edu.ifba.myblog.repositories;

import br.edu.ifba.myblog.models.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Post, Long> {

}