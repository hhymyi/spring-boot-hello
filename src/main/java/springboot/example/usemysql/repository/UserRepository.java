package springboot.example.usemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.example.usemysql.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
