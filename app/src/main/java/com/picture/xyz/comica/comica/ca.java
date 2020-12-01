package com.picture.xyz.comica.comica;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import com.picture.xyz.comica.p240d.jm;

/* renamed from: gr.gamebrain.comica.m */
public class ca {

    /* renamed from: a */
    private static File f15539a;

    /* renamed from: a */
    public static File m21142a() {
        if (f15539a == null) {
            f15539a = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "comica");
        }
        if (!f15539a.exists()) {
            f15539a.mkdirs();
        }
        return m21143b(q.m48751b("$0*6$>i578"));
    }

    /* renamed from: b */
    public static File m21143b(String str) {
        if (f15539a == null) {
            f15539a = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "comica");
        }
        if (!f15539a.exists()) {
            f15539a.mkdirs();
        }
        return new File(f15539a, str);
    }

    /* renamed from: c */
    public static String m21144c() {
        if (f15539a == null) {
            f15539a = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "comica");
        }
        if (!f15539a.exists()) {
            f15539a.mkdirs();
        }
        File file = f15539a;
        StringBuilder insert = new StringBuilder().insert(0, "comica");
        insert.append(System.currentTimeMillis());
        insert.append(jm.m48372c("\u0015\u0003_\u0015"));
        return new File(file, insert.toString()).getAbsolutePath();
    }

    /* renamed from: d */
    public static String m21145d(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'i');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 'X');
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static void m21146e() {
        File file;
        if (Build.VERSION.SDK_INT < 8) {
            file = Environment.getExternalStorageDirectory();
        } else {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        }
        if (file == null) {
            f15539a = Environment.getExternalStorageDirectory();
        }
        File file2 = new File(file, "comica");
        f15539a = file2;
        if (!file2.exists()) {
            f15539a.mkdirs();
        }
    }

    /* renamed from: f */
    public static String m21147f() {
        if (f15539a == null) {
            f15539a = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "comica");
        }
        if (!f15539a.exists()) {
            f15539a.mkdirs();
        }
        File file = f15539a;
        StringBuilder insert = new StringBuilder().insert(0, "comica");
        insert.append(System.currentTimeMillis());
        insert.append(jm.m48372c("\u0015\u0019K\u0014"));
        return new File(file, insert.toString()).getAbsolutePath();
    }
}
