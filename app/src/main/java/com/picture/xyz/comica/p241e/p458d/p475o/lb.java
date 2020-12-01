package com.picture.xyz.comica.p241e.p458d.p475o;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.ca;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p240d.jm;

import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.o.a */
public class lb extends MultiInputFilter {

    /* renamed from: E */
    float f39575E;

    /* renamed from: F */
    private int f39576F;

    /* renamed from: G */
    private Bitmap f39577G;

    public lb(Context context, int i, int i2) {
        super(2);
        this.f39577G = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39575E = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39576F == 0) {
            this.f39576F = ImageHelper.m50969a(this.f39577G);
        }
        super.mo24183a(this.f39576F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39576F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39576F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, ca.m21145d("\u0019*\f;\u0000+\u00007\u0007x\u00011\u000e0\u0019x\u000f4\u00069\u001dcc-\u00071\u000f7\u001b5I+\b5\u00194\f*[\u001cI-6\f\f \u001d-\u001b=Ycc-\u00071\u000f7\u001b5I+\b5\u00194\f*[\u001cI-6\f\f \u001d-\u001b=Xcc.\b*\u00101\u0007?I.\f;[x\u001f\u0007==\u0011\u001b\u00067\u001b<RR\n7\u0007+\u001dx\u000f4\u00069\u001dx\u001e9\u001d=\u001b5\b*\u0002xT"));
        insert.append(this.f39575E);
        insert.append(jm.m48372c("\u0000yX\u001cU\u0000OSM\u0016X@\u001b$\u001bN\u001b\u0005^\u0010\b[\u000b]\tB\tF\u0017S\u000b]\fB\u000eG\u0017S\u000b]\u000bD\tB\u0012H1\u0005T\u001a_SV\u0012R\u001d\u0013Z1\b1\u0005^\u0010\bSX\u001cW\u001cIH1\u0005^\u0010\bSH\u0012V\u0003W\u0016\u000fS\u0006SO\u0016C\u0007N\u0001^A["));
        insert.append(ca.m21145d("-6\f\f \u001d-\u001b=Y"));
        insert.append(jm.m48372c("_\u001b\u0005^\u0010\t[M,o\u0016C0T\u001cI\u0017\u0015\u000b\u0017SM,o\u0016C0T\u001cI\u0017\u0015\n\u0012Z\u0015\u0001\\\u0011\u0000y]\u001fT\u0012OS\\\u0001Z\n\u001bN\u001b\u0017T\u0007\u0013\u0000Z\u001eK\u001f^G\u0017SlZ\u0000y]\u001fT\u0012OSH\u0010Z\u001fR\u001d\\S\u0006S"));
        insert.append(this.f39575E);
        insert.append(ca.m21145d("RR\u001f=\njI5\u0006<\u0000xTx\u00047\rp\u001f=\njA.6\f\f *7\u0006*\rv\u0011tI.6\f\f *7\u0006*\rv\u0010qEx\u001f=\njAiGhF+\n9\u00051\u0007?@qC+\n9\u00051\u0007?FjGhRR\u0000>A?\u001b9\u0010xWxYvQqc;\u00064\u0006*IeIiGjC,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYv^m@R\n7\u00057\u001beI5\u0000 A,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1@v\u001b?\u000btIiGjC,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000qG*\u000e:ExA?\u001b9\u0010xDxYv^m@wYvYm@cc=\u0005+\fx\u0000>Ip\u000e*\b!IfIhGn@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYv\\m@R\n7\u00057\u001beI5\u0000 A,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGmExYvYq@v\u001b?\u000btI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000qG*\u000e:ExA?\u001b9\u0010xDxYv\\m@wYvYm@cc=\u0005+\fx\u0000>Ip\u000e*\b!IfIhGl@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYv\\tIhGh@qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYvZm@R\n7\u00057\u001beI5\u0000 A,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGhExYv\\q@v\u001b?\u000btI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYv\\tIhGh@qG*\u000e:ExA?\u001b9\u0010xDxYvZm@wYvYm@cc=\u0005+\fx\u0000>Ip\u000e*\b!IfIhGj@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYvYtIhGm@qG*\u000e:RR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYvXm@R\n7\u00057\u001beI5\u0000 A,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGmExYv\\q@v\u001b?\u000btI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGhExYv\\q@v\u001b?\u000btIp\u000e*\b!IuIhGi\\qFhGh\\qRR\f4\u001a=I1\u000fxA?\u001b9\u0010xWxYvYm@R\n7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("tI5\u0006<\u0000xBx\u001f=\njAhGmExYv\\q@v\u001b?\u000bcc=\u0005+\fR\n7\u00057\u001beIhGoC,\f \u001d-\u001b=[\u001cA"));
        insert.append(jm.m48372c("\u0006d'^\u000bO\u0006I\u0016"));
        insert.append(1);
        insert.append(ca.m21145d("Ex\u00047\r1IsI.\f;[pYv\\tIhGm@qG*\u000e:RR\u000e46\u001e\u001b9\u000e\u001b\u00064\u0006*IeI.\f;]p\n7\u00057\u001btIiGh@cc%c"));
        return insert.toString();
    }
}
