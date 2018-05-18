package springboot.example.usemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.example.usemysql.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
