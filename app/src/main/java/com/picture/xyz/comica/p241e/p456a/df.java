package com.picture.xyz.comica.p241e.p456a;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.C4232b;

import com.picture.xyz.comica.p243f.p244a.p245a.j;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.a.d */
public class df extends MultiInputFilter {

    /* renamed from: E */
    private int f39457E;

    /* renamed from: F */
    float f39458F;

    /* renamed from: G */
    private Bitmap f39459G;

    public df(Context context, int i, int i2) {
        super(2);
        this.f39459G = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39458F = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39457E == 0) {
            this.f39457E = ImageHelper.m50969a(this.f39459G);
        }
        super.mo24183a(this.f39457E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39457E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39457E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, C4232b.m21129a("\u0007Z\u0012K\u001e[\u001eG\u0019\b\u001fA\u0010@\u0007\b\u0011D\u0018I\u0003\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MG\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MF\u0013}^\u0016Z\u000eA\u0019OW^\u0012KE\b\u0001w#M\u000fk\u0018G\u0005LL\"\u0014G\u0019[\u0003\b\u0011D\u0018I\u0003\b\u0004K\u0016D\u001eF\u0010\bJ"));
        insert.append(this.f39458F);
        insert.append(j.m48668a("\biP\f]\u0010GCE\u0006PP\u00134\u0013^\u0013\u0015V\u0000\u0000K\u0003M\u0001R\u0001V\u001fC\u0003M\u0004R\u0006W\u001fC\u0003M\u0003T\u0001R\u001aX9\u0015\\\nWC^\u0002Z\r\u001bJ9\u00189\u0015V\u0000\u0000CP\f_\fAX9\u0015V\u0000\u0000C@\u0002^\u0013_\u0006\u0007C\u000eCG\u0006K\u0017F\u0011VQwK"));
        insert.append(C4232b.m21129a("](|\u0012P\u0003]\u0005MG"));
        insert.append(j.m48668a("O\u0013\u0015V\u0000\u0001KE<g\u0006K \\\fA\u0007\u001d\u001b\u001fCE<g\u0006K \\\fA\u0007\u001d\u001a\u001aJ\u001d\u0011T\u0001\biU\u000f\\\u0002GCT\u0011R\u001a\u0013^\u0013\u0007\\\u0017\u001b\u0010R\u000eC\u000fVW\u001fCdJ\biU\u000f\\\u0002GC@\u0000R\u000fZ\rTC\u000eC"));
        insert.append(this.f39458F);
        insert.append(C4232b.m21129a("L\"\u0001M\u0014\u001aWE\u0018L\u001e\bJ\b\u001aG\u0013\u0000\u0001M\u0014\u001a_^(|\u0012P4G\u0018Z\u0013\u0006\u000f\u0004W^(|\u0012P4G\u0018Z\u0013\u0006\u000e\u0001[\b\u0001M\u0014\u001a_\u0019Y\u0018X[\u0014I\u001bA\u0019O^\u0001][\u0014I\u001bA\u0019OX\u001aY\u0018L\"\u0014G\u001bG\u0005\u0015W\\\u0012P\u0003]\u0005MEl_"));
        insert.append(j.m48668a("\u0016l7V\u001bG\u0016A\u0006"));
        insert.append(1);
        insert.append(C4232b.m21129a("\u0004WE\u0018L\u001e\u0001YZ\u0010JL\"W\b\u0001M\u0014\u001bWJ\u0005\bJ\b\u0001M\u0014\u001b_O\u0005I\u000e\u0005G\u0006B\u0001L\"W\b\u0014G\u001bG\u0005\bJ\b\u0014G\u001bG\u0005\b\\\b\u0015ZL\"\u0010D(n\u0005I\u0010k\u0018D\u0018ZW\u0015W^\u0012KC\u0000\u0014G\u001bG\u0005\u0004W\u0019Y\u0018^\u0013}U}"));
        return insert.toString();
    }
}
