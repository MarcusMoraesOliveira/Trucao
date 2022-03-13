package com.Trucao.Service;

import com.Trucao.Model.GameRules;
import com.Trucao.Model.Room;
import com.Trucao.Repository.RoomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RoomServiceImpl implements RoomService{
    private static final Logger LOGGER = LoggerFactory.getLogger(RoomServiceImpl.class);
    private RoomRepository roomRepository;
    @Override
    public Room getRoom(int roomId)  throws Exception{
        return roomRepository.findById(roomId).orElseThrow(() -> new Exception("Essa sala não existe"));
    }

    @Override
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room addRoom(String name, GameRules rules) {
        Room room = new Room(rules,name);
        return saveRoom(room);
    }

    @Override
    public Room changeRoom(int roomId, Room room) {
        return null;
    }

    @Override
    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public boolean possivelComecar(int roomId) throws Exception{
        Room room = getRoom(roomId);

        // todo : melhorar logica
        if(room.getJogadores().size() != 2 &&  room.getJogadores().size() !=4){
            LOGGER.info("Não foi possivel começar a partida em "+ roomId);
            return false;
        }
        return true;

    }
}
