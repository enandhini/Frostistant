package frozen.test1;

public class ServiceConstants {
    public static final String AUTHORITY_URL = "https://login.windows.net/common";
    public static final String RESOURCE_ID = "https://outlook.office365.com/";
    public static final String REDIRECT_URL = "https://localhost";
    public static final String CLIENT_ID = "a31dbe4d-73c0-4a61-b197-f3474c418db5";
    // it is generally the case for O365 services that the endpoint ID is the concatenation
    // RESOURCE_ID and the api version. Please check against your actual deployment
    public static final String ENDPOINT_ID = RESOURCE_ID + "api/v1.0";
}
