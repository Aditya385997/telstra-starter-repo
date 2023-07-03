package au.com.telstra.simcardactivator.Repo;

import au.com.telstra.simcardactivator.payload.SimDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimRepo extends JpaRepository<SimDetails,Long> {

}
