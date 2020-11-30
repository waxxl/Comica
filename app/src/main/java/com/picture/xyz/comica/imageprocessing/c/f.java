package com.picture.xyz.comica.imageprocessing.c;

import android.opengl.GLES20;

/* compiled from: MultiPixelRenderer */
public abstract class f extends BasicFilter {
    protected float A;
    private int B;
    private int C;
    protected float z;

    /* access modifiers changed from: protected */
    public void m() {
        super.m();
        this.z = 1.0f / ((float) l());
        this.A = 1.0f / ((float) j());
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.B = GLES20.glGetUniformLocation(this.f11439d, "u_TexelWidth");
        this.C = GLES20.glGetUniformLocation(this.f11439d, "u_TexelHeight");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.B, this.z);
        GLES20.glUniform1f(this.C, this.A);
    }
}
