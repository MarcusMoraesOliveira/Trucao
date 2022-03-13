package com.Trucao.Controller;

import com.Trucao.Model.Player;
import com.Trucao.Model.Room;
import com.Trucao.Service.RoomService;
import com.Trucao.Util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomController extends BaseController {

    private final RoomService roomService;

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        logIncomingCall("GetRooms");
        List<Room> rooms = roomService.getRooms();
        return rooms;
    }

    @GetMapping("/rooms/{roomId}")
    public Room getRoom(@PathVariable int roomId) throws Exception{
        logIncomingCall("getRoom");
        return roomService.getRoom(roomId);
    }




}
