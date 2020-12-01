package com.picture.xyz.comica.p241e.p458d.p465f.p466a;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
import com.picture.xyz.comica.p488g.g;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.f.a.b */
public class cb extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39523E;

    /* renamed from: F */
    float f39524F;

    /* renamed from: G */
    private int f39525G;

    public cb(Context context, int i, int i2) {
        super(2);
        this.f39523E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39524F = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39525G == 0) {
            this.f39525G = ImageHelper.m50969a(this.f39523E);
        }
        super.mo24183a(this.f39525G, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39525G;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39525G = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, g.m48767a("d`qq}a}}z2|{szd2r~{s`)\u001egz{r}f4aud~q`&V4gKFqj`gfw$)\u001egz{r}f4aud~q`&V4gKFqj`gfw%)\u001egz{r}f4aud~q`&V4gKFqj`gfw&)\u001edu`m{zu4dqq&2bM@wlQ{}fv/\u0018w}za`2r~{s`2gqu~}|s2)"));
        insert.append(this.f39524F);
        insert.append(C4230g.m21121c("[S\u00036\u000e*\u0014y\u0016<\u0003j@\u000e@d@/\u0005:SqPwRhRlLyPwWhUmLyPwPnRhIbj/\u000f0\u0004y\r8\t7Hpj\"j/\u0005:Sy\u00036\f6\u0012bj/\u0005:Sy\u00138\r)\f<Ty]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("gKFqj`gfw$"));
        insert.append(C4230g.m21121c("Ly\u0016<\u0003kH/?\r\u0005!#6\u000f+\u0004w\u0018u@/?\r\u0005!#6\u000f+\u0004w\u0019pIw\u0012>\u0002bj?\f6\u0001-@>\u00128\u0019y]y\u00046\u0014q\u00138\r)\f<Tu@\u000eIbj/\u0005:Ry\r6\u00040@d@4\u000f=H/\u0005:Rq\u0016\u00064<\u0018\u001a\u000f6\u0012=N!Ly\u0016\u00064<\u0018\u001a\u000f6\u0012=N Iu@/\u0005:RqQwPv\u0013:\u00015\t7\u0007pIs\u0013:\u00015\t7\u0007vRwPbj0\u0006q\u0007+\u0001 @g@iNaIS\u00036\f6\u0012y]y\u0016<\u0003jHhNiIbj<\f*\u0005y\t?@q\u0007+\u0001 @g@iNnUpj:\u000f5\u000f+]y\r0\u0018q\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("u@4\u000f=\tpN+\u0007;Ly\u0016<\u0003jHhNiIu@q\u0007+\u0001 @t@iNnUpOiNiUp[S\u00055\u0013<@0\u0006yH>\u00128\u0019y^yPwVpj:\u000f5\u000f+]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040Iw\u0012>\u0002bj<\f*\u0005y\t?@q\u0007+\u0001 @g@iNlUpj:\u000f5\u000f+]y\r0\u0018q\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040@r@/\u0005:RqPwUu@iNiIpN+\u0007;Ly\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040Iw\u0012>\u0002u@q\u0007+\u0001 @t@iNlUpOiNiUp[S\u00055\u0013<@0\u0006yH>\u00128\u0019y^yPwTpj:\u000f5\u000f+]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("u@4\u000f=\tyKy\u0016<\u0003kHiNlLyPwPpIw\u0012>\u0002bj<\f*\u0005y\t?@q\u0007+\u0001 @g@iNjUpj:\u000f5\u000f+]y\r0\u0018q\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040@r@/\u0005:RqPwPu@iNlIpN+\u0007;Ly\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("u@4\u000f=\tyKy\u0016<\u0003kHiNlLyPwPpIw\u0012>\u0002u@q\u0007+\u0001 @t@iNjUpOiNiUp[S\u00055\u0013<@0\u0006yH>\u00128\u0019y^yPwRpj:\u000f5\u000f+]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("u@4\u000f=\tyKy\u0016<\u0003kHiNiLyPwUpIw\u0012>\u0002bj<\f*\u0005y\t?@q\u0007+\u0001 @g@iNhUpj:\u000f5\u000f+]y\r0\u0018q\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040@r@/\u0005:RqPwUu@iNlIpN+\u0007;Ly\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040@r@/\u0005:RqPwPu@iNlIpN+\u0007;LyH>\u00128\u0019yMyPwQlIvPwPlIbj<\f*\u0005y\t?@q\u0007+\u0001 @g@iNiQpj:\u000f5\u000f+]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("Ly\r6\u00040@r@/\u0005:RqPwUu@iNlIpN+\u0007;[S\u00055\u0013<j:\u000f5\u000f+]yPwWs\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(C4230g.m21121c("u@4\u000f=\tyKy\u0016<\u0003kHiNlLyPwUpIw\u0012>\u0002bj>\f\u0006&+\u0001>#6\f6\u0012y]y\u0016<\u0003mH:\u000f5\u000f+LyQwPp[S\u001dS"));
        return insert.toString();
    }
}
