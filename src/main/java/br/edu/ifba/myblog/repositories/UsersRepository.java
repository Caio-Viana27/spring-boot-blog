package br.edu.ifba.myblog.repositories;

import br.edu.ifba.myblog.models.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

}