package au.com.telstra.simcardactivator.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AcutateResponse {
    private boolean Success;

    public AcutateResponse() {
    }

    public AcutateResponse(boolean success) {
        Success = success;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    @Override
    public String toString() {
        return "AcutateResponse{" +
                "Success=" + Success +
                '}';
    }
}
