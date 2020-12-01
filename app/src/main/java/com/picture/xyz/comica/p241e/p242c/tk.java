package com.picture.xyz.comica.p241e.p242c;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.util.Log;
import com.picture.xyz.comica.p243f.p244a.p245a.j;
import com.picture.xyz.comica.comica.pa;
import com.picture.xyz.comica.comica.Face2;

/* renamed from: e.c.b */
public class tk extends sl {

    /* renamed from: H */
    PointF f15494H;

    /* renamed from: I */
    private int f15495I;

    /* renamed from: J */
    PointF f15496J;

    /* renamed from: K */
    private int f15497K;

    /* renamed from: L */
    PointF f15498L;

    /* renamed from: M */
    private int f15499M;

    /* renamed from: N */
    private int f15500N;

    /* renamed from: O */
    PointF f15501O;

    /* renamed from: P */
    Face2 f15502P;

    /* renamed from: Q */
    private int f15503Q;

    /* renamed from: R */
    PointF f15504R;

    /* renamed from: S */
    private int f15505S;

    /* renamed from: T */
    private int f15506T;

    /* renamed from: U */
    PointF f15507U;

    /* renamed from: V */
    PointF f15508V;

    public tk(Face2 hVar) {
        mo24140G(hVar);
        if (hVar != null) {
            this.f15510B = hVar.mo24159j();
            this.f15509A = hVar.mo24152a();
        } else {
            this.f15510B = 0.0f;
            this.f15509A = 0.0f;
        }
        this.f15514F = this.f15509A;
        this.f15512D = this.f15510B;
    }

    /* renamed from: G */
    public void mo24140G(Face2 hVar) {
        if (hVar != null) {
            Log.e(pa.m48765a("a.f\rs(w"), j.m48668a("]\fGC]\u0016_\u000f"));
            this.f15502P = hVar;
            this.f15496J = hVar.mo24155f();
            this.f15498L = this.f15502P.mo24156g();
            this.f15501O = this.f15502P.mo24158i();
            this.f15508V = this.f15502P.mo24157h();
            this.f15507U = this.f15502P.mo24161l();
            this.f15504R = this.f15502P.mo24160k();
            this.f15494H = this.f15502P.mo24153b();
            this.f15512D = this.f15502P.mo24159j();
            this.f15514F = this.f15502P.mo24152a();
        } else {
            Log.e(pa.m48765a("a.f\rs(w"), j.m48668a("C]\u0016_\u000f"));
            this.f15496J = new PointF(-1.0f, -1.0f);
            this.f15498L = new PointF(-1.0f, -1.0f);
            this.f15501O = new PointF(-1.0f, -1.0f);
            this.f15508V = new PointF(-1.0f, -1.0f);
            this.f15507U = new PointF(-1.0f, -1.0f);
            this.f15504R = new PointF(-1.0f, -1.0f);
            this.f15494H = new PointF(-1.0f, -1.0f);
            this.f15512D = 0.0f;
            this.f15514F = 0.0f;
        }
        this.f15510B = this.f15512D * this.f15513E;
        this.f15509A = this.f15514F * this.f15515G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return j.m48668a("C\u0011V\u0000Z\u0010Z\f]C^\u0006W\nF\u000eCCU\u000f\\\u0002GX9\u0016]\nU\fA\u000e\u0013\u0010R\u000eC\u000fV\u0011\u0001'\u0013\u0016l7V\u001bG\u0016A\u0006\u0003X9\u0015R\u0011J\n]\u0004\u0013\u0015V\u0000\u0001CE<g\u0006K \\\fA\u0007\biF\rZ\u0005\\\u0011^CE\u0006PQ\u0013\u0016l-\\\u0010VX9\u0016]\nU\fA\u000e\u0013\u0015V\u0000\u0001CF<y\u0002DX9\u0016]\nU\fA\u000e\u0013\u0015V\u0000\u0001CF<\u0001A\fDX9\u0016]\nU\fA\u000e\u0013\u0015V\u0000\u0001CF<a\u0001A\fDX9\u0016]\nU\fA\u000e\u0013\u0015V\u0000\u0001CF<\nC\u0010\biF\rZ\u0005\\\u0011^CE\u0006PQ\u0013\u0016l/P\u000bV\u0006XX9\u0016]\nU\fA\u000e\u0013\u0015V\u0000\u0001CF<a\u0000[\u0006V\b\biF\rZ\u0005\\\u0011^CU\u000f\\\u0002GCF<a\u0002W\nF\u0010\biF\rZ\u0005\\\u0011^CU\u000f\\\u0002GCF<w\n@\u0017\\\u0011G\n\\\rr\u000e\\\u0016]\u0017\biP\f]\u0010GCU\u000f\\\u0002GCR\u0010C\u0006P\u0017l\u0011R\u0017Z\f\u0013^\u0013R\u001dS\bi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f15503Q = GLES20.glGetUniformLocation(this.f15543d, "u_Nose");
        this.f15497K = GLES20.glGetUniformLocation(this.f15543d, "u_Jaw");
        this.f15505S = GLES20.glGetUniformLocation(this.f15543d, "u_Lbrow");
        this.f15500N = GLES20.glGetUniformLocation(this.f15543d, "u_Rbrow");
        this.f15506T = GLES20.glGetUniformLocation(this.f15543d, "u_Lips");
        this.f15499M = GLES20.glGetUniformLocation(this.f15543d, "u_Lcheek");
        this.f15495I = GLES20.glGetUniformLocation(this.f15543d, "u_Rcheek");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        int i = this.f15503Q;
        PointF pointF = this.f15496J;
        GLES20.glUniform2f(i, pointF.x, pointF.y);
        int i2 = this.f15497K;
        PointF pointF2 = this.f15498L;
        GLES20.glUniform2f(i2, pointF2.x, pointF2.y);
        int i3 = this.f15505S;
        PointF pointF3 = this.f15501O;
        GLES20.glUniform2f(i3, pointF3.x, pointF3.y);
        int i4 = this.f15500N;
        PointF pointF4 = this.f15508V;
        GLES20.glUniform2f(i4, pointF4.x, pointF4.y);
        int i5 = this.f15506T;
        PointF pointF5 = this.f15507U;
        GLES20.glUniform2f(i5, pointF5.x, pointF5.y);
        int i6 = this.f15499M;
        PointF pointF6 = this.f15504R;
        GLES20.glUniform2f(i6, pointF6.x, pointF6.y);
        int i7 = this.f15495I;
        PointF pointF7 = this.f15494H;
        GLES20.glUniform2f(i7, pointF7.x, pointF7.y);
    }
}
