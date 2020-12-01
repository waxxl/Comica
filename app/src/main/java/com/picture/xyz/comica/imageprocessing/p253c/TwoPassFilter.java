package com.picture.xyz.comica.imageprocessing.p253c;

import android.opengl.GLES20;
import java.nio.Buffer;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.g */
public abstract class TwoPassFilter extends BasicFilter {

    /* renamed from: A */
    private int[] f41116A;

    /* renamed from: B */
    private int[] f41117B;

    /* renamed from: C */
    private int f41118C;

    /* renamed from: z */
    private int[] f41119z;

    /* renamed from: z */
    private void m50927z() {
        int[] iArr = this.f41119z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41119z = null;
        }
        int[] iArr2 = this.f41116A;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f41116A = null;
        }
        int[] iArr3 = this.f41117B;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f41117B = null;
        }
        int[] iArr4 = new int[1];
        this.f41119z = iArr4;
        this.f41116A = new int[1];
        this.f41117B = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f41117B, 0);
        GLES20.glGenTextures(1, this.f41116A, 0);
        GLES20.glBindFramebuffer(36160, this.f41119z[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f41116A[0]);
        GLES20.glTexImage2D(3553, 0, 6407, mo24173l(), mo24171j(), 0, 6407, 33635, (Buffer) null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f41116A[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f41117B[0]);
        GLES20.glRenderbufferStorage(36161, 33189, mo24173l(), mo24171j());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f41117B[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo53649G() {
        return this.f41118C;
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int[] iArr = this.f41119z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41119z = null;
        }
        int[] iArr2 = this.f41116A;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f41116A = null;
        }
        int[] iArr3 = this.f41117B;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f41117B = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24166d() {
        this.f41118C = 1;
        if (this.f41119z == null) {
            if (mo24173l() != 0 && mo24171j() != 0) {
                m50927z();
            } else {
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, this.f41119z[0]);
        if (this.f15549j != 0) {
            GLES20.glViewport(0, 0, mo24173l(), mo24171j());
            GLES20.glUseProgram(this.f15543d);
            GLES20.glClear(16640);
            GLES20.glClearColor(mo24170h(), mo24169g(), mo24168f(), mo24167e());
            mo24143q();
            GLES20.glDrawArrays(5, 0, 4);
            this.f15549j = this.f41116A[0];
            GLES20.glBindFramebuffer(36160, 0);
            this.f41118C = 2;
            super.mo24166d();
        }
    }
}
