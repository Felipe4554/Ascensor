package Model;

import Controller.Direction;
import java.util.ArrayList;
import java.util.Collections;
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
            // Agregar la solicitud manteniendo el orden de prioridad descendente
            int index = Collections.binarySearch(upRequests, requestFloor, Collections.reverseOrder());
            if (index < 0) {
                index = -index - 1;
            }
            upRequests.add(index, requestFloor);
        } else if (direction == Direction.DOWN) {
            // Agregar la solicitud manteniendo el orden de prioridad ascendente
            int index = Collections.binarySearch(downRequests, requestFloor);
            if (index < 0) {
                index = -index - 1;
            }
            downRequests.add(index, requestFloor);
        }
    }

    public int processNextRequest(int currentFloor, Direction direction) {
        List<Integer> requests = (direction == Direction.UP) ? upRequests : downRequests;

        // Implementar lógica para seleccionar y eliminar la siguiente solicitud basada en prioridad
        int selectedFloor = -1; // Inicializar con un valor que indique que no se ha seleccionado ningún piso
        
        if (!requests.isEmpty()) {
            // Encontrar el piso más cercano en la dirección de movimiento
            int minDistance = Integer.MAX_VALUE;
            for (Integer floor : requests) {
                int distance = Math.abs(floor - currentFloor);
                if (distance < minDistance) {
                    minDistance = distance;
                    selectedFloor = floor;
                }
            }
            
            // Eliminar el piso seleccionado de la lista de solicitudes
            requests.remove(Integer.valueOf(selectedFloor));
        }
        
        // Devolver el piso de la solicitud seleccionada
        return selectedFloor;
    }
    
    public boolean hasRequests() {
    return !upRequests.isEmpty() || !downRequests.isEmpty();
}
    
    // Otros métodos para gestionar y organizar las solicitudes
}
