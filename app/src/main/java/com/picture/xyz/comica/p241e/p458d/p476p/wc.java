package com.picture.xyz.comica.p241e.p458d.p476p;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.p243f.p244a.p245a.v;
import com.picture.xyz.comica.p488g.g;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.p.b */
public class wc extends MultiInputFilter {

    /* renamed from: E */
    private int f39582E;

    /* renamed from: F */
    private Bitmap f39583F;

    /* renamed from: G */
    float f39584G;

    public wc(Context context, int i, int i2) {
        super(2);
        this.f39583F = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39584G = (float) i2;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39582E == 0) {
            this.f39582E = ImageHelper.m50969a(this.f39583F);
        }
        super.mo24183a(this.f39582E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39582E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39582E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, v.m48670a("Z\u0013O\u0002C\u0012C\u000eDAB\bM\tZAL\rE\u0000^Z \u0014D\bL\u000eX\f\n\u0012K\fZ\rO\u0013\u0018%\n\u0014u5O\u0019^\u0014X\u0004\u001aZ \u0014D\bL\u000eX\f\n\u0012K\fZ\rO\u0013\u0018%\n\u0014u5O\u0019^\u0014X\u0004\u001bZ \u0017K\u0013S\bD\u0006\n\u0017O\u0002\u0018A\\>~\u0004R\"E\u000eX\u0005\u0011kI\u000eD\u0012^AL\rE\u0000^A]\u0000^\u0004X\fK\u0013AA\u0017"));
        insert.append(this.f39584G);
        insert.append(g.m48767a(")\u001eq{|gf4dqq'2C2)2bww!<\": % !>4\":%%' >4\":\"# %;/\u0018b}}v4u{z:=\u0018o\u0018bww!4q{~{`/\u0018bww!4aud~q&4/4fqj`gfw&V<"));
        insert.append(v.m48670a("\u0014u5O\u0019^\u0014X\u0004\u001a"));
        insert.append(g.m48767a("82bww <dKFqjW}{`p<l>4dKFqjW}{`p<m;=<fuv)\u001etx}uf4ufsm2)2p}`:gsybxw >4E=)\u001etx}uf4awsx{zu4/4"));
        insert.append(this.f39584G);
        insert.append(v.m48670a("\u0011k\\\u0004IS\n\fE\u0005CA\u0017AG\u000eNI\\\u0004IS\u0002\u0017u5O\u0019i\u000eE\u0013NORM\n\u0017u5O\u0019i\u000eE\u0013NOSH\u0006A\\\u0004IS\u0002P\u0004Q\u0005\u0012I\u0000F\bD\u0006\u0003H\u0000\u0012I\u0000F\bD\u0006\u0005S\u0004Q\u0011kC\u0007\u0002\u0006X\u0000SA\u0014A\u001aO\u001cT\u0003kI\u000eF\u000eX\\\nP\u0004S\u0000\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(v.m48670a("M\n\fE\u0005CH\u0004\u0013M\u0003\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u001fQ\u0003kI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001fM\nQ\u0004Q\u0003H\u0004\u0013M\u0003\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u0018V\u0003kI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001aM\nQ\u0004T\u0003H\u0004\u0013M\u0003\u0011kO\rY\u0004\n\bLA\u0002\u0006X\u0000SA\u0014A\u001aO\u001aT\u0003kQkI\u000eF\u000eX\\\n\u0015O\u0019^\u0014X\u0004\u0018%\u0002"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(v.m48670a("\u0006AG\u000eN\b\nJ\n\u0017O\u0002\u0018I\u001aO\u001fM\nQ\u0004T\u0003H\u0004\u0013M\u0003\u0011k\\\u0004IU\n\u0002E\rE\u0013\u001bZ \u0017O\u0002\u001eAI\u000eF\u000eXS\u0011kI\u000eF\u000eXS\u0017A\\\u0004IU\u0002\u0002E\rE\u0013\u0006A\u001aO\u0012H\u0011kI\u000eF\u000eXP\n\\\n\u0017O\u0002\u001eIM\u0013K\u0018\u0006AM\u0013K\u0018\u0006AM\u0013K\u0018\u0006A\u001bO\u001aH\u0011k\nA\n\u0007F\u000eK\u0015\n\u0013\u0011k\nA\n\bLA\u0002S\u0004Q\nK\n\u0002E\rE\u0013\u0018OXA\u0016AI\u000eF\u000eXS\u0004\u0000\u0003AQk\nA\nA\n\u0013\n\\\nS\u0004Q\nK\n\u0002E\rE\u0013\u0018OXA\u0000AI\u000eF\u000eXP\u0004\u0013\nJ\n\u0002E\rE\u0013\u0018OXA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u001bOKH\nJ\n\u0002E\rE\u0013\u001bOXA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u0018OKH\u0011k\nA\n\u001c\n\u0004F\u0012OAQk\nA\nA\n\u0013\n\\\n\u0002E\rE\u0013\u0018OKA\u0000AI\u000eF\u000eXP\u0004\u0000\nL\nS\u0004Q\nK\nII\u000eF\u000eXP\u0004\u0000\nL\n\u0002E\rE\u0013\u001bOXH\nK\nII\u000eF\u000eXS\u0004\u0000\nL\n\u0002E\rE\u0013\u0018OXH\nJ\n\u0002E\rE\u0013\u0018OXA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u001bOKH\nJ\n\u0002E\rE\u0013\u001bOXA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u0018OKH\u0011k\nA\n\u001c A\nAL\rE\u0000^AMZ A\nAC\u0007\nI\u0018O\u001aA\u0000AI\u000eF\u000eXS\u0004\u0006\n]\n\u0002E\rE\u0013\u0018OKH\n\u001a A\nA\nAMA\u0017A\u0018O\u001aA\u0000AI\u000eF\u000eXS\u0004\u0006\nK\n\u0002E\rE\u0013\u001bOMA\u0001AI\u000eF\u000eXS\u0004\u0006\nK\nI\u001bO\u001aA\u0007AI\u000eF\u000eXP\u0004\u0000\u0003A\u0001AI\u000eF\u000eXP\u0004\u0006\nK\nI\u001bO\u001aA\u0007AI\u000eF\u000eXS\u0004\u0000\u0003Z A\nAWAO\rY\u0004\n\u001a A\nA\nAMA\u0017AI\u000eF\u000eXS\u0004\u0000\nK\n\u0002E\rE\u0013\u001bOKA\u0007A\u0018O\u001aA\u0000A\u0002\u0002E\rE\u0013\u001bOKA\u0007AI\u000eF\u000eXP\u0004\u0006\u0003A\u0000A\u0002\u0002E\rE\u0013\u0018OKA\u0007AI\u000eF\u000eXS\u0004\u0006\u0003A\u0001AI\u000eF\u000eXS\u0004\u0006\nK\nI\u001bO\u001aA\u0007AI\u000eF\u000eXP\u0004\u0000\u0003A\u0001AI\u000eF\u000eXP\u0004\u0006\nK\nI\u001bO\u001aA\u0007AI\u000eF\u000eXS\u0004\u0000\u0003Z A\nAWk\nA\n\u0007F\u000eK\u0015\n\u0003\u0011k\nA\n\bLA\u0002S\u0004Q\nK\n\u0002E\rE\u0013\u0018OHA\u0016AI\u000eF\u000eXS\u0004\u0000\u0003AQk\nA\nA\n\u0003\n\\\nS\u0004Q\nK\n\u0002E\rE\u0013\u0018OHA\u0000AI\u000eF\u000eXP\u0004\u0003\nJ\n\u0002E\rE\u0013\u0018OHA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u001bOKH\nJ\n\u0002E\rE\u0013\u001bOHA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u0018OKH\u0011k\nA\n\u001c\n\u0004F\u0012OAQk\nA\nA\n\u0003\n\\\n\u0002E\rE\u0013\u0018OKA\u0000AI\u000eF\u000eXP\u0004\u0000\nL\nS\u0004Q\nK\nII\u000eF\u000eXP\u0004\u0000\nL\n\u0002E\rE\u0013\u001bOHH\nK\nII\u000eF\u000eXS\u0004\u0000\nL\n\u0002E\rE\u0013\u0018OHH\nJ\n\u0002E\rE\u0013\u0018OHA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u001bOKH\nJ\n\u0002E\rE\u0013\u001bOHA\u0000A\u0002P\u0004Q\nL\n\u0002E\rE\u0013\u0018OKH\u0011k\nA\n\u001c \u0002E\rE\u0013\n\\\n\u0017O\u0002\u0019IXMMMHH\u0011kWkO\rY\u0004 \u0002E\rE\u0013\n\\\n\u0017O\u0002\u0019I\u001aO\u001aH\u0011kM\ru'X\u0000M\"E\rE\u0013\n\\\n\u0017O\u0002\u001eII\u000eF\u000eXM\nP\u0004Q\u0003Z \u001c "));
        return insert.toString();
    }
}
