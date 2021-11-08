package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);

    }

    public void printNames() {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (MeetingRoom mr : meetingRooms) {
            if (isFirst) {
                isFirst = false;
            }
            else {
                sb.append(", ");
            }
            sb.append(mr.getName());
        }
        System.out.println(sb);
    }

    public void printNamesReverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            sb.append(meetingRooms.get(i).getName());
            if (i > 0) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }

    public void printEvenNames() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            sb.append(meetingRooms.get(i).getName());
            if (i < (meetingRooms.size() - 2)) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }

    private String getMeetingRoomFullString(MeetingRoom meetingRoom) {
        return meetingRoom.getName() + ": " +
                getMeetingRoomDatasString(meetingRoom);
    }

    private String getMeetingRoomDatasString(MeetingRoom meetingRoom){
        return meetingRoom.getWidth() + "m*" +
                meetingRoom.getLength() + "m, " +
                meetingRoom.getArea() + "m2";
    }

    public void printAreas() {

        for (MeetingRoom mr : meetingRooms) {
            System.out.println(getMeetingRoomFullString(mr));
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom mr : meetingRooms) {
            if (mr.getName().equals(name)) {
                System.out.println(getMeetingRoomDatasString(mr));
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom mr : meetingRooms) {
            if (mr.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(getMeetingRoomDatasString(mr));
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom mr : meetingRooms) {
            if (mr.getArea() > area) {
                System.out.println(getMeetingRoomFullString(mr));
            }
        }
    }
}
