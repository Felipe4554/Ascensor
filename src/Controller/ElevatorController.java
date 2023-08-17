/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.RequestList;
import java.util.Queue;

/**
 *
 * @author ´Felipe Chacón
 */
public class ElevatorController {
    private int currentFloor;
    private int destinationFloor;
    private Direction direction;
    private Queue<RequestList> requestQueue;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Queue<RequestList> getRequestQueue() {
        return requestQueue;
    }   

    public void addRequest(RequestList request) {
        
    }

    public void processNextRequest() {
        
    }

    public void moveToFloor(int floor) {
        
    }

    // Other methods to get elevator status and information
}

