package com.peng.lottery.app.config;

import android.os.Environment;

public class AppConfig {

    /** AppTag */
    public static final String APP_TAG = "Lottery";
    /** 当前是否是调试状态 */
    public static final boolean isDebug = false;
    /** 服务器根地址 */
    private static final String DEBUG_WEB_IP = "";
    private static final int DEBUG_WEB_PORT = 8080;
    private static final String DEBUG_BASE_URL = "http://" + DEBUG_WEB_IP + ":" + DEBUG_WEB_PORT;
    private static final String WEB_IP = "";
    private static final int WEB_PORT = 8080;
    private static final String BASE_URL = "http://" + WEB_IP + ":" + WEB_PORT ;

    /** 本地文件根路径 */
    public static final String BASE_PATH = Environment.getExternalStorageDirectory().getPath() + "/lottery/";

    /** Activity请求码 */
    public static final int REQUEST_INSTALL = 1000;
    public static final int REQUEST_INPUT_SLOGAN = 10000;
    public static final int REQUEST_INPUT_URL = 10001;

    public static String getBaseUrl() {
        if (isDebug) {
            return DEBUG_BASE_URL;
        } else {
            return BASE_URL;
        }
    }
}
