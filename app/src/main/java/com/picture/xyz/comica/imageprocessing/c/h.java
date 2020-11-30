package com.picture.xyz.comica.imageprocessing.c;

import android.opengl.GLES20;

/* compiled from: TwoPassMultiPixelFilter */
public abstract class h extends g {
    protected float D;
    protected float E;
    private int F;
    private int G;

    /* access modifiers changed from: protected */
    public void m() {
        super.m();
        this.D = 1.0f / ((float) l());
        this.E = 1.0f / ((float) j());
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.F = GLES20.glGetUniformLocation(this.f11439d, "u_TexelWidth");
        this.G = GLES20.glGetUniformLocation(this.f11439d, "u_TexelHeight");
    }

    /* access modifiers changed from: protected */
    public void q() {
        if (G() == 1) {
            this.D = 1.0f / ((float) l());
            this.E = 0.0f;
        } else {
            this.D = 0.0f;
            this.E = 1.0f / ((float) j());
        }
        super.q();
        GLES20.glUniform1f(this.F, this.D);
        GLES20.glUniform1f(this.G, this.E);
    }
}
