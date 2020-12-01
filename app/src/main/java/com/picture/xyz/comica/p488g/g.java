package com.picture.xyz.comica.p488g;

import android.os.Build;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.comica.C4232b;

/* renamed from: gr.gamebrain.comica.g.a */
public class g {

    /* renamed from: a */
    public static boolean f39812a;

    /* renamed from: a */
    public static String m48767a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 20);
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 18);
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static void m48768b(String str) {
        int i = Build.VERSION.SDK_INT;
        str.contains(C4232b.m21129a("0d(g2{(\\\u0012P\u0003]\u0005M(@\u0016D\u0011w\u0011D\u0018I\u0003"));
        str.contains(C4228i.m21095a("\u001au\u0002v\u0018j\u0002M8A)L/\\\u0002_1V<M"));
        f39812a = str.contains(C4232b.m21129a("o;w2p#w\u0014G\u001bG\u0005w\u0015]\u0011N\u0012Z(@\u0016D\u0011w\u0011D\u0018I\u0003")) || str.contains(C4228i.m21095a("~\u0011f\u0018a\tf>V1V/f?L;_8K\u0002_1V<M"));
    }
}
