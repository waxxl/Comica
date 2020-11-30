package com.picture.xyz.comica.imageprocessing.f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import com.picture.xyz.comica.imageprocessing.b;

/* compiled from: BitmapOutput */
public class a extends b /*implements b*/ {
    private C0437a t;
    protected int[] u;
    protected int[] v;
    protected int[] w;

    /* renamed from: com.picture.xyz.comica.imageprocessing.f.a$a  reason: collision with other inner class name */
    /* compiled from: BitmapOutput */
    public interface C0437a {
        void a(Bitmap bitmap);
    }

    public a(C0437a aVar) {
        this.t = aVar;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f11438c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f11438c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f11438c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f11438c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    private void w() {
        int[] iArr = this.u;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.u = null;
        }
        int[] iArr2 = this.v;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.v = null;
        }
        int[] iArr3 = this.w;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.w = null;
        }
        int[] iArr4 = new int[1];
        this.u = iArr4;
        this.v = new int[1];
        this.w = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.w, 0);
        GLES20.glGenTextures(1, this.v, 0);
        GLES20.glBindFramebuffer(36160, this.u[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.v[0]);
        GLES20.glTexImage2D(3553, 0, 6408, l(), j(), 0, 6408, 5121, (Buffer) null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.v[0], 0);
        GLES20.glBindRenderbuffer(36161, this.w[0]);
        GLES20.glRenderbufferStorage(36161, 33189, l(), j());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.w[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    public void a(int i, com.picture.xyz.comica.imageprocessing.e.a aVar, boolean z) {
        this.j = i;
        if (this.f11436a % 2 == 1) {
            v(aVar.j());
            s(aVar.l());
        } else {
            v(aVar.l());
            s(aVar.j());
        }
        p();
    }

    public void c() {
        super.c();
        int[] iArr = this.u;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.u = null;
        }
        int[] iArr2 = this.v;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.v = null;
        }
        int[] iArr3 = this.w;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.w = null;
        }
    }

    public void d() {
        if (this.u == null) {
            if (l() != 0 && j() != 0) {
                w();
            } else {
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, this.u[0]);
        super.d();
        int l = l() * j();
        int[] iArr = new int[l];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, l(), j(), 6408, 5121, wrap);
        GLES20.glBindFramebuffer(36160, 0);
        for (int i = 0; i < l; i++) {
            iArr[i] = (iArr[i] & -16711936) | ((iArr[i] >> 16) & 255) | ((iArr[i] << 16) & 16711680);
        }
        this.t.a(Bitmap.createBitmap(iArr, l(), j(), Bitmap.Config.ARGB_8888));
    }

    /* access modifiers changed from: protected */
    public void m() {
        w();
    }
}
