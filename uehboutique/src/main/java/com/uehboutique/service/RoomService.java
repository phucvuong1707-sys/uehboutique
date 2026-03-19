package com.uehboutique.service;

import com.uehboutique.entity.Room;
import com.uehboutique.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public List<Room> getRoomsByStatus(String status) {
        return roomRepository.findByStatus(status);
    }
}
