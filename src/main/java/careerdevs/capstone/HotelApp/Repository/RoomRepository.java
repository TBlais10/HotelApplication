package careerdevs.capstone.HotelApp.Repository;

import careerdevs.capstone.HotelApp.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
