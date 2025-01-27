package uz.pdp.apphotelbackend.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.apphotelbackend.model.RoomDTO;
import uz.pdp.apphotelbackend.utils.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 Created by: Mehrojbek
 DateTime: 27/01/25 20:50
 **/
@RestController
@RequestMapping(AppConstants.BASE_PATH + "/room")
public class RoomController {

    private List<RoomDTO> rooms = new ArrayList<>(List.of(
            new RoomDTO(1,"220-xona","VIP","Zo'r xona",400000L),
            new RoomDTO(2,"120-xona","STANDARD","Yaxshi xona",300000L),
            new RoomDTO(3,"320-xona","LUX","Lux xona",350000L)
    ));

    @GetMapping
    public List<RoomDTO> read(){
        return rooms;
    }

    @PostMapping
    public RoomDTO create(@RequestBody RoomDTO roomDTO) {
        rooms.add(roomDTO);
        return roomDTO;
    }



}
