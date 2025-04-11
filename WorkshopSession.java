import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single workshop session.
 * Stores session time, trainer, trainer availability, booked participants, and logs.
 */
public class WorkshopSession {

    private DateAndTime startTime;
    private Trainer trainer; // ✅ New field added
    private boolean trainerAvailable;
    private ArrayList<Participant> bookedParticipants;
    private String classLogEntry;
    private List<Participant> participants;

    // ✅ Updated constructor to receive Trainer
    public WorkshopSession(DateAndTime startTime, Trainer trainer) {
        this.startTime = startTime;
        this.trainer = trainer;
        this.trainerAvailable = true;
        this.bookedParticipants = new ArrayList<>();
        this.classLogEntry = "";
    }

    // ✅ Getter for trainer
    public Trainer getTrainer() {
        return trainer;
    }

    public DateAndTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getStartDateTime() {
        return startTime.toLocalDateTime(); // Requires toLocalDateTime() method in DateAndTime class
    }

    public boolean isTrainerAvailable() {
        return trainerAvailable;
    }

    public void setTrainerAvailable(boolean available) {
        this.trainerAvailable = available;
    }

    public ArrayList<Participant> getBookedParticipants() {
        return bookedParticipants;
    }

    public void setBookedParticipants(ArrayList<Participant> participants) {
        this.bookedParticipants = participants;
    }

    public String getClassLogEntry() {
        return classLogEntry;
    }

    public void setClassLogEntry(String classLogEntry) {
        this.classLogEntry = classLogEntry;
    }

    public void addParticipant(Participant p) {
        bookedParticipants.add(p);
    }

    public boolean isFull(int maxSize) {
        return bookedParticipants.size() >= maxSize;
    }

    public boolean isUpcoming() {
        return getStartDateTime().isAfter(LocalDateTime.now());
    }
    public List<Participant> getParticipants() {
    return this.participants; // assuming your session has a participants list
}

}
