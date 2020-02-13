package service;

import data.Member;
import data.MembersGroup;

import java.util.*;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups    группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
      /*  Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        } */

        return groups
                .stream()
                .filter((membersGroup -> membersGroup.getMembers()
                        .stream()
                        .allMatch(member -> member.getAge()>targetAge)))
                .collect(Collectors.toMap(MembersGroup::getGroupName, MembersGroup::getMembers))
                .keySet();

    }


}
