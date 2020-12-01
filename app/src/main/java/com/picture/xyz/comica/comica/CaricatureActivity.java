package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.p240d.C11182e;
import com.picture.xyz.comica.p240d.jl;
import com.picture.xyz.comica.p240d.jm;
import com.picture.xyz.comica.p240d.p455l.bl;
import com.picture.xyz.comica.p240d.p455l.en;
import com.picture.xyz.comica.p241e.p242c.hn;
import com.picture.xyz.comica.imageprocessing.FastImageProcessingPipeline;
import com.picture.xyz.comica.imageprocessing.FastImageProcessingView;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p254e.ImageResourceInput;
import com.picture.xyz.comica.imageprocessing.p255f.BitmapOutput;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: gr.gamebrain.comica.CaricatureActivity */
/* compiled from: sa */
public class CaricatureActivity extends Activity implements C11182e, BitmapOutput.C11653a {

    /* renamed from: a */
    private SparseArray<Face> f39690a;

    /* renamed from: b */
    boolean f39691b = false;

    /* renamed from: c */
    LinearLayout f39692c;

    /* renamed from: d */
    jl f39693d;

    /* renamed from: e */
    en f39694e = new bl();

    /* renamed from: f */
    BitmapOutput f39695f;

    /* renamed from: g */
    private BasicFilter f39696g = null;

    /* renamed from: h */
    private FastImageProcessingView f39697h;

    /* renamed from: i */
    HorizontalScrollView f39698i;

    /* renamed from: j */
    ImageViewTarget f39699j;

    /* renamed from: k */
    Bitmap f39700k;

    /* renamed from: l */
    LinearLayout f39701l;

    /* renamed from: m */
    private FastImageProcessingPipeline f39702m;

    /* renamed from: n */
    Bitmap f39703n;

    /* renamed from: o */
    private GLTextureOutputRenderer f39704o;

    /* renamed from: p */
    private BitmapOutput f39705p;

    /* renamed from: q */
    Face2[] f39706q;

    /* renamed from: a */
    public void mo51898a(Bitmap bitmap) {
        this.f39700k = bitmap;
    }

    /* renamed from: b */
    public void mo51896b(jm cVar) {
        en bVar = (en) cVar;
        this.f39694e = bVar;
        this.f39702m.mo53635d();
        this.f39704o.mo24185B(this.f39696g);
        this.f39696g.mo24185B(this.f39695f);
        this.f39696g.mo24185B(this.f39705p);
        this.f39702m.mo53633a(this.f39696g);
        this.f39696g = bVar.mo51897g(this.f39706q);
        cVar.mo51864b();
        this.f39696g.mo24187w(this.f39695f);
        this.f39696g.mo24187w(this.f39705p);
        this.f39704o.mo24187w(this.f39696g);
        this.f39702m.mo53636e();
        this.f39697h.requestRender();
    }

    public void buttonClicked(View view) {
        if (view.getId() == R.id.adjustments) {
            if (this.f39694e.mo51864b().equals(hn.m21100b("UKUA"))) {
                return;
            }
            if (this.f39691b) {
                this.f39692c.setVisibility(View.GONE);
                this.f39698i.setVisibility(View.VISIBLE);
                this.f39691b = false;
                return;
            }
            if (this.f39692c.getChildCount() > 0) {
                this.f39692c.removeAllViews();
            }
            this.f39694e.mo51862e(this.f39692c, this);
            this.f39698i.setVisibility(View.GONE);
            this.f39692c.setVisibility(View.VISIBLE);
            this.f39691b = true;
        } else if (view.getId() == R.id.nofilter) {
            TextureCache.m40393d().mo46483b(this.f39700k);
            setResult(-1, new Intent());
            finish();
        }
    }

    /* renamed from: c */
    public void mo51941c() {
        this.f39697h.requestRender();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            Uri data = intent.getData();
            if (!getContentResolver().getType(data).contains(C4232b.m21129a("\u0001A\u0013M\u0018"))) {
                String[] strArr = {hn.m21100b("{_EOE"), C4232b.m21129a("\u0018Z\u001eM\u0019\\\u0016\\\u001eG\u0019")};
                Cursor query = getContentResolver().query(data, strArr, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex(strArr[0]));
                    int i3 = query.getInt(query.getColumnIndex(strArr[1]));
                    query.close();
                    Intent intent2 = new Intent(getApplicationContext(), CaricatureActivity.class);
                    intent2.putExtra(hn.m21100b("KEOL"), string);
                    intent2.putExtra(C4232b.m21129a("\u0018Z\u001eM\u0019\\\u0016\\\u001eG\u0019"), i3);
                    startActivity(intent2);
                    return;
                }
                Toast.makeText(getApplicationContext(), hn.m21100b("xKNH_\u0004UKO\u0004WKZ@\u001bMVE\\A"), Toast.LENGTH_SHORT).show();
            }
        } else if (i == 3) {
            Uri data2 = intent.getData();
            String[] strArr2 = {C4232b.m21129a("(L\u0016\\\u0016"), hn.m21100b("KIM^JOEOMTJ")};
            Cursor query2 = getContentResolver().query(data2, strArr2, (String) null, (String[]) null, (String) null);
            if (query2 != null) {
                query2.moveToFirst();
                String string2 = query2.getString(query2.getColumnIndex(strArr2[0]));
                int i4 = query2.getInt(query2.getColumnIndex(strArr2[1]));
                query2.close();
                Intent intent3 = new Intent(getApplicationContext(), CaricatureActivity.class);
                intent3.putExtra(C4232b.m21129a("X\u0016\\\u001f"), string2);
                intent3.putExtra(hn.m21100b("KIM^JOEOMTJ"), i4);
                startActivity(intent3);
                return;
            }
            Toast.makeText(getApplicationContext(), C4232b.m21129a("k\u0018]\u001bLWF\u0018\\WD\u0018I\u0013\b\u001eE\u0016O\u0012"), Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed() {
        if (this.f39691b) {
            this.f39692c.setVisibility(View.GONE);
            this.f39698i.setVisibility(View.VISIBLE);
            this.f39691b = false;
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.caricature_layout);
        this.f39701l = (LinearLayout) findViewById(R.id.effects_menu);
        this.f39692c = (LinearLayout) findViewById(R.id.effect_settings);
        this.f39698i = (HorizontalScrollView) findViewById(R.id.effects_scroll);
        this.f39697h = (FastImageProcessingView) findViewById(R.id.preview);
        FastImageProcessingView fastImageProcessingView = (FastImageProcessingView) findViewById(R.id.menu);
        fastImageProcessingView.setAlpha(0.0f);
        FastImageProcessingPipeline aVar = new FastImageProcessingPipeline();
        this.f39702m = aVar;
        this.f39697h.setPipeline(aVar);
        this.f39697h.setAlpha(0.0f);
        this.f39699j = (ImageViewTarget) findViewById(R.id.image);
        try {
            this.f39703n = TextureCache.m40393d().mo46485e();
            this.f39704o = new ImageResourceInput(this.f39697h, this.f39703n);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f39703n, this.f39703n.getWidth() / 4, this.f39703n.getHeight() / 4, false);
            Frame.Builder builder = new Frame.Builder();
            builder.setBitmap(createScaledBitmap);
            Frame a = builder.build();
            FaceDetector.Builder builder2 = new FaceDetector.Builder(this);
//            builder2.mo33840f(false);
//            builder2.mo33837c(1);
            SparseArray<Face> b = builder2.build().detect(a);
            this.f39690a = b;
            if (b != null && b.size() > 0) {
                this.f39706q = new Face2[this.f39690a.size()];
                int i = 0;
                while (i < this.f39690a.size()) {
                    int i2 = i + 1;
                    this.f39706q[i] = new Face2(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), 1, 1, this.f39690a.valueAt(i));
                    i = i2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jl wVar = new jl(this, false, ThumbnailUtils.extractThumbnail(this.f39703n, 96, 96), fastImageProcessingView, this.f39706q);
        this.f39693d = wVar;
        wVar.mo51899b(this.f39701l);
        if (this.f39704o == null) {
            Toast.makeText(this, C4232b.m21129a("'Z\u0018J\u001bM\u001a\b\u001bG\u0016L\u001eF\u0010\b\u001eE\u0016O\u0012"), Toast.LENGTH_SHORT).show();
            finish();
        }
        ca.m21147f();
        ViewGroup.LayoutParams layoutParams = this.f39697h.getLayoutParams();
        layoutParams.height = (int) ((float) this.f39704o.mo24171j());
        layoutParams.width = (int) ((float) this.f39704o.mo24173l());
        this.f39697h.setLayoutParams(layoutParams);
        this.f39705p = new BitmapOutput(this.f39699j);
        this.f39695f = new BitmapOutput(this);
        this.f39702m.mo53634b(this.f39704o);
        BasicFilter f = this.f39694e.mo51865f(this);
        this.f39696g = f;
        f.mo24187w(this.f39695f);
        this.f39696g.mo24187w(this.f39705p);
        this.f39704o.mo24187w(this.f39696g);
        this.f39702m.mo53636e();
        mo51941c();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
