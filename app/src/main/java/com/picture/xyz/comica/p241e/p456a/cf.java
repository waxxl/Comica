package com.picture.xyz.comica.p241e.p456a;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.p243f.p244a.p245a.j;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.a.f */
public class cf extends MultiInputFilter {

    /* renamed from: E */
    float f39463E;

    /* renamed from: F */
    private Bitmap f39464F;

    /* renamed from: G */
    private int f39465G;

    public cf(Context context, int i, int i2) {
        super(2);
        this.f39464F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39463E = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39465G == 0) {
            this.f39465G = ImageHelper.m50969a(this.f39464F);
        }
        super.mo24183a(this.f39465G, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39465G;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39465G = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, j.m48668a("\u0013A\u0006P\n@\n\\\r\u0013\u000bZ\u0004[\u0013\u0013\u0005_\fR\u0017\biF\rZ\u0005\\\u0011^C@\u0002^\u0013_\u0006AQwCF<g\u0006K\u0017F\u0011VS\biF\rZ\u0005\\\u0011^C@\u0002^\u0013_\u0006AQwCF<g\u0006K\u0017F\u0011VR\biF\rZ\u0005\\\u0011^C@\u0002^\u0013_\u0006AQwCF<g\u0006K\u0017F\u0011VQ\biE\u0002A\u001aZ\rTCE\u0006PQ\u0013\u0015l7V\u001bp\f\\\u0011WX9\u0000\\\r@\u0017\u0013\u0005_\fR\u0017\u0013\u0010P\u0002_\n]\u0004\u0013^"));
        insert.append(this.f39463E);
        insert.append(j.m48668a("\biP\f]\u0010GCE\u0006PP\u00134\u0013^\u0013\u0015V\u0000\u0000K\u0003M\u0001R\u0001V\u001fC\u0003M\u0004R\u0006W\u001fC\u0003M\u0003T\u0001R\u001aX9\u0015\\\nWC^\u0002Z\r\u001bJ9\u00189\u0015V\u0000\u0000CP\f_\fAX9\u0015V\u0000\u0000C@\u0002^\u0013_\u0006\u0007C\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("F<g\u0006K\u0017F\u0011VS"));
        insert.append(j.m48668a("\u001fCE\u0006PQ\u001b\u0015l7V\u001bp\f\\\u0011WMKO\u0013\u0015l7V\u001bp\f\\\u0011WMJJ\u001aMA\u0004QX9\u0005_\fR\u0017\u0013\u0004A\u0002JC\u000eCW\fGK@\u0002^\u0013_\u0006\u0007O\u00134\u001aX9\u0015V\u0000\u0001C^\fW\n\u0013^\u0013\u000e\\\u0007\u001b\u0015V\u0000\u0001KE<g\u0006K \\\fA\u0007\u001d\u001b\u001fCE<g\u0006K \\\fA\u0007\u001d\u001a\u001aO\u0013\u0015V\u0000\u0001K\u0002M\u0003L@\u0000R\u000fZ\rTJ\u001aI@\u0000R\u000fZ\rTL\u0001M\u0003X9\nUKT\u0011R\u001a\u0013]\u0013S\u001dT\u0006J9\u0000\\\u000f\\\u0011\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(j.m48668a("\u001fC^\fW\n\u001aMA\u0004QX9\u0006_\u0010VCZ\u0005\u0013KT\u0011R\u001a\u0013]\u0013S\u001dV\u0003J9\u0000\\\u000f\\\u0011\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(j.m48668a("O\u0013\u000e\\\u0007ZC\u0018CE\u0006PQ\u001bS\u001dV\u001fC\u0003M\u0003J\u001aMA\u0004QX9\u0006_\u0010VCZ\u0005\u0013KT\u0011R\u001a\u0013]\u0013S\u001dQ\u0006J9\u0000\\\u000f\\\u0011\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(j.m48668a("O\u0013\u000e\\\u0007ZC\u0018CE\u0006PQ\u001bS\u001dS\u001fC\u0003M\u0006J\u001aMA\u0004QX9\u0006_\u0010VCZ\u0005\u0013KT\u0011R\u001a\u0013]\u0013S\u001dS\u0006J9\u0000\\\u000f\\\u0011\u000eC\u0003M\u0006IG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(j.m48668a("\u001fC^\fW\n\u0013H\u0013\u0015V\u0000\u0001K\u0003M\u0003O\u0013S\u001dV\u001aJ\u001d\u0011T\u0001\biV\u000f@\u00069\u0000\\\u000f\\\u0011\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(j.m48668a("O\u0013\u000e\\\u0007ZC\u0018CE\u0006PQ\u001bS\u001dV\u001fC\u0003M\u0006J\u001aMA\u0004QX9\u0004_<u\u0011R\u0004p\f_\fAC\u000eCE\u0006PW\u001b\u0000\\\u000f\\\u0011\u001fC\u0002M\u0003J\biNi"));
        return insert.toString();
    }
}
