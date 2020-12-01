package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import com.picture.xyz.comica.p240d.p455l.bl;
import com.picture.xyz.comica.p240d.p455l.en;
import com.picture.xyz.comica.p240d.p455l.wd;
import com.picture.xyz.comica.p241e.p242c.hn;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.comica.Face2;
import com.picture.xyz.comica.imageprocessing.FastImageProcessingPipeline;
import com.picture.xyz.comica.imageprocessing.FastImageProcessingView;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
import com.picture.xyz.comica.imageprocessing.p254e.ImageResourceInput;
import com.picture.xyz.comica.imageprocessing.p255f.BitmapOutput;

/* renamed from: d.w */
public class jl implements BitmapOutput.C11653a {

    /* renamed from: a */
    ImageView f39420a = null;

    /* renamed from: b */
    int f39421b = 0;

    /* renamed from: c */
    ArrayList<en> f39422c = new ArrayList<>();

    /* renamed from: d */
    C11182e f39423d;

    /* renamed from: e */
    private LayoutInflater f39424e;

    /* renamed from: f */
    private FastImageProcessingView f39425f;

    /* renamed from: g */
    LinearLayout f39426g;

    /* renamed from: h */
    private FastImageProcessingPipeline f39427h;

    /* renamed from: i */
    private BitmapOutput f39428i;

    /* renamed from: j */
    Context f39429j;

    /* renamed from: k */
    en f39430k;

    /* renamed from: l */
    ImageResourceInput f39431l;

    /* renamed from: m */
    BasicFilter f39432m;

    /* renamed from: d.w$a */
    /* compiled from: jl */
    class C11183a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bitmap f39433a;

        C11183a(Bitmap bitmap) {
            this.f39433a = bitmap;
        }

        public void run() {
            jl wVar = jl.this;
            wVar.mo51900c(wVar.f39426g, wVar.f39430k, this.f39433a);
            jl.this.m48438e();
        }
    }

    /* renamed from: d.w$b */
    /* compiled from: jl */
    class C11184b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ en f39435a;

        C11184b(en bVar) {
            this.f39435a = bVar;
        }

        public void onClick(View view) {
            ImageView imageView = jl.this.f39420a;
            if (imageView != null) {
                imageView.setBackgroundColor(0);
            }
            jl wVar = jl.this;
            if (wVar.f39420a == view) {
                wVar.f39423d.mo51896b(new bl());
                jl.this.f39420a = null;
                return;
            }
            try {
                wVar.f39423d.mo51896b(this.f39435a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            jl.this.f39420a = (ImageView) view;
            //view.setBackgroundResource(R.drawable.selected);
        }
    }

    public jl(Context context, boolean z, Bitmap bitmap, FastImageProcessingView fastImageProcessingView, Face2[] hVarArr) {
        new PorterDuffColorFilter(-256, PorterDuff.Mode.DST_ATOP);
        this.f39429j = context;
        FastImageProcessingPipeline aVar = new FastImageProcessingPipeline();
        this.f39427h = aVar;
        this.f39425f = fastImageProcessingView;
        fastImageProcessingView.setPipeline(aVar);
        this.f39431l = new ImageResourceInput(this.f39425f, bitmap);
        this.f39428i = new BitmapOutput(this);
        this.f39427h.mo53634b(this.f39431l);
        this.f39422c.add(new wd(context, hVarArr, 7));
        this.f39422c.add(new wd(context, hVarArr, 6));
        this.f39422c.add(new wd(context, hVarArr, 8));
        this.f39422c.add(new wd(context, hVarArr, 5));
        this.f39422c.add(new wd(context, hVarArr, 4));
        this.f39422c.add(new wd(context, hVarArr, 0));
        this.f39422c.add(new wd(context, hVarArr, 1));
        this.f39422c.add(new wd(context, hVarArr, 9));
        this.f39422c.add(new wd(context, hVarArr, 3));
        this.f39422c.add(new wd(context, hVarArr, 2));
        this.f39423d = (C11182e) context;
        this.f39424e = (LayoutInflater) context.getSystemService(hn.m21100b("HZ]TQO{RJ]HZP^V"));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m48438e() {
        int i = this.f39421b + 1;
        this.f39421b = i;
        if (i < this.f39422c.size()) {
            this.f39430k = this.f39422c.get(this.f39421b);
            this.f39427h.mo53635d();
            this.f39431l.mo24185B(this.f39432m);
            this.f39432m.mo24185B(this.f39428i);
            this.f39427h.mo53633a(this.f39432m);
            BasicFilter f = this.f39430k.mo51865f(this.f39429j);
            this.f39432m = f;
            f.mo24187w(this.f39428i);
            this.f39431l.mo24187w(this.f39432m);
            this.f39427h.mo53636e();
            this.f39425f.requestRender();
            return;
        }
        this.f39427h.mo53635d();
        this.f39431l.mo24185B(this.f39432m);
        this.f39432m.mo24185B(this.f39428i);
        this.f39427h.mo53633a(this.f39432m);
        this.f39425f.setVisibility(View.GONE);
    }

    /* renamed from: a */
    public void mo51898a(Bitmap bitmap) {
        this.f39427h.mo53635d();
        ((Activity) this.f39429j).runOnUiThread(new C11183a(bitmap));
    }

    /* renamed from: b */
    public void mo51899b(LinearLayout linearLayout) {
        this.f39421b = 0;
        this.f39426g = linearLayout;
        en bVar = this.f39422c.get(0);
        this.f39430k = bVar;
        BasicFilter f = bVar.mo51865f(this.f39429j);
        this.f39432m = f;
        f.mo24187w(this.f39428i);
        this.f39431l.mo24187w(this.f39432m);
        this.f39427h.mo53636e();
        this.f39425f.requestRender();
    }

    /* renamed from: c */
    public void mo51900c(LinearLayout linearLayout, en bVar, Bitmap bitmap) {
        View inflate = this.f39424e.inflate(R.layout.action_caricature_layout, linearLayout, false);
        ((ImageView) inflate.findViewById(R.id.menuImage)).setImageBitmap(bitmap);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.selected);
        imageView.setClickable(true);
        imageView.setOnClickListener(new C11184b(bVar));
        linearLayout.addView(inflate, linearLayout.getChildCount());
    }
}
