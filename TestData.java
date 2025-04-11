/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mehnaz
 */
public class TestData {
    public static void main(String[] args) {
        // === Add Participants ===
        Participant p1 = new Participant("Mehnaz", "mehnaz@example.com", "123456", "City A", "Female");
        Participant p2 = new Participant("Ayan", "ayan@example.com", "987654", "City B", "Male");

        Data.addParticipant(p1);
        Data.addParticipant(p2);

        // === Add Trainers ===
        Trainer t1 = new Trainer("Zara", "zara@fitness.com", "Yoga");
        Trainer t2 = new Trainer("Rahul", "rahul@fitlife.com", "HIIT");

        Data.addTrainer(t1);
        Data.addTrainer(t2);

        // === Print All Participants ===
        System.out.println("\n=== Registered Participants ===");
        Data.printAllParticipants();

        // === Print All Trainers ===
        System.out.println("\n=== Registered Trainers ===");
        for (Trainer t : Data.trainers) {
            System.out.println("Name: " + t.getName() + ", Email: " + t.getEmail() + ", Class: " + t.getClassType());
        }

        // === Summary ===
        System.out.println("\nTotal Participants: " + Data.getTotalUsers());
        System.out.println("Total Trainers: " + Data.trainers.size());
    }
}

