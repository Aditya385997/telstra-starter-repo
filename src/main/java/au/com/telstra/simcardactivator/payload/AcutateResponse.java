package au.com.telstra.simcardactivator.payload;

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
