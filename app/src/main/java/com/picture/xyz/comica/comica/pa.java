package com.picture.xyz.comica.comica;

/* renamed from: gr.gamebrain.comica.e */
public class pa {
    /* renamed from: a */
    public static String m48765a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 18);
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 'K');
        }
        return new String(cArr);
    }
}
