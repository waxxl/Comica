package com.picture.xyz.comica.p241e.p458d.p463d;

import android.opengl.GLES20;
import com.picture.xyz.comica.p241e.p242c.hn;
import com.picture.xyz.comica.comica.q;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.d.d.a */
public class ja extends BasicFilter {

    /* renamed from: A */
    private float f39512A;

    /* renamed from: B */
    private int f39513B;

    /* renamed from: C */
    private int f39514C;

    /* renamed from: D */
    private float f39515D;

    /* renamed from: z */
    private int f39516z;

    public ja(int i, float f, float f2) {
        this.f39512A = f;
        this.f39516z = i;
        this.f39515D = f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, hn.m21100b("KV^GRWRKU\u0004VA_MNIK\u0004]HTEO\u001f1QUM]KII\u001bWZIKH^V\t`\u001bQdp^\\OQIA\u000b\u001f1RZVBMUC\u001bR^G\t\u0004M{oACgTKI@\u0000.NJRBTVV\u0004]HTEO\u0004N{rJOAUWRPB\u001f1QUM]KII\u001bBWKZP\u001bQdpSV^WSKW@\u0000.XKUWO\u0004RJO\u0004\u001bFWQI{HMAA\u001b\u0019"));
        insert.append(this.f39516z);
        insert.append(q.m48751b("dM)\"<t\u0010z1:$looimvmrsgoihvjssgoiopmvv|U1:$kg.26$4%32-o)\"<u704vM$M)\"<s76?)&3gbg)\"<swwqndM9+0&+g<4**zwq|U!3(>3%32-\u0018(.;37gbgnio|U.13)=gbgmm=+*5\u000046=:ln|U!05o6)+g&zo|>c)=|>tlvM$M9(-gw.13?bwdg'{1%dg'ltnU<Mg1:$mg6704z704l1:$mo=+*5\u000006#+/u!3(>3w?r%32-\u0018,.%\"vhmriiok%32-\u0018(.;37m9+0&+o&j=+*5\u000046=:npujqqwv|Ugg/.'1>+tz3:?+2-\"m\u0003w"));
        insert.append(hn.m21100b("N{oACPNV^\u0014"));
        insert.append(q.m48751b("k./(,ndM\"M\"M-\"+2-)76?)&3h/((o9+0&+o1%vkuqndM\"M)(6#*>.1ov<Ugg)\"<s47&-7z3:?+2-\"m\u0003w"));
        insert.append(hn.m21100b("N{oACPNV^\u0014"));
        insert.append(q.m48751b("k"));
        insert.append(hn.m21100b("M{oACgTKI@"));
        insert.append(q.m48751b("v|Ugg)\"<s%32-gb6*.<,=+*5w"));
        insert.append(hn.m21100b("M{oACgTKI@"));
        insert.append(q.m48751b("ndMg1:$kg;.9!9gbg)\"<sw47&-7q58%j%32-i- =k47&-7q&v|Ugg)\"<s46 14z46 1o;.9!9ndMg!3(>3.13:),.+>z"));
        insert.append("u_Intensity");
        insert.append(hn.m21100b("\u001f1\u0004\u001b\u0004RB\u001b\fWAUCOL\u0013\f_M]B]\nICY\r\u0012\u0004\u0007\u0004"));
        insert.append("u_Threshold");
        insert.append(q.m48751b("nUggV.13:),.+>zwqwdMg!3(>3+**,/>5/gbg;(+o,/>5/i- =k\u0010v|Ugg9+0&+g3223:*/gbg;(+o=+*5q58%sg\bndMg.9gwo32247&-7j+**+\"27vgagoionUggV.13:),.+>z.13:),.+>hvowqwdMg 3\u0018\u00195> \u001c(3(-gbg,/>5/gtg;.9!9m6)+\"1463&|U:U"));
        return insert.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39513B = GLES20.glGetUniformLocation(this.f15543d, "u_Intensity");
        this.f39514C = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39513B, this.f39512A);
        GLES20.glUniform1f(this.f39514C, this.f39515D);
    }
}
