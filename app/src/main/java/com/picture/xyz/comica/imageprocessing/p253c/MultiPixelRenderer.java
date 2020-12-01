package com.picture.xyz.comica.imageprocessing.p253c;

import android.opengl.GLES20;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.f */
public abstract class MultiPixelRenderer extends BasicFilter {

    /* renamed from: A */
    protected float f41112A;

    /* renamed from: B */
    private int f41113B;

    /* renamed from: C */
    private int f41114C;

    /* renamed from: z */
    protected float f41115z;

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
        super.mo24174m();
        this.f41115z = 1.0f / ((float) mo24173l());
        this.f41112A = 1.0f / ((float) mo24171j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41113B = GLES20.glGetUniformLocation(this.f15543d, "u_TexelWidth");
        this.f41114C = GLES20.glGetUniformLocation(this.f15543d, "u_TexelHeight");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41113B, this.f41115z);
        GLES20.glUniform1f(this.f41114C, this.f41112A);
    }
}
