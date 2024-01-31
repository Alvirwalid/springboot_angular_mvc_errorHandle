package com.example.Paytofee.constant;

import org.springframework.http.MediaType;

public interface BaseConstans {
     //================================== *** ==================================
    //									URL
    //================================== *** ==================================

    /*media type*/
    String EXTERNAL_MEDIA_TYPE = MediaType.APPLICATION_JSON_VALUE;
    /*end point*/
    String PRIVATE_APP_ENDPOINT = "/api/private/";
    String PUBLIC_APP_ENDPOINT = "/api/public/";
    /*pageable*/
    String PAGEABLE_PAGE = "page";
    String PAGEABLE_SIZE = "size";
    String PAGEABLE_SEARCH_VALUE = "searchValue";
    String PAGEABLE_PATH = "pageable/{" + PAGEABLE_PAGE + "}/{" + PAGEABLE_SIZE + "}/{" + PAGEABLE_SEARCH_VALUE + "}";
    /*find by id*/
    String OBJECT_ID = "id";
    String GET_OBJECT_BY_ID = "get-by-id/{" + OBJECT_ID + "}";
    /*others*/
    String ACTIVE_PATH = "active";
    String DROPDOWN_LIST_PATH = "dropdown-list";

    //================================== *** ==================================
    //									FILE
    //================================== *** ==================================

    String KEY_FILE_LOCATION = "FILE_LOCATION";
    String KEY_FILE_NAME = "FILE_NAME";

    String UPLOAD_DIR = "/app_resource/pay2fee/data/";
    String FILE_UPLOAD_DIR = UPLOAD_DIR + "file/";

    //================================== *** ==================================
    //									Server Message
    //================================== *** ==================================
    String SAVE_MESSAGE = "Successfully Saved";
    String SAVE_MESSAGE_BN = "সফলভাবে সংরক্ষণ করা হয়েছে";
    String UPDATE_MESSAGE = "Successfully Updated";
    String UPDATE_MESSAGE_BN = "সফলভাবে আপডেট করা হয়েছে";
    String UPLOAD_MESSAGE = "Successfully Uploaded";
    String UPLOAD_MESSAGE_BN = "সফলভাবে আপলোড করা হয়েছে";
    String DELETE_MESSAGE = "Successfully Deleted";
    String DELETE_MESSAGE_BN = "সফলভাবে ডিলিট করা হয়েছে";
    String DELETE_MESSAGE_FAILED = "Delete Failed";
    String DELETE_MESSAGE_FAILED_BN = "ডিলিট সফল হয়নি";
    String DATA_ALRADY_EXISTS_MESSAGE = "Data already exists!!";
    String DATA_ALRADY_EXISTS_MESSAGE_BN = "তথ্যটি ইতিমধ্যে সংরক্ষিত রয়েছে!!";
    String CHILD_RECORD_FOUND = "Child record found !!";
    String CHILD_RECORD_FOUND_BN = "চাইল্ড রেকর্ড ফাউন্ড !!";

    String PROCESS_COMPLETE = "Process successfully completed !!";
    String PROCESS_COMPLETE_BN = "প্রক্রিয়া সফলভাবে শেষ হয়েছে  !!";

    String PROCESS_FAILED = "Processing Failed !!";
    String PROCESS_FAILED_BN = "প্রক্রিয়াকরণ ব্যর্থ হয়েছে  !!";



    //================================== *** ==================================
    //									Audit
    //================================== *** ==================================
    String AUDIT_SAVE = "SAVE";
    String AUDIT_UPDATE = "UPDATE";
    String AUDIT_DELETE = "DELETE";
    String AUDIT_GET = "GET";
    String AUDIT_LOGIN = "LOGIN";
    String AUDIT_REPORT_PRINT = "REPORT_PRINT";
    String AUDIT_REPORT_DOWNLOAD = "REPORT_DOWNLOAD";

}
