package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.Repo.SimRepo;
import au.com.telstra.simcardactivator.payload.AcutateResponse;
import au.com.telstra.simcardactivator.payload.SimDetails;
import au.com.telstra.simcardactivator.payload.SimRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Optional;
import java.util.concurrent.CompletableFuture;
@Service
public class SimService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SimRepo simRepo;
    private static final String url = "http://localhost:8444/actuate";

    public AcutateResponse getStatus(SimDetails simDetails)
    {
        return restTemplate.postForObject(url,simDetails, AcutateResponse.class);
    }

    public void insertSim(SimRecord simDetails)
    {
        simRepo.save(simDetails);
    }
    public SimRecord getSimDetailById(long simId)
    {
        Optional<SimRecord>simDetails = simRepo.findById(simId);
        return simDetails.orElse(null);
    }

}
