package frozen.frostistant;

/**
 * Created by yinaa on 12/9/2014.
 */

/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/

/**
 * this class holds the service constants to connect to Office 365 Outlook services
 * please note that the sample assume that all of this constants will work for all services, which
 * may not be the case
 *
 * fill in the values according to your subscription
 */
public class Constants {
    public static final String AUTHORITY_URL = "https://login.windows.net/common";
    public static final String RESOURCE_ID = "https://outlook.office365.com/";
    public static final String REDIRECT_URL = "";
    public static final String CLIENT_ID = "a31dbe4d-73c0-4a61-b197-f3474c418db5";
    public static final String ENCRYPTION_KEY = "EncryptionKey";
    // it is generally the case for O365 services that the endpoint ID is the concatenation
    // RESOURCE_ID and the api version. Please check against your actual deployment
    public static final String ENDPOINT_ID = RESOURCE_ID + "api/v1.0";
}

