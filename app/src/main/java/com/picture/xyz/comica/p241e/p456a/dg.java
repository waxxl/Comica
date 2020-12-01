package com.picture.xyz.comica.p241e.p456a;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.ca;

import com.picture.xyz.comica.comica.na;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.a.e */
public class dg extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39460E;

    /* renamed from: F */
    private int f39461F;

    /* renamed from: G */
    float f39462G;

    public dg(Context context, int i, int i2) {
        super(2);
        this.f39460E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39462G = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39461F == 0) {
            this.f39461F = ImageHelper.m50969a(this.f39460E);
        }
        super.mo24183a(this.f39461F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39461F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39461F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, na.m48766a("\u001b,\u000e=\u0002-\u00021\u0005~\u0006;\u000f7\u001e3\u001b~\r2\u0004?\u001fea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;[ea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;Zea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;Yea(\n,\u00127\u00059K(\u000e=Y~\u001d\u0001?;\u0013\u001d\u00041\u0019:PT\b1\u0005-\u001f~\r2\u0004?\u001f~\u0018=\n2\u00020\f~V"));
        insert.append(this.f39462G);
        insert.append(ca.m21145d("cc;\u00066\u001a,I.\f;Zx>xTx\u001f=\nkAhGjXj\\tIhGoXm]tIhGh^jXqRR\u001f7\u0000<I5\b1\u0007p@R\u0012R\u001f=\nkI;\u00064\u0006*RR\u001f=\nkI+\b5\u00194\flIeI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("+4\n\u000e&\u001f+\u0019;["));
        insert.append(ca.m21145d("Ex\u001f=\njA.6\f\f *7\u0006*\rv\u0011tI.6\f\f *7\u0006*\rv\u0010q@v\u001b?\u000bcc>\u00057\b,I?\u001b9\u0010xTx\r7\u001dp\u001a9\u0004(\u0005=]tI\u000f@cc.\f;[x\u00047\r1IeI5\u0006<A.\f;[p\u001f\u0007==\u0011\u001b\u00067\u001b<G Ex\u001f\u0007==\u0011\u001b\u00067\u001b<G!@tI.\f;[pXvYw\u001a;\b4\u00006\u000eq@r\u001a;\b4\u00006\u000ew[vYcc1\u000fp\u000e*\b!IfIhGaYqc;\u00064\u0006*IeI.\f;ZpXvYqRR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYv_`@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYv\\h@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYv\\tIhGh@qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYv[h@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYvYtIhGm@qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYvYm@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYv\\tIhGm@qG*\u000e:RR\f4\u001a=IR\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGmExYv\\q@v\u001b?\u000bcc1\u000fxA?\u001b9\u0010xUxYvYq\u0012R\u001f=\nlI;\u00064\u0006*Xcc.\f;]x\n7\u00057\u001bjRR\n7\u00057\u001biTx\u001f=\nlA;\u00064\u0006*ExXvYqRR\n7\u00057\u001bjIeI.\f;]p\u000e*\b!Ex\u000e*\b!Ex\u000e*\b!ExYv_qRRIxI>\u00057\b,I*RRIxI1\u000fxAjGhIrI;\u00064\u0006*[v\u001bxUx\n7\u00057\u001bjG9@x\u0012RIxIxI*IeIjGhIrI;\u00064\u0006*[v\u001bxCx\n7\u00057\u001biG*IsI;\u00064\u0006*[v\u001bxCxAiGhIuI;\u00064\u0006*Xv\bqIsI;\u00064\u0006*Xv\u001bxCxAiGhIuI;\u00064\u0006*[v\bqRRIxI%I=\u0005+\fx\u0012RIxIxI*IeI;\u00064\u0006*[v\bxCx\n7\u00057\u001biG9IuIjGhIrIp\n7\u00057\u001biG9IuI;\u00064\u0006*Xv\u001bqIrIp\n7\u00057\u001bjG9IuI;\u00064\u0006*[v\u001bqIsI;\u00064\u0006*[v\u001bxCxAiGhIuI;\u00064\u0006*Xv\bqIsI;\u00064\u0006*Xv\u001bxCxAiGhIuI;\u00064\u0006*[v\bqRRIxI%cxIx\u000f4\u00069\u001dx\u000eccxIx\u0000>Ip[vYxCx\n7\u00057\u001bjG?IdI;\u00064\u0006*[v\bqI#cxIxIx\u000exTx[vYxCx\n7\u00057\u001bjG?IrI;\u00064\u0006*Xv\u000exBx\n7\u00057\u001bjG?IrIpXvYxDx\n7\u00057\u001biG9@xBx\n7\u00057\u001biG?IrIpXvYxDx\n7\u00057\u001bjG9@ccxIx\u0014x\f4\u001a=I#cxIxIx\u000exTx\n7\u00057\u001bjG9IrI;\u00064\u0006*Xv\bxDx[vYxCxA;\u00064\u0006*Xv\bxDx\n7\u00057\u001biG?@xCxA;\u00064\u0006*[v\bxDx\n7\u00057\u001bjG?@xBx\n7\u00057\u001bjG?IrIpXvYxDx\n7\u00057\u001biG9@xBx\n7\u00057\u001biG?IrIpXvYxDx\n7\u00057\u001bjG9@ccxIx\u0014RIxI>\u00057\b,I:RRIxI1\u000fxAjGhIrI;\u00064\u0006*[v\u000bxUx\n7\u00057\u001bjG9@x\u0012RIxIxI:IeIjGhIrI;\u00064\u0006*[v\u000bxCx\n7\u00057\u001biG:IsI;\u00064\u0006*[v\u000bxCxAiGhIuI;\u00064\u0006*Xv\bqIsI;\u00064\u0006*Xv\u000bxCxAiGhIuI;\u00064\u0006*[v\bqRRIxI%I=\u0005+\fx\u0012RIxIxI:IeI;\u00064\u0006*[v\bxCx\n7\u00057\u001biG9IuIjGhIrIp\n7\u00057\u001biG9IuI;\u00064\u0006*Xv\u000bqIrIp\n7\u00057\u001bjG9IuI;\u00064\u0006*[v\u000bqIsI;\u00064\u0006*[v\u000bxCxAiGhIuI;\u00064\u0006*Xv\bqIsI;\u00064\u0006*Xv\u000bxCxAiGhIuI;\u00064\u0006*[v\bqRRIxI%c;\u00064\u0006*IeI.\f;Zp\u001bt\u000et\u000bqRR\u0014R\u000e46\u001e\u001b9\u000e\u001b\u00064\u0006*IeI.\f;]p\n7\u00057\u001btIiGh@cc%c"));
        return insert.toString();
    }
}
