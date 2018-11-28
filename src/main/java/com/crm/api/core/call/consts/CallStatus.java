package com.crm.api.core.call.consts;

/**
 * Created by miku03 on 2018/5/9.
 */
public class CallStatus {

    public static String CALLER_OUT = "1001";
    public static String CALLER_SUCCESS = "1002";
    public static String CALLER_FAIL = "1003";
    public static String CALLED_OUT = "2001";
    public static String CALLED_SUCCESS = "2002";
    public static String CALLED_FAIL = "2003";
    public static String CALL_COMPLETED = "9001";
    public static String CALL_UNKNOW_FAIL = "9009";



    public static String ON_CALL = "1"; //通话中
    public static String END_CALL = "2"; //通话结束
}
