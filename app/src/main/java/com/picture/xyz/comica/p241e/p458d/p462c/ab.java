package com.picture.xyz.comica.p241e.p458d.p462c;

import android.opengl.GLES20;
import com.picture.xyz.comica.p241e.p242c.hn;
import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.d.c.b */
public class ab extends BasicFilter {

    /* renamed from: A */
    private int f39507A;

    /* renamed from: B */
    private int f39508B;

    /* renamed from: C */
    private int f39509C;

    /* renamed from: D */
    private float f39510D;

    /* renamed from: z */
    private float f39511z;

    public ab(int i, float f, float f2) {
        this.f39510D = f;
        this.f39509C = i;
        this.f39511z = f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, hn.m21100b("KV^GRWRKU\u0004VA_MNIK\u0004]HTEO\u001f1QUM]KII\u001bWZIKH^V\t`\u001bQdp^\\OQIA\u000b\u001f1RZVBMUC\u001bR^G\t\u0004M{oACgTKI@\u0000.NJRBTVV\u0004]HTEO\u0004N{rJOAUWRPB\u001f1QUM]KII\u001bBWKZP\u001bQdpSV^WSKW@\u0000.XKUWO\u0004RJO\u0004\u001bFWQI{HMAA\u001b\u0019"));
        insert.append(this.f39509C);
        insert.append(C4230g.m21121c("bj/\u0005:Sy7y]y\u0016<\u0003jHiNkQkUu@iNnQlTu@iNiWkQp[S\u0016<\u0003m@(\u00150\u00032\u00025\u0015+H/\u0005:Ry\u00106\u0013pj\"j/\u0005:Ty\u00100\u0018/\u00015@d@/\u0005:TqPwIbj?\f6\u0001-@:\u0013,\ry]yPw[S\u00065\u000f8\u0014y\u00025\u0015+?.\t=\u00141@d@hNi[S\t7\u0014y\u000e;@d@kJ;\f,\u0012\u0006\u00130\u001a<Kh[S\u00066\u0012yH0\u000e-@ ]i[y\u0019e\u000e;[y\u0019rKpj\"j?\u000f+@q\t7\u0014y\u0018dPb@!\\7\u0002b@!KrIS\u001byjy@y\u0016<\u0003k@0\u00106\u0013y]y\u00106\u0013yKy\u0016<\u0003kH;\f,\u0012\u0006\u00170\u0004-\bs\u00065\u000f8\u0014q\u0018t\u00025\u0015+?*\t#\u0005pOkUoNiLy\u00025\u0015+?.\t=\u00141J?\f6\u0001-H M;\f,\u0012\u0006\u00130\u001a<IvRlVwPp[S@y@)\t!\u00168\fr]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(hn.m21100b("N{oACPNV^\u0014"));
        insert.append(C4230g.m21121c("Ly\t)\u000f*Ibj$j$j+\u0005-\u0015+\u000ey\u00100\u0018/\u00015O)\u000f.H?\f6\u0001-H7\u0002pLyRwIbj$j/\u000f0\u0004y\r8\t7Hp\u001bS@y@/\u0005:Ty\u00131\u0001+\u0010y]y\u0014<\u0018-\u0015+\u0005k$q"));
        insert.append(hn.m21100b("N{oACPNV^\u0014"));
        insert.append(C4230g.m21121c("Ly"));
        insert.append(hn.m21100b("M{oACgTKI@"));
        insert.append(C4230g.m21121c("p[S@y@/\u0005:Ty\u00025\u0015+@d\u0011,\t:\u000b;\f,\u0012q"));
        insert.append(hn.m21100b("M{oACgTKI@"));
        insert.append(C4230g.m21121c("Ibjy@y\u0016<\u0003m@=\t?\u0006?@d@/\u0005:Tq\u00131\u0001+\u0010w\u0012>\u0002yMy\u00025\u0015+N+\u0007;Ly\u00131\u0001+\u0010w\u0001p[S@y@/\u0005:Ty\u00130\u00077\u0013y]y\u00130\u00077H=\t?\u0006?Ibjy@y\u00065\u000f8\u0014y\t7\u0014<\u000e*\t-\u0019y]y"));
        insert.append("u_Intensity");
        insert.append(hn.m21100b("\u001f1\u0004\u001b\u0004RB\u001b\fWAUCOL\u0013\f_M]B]\nICY\r\u0012\u0004\u0007\u0004"));
        insert.append("u_Threshold");
        insert.append(C4230g.m21121c("pjy@yi0\u000e-\u00057\u00130\u0014 @d@iNi[S@y@?\f6\u0001-@5\u00154\u00131\u0001+\u0010y]y\u00046\u0014q\u00131\u0001+\u0010w\u0012>\u0002u@\u000eIbjy@y\u00065\u000f8\u0014y\f,\r-\u00054\u0010y]y\u00046\u0014q\u00025\u0015+N+\u0007;Ly7p[S@y@0\u0006yH5\u00154\u00131\u0001+\u0010y\\yPwQlIS@y@P\t7\u0014<\u000e*\t-\u0019y]y"));
        insert.append("u_Intensity");
        insert.append(hn.m21100b("\u0004\u0011\u0004\u000e\n\u000b\u001f1\u0004\u001b\u0004\\HdbIE\\gTHTV\u001b\u0019\u001bWSEIT\u001b\u000f\u001b@RB]B\u0011MUP^JHMO]\u0000.F."));
        return insert.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39508B = GLES20.glGetUniformLocation(this.f15543d, "u_Intensity");
        this.f39507A = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39508B, this.f39510D);
        GLES20.glUniform1f(this.f39507A, this.f39511z);
    }
}
