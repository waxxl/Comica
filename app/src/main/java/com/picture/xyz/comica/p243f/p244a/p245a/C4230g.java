package com.picture.xyz.comica.p243f.p244a.p245a;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

import com.picture.xyz.comica.comica.C4232b;
import com.picture.xyz.comica.p240d.C4228i;

/* renamed from: f.a.a.g */
/* compiled from: a */
public final class C4230g {

    /* renamed from: a */
    private EGLDisplay f15517a;

    /* renamed from: b */
    private EGLConfig f15518b = null;

    /* renamed from: c */
    private EGLContext f15519c = EGL14.EGL_NO_CONTEXT;

    public C4230g(EGLContext eGLContext, int i) {
        EGLConfig a;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f15517a = eGLDisplay;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f15517a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    if (!((i & 2) == 0 || (a = m21120a(i, 3)) == null)) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15517a, a, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.f15518b = a;
                            this.f15519c = eglCreateContext;
                        }
                    }
                    if (this.f15519c == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig a2 = m21120a(i, 2);
                        if (a2 != null) {
                            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.f15517a, a2, eGLContext, new int[]{12440, 2, 12344}, 0);
                            m21122e(C4232b.m21129a("M\u0010D4Z\u0012I\u0003M4G\u0019\\\u0012P\u0003"));
                            this.f15518b = a2;
                            this.f15519c = eglCreateContext2;
                        } else {
                            throw new RuntimeException(C4228i.m21095a("l3X?U8\u0019)V}_4W9\u0019<\u0019.L4M<[1\\}|\u001au\u001eV3_4^"));
                        }
                    }
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f15517a, this.f15519c, 12440, iArr2, 0);
                    StringBuilder insert = new StringBuilder().insert(0, C4228i.m21095a("|\u001au\u001eV3M8A)\u0019>K8X)\\9\u0015}Z1P8W)\u0019+\\/J4V3\u0019"));
                    insert.append(iArr2[0]);
                    Log.d("Grafika", insert.toString());
                    return;
                }
                this.f15517a = null;
                throw new RuntimeException(C4232b.m21129a("]\u0019I\u0015D\u0012\b\u0003GWA\u0019A\u0003A\u0016D\u001eR\u0012\b2o;\u0019C"));
            }
            throw new RuntimeException(C4228i.m21095a("L3X?U8\u0019)V}^8M}|\u001aul\r}]4J-U<@"));
        }
        throw new RuntimeException(C4232b.m21129a("m0dWI\u001bZ\u0012I\u0013QW[\u0012\\W]\u0007"));
    }

    /* renamed from: a */
    private /* synthetic */ EGLConfig m21120a(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f15517a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        StringBuilder insert = new StringBuilder().insert(0, C4232b.m21129a("\u0002F\u0016J\u001bMW\\\u0018\b\u0011A\u0019LWz0jO\u0010O\u0010W\u0007W"));
        insert.append(i2);
        insert.append(C4228i.m21095a("}|\u001au\u001eV3_4^"));
        Log.w("Grafika", insert.toString());
        return null;
    }

    /* renamed from: c */
    public static String m21121c(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'Y');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ '`');
        }
        return new String(cArr);
    }

    /* renamed from: e */
    private /* synthetic */ void m21122e(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder insert = new StringBuilder().insert(0, str);
            insert.append(C4228i.m21095a("\u0003}|\u001au}\\/K2Kg\u0019mA"));
            insert.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(insert.toString());
        }
    }

    /* renamed from: b */
    public EGLSurface mo24146b(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f15517a, this.f15518b, new int[]{12375, i, 12374, i2, 12344}, 0);
        m21122e(C4232b.m21129a("\u0012O\u001bk\u0005M\u0016\\\u0012x\u0015]\u0011N\u0012Z$]\u0005N\u0016K\u0012"));
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException(C4228i.m21095a(".L/_<Z8\u0019*X.\u00193L1U"));
    }

    /* renamed from: d */
    public void mo24147d(EGLSurface eGLSurface) {
        if (this.f15517a == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", C4232b.m21129a("9g#mM\b\u001aI\u001cM4]\u0005Z\u0012F\u0003\b\u0000\u0007\u0018\b\u0013A\u0004X\u001bI\u000e"));
        }
        if (!EGL14.eglMakeCurrent(this.f15517a, eGLSurface, eGLSurface, this.f15519c)) {
            throw new RuntimeException(C4228i.m21095a("\\:U\u0010X6\\\u001eL/K8W)\u0019;X4U8]"));
        }
    }

    /* renamed from: f */
    public void mo24148f() {
        EGLDisplay eGLDisplay = this.f15517a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f15517a, this.f15519c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15517a);
        }
        this.f15517a = EGL14.EGL_NO_DISPLAY;
        this.f15519c = EGL14.EGL_NO_CONTEXT;
        this.f15518b = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f15517a != EGL14.EGL_NO_DISPLAY) {
                Log.w("Grafika", C4232b.m21129a(" i%f>f0\u0012Wm\u0010D4G\u0005MW_\u0016[WF\u0018\\WM\u000fX\u001bA\u0014A\u0003D\u000e\b\u0005M\u001bM\u0016[\u0012LW\u0005Z\b\u0004\\\u0016\\\u0012\b\u001aI\u000e\b\u0015MWD\u0012I\u001cM\u0013"));
                mo24148f();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public void mo24150g(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.f15517a, eGLSurface);
    }
}
