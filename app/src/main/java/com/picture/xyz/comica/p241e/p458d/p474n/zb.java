package com.picture.xyz.comica.p241e.p458d.p474n;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p240d.jm;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.n.a */
public class zb extends MultiInputFilter {

    /* renamed from: E */
    private int f39565E;

    /* renamed from: F */
    private Bitmap f39566F;

    public zb(Context context, int i) {
        super(2);
        this.f39566F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39565E == 0) {
            this.f39565E = ImageHelper.m50969a(this.f39566F);
        }
        super.mo24183a(this.f39565E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39565E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39565E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return jm.m48372c("K\u0001^\u0010R\u0000R\u001cUSS\u001a\\\u001bKS]\u001fT\u0012OH1\u0006U\u001a]\u001cI\u001e\u001b\u0000Z\u001eK\u001f^\u0001\t7\u001b\u0006d'^\u000bO\u0006I\u0016\u000bH1\u0006U\u001a]\u001cI\u001e\u001b\u0000Z\u001eK\u001f^\u0001\t7\u001b\u0006d'^\u000bO\u0006I\u0016\nH1\u0006U\u001a]\u001cI\u001e\u001b\u0000Z\u001eK\u001f^\u0001\t7\u001b\u0006d'^\u000bO\u0006I\u0016\tH1\u0005Z\u0001B\u001aU\u0014\u001b\u0005^\u0010\tSM,o\u0016C0T\u001cI\u0017\u0000yX\u001cU\u0000OSM\u0016X@\u001b$\u001bN\u001b\u0005^\u0010\b[\u000b]\tB\tF\u0017S\u000b]\fB\u000eG\u0017S\u000b]\u000bD\tB\u0012H1\u001bR\u0014S\u0003\u001b\u0015W\u001cZ\u0007\u001b\u001fN\u001e\u0013\u001fT\u0004KSM\u0016X@\u001b\u0010\u0012S@y\u001bSI\u0016O\u0006I\u001d\u001b\u0017T\u0007\u0013\u0010\u0017SM\u0016X@\u0013C\u0015@\u0017S\u000b]\u000eJ\u0017S\u000b]\nB\u0012Z\u0000yFyM\u0016X@\u001b\u0000^\u0007W\u0006V[W\u001cL\u0003\u001b\u0005^\u0010\bSX_\u001b\u001bR\u0014S\u0003\u001b\u0015W\u001cZ\u0007\u001b\u001f\tZ\u001b\b1S\u001b\u0015W\u001cZ\u0007\u001b\u0017\u001bN\u001b\u001f\tS\u0016SW\u0006V[XZ\u0000y\u001bSXS\u0006SXS\u0010SM\u0016X@\u0013\u0017\u0012H1S\u001b\u0015W\u001cZ\u0007\u001b\u001f\u001bN\u001b\u001fN\u001e\u0013\u0010\u0012H1S\u001b\u0015W\u001cZ\u0007\u001b\u001d\u001bN\u001b\u001eR\u001d\u0013\u001eR\u001d\u0013\u0010\u0015\u0001\u0017SX]\\Z\u0017SX]YZ\u0000y\u001bS]\u001fT\u0012OSCS\u0006SV\u0012C[V\u0012C[X]I_\u001b\u0010\u0015\u0014\u0012_\u001b\u0010\u0015\u0011\u0012H1S\u001b\u001a]S\u0013\u001d\u001bO\u001bC\u0015C\u0012S@y\u001bS\u001bSX]IS\u0006SWS\u0010S\u0013[X]IS\u0016SWZ\u001bY\u001b\u001f\u0012S\u0014S\u0013\u001f\u001b^\u001b\u001d\u0012H1S\u001bS\u001b\u0010\u0015\u0014\u001bN\u001b\u001f\u001bX\u001b[\u0013\u0010\u0015\u0014\u001b^\u001b\u001f\u0012S\u0011SWZ\u001b\\\u001b[WS\u0016SUZ\u0000y\u001bS\u001bSX]YS\u0006SWS\u0010S\u0013[X]YS\u0016SWZ\u001bY\u001b\u001f\u0012S\u0014S\u0013\u001f\u001b^\u001b\u001d\u0012H1S\u001b\u000e1S\u001b\u001a]S\u0013\u000b\u001bM\u001bB\u0015C\u0012S@y\u001bS\u001bSX]IS\u0006SWS\u0010S\u0013[X]IS\u0016SWZ\u001bY\u001b[\n]\u000bS\u0016SWZ\u0012S\u0014S\u0013\u000b\u001b^\u001b\u001f\u0012H1S\u001bS\u001b\u0010\u0015\u0014\u001bN\u001b\u001f\u001bX\u001b[\u0013\u0010\u0015\u0014\u001b^\u001b\u001f\u0012S\u0011S\u0013B\u0015C\u001b^\u001b\u001f\u0012Z\u001b\\\u001b[CS\u0016SWZ\u0000y\u001bS\u001bSX]YS\u0006SWS\u0010S\u0013[X]YS\u0016SWZ\u001bY\u001b[\n]\u000bS\u0016SWZ\u0012S\u0014S\u0013\u000b\u001b^\u001b\u001f\u0012H1S\u001b\u000e1S\u001b\u0001^\u0007N\u0001USXH1\u000e1\u0005T\u001a_SV\u0012R\u001d\u0013Z1\b1\u0005^\u0010\bSX\u001cW\u001cIH1\u0005^\u0010\u000fSX\u001cW\u001cIA\u001bN\u001b\u0007^\u000bO\u0006I\u0016\t7\u0013\u0006d'^\u000bO\u0006I\u0016\u000b_M,o\u0016C0T\u001cI\u0017\u0012H1\u0015W\u001cZ\u0007\u001b\u0014I\u0012BS\u0006S_\u001cO[X\u001cW\u001cIA\u0015\u0001\\\u0011\u0017SlZ\u0000y]\u001fT\u0012OSH\u0010Z\u001fR\u001d\\S\u0006S\u000e]\u000bH1\u0005^\u0010\tSV\u001c_\u001a\u001bN\u001b\u001eT\u0017\u0013\u0005^\u0010\t[M,o\u0016C0T\u001cI\u0017\u0015\u000b\u0017SM,o\u0016C0T\u001cI\u0017\u0015\n\u0012_\u001b\u0005^\u0010\t[\n]\u000b\\H\u0010Z\u001fR\u001d\\Z\u0012YH\u0010Z\u001fR\u001d\\\\\t]\u000bH1\u0010T\u001fT\u0001\u001bN\u001b\u0005^\u0010\b[]\u001fT\u001cI[\\\u0001Z\n\u001bY\u001bG\u0015C\u0012\\\u001bG\u0015C\u0012H1\u001a]S\u0013\u0014I\u0012BS\u0005S\u000b]\u0002C\u0012yX\u001cW\u001cIN\u001b\u0005^\u0010\b[\\\u0001Z\n\u0012H1S\u001bSM\u0016XG\u001b\u0010T\u001fT\u0001\nS\u0006SM\u0016XG\u0013\u0010T\u001fT\u0001\u0017S\n]\u000bZ\u0000y\u001bS\u001b\u0014W,}\u0001Z\u0014x\u001cW\u001cIS\u0006SM\u0016XG\u0013\u0010T\u001fT\u0001\n]I\u0014YS\u0011S\u0013B\u0015C\u001b^\u001b\u0010T\u001fT\u0001\t]ZZ\u001bX\u001b\u0000^\u0007W\u0006V[X\u001cW\u001cIA\u0015\u0001\\\u0011\u0017SW\u0006V[X\u001cW\u001cIB\u0015\u0001\\\u0011\u0012Z\u001bY\u001b\u0010T\u001fT\u0001\t]Z_\u001b\u0010T\u001fT\u0001\n]ZZ\u0000yFy");
    }
}
