package springboot.example.usemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.example.usemysql.entity.Deparment;

@Repository
public interface DeparmentRepository extends JpaRepository<Deparment,Long> {
}
