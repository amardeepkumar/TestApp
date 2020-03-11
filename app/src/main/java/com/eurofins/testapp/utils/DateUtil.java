package com.eurofins.testapp.utils;

import android.icu.text.SimpleDateFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Date;

@RequiresApi(api = Build.VERSION_CODES.N)
public class DateUtil {
    static SimpleDateFormat fmtOut = new SimpleDateFormat("dd-MM-yyyy");

    public static String getDate(Date date) {
        return fmtOut.format(date);
    }
}
