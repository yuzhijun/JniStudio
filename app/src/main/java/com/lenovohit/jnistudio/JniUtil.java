package com.lenovohit.jnistudio;

/**
 * Created by yuzhijun on 2016/6/27.
 */
public class JniUtil {

    static {
        System.loadLibrary("JniStudio");
    }

    public native String append(String str1,String str2);
}
