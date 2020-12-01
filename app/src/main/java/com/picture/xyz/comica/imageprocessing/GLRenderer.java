package com.picture.xyz.comica.imageprocessing;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.picture.xyz.comica.imageprocessing.b */
public abstract class GLRenderer {

    /* renamed from: a */
    protected int f15540a;

    /* renamed from: b */
    protected FloatBuffer f15541b;

    /* renamed from: c */
    protected FloatBuffer[] f15542c;

    /* renamed from: d */
    protected int f15543d;

    /* renamed from: e */
    private int f15544e;

    /* renamed from: f */
    private int f15545f;

    /* renamed from: g */
    protected int f15546g;

    /* renamed from: h */
    protected int f15547h;

    /* renamed from: i */
    protected int f15548i;

    /* renamed from: j */
    protected int f15549j;

    /* renamed from: k */
    protected int f15550k;

    /* renamed from: l */
    protected int f15551l;

    /* renamed from: m */
    private boolean f15552m;

    /* renamed from: n */
    private boolean f15553n = false;

    /* renamed from: o */
    private boolean f15554o;

    /* renamed from: p */
    private float f15555p;

    /* renamed from: q */
    private float f15556q;

    /* renamed from: r */
    private float f15557r;

    /* renamed from: s */
    private float f15558s;

    public GLRenderer() {
        mo24180u(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f15542c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.f15542c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.f15542c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.f15542c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
        this.f15540a = 0;
        this.f15549j = 0;
        this.f15552m = false;
        this.f15553n = false;
        this.f15554o = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24164b() {
        GLES20.glBindAttribLocation(this.f15543d, 0, "a_Position");
        GLES20.glBindAttribLocation(this.f15543d, 1, "a_TexCoord");
    }

    /* renamed from: c */
    public void mo24165c() {
        this.f15553n = false;
        int i = this.f15543d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f15543d = 0;
        }
        int i2 = this.f15544e;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.f15544e = 0;
        }
        int i3 = this.f15545f;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f15545f = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24166d() {
        if (this.f15549j != 0) {
            GLES20.glViewport(0, 0, this.f15550k, this.f15551l);
            GLES20.glUseProgram(this.f15543d);
            GLES20.glClear(16640);
            GLES20.glClearColor(mo24170h(), mo24169g(), mo24168f(), mo24167e());
            mo24143q();
            GLES20.glDrawArrays(5, 0, 4);
        }
    }

    /* renamed from: e */
    public float mo24167e() {
        return this.f15558s;
    }

    /* renamed from: f */
    public float mo24168f() {
        return this.f15557r;
    }

    /* renamed from: g */
    public float mo24169g() {
        return this.f15556q;
    }

    /* renamed from: h */
    public float mo24170h() {
        return this.f15555p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nvoid main(){\n   gl_FragColor = texture2D(u_Texture0,v_TexCoord);\n}\n";
    }

    /* renamed from: j */
    public int mo24171j() {
        return this.f15551l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo24172k() {
        return "attribute vec4 a_Position;\nattribute vec2 a_TexCoord;\nvarying vec2 v_TexCoord;\nvoid main() {\n  v_TexCoord = a_TexCoord;\n   gl_Position = a_Position;\n}\n";
    }

    /* renamed from: l */
    public int mo24173l() {
        return this.f15550k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24174m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        this.f15546g = GLES20.glGetUniformLocation(this.f15543d, "u_Texture0");
        this.f15547h = GLES20.glGetAttribLocation(this.f15543d, "a_Position");
        this.f15548i = GLES20.glGetAttribLocation(this.f15543d, "a_TexCoord");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* renamed from: o */
    public void mo24175o() {
        String str;
        String k = mo24172k();
        String i = mo24141i();
        int glCreateShader = GLES20.glCreateShader(35633);
        this.f15544e = glCreateShader;
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, k);
            GLES20.glCompileShader(this.f15544e);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f15544e, 35713, iArr, 0);
            if (iArr[0] == 0) {
                str = GLES20.glGetShaderInfoLog(this.f15544e);
                GLES20.glDeleteShader(this.f15544e);
                this.f15544e = 0;
                if (this.f15544e == 0) {
                    int glCreateShader2 = GLES20.glCreateShader(35632);
                    this.f15545f = glCreateShader2;
                    if (glCreateShader2 != 0) {
                        GLES20.glShaderSource(glCreateShader2, i);
                        GLES20.glCompileShader(this.f15545f);
                        int[] iArr2 = new int[1];
                        GLES20.glGetShaderiv(this.f15545f, 35713, iArr2, 0);
                        if (iArr2[0] == 0) {
                            str = GLES20.glGetShaderInfoLog(this.f15545f);
                            GLES20.glDeleteShader(this.f15545f);
                            this.f15545f = 0;
                        }
                    }
                    if (this.f15545f != 0) {
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f15543d = glCreateProgram;
                        if (glCreateProgram != 0) {
                            GLES20.glAttachShader(glCreateProgram, this.f15544e);
                            GLES20.glAttachShader(this.f15543d, this.f15545f);
                            mo24164b();
                            GLES20.glLinkProgram(this.f15543d);
                            int[] iArr3 = new int[1];
                            GLES20.glGetProgramiv(this.f15543d, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.f15543d);
                                this.f15543d = 0;
                            }
                        }
                        if (this.f15543d != 0) {
                            mo24142n();
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
        if (this.f15544e == 0) {
        }
    }

    /* renamed from: p */
    public void mo24176p() {
        if (!this.f15553n) {
            mo24175o();
            this.f15553n = true;
        }
        if (this.f15554o) {
            mo24174m();
            this.f15554o = false;
        }
        mo24166d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        try {
            this.f15541b.position(0);
            GLES20.glVertexAttribPointer(this.f15547h, 2, 5126, false, 8, this.f15541b);
            GLES20.glEnableVertexAttribArray(this.f15547h);
            this.f15542c[this.f15540a].position(0);
            GLES20.glVertexAttribPointer(this.f15548i, 2, 5126, false, 8, this.f15542c[this.f15540a]);
            GLES20.glEnableVertexAttribArray(this.f15548i);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f15549j);
            GLES20.glUniform1i(this.f15546g, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public void mo24177r() {
        this.f15553n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo24178s(int i) {
        if (!this.f15552m && this.f15551l != i) {
            this.f15551l = i;
            this.f15554o = true;
        }
    }

    /* renamed from: t */
    public void mo24179t(int i, int i2) {
        this.f15552m = true;
        if (this.f15540a % 2 == 1) {
            this.f15550k = i2;
            this.f15551l = i;
        } else {
            this.f15550k = i;
            this.f15551l = i2;
        }
        this.f15554o = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo24180u(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15541b = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo24181v(int i) {
        if (!this.f15552m && this.f15550k != i) {
            this.f15550k = i;
            this.f15554o = true;
        }
    }
}
