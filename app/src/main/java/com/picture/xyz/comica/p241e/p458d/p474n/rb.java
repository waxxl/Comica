package com.picture.xyz.comica.p241e.p458d.p474n;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.picture.xyz.comica.utils.TextureCache;
import com.picture.xyz.comica.comica.na;
import com.picture.xyz.comica.p488g.g;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: e.d.n.b */
public class rb extends MultiInputFilter {

    /* renamed from: E */
    float f39567E;

    /* renamed from: F */
    private int f39568F;

    /* renamed from: G */
    float f39569G;

    /* renamed from: H */
    float f39570H;

    /* renamed from: I */
    private Bitmap f39571I;

    public rb(Context context, int i, float f, float f2, float f3) {
        super(2);
        this.f39571I = TextureCache.m40393d().mo46484c(context, i, Bitmap.Config.RGB_565);
        this.f39570H = f2;
        this.f39569G = f3;
        this.f39567E = f;
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f39568F == 0) {
            this.f39568F = ImageHelper.m50969a(this.f39571I);
        }
        super.mo24183a(this.f39568F, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f39568F;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f39568F = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        StringBuilder insert = new StringBuilder().insert(0, g.m48767a("bfww{g{{|4z}u|b4tx}uf/\u0018a|}t{`y2gsybxwf P2aM@wlfa`q\"/\u0018a|}t{`y2gsybxwf P2aM@wlfa`q#/\u0018bsfk}|s2bww 4dKFqjW}{`p)\u001eq{|gf4dqq'2C2)2bww!<\": % !>4\":%%' >4\":\"# %;/\u0018|{szd2r~{s`2xgy:x}cb4dqq'2w;4i\u001e24`qfa`z2p}`:w>4dqq':$<'>4\":'->4\":#%;=)\u001eo\u001edqq'2gw`~a<~{ed2bww!4q82|{szd2r~{s`2x =2o\u001842r~{s`2p2)2x 4?4~a<q=)\u001e24q4/4q494dqq':p;/\u001842r~{s`2x2)2xgy:w;/\u001842r~{s`2z2)2y{z:y{z:w<f>4q:u=>4q:p=)\u001e24tx}uf4j4/4uj<uj<q:`82w<s;82w<v;/\u001842}t4:z2(2$<$;4i\u001e2424q:`4/4~494:<q:`4?4~=2>2x;4=4:x292z;/\u00184242w<s2)2x2?2<:w<s292x;484~=2;2<~4?4|=)\u001e2424q:p4/4~494:<q:p4?4~=2>2x;4=4:x292z;/\u001842i\u001842}t4:l2*2%<$;4i\u001e2424q:`4/4~494:<q:`4?4~=2>2<#:\"4?4~=;4=4:l292x;/\u00184242w<s2)2x2?2<:w<s292x;484:%<$292x;=2;2<j4?4~=)\u001e2424q:p4/4~494:<q:p4?4~=2>2<#:\"4?4~=;4=4:l292x;/\u001842i\u001842fw`gf|4q/\u0018i\u0018b}}v4u{z:=\u0018o\u0018bww!4q{~{`/\u0018bww&4q{~{`&2)2`wlfa`q P:aM@wlfa`q\"8dKFqjW}{`p;/\u0018r~{s`2s`uk4/4v{f<q{~{`&<fuv>4E=)\u001etx}uf4awsx{zu4/4"));
        insert.append(this.f39567E);
        insert.append(na.m48766a("PT\r2\u0004?\u001f~\u0007;\u001d;\u0007-KcK"));
        insert.append(this.f39570H);
        insert.append(g.m48767a(")\u001etx}uf4puaq~a4/4"));
        insert.append(this.f39569G);
        insert.append(na.m48766a("ea(\u000e=Y~\u00061\u000f7KcK3\u0004:C(\u000e=Yv\u001d\u0001?;\u0013\u001d\u00041\u0019:E&G~\u001d\u0001?;\u0013\u001d\u00041\u0019:E'BrK(\u000e=YvZp[q\u0018=\n2\u00020\fwBt\u0018=\n2\u00020\fqYp[ea(\u000e=X~\b1\u0007*\u000e&\u001fcK*\u000e&\u001f+\u0019;Y\u001aC"));
        insert.append(g.m48767a("aM@wlfa`q"));
        insert.append(1);
        insert.append(na.m48766a("rK3\u0004:\u0002wE,\f<PT\r2\u0004?\u001f~\u0007+\u0006*\u000e&\u001f~V~\u000f1\u001fv\b1\u0007*\u000e&\u001frK\tBea8\u00071\n*K2\u001e3\u00023\n9\u000e~V~\r2\u00041\u0019v\f,\n'KtK2\u000e(\u000e2\u0018wD~\u0007;\u001d;\u0007-PT\b1\u00071\u0019~V~\b1\u0007*\u000e&\u001f~A~\u0007+\u00067\u0006?\f;D<\n-\u000e2\u001e3PTK~K(\u000e=_~\b1\u00071\u0019oKcK(\u000e=_v\b1\u00071\u0019rKoEnBea~K~\f24\u0018\u0019?\f\u001d\u00042\u0004,KcK(\u000e=_v\b1\u00071\u0019oE,\f<KtKvZp[~F~\b1\u00071\u0019lE?B~@~\u0018;\u001f2\u001e3C=\u00042\u0004,Yp\u00199\trK2\u001e3C=\u00042\u0004,Zp\u00199\twB~A~\b1\u00071\u0019lE?G~\b1\u00071\u0019oE?Bea#a"));
        return insert.toString();
    }
}
