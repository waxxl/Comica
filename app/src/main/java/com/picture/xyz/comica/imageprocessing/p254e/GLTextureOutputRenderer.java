package com.picture.xyz.comica.imageprocessing.p254e;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.GLRenderer;
import com.picture.xyz.comica.imageprocessing.p255f.GLTextureInputRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.e.a */
public abstract class GLTextureOutputRenderer extends GLRenderer {

    /* renamed from: t */
    protected int[] f15560t;

    /* renamed from: u */
    protected int[] f15561u;

    /* renamed from: v */
    private List<GLTextureInputRenderer> f15562v = new ArrayList();

    /* renamed from: w */
    private Object f15563w = new Object();

    /* renamed from: x */
    private boolean f15564x;

    /* renamed from: z */
    private void m21175z() {
        int[] iArr = this.f15560t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f15560t = null;
        }
        int[] iArr2 = this.f15561u;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f15561u = null;
        }
        int[] iArr3 = new int[1];
        this.f15560t = iArr3;
        this.f15561u = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        GLES20.glGenTextures(1, this.f15561u, 0);
        GLES20.glBindFramebuffer(36160, this.f15560t[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f15561u[0]);
        mo24186C();
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f15561u[0], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    /* renamed from: A */
    public void mo24184A() {
        this.f15564x = true;
    }

    /* renamed from: B */
    public void mo24185B(GLTextureInputRenderer bVar) {
        synchronized (this.f15563w) {
            this.f15562v.remove(bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo24186C() {
        GLES20.glTexImage2D(3553, 0, 6408, mo24173l(), mo24171j(), 0, 6408, 5121, (Buffer) null);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int[] iArr = this.f15560t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f15560t = null;
        }
        int[] iArr2 = this.f15561u;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f15561u = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24166d() {
        boolean z;
        if (this.f15560t == null) {
            if (mo24173l() != 0 && mo24171j() != 0) {
                m21175z();
            } else {
                return;
            }
        }
        if (this.f15564x) {
            z = true;
            GLES20.glBindFramebuffer(36160, this.f15560t[0]);
            super.mo24166d();
            GLES20.glBindFramebuffer(36160, 0);
        } else {
            z = false;
        }
        synchronized (this.f15563w) {
            for (GLTextureInputRenderer a : this.f15562v) {
                try {
                    a.mo24183a(this.f15561u[0], this, z);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
        m21175z();
    }

    /* renamed from: w */
    public synchronized void mo24187w(GLTextureInputRenderer bVar) {
        synchronized (this.f15563w) {
            this.f15562v.add(bVar);
        }
    }

    /* renamed from: x */
    public Object mo24188x() {
        return this.f15563w;
    }

    /* renamed from: y */
    public List<GLTextureInputRenderer> mo24189y() {
        return this.f15562v;
    }
}
