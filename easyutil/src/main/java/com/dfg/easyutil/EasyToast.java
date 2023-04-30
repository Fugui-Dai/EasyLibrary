package com.dfg.easyutil;

import android.content.Context;
import android.widget.Toast;

//依赖包，easyutil类下
public class EasyToast {
    /**
     * Toast
     */
    public static void show(final Context context, final CharSequence text) {
        Toast.makeText(context, text + "更新1.0哦", Toast.LENGTH_SHORT).show();
    }

    /**
     * LongToast
     */
    public static void showLong(final Context context, final CharSequence text) {
        Toast.makeText(context, text + "更新1.0哦", Toast.LENGTH_LONG).show();
    }
}