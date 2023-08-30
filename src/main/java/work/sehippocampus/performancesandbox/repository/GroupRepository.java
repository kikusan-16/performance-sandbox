package work.sehippocampus.performancesandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.sehippocampus.performancesandbox.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByGroupName(String groupName);
}