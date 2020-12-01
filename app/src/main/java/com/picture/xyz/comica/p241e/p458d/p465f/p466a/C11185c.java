package com.picture.xyz.comica.p241e.p458d.p465f.p466a;

import android.opengl.GLES20;

import com.picture.xyz.comica.comica.ca;
import com.picture.xyz.comica.p240d.jm;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.d.f.a.c */
/* compiled from: ab */
public class C11185c extends BasicFilter {

    /* renamed from: A */
    private int f39526A;

    /* renamed from: B */
    private float f39527B;

    /* renamed from: C */
    private int f39528C;

    /* renamed from: D */
    private float f39529D;

    /* renamed from: z */
    private int f39530z;

    public C11185c(int i, float f, float f2) {
        this.f39529D = f;
        this.f39526A = i;
        this.f39527B = f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, jm.m48372c("K\u0001^\u0010R\u0000R\u001cUSV\u0016_\u001aN\u001eKS]\u001fT\u0012OH1\u0006U\u001a]\u001cI\u001e\u001b\u0000Z\u001eK\u001f^\u0001\t7\u001b\u0006d'^\u000bO\u0006I\u0016\u000bH1\u0005Z\u0001B\u001aU\u0014\u001b\u0005^\u0010\tSM,o\u0016C0T\u001cI\u0017\u0000yN\u001dR\u0015T\u0001VS]\u001fT\u0012OSN,r\u001dO\u0016U\u0000R\u0007BH1\u0006U\u001a]\u001cI\u001e\u001b\u0015W\u001cZ\u0007\u001b\u0006d'S\u0001^\u0000S\u001cW\u0017\u0000yX\u001cU\u0000OSR\u001dOS\u001b\u0011W\u0006I,H\u001aA\u0016\u001bN"));
        insert.append(this.f39526A);
        insert.append(ca.m21145d("RR\u001f=\nkI\u000fIeI.\f;ZpYv[i[mExYv^i\\lExYvYo[i@cc.\f;]x\u0018-\u0000;\u0002:\u0005-\u001bp\u001f=\njI(\u0006+@R\u0012R\u001f=\nlI(\u0000 \u001f9\u0005xTx\u001f=\nlAhGqRR\u000f4\u00069\u001dx\n+\u001c5IeIhGcc>\u00057\b,I:\u0005-\u001b\u0007\u001e1\r,\u0001xTxXvYcc1\u0007,I6\u000bxTx[r\u000b4\u001c*6+\u0000\"\fsXcc>\u0006*Ip\u00006\u001dx\u0010eYcI!U6\u000bcI!Bs@R\u0012R\u000f7\u001bxA1\u0007,I ThRx\u0011d\u0007:Rx\u0011sBqc#IRIxI.\f;[x\u0000(\u0006+IeI(\u0006+IsI.\f;[p\u000b4\u001c*6/\u0000<\u001d0C>\u00057\b,A D:\u0005-\u001b\u0007\u001a1\u0013=@w[m_vYtI:\u0005-\u001b\u0007\u001e1\r,\u0001r\u000f4\u00069\u001dp\u0010u\u000b4\u001c*6+\u0000\"\fqFj\\nGh@ccxIx\u00191\u0011.\b4BeI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("N,o\u0016C\u0007N\u0001^C"));
        insert.append(ca.m21145d("tI1\u00197\u001aqRR\u0014R\u0014R\u001b=\u001d-\u001b6I(\u0000 \u001f9\u0005w\u00197\u001ep\u000f4\u00069\u001dp\u0007:@tIjGqRR\u0014R\u001f7\u0000<I5\b1\u0007p@#cxIx\u001f=\nlI+\u00019\u001b(IeI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("N,o\u0016C\u0007N\u0001^C"));
        insert.append(ca.m21145d("tI"));
        insert.append(jm.m48372c("M,o\u0016C0T\u001cI\u0017"));
        insert.append(ca.m21145d("@ccxIx\u001f=\nlI:\u0005-\u001bxT)\u001c1\n3\u000b4\u001c*A"));
        insert.append(jm.m48372c("M,o\u0016C0T\u001cI\u0017"));
        insert.append(ca.m21145d("qRRIxI.\f;]x\r1\u000f>\u000fxTx\u001f=\nlA+\u00019\u001b(G*\u000e:IuI:\u0005-\u001bv\u001b?\u000btI+\u00019\u001b(G9@ccxIx\u001f=\nlI+\u0000?\u0007+IeI+\u0000?\u0007p\r1\u000f>\u000fqRRIxI>\u00057\b,I1\u0007,\f6\u001a1\u001d!IeI"));
        insert.append("u_Intensity");
        insert.append(jm.m48372c("H1S\u001bSR\u0015\u001b[W\u0016U\u0014O\u001b\u0013[_\u001a]\u0015]]I\u0014YZ\u0012S\u0007S"));
        insert.append("u_Threshold");
        insert.append(ca.m21145d("@RIxIQ\u00006\u001d=\u0007+\u0000,\u0010xTxYvYccxIx\u000f4\u00069\u001dx\u0005-\u0004+\u00019\u001b(IeI<\u0006,A+\u00019\u001b(G*\u000e:Ex>qRRIxI>\u00057\b,I4\u001c5\u001d=\u0004(IeI<\u0006,A:\u0005-\u001bv\u001b?\u000btI\u000f@ccxIx\u0000>Ip\u0005-\u0004+\u00019\u001b(IdIhGi\\qcxIx`1\u0007,\f6\u001a1\u001d!IeI"));
        insert.append("u_Intensity");
        insert.append(jm.m48372c("S\u0011S\u000e]\u000bH1S\u001bS\\\u001fd5I\u0012\\0T\u001fT\u0001\u001bN\u001b\u0000S\u0012I\u0003\u001bX\u001b\u0017R\u0015]\u0015\u0011\u001aU\u0007^\u001dH\u001aO\n\u0000yFy"));
        return insert.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39528C = GLES20.glGetUniformLocation(this.f15543d, "u_Intensity");
        this.f39530z = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39528C, this.f39529D);
        GLES20.glUniform1f(this.f39530z, this.f39527B);
    }
}
