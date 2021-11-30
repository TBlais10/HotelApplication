package careerdevs.capstone.HotelApp.Repository;

import careerdevs.capstone.HotelApp.Model.Guest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {

    List<Guest> findGuestByRoom(Integer room, Sort sort);

}
