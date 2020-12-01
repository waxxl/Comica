package com.picture.xyz.comica.p241e.p458d.p473m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.C4232b;
import com.picture.xyz.comica.utils.TextureCache;

import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.m.a */
/* compiled from: ka */
public class C11187a extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39559E;

    /* renamed from: F */
    private int f39560F;

    public C11187a(Context context, int i) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.f39559E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39560F == 0) {
            this.f39560F = ImageHelper.m50969a(this.f39559E);
        }
        super.mo24183a(this.f39560F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39560F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39560F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return C4232b.m21129a("X\u0005M\u0014A\u0004A\u0018FWE\u0012L\u001e]\u001aXWN\u001bG\u0016\\L\"\u0002F\u001eN\u0018Z\u001a\b\u0004I\u001aX\u001bM\u0005\u001a3\b\u0002w#M\u000f\\\u0002Z\u0012\u0018L\"\u0002F\u001eN\u0018Z\u001a\b\u0004I\u001aX\u001bM\u0005\u001a3\b\u0002w#M\u000f\\\u0002Z\u0012\u0019L\"\u0002F\u001eN\u0018Z\u001a\b\u0004I\u001aX\u001bM\u0005\u001a3\b\u0002w#M\u000f\\\u0002Z\u0012\u001aL\"\u0001I\u0005Q\u001eF\u0010\b\u0001M\u0014\u001aW^(|\u0012P4G\u0018Z\u0013\u0013}K\u0018F\u0004\\W^\u0012KD\b \bJ\b\u0001M\u0014\u001b_\u0018Y\u001aF\u001aB\u0004W\u0018Y\u001fF\u001dC\u0004W\u0018Y\u0018@\u001aF\u0001L\"\u001fA\u0010@\u0007\b\u0011D\u0018I\u0003\b\u001b]\u001a\u0000\u001bG\u0000XW^\u0012KD\b\u0014\u0001WS}\bWZ\u0012\\\u0002Z\u0019\b\u0013G\u0003\u0000\u0014\u0004W^\u0012KD\u0000G\u0006D\u0004W\u0018Y\u001dN\u0004W\u0018Y\u0019F\u0001^\u0013}U}^\u0012KD\b\u0004M\u0003D\u0002E_D\u0018_\u0007\b\u0001M\u0014\u001bWK[\b\u001fA\u0010@\u0007\b\u0011D\u0018I\u0003\b\u001b\u001a^\b\f\"W\b\u0011D\u0018I\u0003\b\u0013\bJ\b\u001b\u001aW\u0005WD\u0002E_K^\u0013}\bWKW\u0015WKW\u0003W^\u0012KD\u0000\u0013\u0001L\"W\b\u0011D\u0018I\u0003\b\u001b\bJ\b\u001b]\u001a\u0000\u0014\u0001L\"W\b\u0011D\u0018I\u0003\b\u0019\bJ\b\u001aA\u0019\u0000\u001aA\u0019\u0000\u0014\u0006\u0005\u0004WKYO^\u0004WKYJ^\u0013}\bWN\u001bG\u0016\\WPW\u0015WE\u0016P_E\u0016P_KYZ[\b\u0014\u0006\u0010\u0001[\b\u0014\u0006\u0015\u0001L\"W\b\u001eNW\u0000\u0019\bK\bG\u0006G\u0001WS}\bW\bWKYZW\u0015WDW\u0003W\u0000_KYZW\u0005WD^\b]\b\u001b\u0001W\u0007W\u0000\u001b\bZ\b\u0019\u0001L\"W\bW\b\u0014\u0006\u0010\bJ\b\u001b\b\\\b_\u0000\u0014\u0006\u0010\bZ\b\u001b\u0001W\u0002WD^\bX\b_DW\u0005WF^\u0013}\bW\bWKYJW\u0015WDW\u0003W\u0000_KYJW\u0005WD^\b]\b\u001b\u0001W\u0007W\u0000\u001b\bZ\b\u0019\u0001L\"W\b\n\"W\b\u001eNW\u0000\u000f\bI\bF\u0006G\u0001WS}\bW\bWKYZW\u0015WDW\u0003W\u0000_KYZW\u0005WD^\b]\b_\u0019Y\u0018W\u0005WD^\u0001W\u0007W\u0000\u000f\bZ\b\u001b\u0001L\"W\bW\b\u0014\u0006\u0010\bJ\b\u001b\b\\\b_\u0000\u0014\u0006\u0010\bZ\b\u001b\u0001W\u0002W\u0000F\u0006G\bZ\b\u001b\u0001^\bX\b_PW\u0005WD^\u0013}\bW\bWKYJW\u0015WDW\u0003W\u0000_KYJW\u0005WD^\b]\b_\u0019Y\u0018W\u0005WD^\u0001W\u0007W\u0000\u000f\bZ\b\u001b\u0001L\"W\b\n\"W\b\u0005M\u0003]\u0005FWKL\"\n\"\u0001G\u001eLWE\u0016A\u0019\u0000^\"\f\"\u0001M\u0014\u001bWK\u0018D\u0018ZL\"\u0001M\u0014\u001bW[\u0016E\u0007D\u0012\u001cW\u0015W\\\u0012P\u0003]\u0005MEl_](|\u0012P\u0003]\u0005MG\u0004W^\u0012KE\u0000\u0001w#M\u000fk\u0018G\u0005LYP[\b\u0001w#M\u000fk\u0018G\u0005LYQ^\u0001YZ\u0010JL\"\u0011D\u0018I\u0003\b\u0010Z\u0016QW\u0015WL\u0018\\_[\u0016E\u0007D\u0012\u001c[\b \u0001L\"\u001eNW\u0000\u0010Z\u0016QW\u0016W\u0018Y\u001dG\u0001}K\u0018D\u0018ZJ\b\u0001M\u0014\u001b_\u0018Y\u0011^\u0013}M\u001b[\u0012\b\u001eNW\u0000\u0010Z\u0016QW\u0016W\u0018Y\u001cG\u0001}K\u0018D\u0018ZJ\b\u0001M\u0014\u001b_\u0018Y\u0010^\u0013}M\u001b[\u0012\b\u001eNW\u0000\u0010Z\u0016QW\u0016W\u0018Y\u0018B\u0001}K\u0018D\u0018ZJ\b\u0001M\u0014\u001b_\u0018Y\u001d^\u0013}M\u001b[\u0012\b\f\"\u0014G\u001bG\u0005\u0015W^\u0012KD\u0000G\u0006C\u0001L\"\u0001M\u0014\u001cWK\u0018D\u0018ZE\u0013}^\u0012KC\b\u0014G\u001bG\u0005\u0019L\"\u0014G\u001bG\u0005\u001aJ\b\u0001M\u0014\u001c_K\u0018D\u0018Z[\bF\u0006G\u0001L\"\u0014G\u001bG\u0005\u0019W\u0015W^\u0012KC\u0000F\u0006G\u0002\u0010Z\u0016Q[\bF\u0006G\u0002\u0010Z\u0016Q[\bF\u0006G\u0002\u0010Z\u0016Q[\bG\u0006O\u0001L\"\u0014G\u001bG\u0005\bJ\b_K\u0018D\u0018ZF\b]\b_K\u0018D\u0018ZE\u0006\u0016\b]\b_K\u0018D\u0018ZF\bX\b\u0014G\u001bG\u0005\u0019YI^\b\\\b_\u001aY\u0018W\u0002WK\u0018D\u0018ZE\b]\b_\u0019Y\u0018W\u0005W\u0000\u0014G\u001bG\u0005\u0019W\u0007WK\u0018D\u0018ZF\u0006\u0016\u0001^\u0001^\b\\\b\u0014G\u001bG\u0005\u001aW\u0002W\u0000F\u0006G\bZ\b\u0014G\u001bG\u0005\u0019YI^\b\\\b\u0014G\u001bG\u0005\u0019W\u0002W\u0000F\u0006G\bZ\b\u0014G\u001bG\u0005\u001aYI^\u0001YZ\u0010JLU}\bW\b\u0001M\u0014\u001cWK\u0018D\u0018ZE\bJ\b\u0001M\u0014\u001c_[\u0016E\u0007D\u0012\u001c[\bF\u0006G\u0001L\"W\bW^\u0012KC\b\u0014G\u001bG\u0005\u0019W\u0015W^\u0012KC\u0000\u0014G\u001bG\u0005\u0004W\u0019Y\u0018^\u0013}\bW\b\u0010D(n\u0005I\u0010k\u0018D\u0018ZW\u0015W^\u0012KC\u0000\u0014G\u001bG\u0005\u0019YZ\u0010JW\u0002W\u0000F\u0006G\bZ\b\u0014G\u001bG\u0005\u001aYI^\b\\\b\u0004M\u0003D\u0002E_K\u0018D\u0018ZE\u0006\u0005O\u0015\u0004WD\u0002E_K\u0018D\u0018ZF\u0006\u0005O\u0015\u0001^\b]\b\u0014G\u001bG\u0005\u001aYI[\b\u0014G\u001bG\u0005\u0019YI^\u0013}U}");
    }
}
