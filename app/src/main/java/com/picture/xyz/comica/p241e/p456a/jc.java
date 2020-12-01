package com.picture.xyz.comica.p241e.p456a;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.comica.pa;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.a.c */
public class jc extends MultiInputFilter {

    /* renamed from: E */
    private int f39454E;

    /* renamed from: F */
    float f39455F;

    /* renamed from: G */
    private Bitmap f39456G;

    public jc(Context context, int i, int i2) {
        super(2);
        this.f39456G = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39455F = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39454E == 0) {
            this.f39454E = ImageHelper.m50969a(this.f39456G);
        }
        super.mo24183a(this.f39454E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39454E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39454E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, C4228i.m21095a("I/\\>P.P2W}Q4^5I}_1V<Mf3(W4_2K0\u0019.X0I1\\/\u000b\u0019\u0019(f\t\\%M(K8\tf3(W4_2K0\u0019.X0I1\\/\u000b\u0019\u0019(f\t\\%M(K8\bf3+X/@4W:\u0019+\\>\u000b}O\u0002m8A\u001eV2K9\u0002WZ2W.M}_1V<M}N<M8K0X/R}\u0004"));
        insert.append(this.f39455F);
        insert.append(pa.m48765a("p\u0018(}%a?2=w(!kEk/kd.qx:{<y#y'g2{<|#~&g2{<{%y#b)Az\"u#bkt'}*fk~>c~$e;2=w(!kqb20\u0018k29w?g9|kv$fcqg2=w(!c\"e!g2{<~+g2{<z#b;p\u00186\u0018=w(!ka.f'g&:'}<bkd.qx2(>kz\"u#bkt'}*fk~y;kiA2kt'}*fkvk/k~y2f2'g&:(;p\u0018k2(2v2(2`2=w(!cvb)A2kt'}*fk~k/k~>cqb)A2kt'}*fk|k/k\"|c\"|cqe`g2(<,;g2(<);p\u0018k2-~$s?232v2&s3:&s3:(<9>kqeub>kqepb)A2k{-2c|k.k\"e\"b20\u0018k2k2(<92v2'2`2c:(<92f2';k8k~b2d2c~k?k|b)A2k2kqeuk/k~k9k:cqeuk?k~b2a2';k=k:'2f2%;p\u0018k2k2(<)2v2'2`2c:(<)2f2';k8k~b2d2c~k?k|b)A2koA2k{-2cjk,k#e\"b20\u0018k2k2(<92v2'2`2c:(<92f2';k8k:z<{2f2';b2d2cjk?k~b)A2k2kqeuk/k~k9k:cqeuk?k~b2a2c#e\"k?k~b;k=k:32f2';p\u0018k2k2(<)2v2'2`2c:(<)2f2';k8k:z<{2f2';b2d2cjk?k~b)A2koA2k`.f>`%2()AoAd${/2&s\"|c;AiAd.qx2(}'}9)Ad.qx28s&b'w2v2?w3f>`. \u000f:"));
        insert.append(C4228i.m21095a("(f\t\\%M(K8\t"));
        insert.append(pa.m48765a(">kd.qy:=M\u001fw3Q$}9vejg2=M\u001fw3Q$}9vekb;e`,pp\u0018-~$s?2,`*kk/kv$fca*;~.&g2\u001c;p\u0018-~$s?28q*~\"|,2v2"));
        insert.append(this.f39455F);
        insert.append(C4228i.m21095a("\u0002WO8Zo\u00190V9P}\u0004}T2]uO8Zo\u0011+f\t\\%z2V/]sAq\u0019+f\t\\%z2V/]s@t\u0015}O8Zo\u0011l\u0017m\u0016.Z<U4W:\u0010t\u0013.Z<U4W:\u0016o\u0017m\u0002WP;\u0011:K<@}\u0007}\ts\u000fh\u0010WZ2U2K`\u0019)\\%M(K8\u000b\u0019\u0011"));
        insert.append(pa.m48765a("g\u0014F.j?g9w"));
        insert.append(1);
        insert.append(C4228i.m21095a("q\u00190V9Pt\u0017/^?\u0002W\\1J8\u00194_}\u0011:K<@}\u0007}\ts\fm\u0010WZ2U2K`\u0019)\\%M(K8\u000b\u0019\u0011"));
        insert.append(pa.m48765a("g\u0014F.j?g9w"));
        insert.append(1);
        insert.append(C4228i.m21095a("\u0015}T2]4\u0019v\u0019+\\>\u000bu\ts\fq\u0019m\u0017m\u0010t\u0017/^?\u0002W\\1J8\u00194_}\u0011:K<@}\u0007}\ts\u000bj\u0010WZ2U2K`\u0019)\\%M(K8\u000b\u0019\u0011"));
        insert.append(pa.m48765a("g\u0014F.j?g9w"));
        insert.append(1);
        insert.append(C4228i.m21095a("\u0015}T2]4\u0019v\u0019+\\>\u000bu\ts\tq\u0019m\u0017h\u0010t\u0017/^?\u0002W\\1J8\u00194_}\u0011:K<@}\u0007}\ts\th\u0010WBWZ2U2K`\u0019)\\%M(K8\u000b\u0019\u0011"));
        insert.append(pa.m48765a("g\u0014F.j?g9w"));
        insert.append(1);
        insert.append(C4228i.m21095a("\u0015}T2]4\u0019v\u0019+\\>\u000bu\ts\fq\u0019m\u0017h\u0010t\u0017/^?\u0002WO8Zi\u0019>V1V/\bf3+\\>\r}Z2U2Ko\u0002WZ2U2Ko\u0004}O8Zi\u0011>V1V/\u0015}\ts\u0001t\u0002WZ2U2Kl\u0019`\u0019+\\>\ru^/X$\u0015}^/X$\u0015}^/X$\u0015}\bs\tt\u0002W\u0019}\u0019;U2X)\u0019/\u0002W\u0019}\u00194_}\u0011o\u0017m\u0019w\u0019>V1V/\u000bsK}\u0005}Z2U2Ko\u0017<\u0010}BW\u0019}\u0019}\u0019/\u0019`\u0019o\u0017m\u0019w\u0019>V1V/\u000bsK}\u0013}Z2U2Kl\u0017/\u0019v\u0019>V1V/\u000bsK}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\bsXt\u0019v\u0019>V1V/\bsK}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\u000bsXt\u0002W\u0019}\u0019 \u00198U.\\}BW\u0019}\u0019}\u0019/\u0019`\u0019>V1V/\u000bsX}\u0013}Z2U2Kl\u0017<\u0019p\u0019o\u0017m\u0019w\u0019uZ2U2Kl\u0017<\u0019p\u0019>V1V/\bsKt\u0019w\u0019uZ2U2Ko\u0017<\u0019p\u0019>V1V/\u000bsKt\u0019v\u0019>V1V/\u000bsK}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\bsXt\u0019v\u0019>V1V/\bsK}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\u000bsXt\u0002W\u0019}\u0019 3}\u0019}_1V<M}^f3}\u0019}P;\u0019u\u000bs\t}\u0013}Z2U2Ko\u0017:\u0019a\u0019>V1V/\u000bsXt\u0019&3}\u0019}\u0019}^}\u0004}\u000bs\t}\u0013}Z2U2Ko\u0017:\u0019w\u0019>V1V/\bs^}\u0012}Z2U2Ko\u0017:\u0019w\u0019u\bs\t}\u0014}Z2U2Kl\u0017<\u0010}\u0012}Z2U2Kl\u0017:\u0019w\u0019u\bs\t}\u0014}Z2U2Ko\u0017<\u0010f3}\u0019}D}\\1J8\u0019&3}\u0019}\u0019}^}\u0004}Z2U2Ko\u0017<\u0019w\u0019>V1V/\bsX}\u0014}\u000bs\t}\u0013}\u0011>V1V/\bsX}\u0014}Z2U2Kl\u0017:\u0010}\u0013}\u0011>V1V/\u000bsX}\u0014}Z2U2Ko\u0017:\u0010}\u0012}Z2U2Ko\u0017:\u0019w\u0019u\bs\t}\u0014}Z2U2Kl\u0017<\u0010}\u0012}Z2U2Kl\u0017:\u0019w\u0019u\bs\t}\u0014}Z2U2Ko\u0017<\u0010f3}\u0019}DW\u0019}\u0019;U2X)\u0019?\u0002W\u0019}\u00194_}\u0011o\u0017m\u0019w\u0019>V1V/\u000bs[}\u0005}Z2U2Ko\u0017<\u0010}BW\u0019}\u0019}\u0019?\u0019`\u0019o\u0017m\u0019w\u0019>V1V/\u000bs[}\u0013}Z2U2Kl\u0017?\u0019v\u0019>V1V/\u000bs[}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\bsXt\u0019v\u0019>V1V/\bs[}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\u000bsXt\u0002W\u0019}\u0019 \u00198U.\\}BW\u0019}\u0019}\u0019?\u0019`\u0019>V1V/\u000bsX}\u0013}Z2U2Kl\u0017<\u0019p\u0019o\u0017m\u0019w\u0019uZ2U2Kl\u0017<\u0019p\u0019>V1V/\bs[t\u0019w\u0019uZ2U2Ko\u0017<\u0019p\u0019>V1V/\u000bs[t\u0019v\u0019>V1V/\u000bs[}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\bsXt\u0019v\u0019>V1V/\bs[}\u0013}\u0011l\u0017m\u0019p\u0019>V1V/\u000bsXt\u0002W\u0019}\u0019 3>V1V/\u0019`\u0019+\\>\nuKq^q[t\u0002WDW\\1J83>V1V/\u0019`\u0019+\\>\nu\ts\tt\u0002W^1f\u001bK<^\u001eV1V/\u0019`\u0019+\\>\ruZ2U2Kq\u0019l\u0017m\u0010f3 3"));
        return insert.toString();
    }
}
