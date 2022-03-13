package com.Trucao.Service;

import com.Trucao.Model.GameRules;
import com.Trucao.Model.Room;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoomService {
    Room getRoom(int roomId) throws Exception   ;
    List<Room> getRooms();
    Room addRoom(String name, GameRules rules);
    Room changeRoom(int roomId, Room room);
    void deleteRoom(int id);
    public Room saveRoom(Room room);
    boolean possivelComecar(int roomId) throws Exception;
}
