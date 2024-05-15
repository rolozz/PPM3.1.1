package ru.javamentor.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javamentor.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
