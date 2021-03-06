package careerdevs.capstone.HotelApp.Contollers;

import careerdevs.capstone.HotelApp.Model.Room;
import careerdevs.capstone.HotelApp.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class RoomController {

    @Autowired
    private RoomRepository repo;

    @GetMapping("/test")
    public String test(){
        return "Check one two!";
    }

    @GetMapping("/") //gets all the rooms
    public @ResponseBody List<Room> getAllRooms(){
        return repo.findAll();
    }


}
