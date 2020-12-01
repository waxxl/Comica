package com.picture.xyz.comica.p241e.p242c;

import com.picture.xyz.comica.comica.Face2;

/* renamed from: e.c.a */
public class hn {
    /* renamed from: a */
    public static tk m21099a(Face2 hVar, int i) {
        if (i == 0) {
            return new ue(hVar);
        }
        if (i == 1) {
            return new uk(hVar);
        }
        if (i == 2) {
            return new ce(hVar);
        }
        if (i == 3) {
            return new ae(hVar);
        }
        if (i == 4) {
            return new il(hVar);
        }
        if (i == 5) {
            return new cm(hVar);
        }
        if (i == 6) {
            return new jo(hVar);
        }
        if (i == 7) {
            return new kd(hVar);
        }
        if (i == 8) {
            return new zh(hVar);
        }
        if (i == 9) {
            return new dn(hVar);
        }
        return new ue(hVar);
    }

    /* renamed from: b */
    public static String m21100b(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ '$');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ ';');
        }
        return new String(cArr);
    }
}
