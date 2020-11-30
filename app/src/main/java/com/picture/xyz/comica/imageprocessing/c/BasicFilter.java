package com.picture.xyz.comica.imageprocessing.c;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.f.GLTextureInputRenderer;

/* compiled from: BasicFilter */
public abstract class BasicFilter extends com.picture.xyz.comica.imageprocessing.e.a implements GLTextureInputRenderer {
    private int y;

    public float D(String str) {
        return 0.0f;
    }

    public void E(String str, float f2) {
    }

    public void F(String str, float[] fArr) {
    }

    public void a(int i, com.picture.xyz.comica.imageprocessing.e.a aVar, boolean z) {
        if (z) {
            A();
        }
        this.j = i;
        v(aVar.l());
        s(aVar.j());
        p();
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.y = GLES20.glGetUniformLocation(this.f11439d, "u_Size");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform2f(this.y, (float) this.k, (float) this.l);
    }
}
