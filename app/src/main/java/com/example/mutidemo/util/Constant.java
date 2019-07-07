package com.example.mutidemo.util;

public class Constant {

    public static final int BAUDRATE = 9600;
    public static final byte DATABIT = 8;
    public static final byte STOPBIT = 1;
    public static final byte PARITY = 0;
    public static final byte FLOWCONTROL = 0;

    public static final String ManufacturerString = "mManufacturer=WCH";
    public static final String ModelString = "mModel=WCHUARTDemo";
    public static final String VersionString = "mVersion=1.0";


    public static final String ZCALL = "AT+ZCALL?##\r\n";
    public static final String ZBEAT = "AT+ZBEAT?##\r\n";

    public static final String mImageUrl_1 = "https://images.unsplash.com/photo-1562257101-a6e30ba272ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80";

    //retrofit请求baseurl只能是根url，不能带任何参数
    public static final String WEATHER_URL = "https://way.jd.com/";
}
