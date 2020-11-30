package com.picture.xyz.comica.imageprocessing.c;

import android.opengl.GLES20;
import java.nio.Buffer;

/* compiled from: TwoPassFilter */
public abstract class g extends BasicFilter {
    private int[] A;
    private int[] B;
    private int C;
    private int[] z;

    private void z() {
        int[] iArr = this.z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.z = null;
        }
        int[] iArr2 = this.A;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.A = null;
        }
        int[] iArr3 = this.B;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.B = null;
        }
        int[] iArr4 = new int[1];
        this.z = iArr4;
        this.A = new int[1];
        this.B = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.B, 0);
        GLES20.glGenTextures(1, this.A, 0);
        GLES20.glBindFramebuffer(36160, this.z[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.A[0]);
        GLES20.glTexImage2D(3553, 0, 6407, l(), j(), 0, 6407, 33635, (Buffer) null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.A[0], 0);
        GLES20.glBindRenderbuffer(36161, this.B[0]);
        GLES20.glRenderbufferStorage(36161, 33189, l(), j());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.B[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    /* access modifiers changed from: protected */
    public int G() {
        return this.C;
    }

    public void c() {
        super.c();
        int[] iArr = this.z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.z = null;
        }
        int[] iArr2 = this.A;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.A = null;
        }
        int[] iArr3 = this.B;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.B = null;
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.C = 1;
        if (this.z == null) {
            if (l() != 0 && j() != 0) {
                z();
            } else {
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, this.z[0]);
        if (this.j != 0) {
            GLES20.glViewport(0, 0, l(), j());
            GLES20.glUseProgram(this.f11439d);
            GLES20.glClear(16640);
            GLES20.glClearColor(h(), g(), f(), e());
            q();
            GLES20.glDrawArrays(5, 0, 4);
            this.j = this.A[0];
            GLES20.glBindFramebuffer(36160, 0);
            this.C = 2;
            super.d();
        }
    }
}
