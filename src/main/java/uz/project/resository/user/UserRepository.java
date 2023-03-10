package uz.project.resository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.project.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
