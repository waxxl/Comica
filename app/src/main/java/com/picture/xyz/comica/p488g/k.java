package com.picture.xyz.comica.p488g;

/* renamed from: gr.gamebrain.comica.g.c */
public class k {
    /* renamed from: a */
    public static String m48770a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'p');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 1);
        }
        return new String(cArr);
    }
}
