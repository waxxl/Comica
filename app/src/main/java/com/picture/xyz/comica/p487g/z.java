package com.picture.xyz.comica.p487g;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.opengl.GLES20;
import android.preference.PreferenceManager;
import com.picture.xyz.comica.comica.ca;
import com.picture.xyz.comica.imageprocessing.GLRenderer;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p255f.GLTextureInputRenderer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import com.picture.xyz.comica.p488g.g;

/* renamed from: g.a */
public class z extends GLRenderer implements GLTextureInputRenderer {

    /* renamed from: A */
    private int f39637A;

    /* renamed from: B */
    protected int[] f39638B;

    /* renamed from: t */
    protected int[] f39639t;

    /* renamed from: u */
    File f39640u = mo51917w();

    /* renamed from: v */
    protected int[] f39641v;

    /* renamed from: w */
    private Context f39642w;

    /* renamed from: x */
    private boolean f39643x;

    /* renamed from: y */
    private boolean f39644y;

    /* renamed from: z */
    private String f39645z;

    public z(Context context, boolean z, String str, boolean z2) {
        this.f39642w = context;
        this.f39643x = z;
        this.f39645z = str;
        this.f39644y = z2;
        this.f39637A = 1;
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

    /* renamed from: z */
    private /* synthetic */ void m48673z() {
        int[] iArr = this.f39639t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f39639t = null;
        }
        int[] iArr2 = this.f39638B;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f39638B = null;
        }
        int[] iArr3 = this.f39641v;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f39641v = null;
        }
        int[] iArr4 = new int[1];
        this.f39639t = iArr4;
        this.f39638B = new int[1];
        this.f39641v = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f39641v, 0);
        GLES20.glGenTextures(1, this.f39638B, 0);
        GLES20.glBindFramebuffer(36160, this.f39639t[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f39638B[0]);
        GLES20.glTexImage2D(3553, 0, 6408, mo24173l(), mo24171j(), 0, 6408, 5121, (Buffer) null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f39638B[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f39641v[0]);
        GLES20.glRenderbufferStorage(36161, 33189, mo24173l(), mo24171j());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f39641v[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(this + g.m48767a(".2Rs}~qv4f{2gw`2ab4`q|pwf2vgrtq`4e}f|2gfufaa4") + glCheckFramebufferStatus + ca.m21145d("I9\u0007<I=\u001b*\u0006*I") + GLES20.glGetError());
        }
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        this.f15549j = i;
        mo24181v(aVar.mo24173l());
        mo24178s(aVar.mo24171j());
        mo24176p();
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int[] iArr = this.f39639t;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f39639t = null;
        }
        int[] iArr2 = this.f39638B;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f39638B = null;
        }
        int[] iArr3 = this.f39641v;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f39641v = null;
        }
    }

    /* renamed from: d */
    public void mo24166d() {
        if (this.f39639t == null) {
            if (mo24173l() != 0 && mo24171j() != 0) {
                m48673z();
            } else {
                return;
            }
        }
        GLES20.glBindFramebuffer(36160, this.f39639t[0]);
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
        Bitmap createBitmap = Bitmap.createBitmap(iArr, mo24173l(), mo24171j(), Bitmap.Config.ARGB_8888);
        PreferenceManager.getDefaultSharedPreferences(this.f39642w).getBoolean(ca.m21145d("\u001e9\u001d=\u001b5\b*\u0002"), true);
        if (this.f39644y) {
            StringBuilder insert = new StringBuilder().insert(0, this.f39645z);
            insert.append(this.f39637A);
            insert.toString();
            this.f39637A++;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f39640u);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (this.f39643x) {
                mo51918x();
                MediaScannerConnection.scanFile(this.f39642w, new String[]{this.f39645z}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
        m48673z();
    }

    /* renamed from: w */
    public File mo51917w() {
        return new File(this.f39642w.getCacheDir(), g.m48767a("dz{f{<~bs"));
    }

    /* renamed from: x */
    public void mo51918x() throws IOException {
        mo51919y(this.f39645z);
    }

    /* renamed from: y */
    public void mo51919y(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f39640u);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }
}
