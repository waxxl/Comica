package com.picture.xyz.comica.p241e.p458d.p459a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.C4232b;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: e.d.a.a */
public class ka extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39495E;

    /* renamed from: F */
    private int f39496F;

    public ka(Context context, int i) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.f39495E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39496F == 0) {
            this.f39496F = ImageHelper.m50969a(this.f39495E);
        }
        super.mo24183a(this.f39496F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39496F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39496F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return C4232b.m21129a("\u0007Z\u0012K\u001e[\u001eG\u0019\b\u001aM\u0013A\u0002E\u0007\b\u0011D\u0018I\u0003\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MG\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MF\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005ME\u0013}^\u0016Z\u000eA\u0019OW^\u0012KE\b\u0001w#M\u000fk\u0018G\u0005LL\"\u0014G\u0019[\u0003\b\u0001M\u0014\u001bWW\u0015W^\u0012KD\u0000G\u0006E\u0019E\u001d[\bG\u0006@\u0019B\u001c[\bG\u0006G\u001fE\u0019^\u0013}^\u0018A\u0013\b\u001aI\u001eF_\u0001}S}^\u0012KD\b\u0014G\u001bG\u0005\u0013}^\u0012KD\b\u0004I\u001aX\u001bMC\bJ\b\u0003M\u000f\\\u0002Z\u0012\u001a3\u0000\u0002w#M\u000f\\\u0002Z\u0012\u0018[\b\u0001M\u0014\u001a_^(|\u0012P4G\u0018Z\u0013\u0006\u000f\u0004W^(|\u0012P4G\u0018Z\u0013\u0006\u000e\u0001^\u0006\u0005O\u0015\u0013}N\u001bG\u0016\\WO\u0005I\u000e\bJ\b\u0013G\u0003\u0000\u0004I\u001aX\u001bMC\u0004W^\u0013}A\u0011\b_O\u0005I\u000e\bI\bG\u0006E\u0018^\"\u0014G\u001bG\u0005\u0015W^\u0012KD\u0000F\u0006G\u0001L\"\u0012D\u0004MWA\u0011\b_O\u0005I\u000e\bI\bG\u0006G\u001d^S}K\u0018D\u0018ZJ\b\u0003M\u000f\\\u0002Z\u0012\u001a3\u0000\u0002w#M\u000f\\\u0002Z\u0012\u0019[\b\u0001M\u0014\u001a_^(|\u0012P4G\u0018Z\u0013\u0006\u000f\u0007E\u0006G\b[\b\u0001w#M\u000fk\u0018G\u0005LYQX\u001aY\u0018W\b\\\bG\u0006B\u0001^\u0006\u0005O\u0015\u0013}^\u0012KC\b\u0014G\u001bG\u0005\u001aL\"\u0001M\u0014\u001cWK\u0018D\u0018ZF\u0013}K\u0018D\u0018ZE\u0015W^\u0012KC\u0000\u0014G\u001bG\u0005\u0004W\u0019Y\u0018^\u0013}K\u0018D\u0018ZF\bJ\b\u0001M\u0014\u001c_\u0019Y\u0018]O\u0005I\u000e\u0004W\u0019Y\u0018]O\u0005I\u000e\u0004W\u0019Y\u0018]O\u0005I\u000e\u0004W\u0018Y\u0010^\u0013}K\u0018D\u0018ZW\u0015W\u0000\u0014G\u001bG\u0005\u0019W\u0002W\u0000\u0014G\u001bG\u0005\u001aYIW\u0002W\u0000\u0014G\u001bG\u0005\u0019W\u0007WK\u0018D\u0018ZF\u0006\u0016\u0001W\u0003W\u0000E\u0006G\b]\b\u0014G\u001bG\u0005\u001aW\u0002W\u0000F\u0006G\bZ\b_K\u0018D\u0018ZF\bX\b\u0014G\u001bG\u0005\u0019YI^\u0001^\u0001W\u0003WK\u0018D\u0018ZE\b]\b_\u0019Y\u0018W\u0005WK\u0018D\u0018ZF\u0006\u0016\u0001W\u0003WK\u0018D\u0018ZF\b]\b_\u0019Y\u0018W\u0005WK\u0018D\u0018ZE\u0006\u0016\u0001^\u0006\u0005O\u0015\u0013\n\"\u0012D\u0004M}K\u0018D\u0018ZW\u0015W^\u0012KD\u0000G\u0006G\u0001L\"\u0010D(n\u0005I\u0010k\u0018D\u0018ZW\u0015W^\u0012KC\u0000\u0014G\u001bG\u0005\u0004W\u0019Y\u0018^\u0013}U}");
    }
}
