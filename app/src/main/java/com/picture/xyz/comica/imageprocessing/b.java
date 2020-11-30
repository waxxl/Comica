package com.picture.xyz.comica.imageprocessing;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: GLRenderer */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected int f11436a;

    /* renamed from: b  reason: collision with root package name */
    protected FloatBuffer f11437b;

    /* renamed from: c  reason: collision with root package name */
    protected FloatBuffer[] f11438c;

    /* renamed from: d  reason: collision with root package name */
    protected int f11439d;

    /* renamed from: e  reason: collision with root package name */
    private int f11440e;

    /* renamed from: f  reason: collision with root package name */
    private int f11441f;

    /* renamed from: g  reason: collision with root package name */
    protected int f11442g;

    /* renamed from: h  reason: collision with root package name */
    protected int f11443h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    private boolean m;
    private boolean n = false;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;

    public b() {
        u(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f11438c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.f11438c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.f11438c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.f11438c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
        this.f11436a = 0;
        this.j = 0;
        this.m = false;
        this.n = false;
        this.o = false;
    }

    /* access modifiers changed from: protected */
    public void b() {
        GLES20.glBindAttribLocation(this.f11439d, 0, "a_Position");
        GLES20.glBindAttribLocation(this.f11439d, 1, "a_TexCoord");
    }

    public void c() {
        this.n = false;
        int i2 = this.f11439d;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.f11439d = 0;
        }
        int i3 = this.f11440e;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f11440e = 0;
        }
        int i4 = this.f11441f;
        if (i4 != 0) {
            GLES20.glDeleteShader(i4);
            this.f11441f = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.j != 0) {
            GLES20.glViewport(0, 0, this.k, this.l);
            GLES20.glUseProgram(this.f11439d);
            GLES20.glClear(16640);
            GLES20.glClearColor(h(), g(), f(), e());
            q();
            GLES20.glDrawArrays(5, 0, 4);
        }
    }

    public float e() {
        return this.s;
    }

    public float f() {
        return this.r;
    }

    public float g() {
        return this.q;
    }

    public float h() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nvoid main(){\n   gl_FragColor = texture2D(u_Texture0,v_TexCoord);\n}\n";
    }

    public int j() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public String k() {
        return "attribute vec4 a_Position;\nattribute vec2 a_TexCoord;\nvarying vec2 v_TexCoord;\nvoid main() {\n  v_TexCoord = a_TexCoord;\n   gl_Position = a_Position;\n}\n";
    }

    public int l() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.f11442g = GLES20.glGetUniformLocation(this.f11439d, "u_Texture0");
        this.f11443h = GLES20.glGetAttribLocation(this.f11439d, "a_Position");
        this.i = GLES20.glGetAttribLocation(this.f11439d, "a_TexCoord");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    public void o() {
        String str;
        String k2 = k();
        String i2 = i();
        int glCreateShader = GLES20.glCreateShader(35633);
        this.f11440e = glCreateShader;
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, k2);
            GLES20.glCompileShader(this.f11440e);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f11440e, 35713, iArr, 0);
            if (iArr[0] == 0) {
                str = GLES20.glGetShaderInfoLog(this.f11440e);
                GLES20.glDeleteShader(this.f11440e);
                this.f11440e = 0;
                if (this.f11440e == 0) {
                    int glCreateShader2 = GLES20.glCreateShader(35632);
                    this.f11441f = glCreateShader2;
                    if (glCreateShader2 != 0) {
                        GLES20.glShaderSource(glCreateShader2, i2);
                        GLES20.glCompileShader(this.f11441f);
                        int[] iArr2 = new int[1];
                        GLES20.glGetShaderiv(this.f11441f, 35713, iArr2, 0);
                        if (iArr2[0] == 0) {
                            str = GLES20.glGetShaderInfoLog(this.f11441f);
                            GLES20.glDeleteShader(this.f11441f);
                            this.f11441f = 0;
                        }
                    }
                    if (this.f11441f != 0) {
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f11439d = glCreateProgram;
                        if (glCreateProgram != 0) {
                            GLES20.glAttachShader(glCreateProgram, this.f11440e);
                            GLES20.glAttachShader(this.f11439d, this.f11441f);
                            b();
                            GLES20.glLinkProgram(this.f11439d);
                            int[] iArr3 = new int[1];
                            GLES20.glGetProgramiv(this.f11439d, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.f11439d);
                                this.f11439d = 0;
                            }
                        }
                        if (this.f11439d != 0) {
                            n();
                            return;
                        }
                        throw new RuntimeException("Could not create program.");
                    }
                    throw new RuntimeException(this + ": Could not create fragment shader. Reason: " + str);
                }
                throw new RuntimeException(this + ": Could not create vertex shader. Reason: " + str);
            }
        }
        str = "none";
        if (this.f11440e == 0) {
        }
    }

    public void p() {
        if (!this.n) {
            o();
            this.n = true;
        }
        if (this.o) {
            m();
            this.o = false;
        }
        d();
    }

    /* access modifiers changed from: protected */
    public void q() {
        try {
            this.f11437b.position(0);
            GLES20.glVertexAttribPointer(this.f11443h, 2, 5126, false, 8, this.f11437b);
            GLES20.glEnableVertexAttribArray(this.f11443h);
            this.f11438c[this.f11436a].position(0);
            GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 8, this.f11438c[this.f11436a]);
            GLES20.glEnableVertexAttribArray(this.i);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.j);
            GLES20.glUniform1i(this.f11442g, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void r() {
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public void s(int i2) {
        if (!this.m && this.l != i2) {
            this.l = i2;
            this.o = true;
        }
    }

    public void t(int i2, int i3) {
        this.m = true;
        if (this.f11436a % 2 == 1) {
            this.k = i3;
            this.l = i2;
        } else {
            this.k = i2;
            this.l = i3;
        }
        this.o = true;
    }

    /* access modifiers changed from: protected */
    public void u(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11437b = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    /* access modifiers changed from: protected */
    public void v(int i2) {
        if (!this.m && this.k != i2) {
            this.k = i2;
            this.o = true;
        }
    }
}
