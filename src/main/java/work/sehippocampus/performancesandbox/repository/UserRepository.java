package work.sehippocampus.performancesandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.sehippocampus.performancesandbox.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
