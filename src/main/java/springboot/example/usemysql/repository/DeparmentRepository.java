package springboot.example.usemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.example.usemysql.entity.Deparment;

public interface DeparmentRepository extends JpaRepository<Deparment,Long> {
}
