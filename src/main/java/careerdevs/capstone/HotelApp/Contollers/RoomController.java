package careerdevs.capstone.HotelApp.Contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class RoomController {
    @GetMapping("/test")
    public String test(){
        return "Check one two!";
    }
}
