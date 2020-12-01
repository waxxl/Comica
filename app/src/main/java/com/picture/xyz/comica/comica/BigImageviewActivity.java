//package com.picture.xyz.comica.comica;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.database.Cursor;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.graphics.Matrix;
//import android.graphics.Paint;
//import android.graphics.Rect;
//import android.net.Uri;
//import android.opengl.GLSurfaceView;
//import android.os.Bundle;
//import android.preference.PreferenceManager;
//import android.util.Log;
//import android.view.View;
//import android.widget.HorizontalScrollView;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ProgressBar;
//import android.widget.RelativeLayout;
//import android.widget.Toast;
//import com.appodeal.ads.Appodeal;
//import com.crashlytics.android.Crashlytics;
//import com.edmodo.cropper.CropImageView;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.ogury.p396cm.OguryChoiceManager;
//import com.xinlan.imageeditlibrary.editimage.EditImageActivity;
//import com.picture.xyz.comica.utils.TextureCache;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.lang.reflect.Array;
//import com.picture.xyz.comica.p240d.C11182e;
//import com.picture.xyz.comica.p240d.C4228i;
//import com.picture.xyz.comica.p240d.jm;
//import com.picture.xyz.comica.p240d.rn;
//import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
//import com.picture.xyz.comica.p243f.p244a.p245a.s;
//import com.picture.xyz.comica.p243f.p244a.p245a.t;
//import com.picture.xyz.comica.p243f.p244a.p245a.u;
//import com.picture.xyz.comica.p243f.p244a.p245a.v;
//import com.picture.xyz.comica.p246gr.gamebrain.comica.billing.x;
//import p487g.m;
//import p487g.z;
//import p498it.sephiroth.android.library.imagezoom.p500b.C11652a;
//import com.picture.xyz.comica.imageprocessing.FastImageProcessingView;
//import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
//import com.picture.xyz.comica.imageprocessing.p254e.ImageResourceInput;
//import com.picture.xyz.comica.imageprocessing.p255f.BitmapOutput;
//
///* renamed from: gr.gamebrain.comica.BigImageviewActivity */
///* compiled from: oa */
//public class BigImageviewActivity extends Activity implements C11182e, BitmapOutput.C11653a {
//
//    /* renamed from: A */
//    z f39656A;
//
//    /* renamed from: a */
//    LinearLayout f39657a;
//
//    /* renamed from: b */
//    BitmapOutput f39658b;
//
//    /* renamed from: c */
//    boolean f39659c = false;
//
//    /* renamed from: d */
//    String f39660d;
//
//    /* renamed from: e */
//    HorizontalScrollView f39661e;
//
//    /* renamed from: f */
//    ProgressBar f39662f;
//
//    /* renamed from: g */
//    int f39663g;
//
//    /* renamed from: h */
//    private FastImageProcessingView f39664h;
//
//    /* renamed from: i */
//    ImageView f39665i;
//
//    /* renamed from: j */
//    float[][] f39666j = new float[3][];
//
//    /* renamed from: k */
//    private BasicFilter f39667k = null;
//
//    /* renamed from: l */
//    private AdView f39668l;
//
//    /* renamed from: m */
//    boolean f39669m = false;
//
//    /* renamed from: n */
//    LinearLayout f39670n;
//
//    /* renamed from: o */
//    private m f39671o;
//
//    /* renamed from: p */
//    String f39672p;
//
//    /* renamed from: q */
//    jm f39673q = new rn((Context) null);
//
//    /* renamed from: r */
//    Bitmap f39674r;
//
//    /* renamed from: s */
//    int f39675s = 2160;
//
//    /* renamed from: t */
//    Canvas f39676t;
//
//    /* renamed from: u */
//    private ImageResourceInput f39677u;
//
//    /* renamed from: v */
//    ImageViewTarget f39678v;
//
//    /* renamed from: w */
//    Bitmap[][] f39679w;
//
//    /* renamed from: x */
//    C4228i f39680x;
//
//    /* renamed from: y */
//    boolean f39681y = false;
//
//    /* renamed from: z */
//    Bitmap f39682z;
//
//    /* renamed from: gr.gamebrain.comica.BigImageviewActivity$a */
//    /* compiled from: oa */
//    class C11192a implements Runnable {
//
//        /* renamed from: a */
//        final /* synthetic */ CropImageView f39683a;
//
//        C11192a(CropImageView cropImageView) {
//            this.f39683a = cropImageView;
//        }
//
//        public void run() {
//            this.f39683a.setVisibility(View.GONE);
//            this.f39683a.setVisibility(View.VISIBLE);
//        }
//    }
//
//    /* renamed from: gr.gamebrain.comica.BigImageviewActivity$b */
//    /* compiled from: oa */
//    class C11193b implements Runnable {
//
//        /* renamed from: b */
//        final /* synthetic */ Bitmap f39686b;
//
//        C11193b(Bitmap bitmap) {
//            this.f39686b = bitmap;
//        }
//
//        public void run() {
//            BigImageviewActivity bigImageviewActivity = BigImageviewActivity.this;
//            bigImageviewActivity.f39676t.drawBitmap(this.f39686b, (float) (bigImageviewActivity.f39674r.getWidth() / 2), (float) (BigImageviewActivity.this.f39674r.getHeight() / 2), (Paint) null);
//            BigImageviewActivity bigImageviewActivity2 = BigImageviewActivity.this;
//            bigImageviewActivity2.f39678v.setImageBitmap(bigImageviewActivity2.f39674r);
//            Log.e(s.m48664a(")\u001b?\u001f*\u0002\b\u0000.\u0013?\u0017/"), v.m48670a("\u0003K\u0002A\u0006X\u000e_\u000fN"));
//            BigImageviewActivity bigImageviewActivity3 = BigImageviewActivity.this;
//            bigImageviewActivity3.f39663g = 0;
//            bigImageviewActivity3.f39662f.setVisibility(View.GONE);
//        }
//    }
//
//    /* renamed from: gr.gamebrain.comica.BigImageviewActivity$c */
//    /* compiled from: oa */
//    class C11194c implements View.OnClickListener {
//
//        /* renamed from: b */
//        final /* synthetic */ CropImageView f39688b;
//
//        C11194c(CropImageView cropImageView) {
//            this.f39688b = cropImageView;
//        }
//
//        public void onClick(View view) {
//            Bitmap croppedImage = this.f39688b.getCroppedImage();
//            BigImageviewActivity.this.m48685g(croppedImage);
//            String a = u.m48672a("n\u000fb\r");
//            Log.e(a, croppedImage.getWidth() + jm.m48372c("S") + croppedImage.getHeight());
//            BigImageviewActivity.this.findViewById(R.id.layout_crop).setVisibility(View.GONE);
//            BigImageviewActivity.this.findViewById(R.id.layout_filter).setVisibility(View.VISIBLE);
//        }
//    }
//
//    /* renamed from: gr.gamebrain.comica.BigImageviewActivity$d */
//    /* compiled from: oa */
//    class C11195d implements View.OnClickListener {
//        C11195d() {
//        }
//
//        public void onClick(View view) {
//            BigImageviewActivity.this.finish();
//        }
//    }
//
//    /* renamed from: c */
//    private /* synthetic */ Bitmap m48683c(String str, int i, float f) throws IOException {
//        int i2;
//        int i3;
//        String str2 = str;
//        int i4 = i;
//        FileInputStream fileInputStream = new FileInputStream(str2);
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        int i5 = 1;
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
//        fileInputStream.close();
//        if (i4 == 90 || i4 == 270) {
//            i3 = options.outHeight;
//            i2 = options.outWidth;
//        } else {
//            i3 = options.outWidth;
//            i2 = options.outHeight;
//        }
//        float f2 = 1.8f * f;
//        FileInputStream fileInputStream2 = new FileInputStream(str2);
//        for (int min = Math.min(i3, i2); ((float) min) > f2; min /= 2) {
//            i5 *= 2;
//        }
//        BitmapFactory.Options options2 = new BitmapFactory.Options();
//        options2.inSampleSize = i5;
//        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, (Rect) null, options2);
//        fileInputStream2.close();
//        float max = Math.max(f / ((float) decodeStream.getHeight()), f / ((float) decodeStream.getWidth()));
//        Matrix matrix = new Matrix();
//        if (i4 > 0) {
//            matrix.postRotate((float) i4);
//        }
//        if (max < 1.0f) {
//            matrix.preScale(max, max);
//        }
//        return (i4 > 0 || max < 1.0f) ? Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true) : decodeStream;
//    }
//
//    /* access modifiers changed from: private */
//    /* renamed from: g */
//    public /* synthetic */ void m48685g(Bitmap bitmap) {
//        this.f39678v.setImageBitmap(bitmap);
//        this.f39677u = new ImageResourceInput((GLSurfaceView) this.f39664h, this.f39679w[0][0], 1080.0f);
//        String f = ca.m21147f();
//        this.f39672p = f;
//        this.f39656A = new z(this, false, f, false);
//        this.f39658b = new BitmapOutput(this);
//        this.f39671o.mo53634b(this.f39677u);
//        this.f39671o.mo53636e();
//        BasicFilter d = this.f39673q.mo51861d(this);
//        this.f39667k = d;
//        d.mo24187w(this.f39656A);
//        this.f39667k.mo24187w(this.f39658b);
//        this.f39677u.mo24187w(this.f39667k);
//        this.f39671o.mo53636e();
//        mo51929f();
//    }
//
//    /* renamed from: a */
//    public void mo51898a(Bitmap bitmap) {
//        int i = this.f39663g;
//        if (i == 0) {
//            this.f39676t.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
//            this.f39677u.mo53653H(this.f39679w[1][0]);
//            this.f39663g++;
//            this.f39664h.requestRender();
//        } else if (i == 1) {
//            this.f39676t.drawBitmap(bitmap, (float) (this.f39674r.getWidth() / 2), 0.0f, (Paint) null);
//            this.f39677u.mo53653H(this.f39679w[0][1]);
//            this.f39663g++;
//            this.f39664h.requestRender();
//        } else if (i == 2) {
//            this.f39676t.drawBitmap(bitmap, 0.0f, (float) (this.f39674r.getHeight() / 2), (Paint) null);
//            this.f39677u.mo53653H(this.f39679w[1][1]);
//            this.f39663g++;
//            this.f39664h.requestRender();
//        } else {
//            runOnUiThread(new C11193b(bitmap));
//        }
//    }
//
//    /* renamed from: b */
//    public void mo51896b(jm cVar) {
//        this.f39673q = cVar;
//        this.f39671o.mo53635d();
//        this.f39677u.mo24185B(this.f39667k);
//        this.f39667k.mo24185B(this.f39656A);
//        this.f39667k.mo24185B(this.f39658b);
//        this.f39671o.mo53633a(this.f39667k);
//        this.f39667k = cVar.mo51865f(this);
//        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
//        for (int i = 0; i < 3; i++) {
//            float[][] fArr2 = this.f39666j;
//            if (fArr2[i] == null) {
//                this.f39667k.mo24182F(la.f39820a[i], fArr);
//            } else {
//                this.f39667k.mo24182F(la.f39820a[i], fArr2[i]);
//            }
//        }
//        this.f39677u.mo53653H(this.f39679w[0][0]);
//        this.f39663g = 0;
//        cVar.mo51864b();
//        this.f39667k.mo24187w(this.f39656A);
//        this.f39667k.mo24187w(this.f39658b);
//        this.f39677u.mo24187w(this.f39667k);
//        this.f39671o.mo53636e();
//        mo51929f();
//    }
//
//    public void buttonClicked(View view) {
//        if (view.getId() == R.id.share) {
//            String f = ca.m21147f();
//            TextureCache.m40393d().mo46483b(((C11652a) this.f39678v.getDrawable()).mo53622a());
//            int i = 9;
//            if (this.f39659c) {
//                i = 33;
//            }
//            TextureCache.m40393d().mo46487g(this.f39673q.getClass());
//            EditImageActivity.m40228T(this, f, f, i);
//        } else if (view.getId() == R.id.adjustments && !this.f39673q.mo51864b().equals(C4230g.m21121c("\u000e6\u000e<"))) {
//            if (this.f39669m) {
//                this.f39657a.setVisibility(View.GONE);
//                this.f39661e.setVisibility(View.VISIBLE);
//                this.f39669m = false;
//                return;
//            }
//            if (this.f39657a.getChildCount() > 0) {
//                this.f39657a.removeAllViews();
//            }
//            this.f39673q.mo51862e(this.f39657a, this);
//            this.f39661e.setVisibility(View.GONE);
//            this.f39657a.setVisibility(View.VISIBLE);
//            this.f39669m = true;
//        }
//    }
//
//    /* renamed from: e */
//    public Bitmap[][] mo51928e(Bitmap bitmap, int i, int i2) {
//        int[] iArr = new int[2];
//        iArr[1] = i2;
//        iArr[0] = i;
//        Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance(Bitmap.class, iArr);
//        int width = bitmap.getWidth() / i;
//        int height = bitmap.getHeight() / i2;
//        for (int i3 = 0; i3 < i; i3++) {
//            for (int i4 = 0; i4 < i2; i4++) {
//                bitmapArr[i3][i4] = Bitmap.createBitmap(bitmap, i3 * width, i4 * height, width, height);
//            }
//        }
//        return bitmapArr;
//    }
//
//    /* renamed from: f */
//    public void mo51929f() {
//        this.f39662f.setVisibility(View.VISIBLE);
//        this.f39664h.requestRender();
//    }
//
//    /* access modifiers changed from: protected */
//    public void onActivityResult(int i, int i2, Intent intent) {
//        if (i2 != -1) {
//            return;
//        }
//        if (i == 1) {
//            Uri data = intent.getData();
//            String[] strArr = {t.m48671a("`W^G^"), C4230g.m21121c("6\u00120\u00057\u00148\u00140\u000f7")};
//            Cursor query = getContentResolver().query(data, strArr, (String) null, (String[]) null, (String) null);
//            if (query != null) {
//                query.moveToFirst();
//                String string = query.getString(query.getColumnIndex(strArr[0]));
//                int i3 = query.getInt(query.getColumnIndex(strArr[1]));
//                query.close();
//                Intent intent2 = new Intent(getApplicationContext(), ImageviewActivity.class);
//                intent2.putExtra(t.m48671a("C^GW"), string);
//                intent2.putExtra(C4230g.m21121c("6\u00120\u00057\u00148\u00140\u000f7"), i3);
//                startActivity(intent2);
//                return;
//            }
//            Toast.makeText(getApplicationContext(), t.m48671a("pPFSW\u001f]PG\u001f_PR[\u0013V^^TZ"), 0).show();
//        } else if (i == 9) {
//            if (!this.f39681y) {
//                setResult(-1, intent);
//                finish();
//            } else if (x.m48756a().mo52007f()) {
//                Appodeal.show(this, 3);
//            } else {
//                setResult(-1, intent);
//                finish();
//            }
//        } else if (i == 33) {
//            setResult(-1, intent);
//            finish();
//        } else {
//            onBackPressed();
//        }
//    }
//
//    public void onBackPressed() {
//        if (this.f39669m) {
//            this.f39657a.setVisibility(View.GONE);
//            this.f39661e.setVisibility(View.VISIBLE);
//            this.f39669m = false;
//            return;
//        }
//        if (x.m48756a().mo52007f() && !this.f39681y) {
//            Appodeal.show(this, 3);
//        }
//        super.onBackPressed();
//    }
//
//    /* access modifiers changed from: protected */
//    public void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        requestWindowFeature(1);
//        getWindow().setFlags(1024, 1024);
//        setContentView(R.layout.imageview_layout);
//        if (x.m48756a().mo52007f()) {
//            this.f39668l = (AdView) findViewById(R.id.adView);
//            this.f39668l.loadAd(new AdRequest.Builder().build());
//        }
//        this.f39662f = (ProgressBar) findViewById(R.id.loading);
//        this.f39670n = (LinearLayout) findViewById(R.id.effects_menu);
//        this.f39657a = (LinearLayout) findViewById(R.id.effect_settings);
//        this.f39661e = (HorizontalScrollView) findViewById(R.id.effects_scroll);
//        C4228i iVar = new C4228i(this, false);
//        this.f39680x = iVar;
//        iVar.mo24137b(this.f39670n);
//        this.f39664h = (FastImageProcessingView) findViewById(R.id.preview);
//        this.f39665i = (ImageView) findViewById(R.id.share);
//        m bVar = new m();
//        this.f39671o = bVar;
//        this.f39664h.setPipeline(bVar);
//        Bundle extras = getIntent().getExtras();
//        this.f39660d = extras.getString(t.m48671a("C^GW"));
//        int i = extras.getInt(C4230g.m21121c("6\u00120\u00057\u00148\u00140\u000f7"));
//        this.f39659c = extras.getBoolean(t.m48671a("\\\\S_^TZ"), false);
//        this.f39681y = extras.getBoolean(C4230g.m21121c("\u0005=\t-"), false);
//        int i2 = extras.getInt(t.m48671a("^@OV\\GG"), -1);
//        int i3 = extras.getInt(C4230g.m21121c("8\u0013)\u0005:\u0014 "), -1);
//        Crashlytics.m17428B(t.m48671a("C^GW"), this.f39660d);
//        Class cls = (Class) extras.getSerializable(C4230g.m21121c("\u0005?\u0006<\u0003-"));
//        if (cls != null) {
//            try {
//                this.f39673q = (jm) cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this});
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        this.f39664h.setAlpha(0.0f);
//        this.f39678v = (ImageViewTarget) findViewById(R.id.image);
//        if (PreferenceManager.getDefaultSharedPreferences(this.f39664h.getContext()).getBoolean(t.m48671a("Y\\JAT"), false) && (i2 < 0 || i3 < 0)) {
//            this.f39675s = 2160;
//        }
//        try {
//            if (this.f39660d.length() > 0) {
//                this.f39682z = m48683c(this.f39660d, i, (float) this.f39675s);
//            } else {
//                this.f39682z = TextureCache.m40393d().mo46485e();
//            }
//            if (this.f39682z == null) {
//                StringBuilder insert = new StringBuilder().insert(0, C4230g.m21121c("\u0017\u000fy\u0005!\u0003<\u0010-\t6\u000ey\u0002,\u0014y\u000e,\f5@;\t-\r8\u0010y\u00066\u0012y"));
//                insert.append(this.f39660d);
//                Crashlytics.m17431x(insert.toString());
//            }
//        } catch (Exception e2) {
//            StringBuilder insert2 = new StringBuilder().insert(0, t.m48671a("p^FX[K\u0013^]\u001fVGPZCKZP]\u001fDWZSV\u001f_PR[ZQT\u001fZRRXV\u001f"));
//            insert2.append(this.f39660d);
//            Crashlytics.m17431x(insert2.toString());
//            Crashlytics.m17432z(e2);
//        }
//        if (i2 <= 0 || i3 <= 0) {
//            this.f39679w = mo51928e(this.f39682z, 2, 2);
//            this.f39674r = Bitmap.createBitmap(this.f39682z.getWidth(), this.f39682z.getHeight(), Bitmap.Config.ARGB_8888);
//            this.f39676t = new Canvas(this.f39674r);
//            m48685g(this.f39682z);
//            this.f39663g = 0;
//            findViewById(R.id.layout_crop).setVisibility(View.GONE);
//            findViewById(R.id.layout_filter).setVisibility(View.VISIBLE);
//            return;
//        }
//        CropImageView cropImageView = (CropImageView) findViewById(R.id.CropImageView);
//        cropImageView.setImageBitmap(this.f39682z);
//        cropImageView.setFixedAspectRatio(true);
//        cropImageView.mo16954d(i2, i3);
//        ((RelativeLayout) findViewById(R.id.layout_crop)).post(new C11192a(cropImageView));
//        findViewById(R.id.btn_done).setOnClickListener(new C11194c(cropImageView));
//        findViewById(R.id.btn_cancel).setOnClickListener(new C11195d());
//    }
//
//    public void onDestroy() {
//        super.onDestroy();
//    }
//
//    public void onPause() {
//        super.onPause();
//    }
//
//    public void onResume() {
//        super.onResume();
//        ComikaApplication.f15521e = ComikaApplication.C4231a.f15528d;
//    }
//}
