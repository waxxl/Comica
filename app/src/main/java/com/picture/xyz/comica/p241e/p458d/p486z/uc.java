package com.picture.xyz.comica.p241e.p458d.p486z;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.p243f.p244a.p245a.v;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.z.b */
public class uc extends MultiInputFilter {

    /* renamed from: E */
    float f39630E;

    /* renamed from: F */
    private Bitmap f39631F;

    /* renamed from: G */
    float f39632G;

    /* renamed from: H */
    float f39633H;

    /* renamed from: I */
    private int f39634I;

    public uc(Context context, int i, float f, float f2, float f3) {
        super(2);
        this.f39631F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39632G = f2;
        this.f39633H = f3;
        this.f39630E = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39634I == 0) {
            this.f39634I = ImageHelper.m50969a(this.f39631F);
        }
        super.mo24183a(this.f39634I, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39634I;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39634I = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, v.m48670a("\u0011X\u0004I\bY\bE\u000f\n\tC\u0006B\u0011\n\u0007F\u000eK\u0015\u0011k_\u000fC\u0007E\u0013GAY\u0000G\u0011F\u0004XSnA_>~\u0004R\u0015_\u0013OQ\u0011k_\u000fC\u0007E\u0013GAY\u0000G\u0011F\u0004XSnA_>~\u0004R\u0015_\u0013OP\u0011k\\\u0000X\u0018C\u000fMA\\\u0004IS\n\u0017u5O\u0019i\u000eE\u0013NZ \u0002E\u000fY\u0015\n\u0017O\u0002\u0019A}A\u0017A\\\u0004IR\u0002Q\u0004S\u001bS\u001fM\nQ\u0004V\u001bT\u001eM\nQ\u0004Q\u001dS\u001bH\u0011kB\bM\tZAL\rE\u0000^AF\u0014GIF\u000e]\u0011\n\u0017O\u0002\u0019AIH\n\u001a A\n\u0013O\u0015_\u0013DAN\u000e^IIM\n\u0017O\u0002\u0019I\u001aO\u0019M\nQ\u0004T\u0013M\nQ\u0004P\u001bH\u0003Z \u001c \u0017O\u0002\u0019AY\u0004^\r_\f\u0002\rE\u0016ZA\\\u0004IR\n\u0002\u0006AB\bM\tZAL\rE\u0000^AFS\u0003AQk\nAL\rE\u0000^ANA\u0017AFS\nL\n\r_\f\u0002\u0002\u0003Z A\n\u0002\n\\\n\u0002\nJ\n\u0017O\u0002\u0019INH\u0011k\nAL\rE\u0000^AFA\u0017AF\u0014GIIH\u0011k\nAL\rE\u0000^ADA\u0017AG\bDIG\bDIIOXM\n\u0002\u0004\u0006\u0003M\n\u0002\u0004\u0003\u0003Z A\n\u0007F\u000eK\u0015\n\u0019\n\\\n\fK\u0019\u0002\fK\u0019\u0002\u0002\u0004\u0013\u0006AIOMH\u0006AIOHH\u0011k\nAC\u0007\nIDA\u0016A\u001aO\u001aH\n\u001a A\nA\n\u0002\u0004\u0013\n\\\n\r\nJ\nI\u0002\u0002\u0004\u0013\nL\n\r\u0003A\u0000AFH\nN\nIFA\u0007ADH\u0011k\nA\nAIOMA\u0017AFA\u0001A\u0002IIOMA\u0007AFH\nK\n\r\u0003A\u0005A\u0002\r\nL\n\u000f\u0003Z A\nA\n\u0002\u0004\u0003\n\\\n\r\nJ\nI\u0002\u0002\u0004\u0003\nL\n\r\u0003A\u0000AFH\nN\nIFA\u0007ADH\u0011k\nAWk\nAC\u0007\nIRA\u0014A\u001bO\u001aH\n\u001a A\nA\n\u0002\u0004\u0013\n\\\n\r\nJ\nI\u0002\u0002\u0004\u0013\nL\n\r\u0003A\u0000A\u0002P\u0004Q\nL\n\r\u0003H\nN\nIRA\u0007AFH\u0011k\nA\nAIOMA\u0017AFA\u0001A\u0002IIOMA\u0007AFH\nK\nI\u001bO\u001aA\u0007AFH\u0003A\u0005A\u0002\u0019\nL\n\r\u0003Z A\nA\n\u0002\u0004\u0003\n\\\n\r\nJ\nI\u0002\u0002\u0004\u0003\nL\n\r\u0003A\u0000A\u0002P\u0004Q\nL\n\r\u0003H\nN\nIRA\u0007AFH\u0011k\nAWk\nAX\u0004^\u0014X\u000f\n\u0002\u0011kWk\\\u000eC\u0005\n\fK\bDI\u0003kQk\\\u0004IR\n\u0002E\rE\u0013\u0011k\\\u0004IU\n\u0002E\rE\u0013\u0018A\u0017A^\u0004R\u0015_\u0013OSnI_>~\u0004R\u0015_\u0013OQ\u0006\u0017u5O\u0019i\u000eE\u0013NH\u0011kL\rE\u0000^AM\u0013K\u0018\n\\\n\u0005E\u0015\u0002\u0002E\rE\u0013\u0018OX\u0006HM\n6\u0003Z \u0007F\u000eK\u0015\n\u0012I\u0000F\bD\u0006\n\\\n"));
        insert.append(this.f39630E);
        insert.append(C4228i.m21095a("\u0002W_1V<M}U8O8U.\u0019`\u0019"));
        insert.append(this.f39632G);
        insert.append(v.m48670a("Z \u0007F\u000eK\u0015\n\u0003K\u0012O\r_\f\n\\\n"));
        insert.append(this.f39633H);
        insert.append(C4228i.m21095a("f3+\\>\u000b}T2]4\u0019`\u00190V9\u0011+\\>\u000buO\u0002m8A\u001eV2K9\u0017%\u0015}O\u0002m8A\u001eV2K9\u0017$\u0010q\u0019+\\>\u000bu\bs\trJ>X1P3^t\u0010wJ>X1P3^r\u000bs\tf3+\\>\n}Z2U)\\%M`\u0019)\\%M(K8\u000b\u0019\u0011"));
        insert.append(v.m48670a("_>~\u0004R\u0015_\u0013O"));
        insert.append(1);
        insert.append(C4228i.m21095a("\u0015}T2]4\u0010sK:[f3;U2X)\u00191L0M8A)\u0019`\u00199V)\u0011>V1M8A)\u0015}nt\u0002W_1V<M}U(T4T<^8\u0019`\u0019;U2V/\u0011:K<@}\u0013}U8O8U.\u0010r\u00191\\+\\1Jf3>V1V/\u0019`\u0019>V1M8A)\u0019w\u00191L0P0X:\\r[<J8U(Tf34_}\u0011:K<@}\u0007}\ts\u0000m\u0010WZ2U2K`\u0019+\\>\nu\ts\u0000t\u0002W\u0019}\u0019+\\>\r}Z2U2Kl\u0019`\u0019+\\>\ruZ2U2Kq\u0019l\u0017m\u0010f3}\u0019}^1f\u001bK<^\u001eV1V/\u0019`\u0019+\\>\ruZ2U2Kl\u0017/^?\u0019w\u0019u\bs\t}\u0014}Z2U2Ko\u0017<\u0010}\u0012}J8M1L0\u0011>V1V/\u000bsK:[q\u00191L0\u0011>V1V/\bsK:[t\u0010}\u0013}Z2U2Ko\u0017<\u0015}Z2U2Kl\u0017<\u0010f3 3"));
        return insert.toString();
    }
}
