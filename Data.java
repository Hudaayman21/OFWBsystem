import java.time.LocalDateTime;
import java.util.ArrayList;

public class Data {

    // === system-wide config ===
    public static LocalDateTime bookingsOpenTime;
    public static LocalDateTime bookingsCloseTime;
    public static LocalDateTime workshopStartTime;
    public static LocalDateTime workshopEndTime;
    public static int classDurationMinutes = 30;

    public static String currentState = "Dormant";

    // === app-wide data storage ===
    public static ArrayList<Participant> participants = new ArrayList<>();
    public static ArrayList<Trainer> trainers = new ArrayList<>();
    public static ArrayList<WorkshopSession> sessions = new ArrayList<>();
    public static ArrayList<Participant> canceledParticipants = new ArrayList<>();


    // === helper methods ===
    public static void addParticipant(Participant p) {
        participants.add(p);
    }

    public static void addTrainer(Trainer t) {
        trainers.add(t);
    }

    public static void addSession(WorkshopSession s) {
        sessions.add(s);
    }

    public static Participant getParticipantByEmail(String email) {
        for (Participant p : participants) {
            if (p.getEmail().equalsIgnoreCase(email)) return p;
        }
        return null;
    }

    public static Trainer getTrainerByName(String name) {
        for (Trainer t : trainers) {
            if (t.getName().equalsIgnoreCase(name)) return t;
        }
        return null;
    }

    public static int getTotalUsers() {
        return participants.size();
    }

    public static int getTotalBookings() {
        int count = 0;
        for (WorkshopSession session : sessions) {
            count += session.getBookedParticipants().size();
        }
        return count;
    }
    

public static void addCanceledParticipant(Participant p) {
    canceledParticipants.add(p);
}


    public static int getUpcomingEventsCount() {
        int count = 0;
        LocalDateTime now = LocalDateTime.now();
        for (WorkshopSession session : sessions) {
            if (session.getStartTime().toLocalDateTime().isAfter(now)) {
                count++;
            }
        }
        return count;
    }

    // ✅ print all participants
    public static void printAllParticipants() {
        if (participants.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            System.out.println("Registered Participants:");
            for (Participant p : participants) {
                System.out.println(p);
            }
        }
    }
}
