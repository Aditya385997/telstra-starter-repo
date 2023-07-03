package au.com.telstra.simcardactivator.controller;

import au.com.telstra.simcardactivator.payload.AcutateResponse;
import au.com.telstra.simcardactivator.payload.SimDetails;
import au.com.telstra.simcardactivator.payload.SimRecord;
import au.com.telstra.simcardactivator.service.SimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class SimCotroller {
    @Autowired
    private SimService simService;

    @PostMapping("/activate")
    public void getStatusCall(@RequestBody SimDetails simDetails)
    {
        AcutateResponse acutateResponse = simService.getStatus(simDetails);
        System.out.print(acutateResponse.isSuccess());
        SimRecord simRecord = new SimRecord();
        simRecord.setIccid(simDetails.getIccid());
        simRecord.setCustomerEmail(simDetails.getCustomerEmail());
        simRecord.setActive(acutateResponse.isSuccess());
        simService.insertSim(simRecord);
    }

//    @PostMapping("/insert")
//    public void insertSimDetail(@RequestBody SimRecord simRecord)
//    {
//        simService.insertSim(simRecord);
//    }

    @GetMapping("/getDetails/{simId}")
    public void getSimDetail(@PathVariable long simId)
    {
        System.out.print(simService.getSimDetailById(simId));
    }

}
