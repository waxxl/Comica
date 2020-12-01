package com.picture.xyz.comica.p241e.p458d.p467g;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p243f.p244a.p245a.u;
import com.picture.xyz.comica.comica.na;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.g.c */
/* compiled from: cb */
public class C11186c extends MultiInputFilter {

    /* renamed from: E */
    private int f39537E;

    /* renamed from: F */
    private Bitmap f39538F;

    /* renamed from: G */
    float f39539G;

    public C11186c(Context context, int i, int i2) {
        super(2);
        this.f39538F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39539G = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39537E == 0) {
            this.f39537E = ImageHelper.m50969a(this.f39538F);
        }
        super.mo24183a(this.f39537E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39537E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39537E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, na.m48766a("\u001b,\u000e=\u0002-\u00021\u0005~\u00037\f6\u001b~\r2\u0004?\u001fea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;[ea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;Zea+\u00057\r1\u00193K-\n3\u001b2\u000e,Y\u001aK+4\n\u000e&\u001f+\u0019;Yea(\n,\u00127\u00059K(\u000e=Y~\u001d\u0001?;\u0013\u001d\u00041\u0019:PT\b1\u0005-\u001f~\r2\u0004?\u001f~\u0018=\n2\u00020\f~V"));
        insert.append(this.f39539G);
        insert.append(u.m48672a("\u0016WN2C.Y}[8Nn\r\n\r`\r+H>\u001eu\u001ds\u001fl\u001fh\u0001}\u001ds\u001al\u0018i\u0001}\u001ds\u001dj\u001fl\u0004f'+B4I}@<D3\u0005t'&'+H>\u001e}N2A2_f'+H>\u001e}^<@-A8\u0019}\u0010}Y8U)X/Hoiu"));
        insert.append(na.m48766a("+4\n\u000e&\u001f+\u0019;["));
        insert.append(u.m48672a("\u0001}[8No\u0005+r\tH%n2B/IsUq\r+r\tH%n2B/IsTt\u0004s_:Of';A2L)\r:_<T}\u0010}I2Yu^<@-A8\u0019q\r\n\u0004f'+H>\u001f}@2I4\r`\r0B9\u0005+H>\u001fu[\u0002y8U\u001eB2_9\u0003%\u0001}[\u0002y8U\u001eB2_9\u0003$\u0004q\r+H>\u001fu\u001cs\u001dr^>L1D3Jt\u0004w^>L1D3Jr\u001fs\u001df'4KuJ/L$\rc\rm\u0003e\u0004WN2A2_}\u0010}[8Nn\u0005l\u0003m\u0004f'8A.H}D;\ruJ/L$\rc\rm\u0003j\u001dt'>B1B/\u0010}@4UuY8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\u0004s_:Oq\r+H>\u001eu\u001cs\u001dt\u0001}\u0005:_<T}\u0000}\u001ds\u001am\u0004r\u001ds\u001ct\u0016WH1^8\r4K}\u0005:_<T}\u0013}\u001ds\u001bt'>B1B/\u0010}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\u0004s_:Of'8A.H}D;\ruJ/L$\rc\rm\u0003h\u001dt'>B1B/\u0010}@4UuY8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u0018q\rm\u0003m\u0004t\u0003/J?\u0001}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("q\r0B9Dt\u0003/J?\u0001}\u0005:_<T}\u0000}\u001ds\u0018m\u0004r\u001ds\u001ct\u0016WH1^8\r4K}\u0005:_<T}\u0013}\u001ds\u0019t'>B1B/\u0010}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("q\r0B9D}\u0006}[8No\u0005m\u0003h\u0001}\u001ds\u001dt\u0004s_:Of'8A.H}D;\ruJ/L$\rc\rm\u0003n\u001dt'>B1B/\u0010}@4UuY8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u001dq\rm\u0003h\u0004t\u0003/J?\u0001}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("q\r0B9D}\u0006}[8No\u0005m\u0003h\u0001}\u001ds\u001dt\u0004s_:Oq\ruJ/L$\rp\rm\u0003n\u0004r\u001ds\u001ct\u0016WH1^8\r4K}\u0005:_<T}\u0013}\u001ds\u001ft'>B1B/\u0010}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u001dq\rm\u0003h\u0004t\u0003/J?\u0016WH1^8\r4K}\u0005:_<T}\u0013}\u001ds\u001ct'>B1B/\u0010}@4UuY8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u0018q\rm\u0003h\u0004t\u0003/J?\u0001}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u001dq\rm\u0003h\u0004t\u0003/J?\u0001}\u0005:_<T}\u0000}\u001ds\u001ct\u0002m\u0003l\u0004f'8A.H}D;\ruJ/L$\rc\rm\u0003m\u0018t'>B1B/\u0010}Y8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("\u0001}@2I4\rv\r+H>\u001fu\u001ds\u0018q\rm\u0003h\u0004t\u0003/J?\u0016WH1^8'>B1B/\u0010}\u001ds\u001awY8U)X/Hoiu"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(u.m48672a("q\r0B9D}\u0006}[8No\u0005m\u0003h\u0001}\u001ds\u0018t\u0004s_:Of':A\u0002k/L:n2A2_}\u0010}[8Ni\u0005>B1B/\u0001}\u001cs\u001dt\u0016WPW"));
        return insert.toString();
    }
}
