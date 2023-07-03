package au.com.telstra.simcardactivator.Repo;

import au.com.telstra.simcardactivator.payload.SimDetails;
import au.com.telstra.simcardactivator.payload.SimRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SimRepo extends JpaRepository<SimRecord,Long> {

}
