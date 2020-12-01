package com.picture.xyz.comica.imageprocessing.p253c;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p255f.GLTextureInputRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.a */
public abstract class BasicFilter extends GLTextureOutputRenderer implements GLTextureInputRenderer {

    /* renamed from: y */
    private int f15559y;

    /* renamed from: D */
    public float mo24144D(String str) {
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (z) {
            mo24184A();
        }
        this.f15549j = i;
        mo24181v(aVar.mo24173l());
        mo24178s(aVar.mo24171j());
        mo24176p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f15559y = GLES20.glGetUniformLocation(this.f15543d, "u_Size");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform2f(this.f15559y, (float) this.f15550k, (float) this.f15551l);
    }
}
