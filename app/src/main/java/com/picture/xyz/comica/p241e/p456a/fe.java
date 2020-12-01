package com.picture.xyz.comica.p241e.p456a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.picture.xyz.comica.p488g.o;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.a.b */
public class fe extends MultiInputFilter {

    /* renamed from: E */
    private float f39446E = 1.0f;

    /* renamed from: F */
    private Bitmap f39447F;

    /* renamed from: G */
    private int f39448G;

    /* renamed from: H */
    private int f39449H;

    /* renamed from: I */
    private float f39450I = 0.0f;

    /* renamed from: J */
    private int f39451J;

    /* renamed from: K */
    private float f39452K = 1.0f;

    /* renamed from: L */
    private int f39453L;

    public fe(Context context, int i) {
        super(2);
        new BitmapFactory.Options().inScaled = false;
        this.f39447F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        float f;
        float f2;
        if (str.equals(jh.f39474i)) {
            f = this.f39450I + 0.3f;
            f2 = 0.03f;
        } else if (str.equals(jh.f39473h)) {
            f = this.f39452K;
            f2 = 0.1f;
        } else if (!str.equals(jh.f39476k)) {
            return 0.0f;
        } else {
            f = this.f39446E - 0.5f;
            f2 = 0.075f;
        }
        return f / f2;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39474i)) {
            this.f39450I = (0.03f * f) - 0.3f;
        }
        if (str.equals(jh.f39473h)) {
            this.f39452K = 0.1f * f;
        }
        if (str.equals(jh.f39476k)) {
            this.f39446E = (f * 0.075f) + 0.5f;
        }
    }

    /* renamed from: I */
    public void mo51906I(float f) {
        this.f39450I = f;
    }

    /* renamed from: J */
    public void mo51907J(float f) {
        this.f39446E = f;
    }

    /* renamed from: K */
    public void mo51908K(float f) {
        this.f39452K = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39449H == 0) {
            this.f39449H = ImageHelper.m50969a(this.f39447F);
        }
        super.mo24183a(this.f39449H, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39449H;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39449H = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return o.m48769a("I.\\?P/P3W|T9]5L1I|_0V=Mg3)W5_3K1\u0019/X1I0\\.\u000b\u0018\u0019)f\b\\$M)K9\tg3)W5_3K1\u0019/X1I0\\.\u000b\u0018\u0019)f\b\\$M)K9\bg3)W5_3K1\u0019:U3X(\u0019)f\u000fX(L.X(P3Wg3)W5_3K1\u0019:U3X(\u0019)f\u001fV2M.X/Mg3)W5_3K1\u0019:U3X(\u0019)f\u001eK5^4M2\\/Jg3?V2J(\u0019*\\?\n|U)T5W=W?\\\u000b\\5^4M5W;\u0019a\u0019*\\?\nt\tr\u000bm\u000bi\u0015|\tr\u000em\fh\u0015|\tr\tk\u000bm\u0010g3*X.@5W;\u0019*\\?\u000b|O\u0003m9A\u001fV3K8\u0002VO3P8\u00191X5Wt\u0010'3|\u0019*\\?\r|M9A\u001fV0V)K|\u0004|M9A(L.\\n}tL\u0003m9A(L.\\l\u0015*f\b\\$z3V.]u\u0002V\u0019|_0V=M|[0L9z3U3K|\u0004|M9A\u001fV0V)Kr[|\u0013|\u000fo\u0017l\u0002V\u0019|O9Zn\u0019-L=]m\u0002V\u0019|H)X8\br@|\u0004|_0V3Kt_0V3Kt[0L9z3U3Ku\u0019s\u0019d\u0017l\u0010g3|\u0019-L=]m\u0017$\u0019a\u0019:U3V.\u0011>U)\\\u001fV0V.\u0010|\u0014|\u0011-L=]m\u0017%\u0019v\u0019d\u0017l\u0010g3|\u0019*\\?\u000b|H)X8\u000bg3|\u0019-L=]n\u0017%\u0019a\u0019:U3V.\u0011?\\5Ut[0L9z3U3Ku\u0019s\u0019d\u0017l\u0010g3|\u0019-L=]n\u0017$\u0019a\u0019?\\5Ut[0L9z3U3Ku\u0019q\u0019tH)X8\u000br@|\u0013|\u0001r\tu\u0002V\u0019|O9Zn\u0019(\\$i3Jm\u0002V\u0019|M9A\fV/\brA|\u0004|\u0011-L=]m\u0017$\u0019v\u0019l\u0017m\u000bi\u0010|\u0012|\tr\fs\fm\u000br\t|\u0012|\u0011t\tr\bn\f|\u0014|\br\ts\fm\u000br\tu\u0019v\u0019(\\$z3U3L.\u0017.\u0010g3|\u0019(\\$i3Jm\u0017%\u0019a\u0019tH)X8\br@|\u0013|\tr\bn\fu\u0019w\u0019l\u0017i\u0016i\bn\u0017l\u0019w\u0019t\u0011l\u0017m\u000bi\u0019q\u0019m\u0017l\u0016i\bn\u0017l\u0010|\u0013|M9A\u001fV0V)Kr^u\u0002V\u0019|O9Zn\u0019(\\$i3Jn\u0002V\u0019|M9A\fV/\u000brA|\u0004|\u0011-L=]n\u0017$\u0019v\u0019l\u0017m\u000bi\u0010|\u0012|\tr\fs\fm\u000br\t|\u0012|\u0011t\tr\bn\f|\u0014|\br\ts\fm\u000br\tu\u0019v\u0019(\\$z3U3L.\u0017.\u0010g3|\u0019(\\$i3Jn\u0017%\u0019a\u0019tH)X8\u000br@|\u0013|\tr\bn\fu\u0019w\u0019l\u0017i\u0016i\bn\u0017l\u0019w\u0019t\u0011l\u0017m\u000bi\u0019q\u0019m\u0017l\u0016i\bn\u0017l\u0010|\u0013|M9A\u001fV0V)Kr^u\u0002V\u0019|O9Zh\u00192\\+z3U3Km\u0019a\u0019(\\$M)K9\u000b\u0018\u0011)f\b\\$M)K9\bp\u0019(\\$i3Jm\u0010g3|\u0019*\\?\r|W9N\u001fV0V.\u000b|\u0004|M9A(L.\\n}tL\u0003m9A(L.\\m\u0015|M9A\fV/\u000bu\u0002V\u0019|O9Zh\u00192\\+z3U3K|\u0004|T5AtW9N\u001fV0V.\bp\u00192\\+z3U3Kn\u0015|_.X?Mt[0L9z3U3Ku\u0010g3|\u0019*\\?\r|U)M\u001fV0V.\u0019a\u0019*\\?\rtW9N\u001fV0V.\u0017.^>\u0015|M9A\u001fV0V)KrXu\u0002V\u0019|P:\u0019tL\u0003j=M)K=M5V2\u0019}\u0004|\br\tu3|\u0019'3|\u0019|_0V=M|U)T5W=W?\\|\u0004|]3MtU)M\u001fV0V.\u0017.^>\u0015|U)T5W=W?\\\u000b\\5^4M5W;\u0010g3|\u0019|O9Zo\u0019;K9@\u000fZ=U9z3U3K|\u0004|O9Zo\u00110L1P2X2Z9\u0010g3|\u0019|U)M\u001fV0V.\u0019a\u0019*\\?\rtT5At^.\\%j?X0\\\u001fV0V.\u0015|U)M\u001fV0V.\u0017.^>\u0015|L\u0003j=M)K=M5V2\u0010p\u00190L(z3U3KrXu\u0002V\u0019|DV\u0019|O9Zh\u0019>K|\u0004|O9Zh\u0011)f\u001eK5^4M2\\/Jp\u0019)f\u001eK5^4M2\\/Jp\u0019)f\u001eK5^4M2\\/Jp\u0019m\u0010g3|\u00190L(z3U3K|\u0004|U)M\u001fV0V.\u0019w\u0019>Kg3|\u0019;U\u0003.X;z3U3K|\u0004|O9Zh\u0011t\u00110L(z3U3KrK;[|\u0014|O9Zo\u0011l\u0017i\u0010u\u0019v\u0019)f\u001fV2M.X/M|\u0012|O9Zo\u0011l\u0017i\u0010u\u0015|U)M\u001fV0V.\u0017=\u0010g3!3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39448G = GLES20.glGetUniformLocation(this.f15543d, "u_Saturation");
        this.f39453L = GLES20.glGetUniformLocation(this.f15543d, "u_Contrast");
        this.f39451J = GLES20.glGetUniformLocation(this.f15543d, "u_Brightness");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39448G, this.f39452K);
        GLES20.glUniform1f(this.f39453L, this.f39446E);
        GLES20.glUniform1f(this.f39451J, this.f39450I);
    }
}
