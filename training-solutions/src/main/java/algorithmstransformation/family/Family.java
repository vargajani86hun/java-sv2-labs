package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> memberList;

    public Family() {
        memberList = new ArrayList<>();
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String givenName) {
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember member : memberList) {
            if (member.getName().indexOf(givenName) > 0) {
                ages.add(member.getAge());
            }
        }
        return ages;
    }

    public void addFamilyMember(FamilyMember member) {
        memberList.add(member);
    }

    public List<FamilyMember> getMemberList() {
        return new ArrayList<>(memberList);
    }
}
