package com.picture.xyz.comica.imageprocessing.p253c;

import android.opengl.GLES20;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.h */
public abstract class TwoPassMultiPixelFilter extends TwoPassFilter {

    /* renamed from: D */
    protected float f41120D;

    /* renamed from: E */
    protected float f41121E;

    /* renamed from: F */
    private int f41122F;

    /* renamed from: G */
    private int f41123G;

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
        super.mo24174m();
        this.f41120D = 1.0f / ((float) mo24173l());
        this.f41121E = 1.0f / ((float) mo24171j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41122F = GLES20.glGetUniformLocation(this.f15543d, "u_TexelWidth");
        this.f41123G = GLES20.glGetUniformLocation(this.f15543d, "u_TexelHeight");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        if (mo53649G() == 1) {
            this.f41120D = 1.0f / ((float) mo24173l());
            this.f41121E = 0.0f;
        } else {
            this.f41120D = 0.0f;
            this.f41121E = 1.0f / ((float) mo24171j());
        }
        super.mo24143q();
        GLES20.glUniform1f(this.f41122F, this.f41120D);
        GLES20.glUniform1f(this.f41123G, this.f41121E);
    }
}
