package HomeWork.Part_2.lesson4.controllers;

import HomeWork.Part_2.lesson4.models.User;
import HomeWork.Part_2.lesson4.services.GroupService;

import java.util.List;

public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    public List<User> getAllUsersFromGroup(String groupTitle) {
        return groupService.getAllUsersFromGroup(groupTitle);
    }
}
