package com.picture.xyz.comica.p241e.p456a;

import android.opengl.GLES20;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.a.a */
public class dl extends BasicFilter {

    /* renamed from: A */
    private float f39440A = 0.0f;

    /* renamed from: B */
    private int f39441B;

    /* renamed from: C */
    private float f39442C = 1.0f;

    /* renamed from: D */
    private int f39443D;

    /* renamed from: E */
    private int f39444E;

    /* renamed from: z */
    private float f39445z = 1.0f;

    /* renamed from: D */
    public float mo24144D(String str) {
        float f;
        float f2;
        if (str.equals(jh.f39474i)) {
            f = this.f39440A + 0.3f;
            f2 = 0.03f;
        } else if (str.equals(jh.f39473h)) {
            f = this.f39442C;
            f2 = 0.1f;
        } else if (!str.equals(jh.f39476k)) {
            return 0.0f;
        } else {
            f = this.f39445z - 0.5f;
            f2 = 0.075f;
        }
        return f / f2;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39474i)) {
            this.f39440A = (0.03f * f) - 0.3f;
        }
        if (str.equals(jh.f39473h)) {
            this.f39442C = 0.1f * f;
        }
        if (str.equals(jh.f39476k)) {
            this.f39445z = (f * 0.075f) + 0.5f;
        }
    }

    /* renamed from: G */
    public void mo51903G(float f) {
        this.f39440A = f;
    }

    /* renamed from: H */
    public void mo51904H(float f) {
        this.f39445z = f;
    }

    /* renamed from: I */
    public void mo51905I(float f) {
        this.f39442C = f;
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return C4228i.m21095a("-K8Z4J4V3\u00190\\9P(T-\u0019;U2X)\u0002WL3P;V/T}J<T-U8Ko}}L\u0002m8A)L/\\m\u0002WL3P;V/T}_1V<M}L\u0002j<M(K<M4V3\u0002WL3P;V/T}_1V<M}L\u0002z2W)K<J)\u0002WL3P;V/T}_1V<M}L\u0002{/P:Q)W8J.\u0002WZ2W.M}O8Zn\u00191L0P3X3Z8n8P:Q)P3^}\u0004}O8Zn\u0011m\u0017o\bo\fq\u0019m\u0017j\bh\rq\u0019m\u0017m\u000eo\bt\u0002WO<K$P3^}O8Zo\u0019+f\t\\%z2V/]f3+V4]}T<P3\u0011tBW\u0019}O8Zi\u00191L)z2U2K}\u0004}M8A)L/\\o}uL\u0002m8A)L/\\m\u0015+f\t\\%z2V/]t\u0002W\u0019}P;\u0019uL\u0002j<M(K<M4V3\u0019|\u0004}\bs\tt3}\u0019&3}\u0019}_1V<M}U(T4W<W>\\}\u0004}]2MuU(M\u001eV1V/\u0017/^?\u0015}U(T4W<W>\\\n\\4^5M4W:\u0010f3}\u0019}O8Zn\u0019:K8@\u000eZ<U8z2U2K}\u0004}O8Zn\u00111L0P3X3Z8\u0010f3}\u0019}U(M\u001eV1V/\u0019`\u0019+\\>\ruT4Au^/\\$j>X1\\\u001eV1V/\u0015}U(M\u001eV1V/\u0017/^?\u0015}L\u0002j<M(K<M4V3\u0010q\u00191L)z2U2KsXt\u0002W\u0019}DW\u0019}O8Zi\u0019?K}\u0004}O8Zi\u0011(f\u001fK4^5M3\\.Jq\u0019(f\u001fK4^5M3\\.Jq\u0019(f\u001fK4^5M3\\.Jq\u0019l\u0010f3}\u00191L)z2U2K}\u0004}U(M\u001eV1V/\u0019v\u0019?Kf3}\u0019:U\u0002/X:z2U2K}\u0004}O8Zi\u0011u\u00111L)z2U2KsK:[}\u0014}O8Zn\u0011m\u0017h\u0010t\u0019w\u0019(f\u001eV3M/X.M}\u0012}O8Zn\u0011m\u0017h\u0010t\u0015}U(M\u001eV1V/\u0017<\u0010f3 3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39443D = GLES20.glGetUniformLocation(this.f15543d, "u_Saturation");
        this.f39441B = GLES20.glGetUniformLocation(this.f15543d, "u_Contrast");
        this.f39444E = GLES20.glGetUniformLocation(this.f15543d, "u_Brightness");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39443D, this.f39442C);
        GLES20.glUniform1f(this.f39441B, this.f39445z);
        GLES20.glUniform1f(this.f39444E, this.f39440A);
    }
}
