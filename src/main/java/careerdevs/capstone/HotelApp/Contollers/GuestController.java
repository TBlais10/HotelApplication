package careerdevs.capstone.HotelApp.Contollers;

import careerdevs.capstone.HotelApp.Model.Guest;
import careerdevs.capstone.HotelApp.Model.Room;
import careerdevs.capstone.HotelApp.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/rooms")
public class GuestController {

    @Autowired
    private GuestRepository repo;

    @GetMapping("/test")
    public String test() {
        return "Testing one two, one two!";
    }

    @GetMapping("/") //gets all the rooms
    public @ResponseBody
    List<Guest> getAllRooms() {
        return repo.findAll();
    }
}