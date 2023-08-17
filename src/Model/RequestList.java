/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.Direction;
import java.util.ArrayList;
import java.util.List;

public class RequestList {
    private List<Integer> upRequests;
    private List<Integer> downRequests;

    public RequestList() {
        upRequests = new ArrayList<>();
        downRequests = new ArrayList<>();
    }

    public void addRequest(int requestFloor, Direction direction) {
        if (direction == Direction.UP) {
            upRequests.add(requestFloor);
        } else if (direction == Direction.DOWN) {
            downRequests.add(requestFloor);
        }
        // You can add logic to maintain priority order within each list
    }

    public int processNextRequest(int currentFloor, Direction direction) {
        List<Integer> requests = (direction == Direction.UP) ? upRequests : downRequests;
        
        // Implement logic to select and remove the next request based on priority
        // and considering the current floor and direction of movement
        
        // Return the selected request floor
        return selectedFloor;
    }
    
    // Other methods to manage and organize the requests
}
