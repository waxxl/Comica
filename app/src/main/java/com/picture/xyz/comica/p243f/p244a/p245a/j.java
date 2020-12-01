package com.picture.xyz.comica.p243f.p244a.p245a;

/* renamed from: f.a.a.b */
public class j {
    /* renamed from: a */
    public static String m48668a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'c');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ '3');
        }
        return new String(cArr);
    }
}
