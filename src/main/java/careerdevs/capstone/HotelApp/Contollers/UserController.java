package careerdevs.capstone.HotelApp.Contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class UserController {
    @GetMapping("/test")
    public String test(){
        return "Testing one two, one two!";
    }
}
