package com.picture.xyz.comica.p241e.p457b;

import android.opengl.GLES20;
import com.picture.xyz.comica.p488g.k;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;

/* renamed from: e.b.a */
public class vn extends bi {

    /* renamed from: A */
    private float f39479A;

    /* renamed from: z */
    private int f39480z;

    public vn(float f) {
        this.f39479A = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (z) {
            mo24184A();
        }
        this.f15549j = i;
        mo24181v(aVar.mo24173l() / 2);
        mo24178s(aVar.mo24171j() / 2);
        mo24176p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return k.m48770a("q\u0002d\u0013h\u0003h\u001foPi\u0019f\u0018qPg\u001cn\u0011uK\u000b\u0005o\u0019g\u001fs\u001d!\u0003`\u001dq\u001cd\u000234!\u0005^$d\bu\u0005s\u00151K\u000b\u0006`\u0002x\u0019o\u0017!\u0006d\u00133Pw/U\u0015y3n\u001fs\u0014:zt\u001eh\u0016n\u0002lPg\u001cn\u0011uPt/R\u0019f\u001d`K\u000b\u0005o\u0019g\u001fs\u001d!\u0006d\u00133Pt/R\u0019{\u0015:zw\u0015bB!\u001en\u0002l\u0011m\u0019{\u0015R\u0019{\u0015)Y\u000by\b\u000b\u000by\byw\u0015bB!\u0019o\u0003h\ndP<Pt/R\u0019{\u0015:z\by\b\u0006d\u00133Pn\u0005u\u0003h\ndK\u000by\bys\u0015u\u0005s\u001e!\u0019o\u0003h\ndK\u000by\b\r\u000b\u0006n\u0019ePl\u0011h\u001e!Xw\u001fh\u0014(Pzz\bP!\u0016m\u001f`\u0004!\u0003h\u0017l\u0011!M!\u0005^#h\u0017l\u0011:z!P!Pw\u0015bB!\u0019l\u0017^\u0003h\ndP<Po\u001fs\u001d`\u001ch\nd#h\ndX(K\u000bP!P!\u0006d\u00133Pt\u0006!M!\u0006^$d\bB\u001fn\u0002eK\u000bP!P!\u0016m\u001f`\u0004!\u0004v\u001fR\u0019f\u001d`B!M!B/@!Z!\u0003h\u0017l\u0011!Z!\u0003h\u0017l\u0011:z!P!Ph\u001euPi\u0011m\u0016V\u0019e\u0004iP<Ph\u001euXb\u0015h\u001c)P3^1P+Pr\u0019f\u001d`P(Y:z!P!Pw\u0015bC!\u0003t\u001d!M!\u0006d\u00132X1^1Y:z!P!Ph\u0016!Xi\u0011m\u0016V\u0019e\u0004iP?P1Y!\u000b\u000bP!P!P!P!\u0016m\u001f`\u0004!\u001en\u0002lP<P1^1K\u000bP!P!P!P!\u0016n\u0002!X!\u0019o\u0004!\u0019!M!]i\u0011m\u0016V\u0019e\u0004iK!\u0019!L<Pi\u0011m\u0016V\u0019e\u0004iK![*\u0019!Y!\u000b\u000bP!P!P!P!P!P!\u0016n\u0002!X!\u0019o\u0004!\u001a!M!]i\u0011m\u0016V\u0019e\u0004iK!\u001a!L<Pi\u0011m\u0016V\u0019e\u0004iK![*\u001a!Y!\u000b\u000bP!P!P!P!P!P!P!P!\u0016m\u001f`\u0004!\u0014!M!\u001cd\u001ef\u0004iXw\u0015bB)\u0019-\u001a(Y:z!P!P!P!P!P!P!P!Pg\u001cn\u0011uPj\u0015s\u001ed\u001c!M!\u0015y\u0000)P,\u0014!ZeP.Pu\u0007n#h\u0017l\u00113P(K\u000bP!P!P!P!P!P!P!P!\u0006d\u00132PbP<Pu\u0015y\u0004t\u0002dBEXt/U\u0015y\u0004t\u0002d@-Pt\u0006![!A/@+\u0006d\u00133Xh\\kY!_!\u0019l\u0017^\u0003h\ndY/\u0002f\u0012:z!P!P!P!P!P!P!P!Po\u001fs\u001d![<Pj\u0015s\u001ed\u001c:z!P!P!P!P!P!P!P!Pr\u0005lP*M!\u001bd\u0002o\u0015mP+PbK\u000bP!P!P!P!P!P!\r\u000bP!P!P!P!\r\u000bP!P!P!P!\u0003t\u001d!_<Po\u001fs\u001d:z!P!P|Pd\u001cr\u0015!\u000b\u000bP!P!P!P!\u0003t\u001d!M!Pu\u0015y\u0004t\u0002dBEXt/U\u0015y\u0004t\u0002d@-Pt\u0006(^s\u0017cK\u000bP!P!\r\u000bP!P!\u0017m/G\u0002`\u0017B\u001fm\u001fsP<Pw\u0015bD)\u0003t\u001d-P0^1Y:z|z");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39480z = GLES20.glGetUniformLocation(this.f15543d, "u_Sigma");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39480z, this.f39479A);
    }
}
