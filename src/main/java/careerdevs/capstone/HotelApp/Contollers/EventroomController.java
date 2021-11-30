package careerdevs.capstone.HotelApp.Contollers;

import careerdevs.capstone.HotelApp.Model.Eventrooms;
import careerdevs.capstone.HotelApp.Repository.EventroomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/eventrooms")
public class EventroomController {

    @Autowired
    private EventroomsRepository repo;

    @GetMapping
    public String test() {
        return "Testing one two! Hey, HEY!!";
    }

    @GetMapping("/") //gets all the rooms
    public @ResponseBody
    List<Eventrooms> getAllRooms() {
        return repo.findAll();
    }
}
