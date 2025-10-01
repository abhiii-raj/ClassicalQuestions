public class MeetingRooms2 {
    public static void main(String[] args) {
        int meet[][] = { { 0, 3}, { 5, 10 }, { 15, 20 } }; // si < ei
        // int meet[][] = { { 0, 11 }, { 8, 10 } };

        int end = meet[0][1];
        int count = 1;

        for (int i = 1; i < meet.length; i++) {
            if (meet[i][0] >= end) {
                // same room mein accomodate ho jayenge.
                end = meet[i][1];
            } else if (meet[i][0] < end) {
                count++;
                end = meet[i][1];
            }
        }

        System.out.println(count);
    }
}
