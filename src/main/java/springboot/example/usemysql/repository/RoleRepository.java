package springboot.example.usemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.example.usemysql.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
