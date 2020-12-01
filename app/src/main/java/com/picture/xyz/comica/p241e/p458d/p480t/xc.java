package com.picture.xyz.comica.p241e.p458d.p480t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.ca;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p241e.p456a.jh;

import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.t.b */
public class xc extends MultiInputFilter {

    /* renamed from: E */
    private int f39596E;

    /* renamed from: F */
    private Bitmap f39597F;

    /* renamed from: G */
    private int f39598G;

    /* renamed from: H */
    private float f39599H = 1.0f;

    /* renamed from: I */
    private float f39600I = 1.0f;

    /* renamed from: J */
    float f39601J;

    /* renamed from: K */
    private int f39602K;

    /* renamed from: L */
    private float f39603L = 0.0f;

    /* renamed from: M */
    private int f39604M;

    public xc(Context context, int i) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.f39597F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        float f;
        float f2;
        if (str.equals(jh.f39474i)) {
            f = this.f39603L + 0.3f;
            f2 = 0.06f;
        } else if (str.equals(jh.f39473h)) {
            f = this.f39599H;
            f2 = 0.2f;
        } else if (!str.equals(jh.f39476k)) {
            return 0.0f;
        } else {
            f = this.f39600I - 0.5f;
            f2 = 0.1f;
        }
        return f / f2;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39474i)) {
            this.f39603L = (0.06f * f) - 0.3f;
        }
        if (str.equals(jh.f39473h)) {
            this.f39599H = 0.2f * f;
        }
        if (str.equals(jh.f39476k)) {
            this.f39600I = (f * 0.1f) + 0.5f;
        }
    }

    /* renamed from: I */
    public void mo51911I(float f) {
        this.f39603L = f;
    }

    /* renamed from: J */
    public void mo51912J(float f) {
        this.f39600I = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39596E == 0) {
            this.f39596E = ImageHelper.m50969a(this.f39597F);
        }
        super.mo24183a(this.f39596E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39596E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39596E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, ca.m21145d("\u0019*\f;\u0000+\u00007\u0007x\u00011\u000e0\u0019x\u000f4\u00069\u001dcc-\u00071\u000f7\u001b5I+\b5\u00194\f*[\u001cI-6\f\f \u001d-\u001b=Ycc-\u00071\u000f7\u001b5I+\b5\u00194\f*[\u001cI-6\f\f \u001d-\u001b=Xcc.\b*\u00101\u0007?I.\f;[x\u001f\u0007==\u0011\u001b\u00067\u001b<RR\u001c6\u0000>\u0006*\u0004x\u000f4\u00069\u001dx\u001c\u0007:9\u001d-\u001b9\u001d1\u00066RR\u001c6\u0000>\u0006*\u0004x\u000f4\u00069\u001dx\u001c\u0007*7\u0007,\u001b9\u001a,RR\u001c6\u0000>\u0006*\u0004x\u000f4\u00069\u001dx\u001c\u0007+*\u0000?\u0001,\u0007=\u001a+RR\n7\u0007+\u001dx\u000f4\u00069\u001dx\u001e9\u001d=\u001b5\b*\u0002xT"));
        insert.append(this.f39601J);
        insert.append(ca.m21145d("RR\n7\u0007+\u001dx\u001f=\nkI\u000fIeI.\f;ZpYv[i[mExYv^i\\lExYvYo[i@cc.\u00061\rx\u00049\u00006Aqc#c.\f;]x\u0005-\u001d\u001b\u00064\u0006*RR\u001f=\nkI+\b5\u00194\flIeI,\f \u001d-\u001b=[\u001cA"));
        insert.append(ca.m21145d("-6\f\f \u001d-\u001b=Y"));
        insert.append(ca.m21145d("tI.\f;[p\u001f\u0007==\u0011\u001b\u00067\u001b<G Ex\u001f\u0007==\u0011\u001b\u00067\u001b<G!@qG*\u000e:RR\u000f4\u00069\u001dx\u000e*\b!IeI<\u0006,A+\b5\u00194\flEx>qIsI"));
        insert.append("u_Brightness");
        insert.append(ca.m21145d("cc4\u001c,*7\u00057\u001beI,\f \u001d-\u001b=[\u001cA"));
        insert.append(ca.m21145d("\u001c\u0007==\u0011,\u001c*\f"));
        insert.append(1);
        insert.append(ca.m21145d("tI.\f;[pYv\\tI?\u001b9\u0010q@ccxI1\u000fxA"));
        insert.append("u_Saturation");
        insert.append(ca.m21145d("IyTxXvYqcxI#cxIx\u000f4\u00069\u001dx\u0005-\u00041\u00079\u0007;\fxTx\r7\u001dp\u0005-\u001d\u001b\u00064\u0006*G*\u000e:Ex>qRRIxI.\f;Zx\u000e*\f!:;\b4\f\u001b\u00064\u0006*IeI.\f;Zp\u0005-\u00041\u00079\u0007;\fqRRIxI4\u001c,*7\u00057\u001bxTx\u001f=\nlA5\u0000 A?\u001b=\u0010\u000b\n9\u0005=*7\u00057\u001btI4\u001c,*7\u00057\u001bv\u001b?\u000btI"));
        insert.append("u_Saturation");
        insert.append(ca.m21145d("qEx\u0005-\u001d\u001b\u00064\u0006*G9@ccxI%cxI?\u0005\u0007/*\b?*7\u00057\u001bxTx\u001f=\nlApA4\u001c,*7\u00057\u001bv\u001b?\u000bxDx\u001f=\nkAhGm@qIrI"));
        insert.append("u_Contrast");
        insert.append(ca.m21145d("xBx\u001f=\nkAhGm@qEx\u0005-\u001d\u001b\u00064\u0006*G9@cc%c"));
        return insert.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39604M = GLES20.glGetUniformLocation(this.f15543d, "u_Saturation");
        this.f39602K = GLES20.glGetUniformLocation(this.f15543d, "u_Contrast");
        this.f39598G = GLES20.glGetUniformLocation(this.f15543d, "u_Brightness");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39604M, this.f39599H);
        GLES20.glUniform1f(this.f39602K, this.f39600I);
        GLES20.glUniform1f(this.f39598G, this.f39603L);
    }
}
