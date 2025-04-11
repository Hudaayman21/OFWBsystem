/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mehnaz
 */

public class Trainer extends Person {
    private String classType;
    private ClassRoom myClassRoom;

    public Trainer(String name, String email, String classType) {
        super(name, email);
        this.classType = classType;
        this.myClassRoom = new ClassRoom(this); // each trainer owns their ClassRoom
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public ClassRoom getMyClassRoom() {
        return myClassRoom;
    }

    public void setMyClassRoom(ClassRoom myClassRoom) {
        this.myClassRoom = myClassRoom;
    }
}
