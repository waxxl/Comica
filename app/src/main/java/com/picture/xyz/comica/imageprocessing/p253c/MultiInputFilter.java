package com.picture.xyz.comica.imageprocessing.p253c;

import android.opengl.GLES20;

import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.e */
public abstract class MultiInputFilter extends BasicFilter {

    /* renamed from: A */
    private int[] f41107A;

    /* renamed from: B */
    protected int[] f41108B;

    /* renamed from: C */
    protected List<GLTextureOutputRenderer> f41109C;

    /* renamed from: D */
    protected List<GLTextureOutputRenderer> f41110D;

    /* renamed from: z */
    private int f41111z;

    public MultiInputFilter(int i) {
        this.f41111z = i;
        int i2 = i - 1;
        this.f41107A = new int[i2];
        this.f41108B = new int[i2];
        this.f41109C = new ArrayList(i);
        this.f41110D = new ArrayList(i);
    }

    /* renamed from: G */
    public void mo53647G() {
        this.f41110D.clear();
    }

    /* renamed from: H */
    public void mo53648H(GLTextureOutputRenderer aVar, int i) {
        this.f41110D.remove(aVar);
        this.f41110D.add(i, aVar);
    }

    /* renamed from: a */
    public synchronized void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (!this.f41109C.contains(aVar)) {
            this.f41109C.add(aVar);
            if (z) {
                mo24184A();
            }
        }
        int lastIndexOf = this.f41110D.lastIndexOf(aVar);
        if (lastIndexOf == 0) {
            this.f15549j = i;
            mo24181v(aVar.mo24173l());
            mo24178s(aVar.mo24171j());
        } else {
            this.f41108B[lastIndexOf - 1] = i;
        }
        if (this.f41109C.size() == this.f41111z) {
            mo24176p();
            this.f41109C.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        int i = 0;
        while (i < this.f41111z - 1) {
            int[] iArr = this.f41107A;
            int i2 = this.f15543d;
            StringBuilder sb = new StringBuilder();
            sb.append("u_Texture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        int i = 0;
        int i2 = 0;
        while (i < this.f41111z - 1) {
            switch (i) {
                case 0:
                    i2 = 33985;
                    break;
                case 1:
                    i2 = 33986;
                    break;
                case 2:
                    i2 = 33987;
                    break;
                case 3:
                    i2 = 33988;
                    break;
                case 4:
                    i2 = 33989;
                    break;
                case 5:
                    i2 = 33990;
                    break;
                case 6:
                    i2 = 33991;
                    break;
                case 7:
                    i2 = 33992;
                    break;
                case 8:
                    i2 = 33993;
                    break;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, this.f41108B[i]);
            int i3 = this.f41107A[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }
}
