package com.educando_web.course.repositories;

import com.educando_web.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{


}
