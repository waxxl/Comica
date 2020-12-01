package com.picture.xyz.comica.comica;

/* renamed from: gr.gamebrain.comica.f */
public final class na {
    /* renamed from: a */
    public static String m48766a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'k');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ '^');
        }
        return new String(cArr);
    }
}
