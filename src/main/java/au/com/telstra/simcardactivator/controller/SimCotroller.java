package au.com.telstra.simcardactivator.controller;

import au.com.telstra.simcardactivator.payload.SimDetails;
import au.com.telstra.simcardactivator.service.SimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class SimCotroller {
    @Autowired
    private SimService simService;

    @PostMapping("/details")
    public String getStatusCall(@RequestBody SimDetails simDetails)
    {
        String status = simService.getStatus(simDetails);
        if(status == null)
        {
            return "Not Successful";
        }
        return "Successfull";
    }

}
