/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensor;

import Controller.Direction;
import Controller.ElevatorController;
import Model.RequestList;
import View.ElevatorView;

public class Ascensor {
    public static void main(String[] args) {
        RequestList requestList = new RequestList();
        ElevatorController elevatorController = new ElevatorController();
        elevatorController.setRequestList(requestList);

        ElevatorView elevatorView = new ElevatorView(); // You can create an instance of ElevatorView here

        // Simulate user requests
        elevatorController.receiveUserRequest(9, Direction.UP);
        elevatorController.receiveUserRequest(6, Direction.UP);
        elevatorController.receiveUserRequest(2, Direction.DOWN);

        // Process and move
        while (elevatorController.getRequestList().hasRequests()) {
            elevatorController.processNextRequest();
            elevatorController.moveToFloor(elevatorController.getDestinationFloor());
            elevatorView.updateView(
                elevatorController.getCurrentFloor(),
                elevatorController.getDestinationFloor(),
                elevatorController.getDirection()
            );
        }

        System.out.println("All requests processed. Elevator is now idle.");
    }
}
