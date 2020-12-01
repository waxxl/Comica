package com.picture.xyz.comica.p241e.p242c;

import android.opengl.GLES20;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.c.c */
public class sl extends BasicFilter {

    /* renamed from: A */
    protected float f15509A = 0.4f;

    /* renamed from: B */
    protected float f15510B = 0.3f;

    /* renamed from: C */
    private int f15511C;

    /* renamed from: D */
    protected float f15512D;

    /* renamed from: E */
    protected float f15513E = 1.0f;

    /* renamed from: F */
    protected float f15514F;

    /* renamed from: G */
    protected float f15515G = 1.0f;

    /* renamed from: z */
    private int f15516z;

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39478m)) {
            return this.f15515G * 5.0f;
        }
        if (str.equals(jh.f39477l)) {
            return (this.f15513E * 10.0f) - 5.0f;
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39478m)) {
            this.f15515G = ((f - 5.0f) / 5.0f) + 1.0f;
        }
        if (str.equals(jh.f39477l)) {
            this.f15513E = ((f - 5.0f) / 10.0f) + 1.0f;
        }
        this.f15509A = this.f15514F * this.f15515G;
        this.f15510B = this.f15512D * this.f15513E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return C4230g.m21121c("\u0010+\u0005:\t*\t6\u000ey\r<\u00040\u00154\u0010y\u00065\u000f8\u0014bj,\u000e0\u00066\u00124@*\u00014\u00105\u0005+R\u001d@,?\r\u0005!\u0014,\u0012<Pbj/\u0001+\u00190\u000e>@/\u0005:Ry\u0016\u00064<\u0018\u001a\u000f6\u0012=[S\u0016<\u0003k@:\u00057\u0014<\u0012y]y\u0016<\u0003kHiNlLyPwUp[S\u00157\t?\u000f+\ry\u00065\u000f8\u0014y\u0015\u000628\u00040\u0015*[S\u00157\t?\u000f+\ry\u00065\u000f8\u0014y\u0015\u0006$0\u0013-\u000f+\u00140\u000f7!4\u000f,\u000e-[S\u00036\u000e*\u0014y\u00065\u000f8\u0014y\u0001*\u0010<\u0003-?+\u0001-\t6@d@hNi[S\u00166\t=@4\u00010\u000eqI\"jy@y\b0\u00071\u0010y\u0016<\u0003k@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005y]y\u0016\u00064<\u0018\u001a\u000f6\u0012=[S@y@1\t>\b)@?\f6\u0001-@=\t*\u0014y]y\u00040\u0013-\u00017\u0003<H:\u00057\u0014<\u0012u@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005p[S@y@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005y]y\u0016\u00064<\u0018\u001a\u000f6\u0012=[S@y@0\u0006yH=\t*\u0014y\\y\u0015\u000628\u00040\u0015*Iy\u001bS@y@y@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005yMd@:\u00057\u0014<\u0012bjy@y@y\b0\u00071\u0010y\u00065\u000f8\u0014y\u0010<\u0012:\u00057\u0014y]yQwPyMyH,?\u000b\u0001=\t,\u0013yMy\u00040\u0013-IyOy\u0015\u000628\u00040\u0015*@s@,?\u001d\t*\u00146\u0012-\t6\u000e\u0018\r6\u00157\u0014bjy@y@y\u0010<\u0012:\u00057\u0014y]y\u0010<\u0012:\u00057\u0014yJy\u0010<\u0012:\u00057\u0014bjy@y@y\u0014<\u0018-\u0015+\u0005\u001a\u000f6\u0012=\t7\u0001-\u0005\r\u000f\f\u0013<@d@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005yJy\u0010<\u0012:\u00057\u0014bjy@y@y\u0014<\u0018-\u0015+\u0005\u001a\u000f6\u0012=\t7\u0001-\u0005\r\u000f\f\u0013<@r]y\u0003<\u000e-\u0005+[S@y@$jy@y\u00075?\u001f\u00128\u0007\u001a\u000f5\u000f+@d@-\u0005!\u0014,\u0012<R\u001dH,?\r\u0005!\u0014,\u0012<Pu@-\u0005!\u0014,\u0012<#6\u000f+\u00040\u000e8\u0014<465*\u0005p[S\u001dS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f15516z = GLES20.glGetUniformLocation(this.f15543d, "u_Radius");
        this.f15511C = GLES20.glGetUniformLocation(this.f15543d, "u_DistortionAmount");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f15516z, this.f15510B);
        GLES20.glUniform1f(this.f15511C, this.f15509A);
    }
}
