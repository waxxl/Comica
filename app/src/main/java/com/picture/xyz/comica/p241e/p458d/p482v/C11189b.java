package com.picture.xyz.comica.p241e.p458d.p482v;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;

import com.picture.xyz.comica.comica.C4232b;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p488g.o;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.v.b */
/* compiled from: jc */
public class C11189b extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39615E;

    /* renamed from: F */
    private int f39616F;

    /* renamed from: G */
    float f39617G;

    public C11189b(Context context, int i, int i2) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.f39615E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39617G = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39616F == 0) {
            this.f39616F = ImageHelper.m50969a(this.f39615E);
        }
        super.mo24183a(this.f39616F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39616F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39616F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, C4232b.m21129a("\u0007Z\u0012K\u001e[\u001eG\u0019\b\u001fA\u0010@\u0007\b\u0011D\u0018I\u0003\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MG\u0013}]\u0019A\u0011G\u0005EW[\u0016E\u0007D\u0012ZElW](|\u0012P\u0003]\u0005MF\u0013}^\u0016Z\u000eA\u0019OW^\u0012KE\b\u0001w#M\u000fk\u0018G\u0005LL\"\u0014G\u0019[\u0003\b\u0011D\u0018I\u0003\b\u0004K\u0016D\u001eF\u0010\bJ"));
        insert.append(this.f39617G);
        insert.append(o.m48769a("g3?V2J(\u0019*\\?\n|n|\u0004|O9Zo\u0011l\u0017n\bn\fp\u0019l\u0017k\bi\rp\u0019l\u0017l\u000en\bu\u0002VO3P8\u00191X5Wt\u0010VBVO9Zo\u0019?V0V.\u0002VO9Zo\u0019/X1I0\\h\u0019a\u0019(\\$M)K9\u000b\u0018\u0011"));
        insert.append(C4232b.m21129a("](|\u0012P\u0003]\u0005MG"));
        insert.append(o.m48769a("p\u0019*\\?\u000btO\u0003m9A\u001fV3K8\u0017$\u0015|O\u0003m9A\u001fV3K8\u0017%\u0010u\u0017.^>\u0002V_0V=M|^.X%\u0019a\u00198V(\u0011/X1I0\\h\u0015|nu\u0002VO9Zn\u00191V8P|\u0004|T3]tO9Zn\u0011*f\b\\$z3V.]rAp\u0019*f\b\\$z3V.]r@u\u0015|O9Zn\u0011m\u0017l\u0016/Z=U5W;\u0010u\u0013/Z=U5W;\u0016n\u0017l\u0002VP:\u0011;K=@|\u0007|\tr\u000fi\u0010VZ3U3Ka\u0019(\\$M)K9\u000b\u0018\u0011"));
        insert.append(C4232b.m21129a("\u0002w#M\u000f\\\u0002Z\u0012"));
        insert.append(1);
        insert.append(o.m48769a("p\u00191V8Pu\u0017.^>\u0002V\\0J9\u00195_|\u0011;K=@|\u0007|\tr\fl\u0010VZ3U3Ka\u0019(\\$M)K9\u000b\u0018\u0011"));
        insert.append(C4232b.m21129a("\u0002w#M\u000f\\\u0002Z\u0012"));
        insert.append(1);
        insert.append(o.m48769a("\u0015|T3]5\u0019w\u0019*\\?\u000bt\tr\fp\u0019l\u0017l\u0010u\u0017.^>\u0002V\\0J9\u00195_|\u0011;K=@|\u0007|\tr\u000bk\u0010VZ3U3Ka\u0019(\\$M)K9\u000b\u0018\u0011"));
        insert.append(C4232b.m21129a("\u0002w#M\u000f\\\u0002Z\u0012"));
        insert.append(1);
        insert.append(o.m48769a("\u0015|T3]5\u0019w\u0019*\\?\u000bt\tr\tp\u0019l\u0017i\u0010u\u0017.^>\u0002V\\0J9\u00195_|\u0011;K=@|\u0007|\tr\ti\u0010VBVZ3U3Ka\u0019(\\$M)K9\u000b\u0018\u0011"));
        insert.append(C4232b.m21129a("\u0002w#M\u000f\\\u0002Z\u0012"));
        insert.append(1);
        insert.append(o.m48769a("\u0015|T3]5\u0019w\u0019*\\?\u000bt\tr\fp\u0019l\u0017i\u0010u\u0017.^>\u0002VO9Zh\u0019?V0V.\bg3*\\?\r|Z3U3Kn\u0002VZ3U3Kn\u0004|O9Zh\u0011?V0V.\u0015|\tr\u0001u\u0002VZ3U3Km\u0019a\u0019*\\?\rt^.X%\u0015|^.X%\u0015|^.X%\u0015|\br\tu\u0002V\u0019|\u0019:U3X(\u0019.\u0002V\u0019|\u00195_|\u0011n\u0017l\u0019v\u0019?V0V.\u000brK|\u0005|Z3U3Kn\u0017=\u0010|BV\u0019|\u0019|\u0019.\u0019a\u0019n\u0017l\u0019v\u0019?V0V.\u000brK|\u0013|Z3U3Km\u0017.\u0019w\u0019?V0V.\u000brK|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\brXu\u0019w\u0019?V0V.\brK|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\u000brXu\u0002V\u0019|\u0019!\u00199U/\\|BV\u0019|\u0019|\u0019.\u0019a\u0019?V0V.\u000brX|\u0013|Z3U3Km\u0017=\u0019q\u0019n\u0017l\u0019v\u0019tZ3U3Km\u0017=\u0019q\u0019?V0V.\brKu\u0019v\u0019tZ3U3Kn\u0017=\u0019q\u0019?V0V.\u000brKu\u0019w\u0019?V0V.\u000brK|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\brXu\u0019w\u0019?V0V.\brK|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\u000brXu\u0002V\u0019|\u0019!3|\u0019|_0V=M|^g3|\u0019|P:\u0019t\u000br\t|\u0013|Z3U3Kn\u0017;\u0019`\u0019?V0V.\u000brXu\u0019'3|\u0019|\u0019|^|\u0004|\u000br\t|\u0013|Z3U3Kn\u0017;\u0019v\u0019?V0V.\br^|\u0012|Z3U3Kn\u0017;\u0019v\u0019t\br\t|\u0014|Z3U3Km\u0017=\u0010|\u0012|Z3U3Km\u0017;\u0019v\u0019t\br\t|\u0014|Z3U3Kn\u0017=\u0010g3|\u0019|D|\\0J9\u0019'3|\u0019|\u0019|^|\u0004|Z3U3Kn\u0017=\u0019v\u0019?V0V.\brX|\u0014|\u000br\t|\u0013|\u0011?V0V.\brX|\u0014|Z3U3Km\u0017;\u0010|\u0013|\u0011?V0V.\u000brX|\u0014|Z3U3Kn\u0017;\u0010|\u0012|Z3U3Kn\u0017;\u0019v\u0019t\br\t|\u0014|Z3U3Km\u0017=\u0010|\u0012|Z3U3Km\u0017;\u0019v\u0019t\br\t|\u0014|Z3U3Kn\u0017=\u0010g3|\u0019|DV\u0019|\u0019:U3X(\u0019>\u0002V\u0019|\u00195_|\u0011n\u0017l\u0019v\u0019?V0V.\u000br[|\u0005|Z3U3Kn\u0017=\u0010|BV\u0019|\u0019|\u0019>\u0019a\u0019n\u0017l\u0019v\u0019?V0V.\u000br[|\u0013|Z3U3Km\u0017>\u0019w\u0019?V0V.\u000br[|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\brXu\u0019w\u0019?V0V.\br[|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\u000brXu\u0002V\u0019|\u0019!\u00199U/\\|BV\u0019|\u0019|\u0019>\u0019a\u0019?V0V.\u000brX|\u0013|Z3U3Km\u0017=\u0019q\u0019n\u0017l\u0019v\u0019tZ3U3Km\u0017=\u0019q\u0019?V0V.\br[u\u0019v\u0019tZ3U3Kn\u0017=\u0019q\u0019?V0V.\u000br[u\u0019w\u0019?V0V.\u000br[|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\brXu\u0019w\u0019?V0V.\br[|\u0013|\u0011m\u0017l\u0019q\u0019?V0V.\u000brXu\u0002V\u0019|\u0019!3?V0V.\u0019a\u0019*\\?\ntKp^p[u\u0002VDV\\0J93?V0V.\u0019a\u0019*\\?\nt\tr\tu\u0002V^0f\u001aK=^\u001fV0V.\u0019a\u0019*\\?\rtZ3U3Kp\u0019m\u0017l\u0010g3!3"));
        return insert.toString();
    }
}
