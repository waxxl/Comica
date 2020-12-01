package com.picture.xyz.comica.comica;

/* renamed from: gr.gamebrain.comica.b */
/* compiled from: f */
public class C4232b {
    /* renamed from: a */
    public static String m21129a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'w');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ '(');
        }
        return new String(cArr);
    }
}
