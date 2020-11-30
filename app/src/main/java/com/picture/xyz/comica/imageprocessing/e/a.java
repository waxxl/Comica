package com.picture.xyz.comica.imageprocessing.e;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.b;
import com.picture.xyz.comica.imageprocessing.f.GLTextureInputRenderer;

/* compiled from: GLTextureOutputRenderer */
public abstract class a extends b {
    protected int[] t;
    protected int[] u;
    private List<GLTextureInputRenderer> v = new ArrayList();
    private Object w = new Object();
    private boolean x;

    private void z() {
        int[] iArr = this.t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.t = null;
        }
        int[] iArr2 = this.u;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.u = null;
        }
        int[] iArr3 = new int[1];
        this.t = iArr3;
        this.u = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        GLES20.glGenTextures(1, this.u, 0);
        GLES20.glBindFramebuffer(36160, this.t[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.u[0]);
        C();
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u[0], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    public void A() {
        this.x = true;
    }

    public void B(GLTextureInputRenderer bVar) {
        synchronized (this.w) {
            this.v.remove(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public void C() {
        GLES20.glTexImage2D(3553, 0, 6408, l(), j(), 0, 6408, 5121, (Buffer) null);
    }

    public void c() {
        super.c();
        int[] iArr = this.t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.t = null;
        }
        int[] iArr2 = this.u;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.u = null;
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        boolean z;
        if (this.t == null) {
            if (l() != 0 && j() != 0) {
                z();
            } else {
                return;
            }
        }
        if (this.x) {
            z = true;
            GLES20.glBindFramebuffer(36160, this.t[0]);
            super.d();
            GLES20.glBindFramebuffer(36160, 0);
        } else {
            z = false;
        }
        synchronized (this.w) {
            for (GLTextureInputRenderer a2 : this.v) {
                try {
                    a2.a(this.u[0], this, z);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        z();
    }

    public synchronized void w(GLTextureInputRenderer bVar) {
        synchronized (this.w) {
            this.v.add(bVar);
        }
    }

    public Object x() {
        return this.w;
    }

    public List<GLTextureInputRenderer> y() {
        return this.v;
    }
}
