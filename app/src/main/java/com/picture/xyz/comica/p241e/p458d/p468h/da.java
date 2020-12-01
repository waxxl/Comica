package com.picture.xyz.comica.p241e.p458d.p468h;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p243f.p244a.p245a.v;
import com.picture.xyz.comica.comica.na;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.h.b */
public class da extends MultiInputFilter {

    /* renamed from: E */
    private Bitmap f39544E;

    /* renamed from: F */
    private int f39545F;

    /* renamed from: G */
    float f39546G;

    /* renamed from: H */
    float f39547H;

    /* renamed from: I */
    float f39548I;

    public da(Context context, int i, float f, float f2, float f3) {
        super(2);
        this.f39544E = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39547H = f2;
        this.f39546G = f3;
        this.f39548I = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39545F == 0) {
            this.f39545F = ImageHelper.m50969a(this.f39544E);
        }
        super.mo24183a(this.f39545F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39545F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39545F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, na.m48766a(".\u0019;\b7\u00187\u00040K6\u00029\u0003.K8\u00071\n*PT\u001e0\u00028\u0004,\u0006~\u0018?\u0006.\u0007;\u0019l/~\u001e\u0001?;\u0013*\u001e,\u000enPT\u001e0\u00028\u0004,\u0006~\u0018?\u0006.\u0007;\u0019l/~\u001e\u0001?;\u0013*\u001e,\u000eoPT\u001d?\u0019'\u00020\f~\u001d;\blK(4\n\u000e&(1\u0004,\u000fea=\u00040\u0018*K(\u000e=X~<~V~\u001d;\bmCnElZl^rKnEiZk_rKnEn\\lZwPT\u00037\f6\u001b~\r2\u0004?\u001f~\u0007+\u0006v\u00071\u001c.K(\u000e=X~\bwK%a~K,\u000e*\u001e,\u0005~\u000f1\u001fv\brK(\u000e=Xv[pXrKnEkRrKnEoZwBea#a(\u000e=X~\u0018;\u001f2\u001e3C2\u0004)\u001b~\u001d;\bmK=G~\u00037\f6\u001b~\r2\u0004?\u001f~\u0007lB~\u0010TK~\r2\u0004?\u001f~\u000f~V~\u0007lKsK2\u001e3C=Bea~K=KcK=KuK(\u000e=Xv\u000fwPTK~\r2\u0004?\u001f~\u0007~V~\u0007+\u0006v\bwPTK~\r2\u0004?\u001f~\u0005~V~\u00067\u0005v\u00067\u0005v\bp\u0019rK=E9BrK=E<Bea~K8\u00071\n*K&KcK3\n&C3\n&C=E,G~\bp\fwG~\bp\twPTK~\u00028Kv\u0005~W~[p[wK%a~K~K=E,KcK2KuKvC=E,KsK2B~A~\u0007wKqKv\u0007~F~\u0005wPTK~K~\bp\f~V~\u0007~@~Cv\bp\f~F~\u0007wKtK2B~D~C2KsK0Bea~K~K=E<KcK2KuKvC=E<KsK2B~A~\u0007wKqKv\u0007~F~\u0005wPTK~\u0016TK~\u00028Kv\u0013~U~Zp[wK%a~K~K=E,KcK2KuKvC=E,KsK2B~A~CoEnKsK2BwKqKv\u0013~F~\u0007wPTK~K~\bp\f~V~\u0007~@~Cv\bp\f~F~\u0007wKtKvZp[~F~\u0007wB~D~C&KsK2Bea~K~K=E<KcK2KuKvC=E<KsK2B~A~CoEnKsK2BwKqKv\u0013~F~\u0007wPTK~\u0016TK~\u0019;\u001f+\u00190K=PT\u0016T\u001d1\u0002:K3\n7\u0005vBT\u0010T\u001d;\bmK=\u00042\u0004,PT\u001d;\bjK=\u00042\u0004,Y~V~\u001f;\u0013*\u001e,\u000el/v\u001e\u0001?;\u0013*\u001e,\u000enG(4\n\u000e&(1\u0004,\u000fwPT\r2\u0004?\u001f~\f,\n'KcK:\u0004*C=\u00042\u0004,Yp\u00199\trK\tBea8\u00071\n*K-\b?\u00077\u00059KcK"));
        insert.append(this.f39548I);
        insert.append(v.m48670a("\u0011kL\rE\u0000^AF\u0004\\\u0004F\u0012\n\\\n"));
        insert.append(this.f39547H);
        insert.append(na.m48766a("ea8\u00071\n*K<\n-\u000e2\u001e3KcK"));
        insert.append(this.f39546G);
        insert.append(v.m48670a("Z \u0017O\u0002\u0018AG\u000eN\b\n\\\n\fE\u0005\u0002\u0017O\u0002\u0018I\\>~\u0004R\"E\u000eX\u0005\u0004\u0019\u0006A\\>~\u0004R\"E\u000eX\u0005\u0004\u0018\u0003M\n\u0017O\u0002\u0018I\u001bO\u001aNY\u0002K\rC\u000fMH\u0003KY\u0002K\rC\u000fMN\u0018O\u001aZ \u0002E\rE\u0013\n\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CH\u0004\u0013M\u0003\u0011kC\u0007\u0002\u0006X\u0000SA\u0014A\u001aO\u0013H \u0002E\rE\u0013\n\\\n\u0017O\u0002\u0019I\u001bO\u001aH\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u001dQ\u0003kI\u000eF\u000eX\\\n\fC\u0019\u0002\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CH\u0004\u0013M\u0003\u0006A\\\u0004IR\u0002P\u0004Q\u0003M\nIM\u0013K\u0018\nL\nQ\u0004V\u001aH\u0005Q\u0004S\u0003Z \u0004F\u0012OAC\u0007\nIM\u0013K\u0018\n_\nQ\u0004W\u0003kI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CH\u0004\u0013M\u0003\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u001fQ\u0003kI\u000eF\u000eX\\\n\fC\u0019\u0002\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CA\u0001A\\\u0004IS\u0002Q\u0004T\u0006A\u001aO\u001aH\u0003OX\u0006HM\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\u0003OX\u0006HM\nIM\u0013K\u0018\nL\nQ\u0004T\u001aH\u0005Q\u0004P\u0003Z \u0004F\u0012OAC\u0007\nIM\u0013K\u0018\n_\nQ\u0004U\u0003kI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001fM\nQ\u0004Q\u0003H\u0004\u0013M\u0003\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u0019Q\u0003kI\u000eF\u000eX\\\n\fC\u0019\u0002\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CA\u0001A\\\u0004IS\u0002Q\u0004Q\u0006A\u001aO\u001fH\u0003OX\u0006HM\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001fM\nQ\u0004Q\u0003H\u0004\u0013M\u0003\u0006A\u0002\u0006X\u0000SA\u0007A\u001aO\u0019H\u0005Q\u0004P\u0003Z \u0004F\u0012OAC\u0007\nIM\u0013K\u0018\n_\nQ\u0004S\u0003kI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CA\u0001A\\\u0004IS\u0002Q\u0004Q\u0006A\u001aO\u001fH\u0003OX\u0006HZ \u0004F\u0012OAC\u0007\nIM\u0013K\u0018\n_\nQ\u0004P\u0003kI\u000eF\u000eX\\\n\fC\u0019\u0002\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CA\u0001A\\\u0004IS\u0002Q\u0004T\u0006A\u001aO\u001fH\u0003OX\u0006HM\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001aM\nQ\u0004T\u0003H\u0004\u0013M\u0003\u0006A\u0002\u0006X\u0000SA\u0007A\u001aO\u001bH\u0005Q\u0004P\u0003Z \u0004F\u0012OkI\u000eF\u000eX\\\nP\u0004Q\u0000\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(na.m48766a("\u001e\u0001?;\u0013*\u001e,\u000e"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001fM\nQ\u0004T\u0003H\u0004\u0013M\u0003\u0011k\nA\n\u0017O\u0002\u001eAI\u000eF\u000eXP\n\\\n\u0017O\u0002\u001eII\u000eF\u000eXM\nP\u0004Q\u0003Z A\nAM\ru'X\u0000M\"E\rE\u0013\n\\\n\u0017O\u0002\u001eII\u000eF\u000eXP\u0004\u0013M\u0003\nK\nI\u001bO\u001aA\u0007AI\u000eF\u000eXS\u0004\u0000\u0003A\u0001AY\u0004^\r_\f\u0002\u0002E\rE\u0013\u0018OX\u0006HM\n\r_\f\u0002\u0002E\rE\u0013\u001bOX\u0006HH\u0003A\u0000AI\u000eF\u000eXS\u0004\u0000\u0006AI\u000eF\u000eXP\u0004\u0000\u0003Z \u001c "));
        return insert.toString();
    }
}
