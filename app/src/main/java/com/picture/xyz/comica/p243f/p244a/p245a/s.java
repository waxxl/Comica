package com.picture.xyz.comica.p243f.p244a.p245a;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.picture.xyz.comica.p240d.jm;

/* renamed from: f.a.a.a */
public class s {

    /* renamed from: a */
    private EGLSurface f39635a = EGL14.EGL_NO_SURFACE;

    /* renamed from: b */
    protected C4230g f39636b;

    protected s(C4230g gVar) {
        this.f39636b = gVar;
    }

    /* renamed from: a */
    public static String m48664a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'K');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 'r');
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public void mo51913b() {
        this.f39636b.mo24147d(this.f39635a);
    }

    /* renamed from: c */
    public void mo51914c(int i, int i2) {
        if (this.f39635a == EGL14.EGL_NO_SURFACE) {
            this.f39635a = this.f39636b.mo24146b(i, i2);
            return;
        }
        throw new IllegalStateException(jm.m48372c("\u0000N\u0001]\u0012X\u0016\u001b\u0012W\u0001^\u0012_\n\u001b\u0010I\u0016Z\u0007^\u0017"));
    }

    /* renamed from: d */
    public void mo51915d() {
        this.f39636b.mo24150g(this.f39635a);
        this.f39635a = EGL14.EGL_NO_SURFACE;
    }
}
