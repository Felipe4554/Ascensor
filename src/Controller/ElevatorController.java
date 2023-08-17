/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.RequestList;
import Controller.Direction;
import View.ElevatorView;

/**
 *
 * @author ´Felipe Chacón
 */
public class ElevatorController {
    private int currentFloor;
    private int destinationFloor;
    private Direction direction;
    private RequestList requestList; // Use RequestList instead of Queue<RequestList>

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

    public RequestList getRequestList() {
        return requestList;
    }

    public void setRequestList(RequestList requestList) {
        this.requestList = requestList;
    }
    
    
    public void receiveUserRequest(int floor, Direction direction) {
        requestList.addRequest(floor, direction);
    }

    public void processNextRequest() {
        int nextFloor = requestList.processNextRequest(currentFloor, direction);
        setDestinationFloor(nextFloor);
    }
    
    public void updateView() {
        ElevatorView elevatorView = new ElevatorView(); // Create an instance of ElevatorView
        elevatorView.updateView(currentFloor, destinationFloor, direction); // Call the updateView method in ElevatorView
    }

    public void moveToFloor(int floor) {
        if (floor > currentFloor) {
            direction = Direction.UP;
        } else if (floor < currentFloor) {
            direction = Direction.DOWN;
        } else {
            direction = Direction.STOP; // Elevator is already at the desired floor
            return;
    }

    while (currentFloor != floor) {
        // Simulate moving the elevator one floor at a time
        if (direction == Direction.UP) {
            currentFloor++;
        } else if (direction == Direction.DOWN) {
            currentFloor--;
        }

        updateView(); // Update the view to show the current floor
    }

        direction = Direction.STOP; // Stop the elevator after reaching the desired floor
        updateView(); // Update the view to show the final state
    }
}

