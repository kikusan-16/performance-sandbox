package work.sehippocampus.performancesandbox.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.sehippocampus.performancesandbox.model.Group;
import work.sehippocampus.performancesandbox.repository.GroupRepository;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    public Group getGroupByGroupName(String groupName) {
        return groupRepository.findByGroupName(groupName);
    }
}