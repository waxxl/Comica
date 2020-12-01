package com.picture.xyz.comica.imageprocessing.p255f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import com.picture.xyz.comica.imageprocessing.GLRenderer;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.f.a */
public class BitmapOutput extends GLRenderer implements GLTextureInputRenderer {

    /* renamed from: t */
    private C11653a f41158t;

    /* renamed from: u */
    protected int[] f41159u;

    /* renamed from: v */
    protected int[] f41160v;

    /* renamed from: w */
    protected int[] f41161w;

    /* renamed from: com.picture.xyz.comica.imageprocessing.f.a$a */
    /* compiled from: BitmapOutput */
    public interface C11653a {
        /* renamed from: a */
        void mo51898a(Bitmap bitmap);
    }

    public BitmapOutput(C11653a aVar) {
        this.f41158t = aVar;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f15542c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f15542c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f15542c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f15542c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    /* renamed from: w */
    private void m50978w() {
        int[] iArr = this.f41159u;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41159u = null;
        }
        int[] iArr2 = this.f41160v;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f41160v = null;
        }
        int[] iArr3 = this.f41161w;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f41161w = null;
        }
        int[] iArr4 = new int[1];
        this.f41159u = iArr4;
        this.f41160v = new int[1];
        this.f41161w = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f41161w, 0);
        GLES20.glGenTextures(1, this.f41160v, 0);
        GLES20.glBindFramebuffer(36160, this.f41159u[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f41160v[0]);
        GLES20.glTexImage2D(3553, 0, 6408, mo24173l(), mo24171j(), 0, 6408, 5121, (Buffer) null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f41160v[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f41161w[0]);
        GLES20.glRenderbufferStorage(36161, 33189, mo24173l(), mo24171j());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f41161w[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + ": Failed to set up render buffer with status " + glCheckFramebufferStatus + " and error " + GLES20.glGetError());
        }
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        this.f15549j = i;
        if (this.f15540a % 2 == 1) {
            mo24181v(aVar.mo24171j());
            mo24178s(aVar.mo24173l());
        } else {
            mo24181v(aVar.mo24173l());
            mo24178s(aVar.mo24171j());
        }
        mo24176p();
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int[] iArr = this.f41159u;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41159u = null;
        }
        int[] iArr2 = this.f41160v;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f41160v = null;
        }
        int[] iArr3 = this.f41161w;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f41161w = null;
        }
    }

    /* renamed from: d */
    public void mo24166d() {
        if (this.f41159u == null) {
            if (mo24173l() != 0 && mo24171j() != 0) {
                m50978w();
            } else {
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, this.f41159u[0]);
        super.mo24166d();
        int l = mo24173l() * mo24171j();
        int[] iArr = new int[l];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, mo24173l(), mo24171j(), 6408, 5121, wrap);
        GLES20.glBindFramebuffer(36160, 0);
        for (int i = 0; i < l; i++) {
            iArr[i] = (iArr[i] & -16711936) | ((iArr[i] >> 16) & 255) | ((iArr[i] << 16) & 16711680);
        }
        this.f41158t.mo51898a(Bitmap.createBitmap(iArr, mo24173l(), mo24171j(), Bitmap.Config.ARGB_8888));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
        m50978w();
    }
}
