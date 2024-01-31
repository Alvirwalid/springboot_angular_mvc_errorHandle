package com.example.Paytofee.sysadmin.common;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static com.example.Paytofee.constant.BaseConstans.*;

@Component
@AllArgsConstructor
public class Utils {


    public static BaseResponse generateSuccessResponse(Object obj, String... message) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(true);
        baseResponse.setData(obj);
        if (message.length > 1 && message[0] != null && message[1] != null) {
            baseResponse.setMessage(message[0]);
            baseResponse.setMessageBn(message[1]);
        }
        return baseResponse;
    }


    public static BaseResponse generateErrorResponse(Exception e) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(false);
        String msgType = getMessageType(e.getMessage());
        if(msgType.equals("uk") || msgType.equals("re")) {
            baseResponse.setMessage(DATA_ALRADY_EXISTS_MESSAGE);
            baseResponse.setMessageBn(DATA_ALRADY_EXISTS_MESSAGE_BN);
        }else if(msgType.equals("fk")) {
            baseResponse.setMessage(CHILD_RECORD_FOUND);
            baseResponse.setMessageBn(CHILD_RECORD_FOUND_BN);
        }else {
            baseResponse.setMessage(e.getMessage());
        }

//		e.printStackTrace();

//		System.out.println(e.getMessage());
        return baseResponse;
    }

    private static String getMessageType(String message) {
        System.out.println("12 > " + message);
//    	System.out.println("13 > " + message.substring(52,54));
        if(message != null && message.length() > 55) {
            return message.substring(52,54);
        }
        return "";
    }
}
