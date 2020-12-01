package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.SparseArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.edmodo.cropper.CropImageView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.p487g.m;
import com.picture.xyz.comica.p487g.z;
import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p500b.C11652a;
import java.io.FileInputStream;
import java.io.IOException;
import com.picture.xyz.comica.p240d.C11182e;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.p240d.jm;
import com.picture.xyz.comica.p240d.rn;
import com.picture.xyz.comica.p243f.p244a.p245a.t;
import com.picture.xyz.comica.p488g.k;
import com.picture.xyz.comica.imageprocessing.FastImageProcessingView;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
import com.picture.xyz.comica.imageprocessing.p254e.ImageResourceInput;
import com.picture.xyz.comica.imageprocessing.p255f.BitmapOutput;
import com.picture.xyz.comica.utils.TextureCache;

/* renamed from: gr.gamebrain.comica.ImageviewActivity */
/* compiled from: ea */
public class ImageviewActivity extends Activity implements C11182e, BitmapOutput.C11653a {

    /* renamed from: z */
    private static int f39746z = 17;

    /* renamed from: a */
    LinearLayout f39747a;

    /* renamed from: b */
    ImageViewTarget f39748b;

    /* renamed from: c */
    private m f39749c;

    /* renamed from: d */
    ProgressBar f39750d;

    /* renamed from: e */
    int f39751e = 1080;

    /* renamed from: f */
    jm f39752f = new rn((Context) null);

    /* renamed from: g */
    private FastImageProcessingView f39753g;

    /* renamed from: h */
    C4228i f39754h;

    /* renamed from: i */
    private BitmapOutput f39755i;

    /* renamed from: j */
    String f39756j;

    /* renamed from: k */
    z f39757k;

    /* renamed from: l */
    Bitmap f39758l;

    /* renamed from: n */
    boolean f39760n = false;

    /* renamed from: o */
    boolean f39761o = false;

    /* renamed from: p */
    HorizontalScrollView f39762p;

    /* renamed from: q */
    LinearLayout f39763q;

    /* renamed from: r */
    BitmapOutput f39764r;

    /* renamed from: s */
    String f39765s;

    /* renamed from: t */
    private BasicFilter f39766t = null;

    /* renamed from: u */
    float[][] f39767u = new float[3][];

    /* renamed from: v */
    boolean f39768v = false;

    /* renamed from: w */
    Bitmap f39769w;

    /* renamed from: x */
    private ImageResourceInput f39770x;

    /* renamed from: y */
    ImageView f39771y;

    /* renamed from: gr.gamebrain.comica.ImageviewActivity$a */
    /* compiled from: ea */
    class C11201a implements Runnable {
        C11201a() {
        }

        public void run() {
            ImageviewActivity.this.f39750d.setVisibility(View.GONE);
        }
    }

    /* renamed from: gr.gamebrain.comica.ImageviewActivity$b */
    /* compiled from: ea */
    class C11202b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropImageView f39773a;

        C11202b(CropImageView cropImageView) {
            this.f39773a = cropImageView;
        }

        public void onClick(View view) {
            Bitmap croppedImage = this.f39773a.getCroppedImage();
            ImageviewActivity.this.m48722d(croppedImage);
            String a = C4232b.m21129a("k%g'");

            ImageviewActivity.this.findViewById(R.id.layout_crop).setVisibility(View.GONE);
            ImageviewActivity.this.findViewById(R.id.layout_filter).setVisibility(View.VISIBLE);
        }
    }

    /* renamed from: gr.gamebrain.comica.ImageviewActivity$c */
    /* compiled from: ea */
    class C11203c implements View.OnClickListener {
        C11203c() {
        }

        public void onClick(View view) {
            ImageviewActivity.this.finish();
        }
    }

    /* renamed from: gr.gamebrain.comica.ImageviewActivity$d */
    /* compiled from: ea */
    class C11204d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropImageView f39776a;

        C11204d(CropImageView cropImageView) {
            this.f39776a = cropImageView;
        }

        public void run() {
            this.f39776a.setVisibility(View.GONE);
            this.f39776a.setVisibility(View.VISIBLE);
        }
    }

    /* renamed from: c */
    private /* synthetic */ Bitmap m48721c(String str, int i, float f) throws IOException {
        int i2;
        int i3;
        String str2 = str;
        int i4 = i;
        FileInputStream fileInputStream = new FileInputStream(str2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i5 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
        fileInputStream.close();
        if (i4 == 90 || i4 == 270) {
            i3 = options.outHeight;
            i2 = options.outWidth;
        } else {
            i3 = options.outWidth;
            i2 = options.outHeight;
        }
        float f2 = 1.8f * f;
        FileInputStream fileInputStream2 = new FileInputStream(str2);
        for (int min = Math.min(i3, i2); ((float) min) > f2; min /= 2) {
            i5 *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i5;
        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, (Rect) null, options2);
        fileInputStream2.close();
        float max = Math.max(f / ((float) decodeStream.getHeight()), f / ((float) decodeStream.getWidth()));
        Matrix matrix = new Matrix();
        if (i4 > 0) {
            matrix.postRotate((float) i4);
        }
        if (max < 1.0f) {
            matrix.preScale(max, max);
        }
        return (i4 > 0 || max < 1.0f) ? Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true) : decodeStream;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m48722d(Bitmap bitmap) {
        this.f39769w = bitmap;
        this.f39748b.setImageBitmap(bitmap);
        this.f39770x = new ImageResourceInput((GLSurfaceView) this.f39753g, bitmap, (float) this.f39751e);
        if (m48724f() && m48725g(bitmap)) {
            findViewById(R.id.caricatureme).setVisibility(View.VISIBLE);
        }
        String f = ca.m21147f();
        this.f39765s = f;
        this.f39757k = new z(this, false, f, false);
        this.f39755i = new BitmapOutput(this.f39748b);
        this.f39764r = new BitmapOutput(this);
        this.f39749c.mo53634b(this.f39770x);
        BasicFilter d = this.f39752f.mo51861d(this);
        this.f39766t = d;
        d.mo24187w(this.f39757k);
        this.f39766t.mo24187w(this.f39755i);
        this.f39766t.mo24187w(this.f39764r);
        this.f39770x.mo24187w(this.f39766t);
        this.f39749c.mo53636e();
        mo51972h();
    }

    /* renamed from: f */
    private /* synthetic */ boolean m48724f() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this) == 0;
    }

    /* renamed from: g */
    private /* synthetic */ boolean m48725g(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, false);
        FaceDetector.Builder builder = new FaceDetector.Builder(this.f39753g.getContext());
        builder.setClassificationType(0);
        builder.setLandmarkType(0);
        builder.setTrackingEnabled(false);
        builder.setProminentFaceOnly(false);
        builder.setMode(0);
        FaceDetector a = builder.build();
        Frame.Builder builder2 = new Frame.Builder();
        builder2.setBitmap(createScaledBitmap);
        SparseArray<Face> b = a.detect(builder2.build());
        a.release();
        for (int i = 0; i < 3; i++) {
            this.f39767u[i] = null;
        }
        if (b == null || b.size() == 0) {
            return false;
        }
        int min = Math.min(b.size(), 3);
        int i2 = 0;
        boolean z = false;
        while (i2 < min) {
            this.f39767u[i2] = new float[4];
            Face valueAt = b.valueAt(i2);
            float f = valueAt.getPosition().x;
            float f2 = valueAt.getPosition().y;
            float e = valueAt.getWidth() + f;
            this.f39767u[i2][0] = f / ((float) bitmap.getWidth());
            this.f39767u[i2][1] = 1.0f - ((valueAt.getHeight() + f2) / ((float) bitmap.getHeight()));
            this.f39767u[i2][2] = e / ((float) bitmap.getWidth());
            i2++;
            this.f39767u[i2][3] = 1.0f - (f2 / ((float) bitmap.getHeight()));
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo51898a(Bitmap bitmap) {
        runOnUiThread(new C11201a());
    }

    /* renamed from: b */
    public void mo51896b(jm cVar) {
        this.f39752f = cVar;
        this.f39749c.mo53635d();
        this.f39770x.mo24185B(this.f39766t);
        this.f39766t.mo24185B(this.f39757k);
        this.f39766t.mo24185B(this.f39764r);
        this.f39766t.mo24185B(this.f39755i);
        this.f39749c.mo53633a(this.f39766t);
        this.f39766t = cVar.mo51865f(this);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        for (int i = 0; i < 3; i++) {
            float[][] fArr2 = this.f39767u;
            if (fArr2[i] == null) {
                this.f39766t.mo24182F(la.f39820a[i], fArr);
            } else {
                this.f39766t.mo24182F(la.f39820a[i], fArr2[i]);
            }
        }
        cVar.mo51864b();
        this.f39766t.mo24187w(this.f39757k);
        this.f39766t.mo24187w(this.f39764r);
        this.f39766t.mo24187w(this.f39755i);
        this.f39770x.mo24187w(this.f39766t);
        this.f39749c.mo53636e();
        mo51972h();
    }

    public void buttonClicked(View view) {
        if (view.getId() == R.id.share) {
            String f = ca.m21147f();
            TextureCache.m40393d().mo46483b(((C11652a) this.f39748b.getDrawable()).mo53622a());
            int i = 9;
            if (this.f39768v) {
                i = 33;
            }
            TextureCache.m40393d().mo46487g(this.f39752f.getClass());
            //EditImageActivity.m40228T(this, f, f, i);
        } else if (view.getId() == R.id.caricatureme) {
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
            //ToDO CaricatureActivity
//            Intent intent = new Intent(getApplicationContext(), CaricatureActivity.class);
//            TextureCache.m40393d().mo46483b(this.f39769w);
//            startActivityForResult(intent, f39746z);
        } else if (view.getId() == R.id.adjustments && !this.f39752f.mo51864b().equals(k.m48770a("o\u001fo\u0015"))) {
            if (this.f39760n) {
                this.f39763q.setVisibility(View.GONE);
                this.f39762p.setVisibility(View.VISIBLE);
                this.f39760n = false;
                return;
            }
            if (this.f39763q.getChildCount() > 0) {
                this.f39763q.removeAllViews();
            }
            this.f39752f.mo51862e(this.f39763q, this);
            this.f39762p.setVisibility(View.GONE);
            this.f39763q.setVisibility(View.VISIBLE);
            this.f39760n = true;
        }
    }

    /* renamed from: h */
    public void mo51972h() {
        this.f39750d.setVisibility(View.VISIBLE);
        this.f39753g.requestRender();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            Uri data = intent.getData();
            String[] strArr = {t.m48671a("`W^G^"), k.m48770a("\u001fs\u0019d\u001eu\u0011u\u0019n\u001e")};
            Cursor query = getContentResolver().query(data, strArr, (String) null, (String[]) null, (String) null);
            if (query != null) {
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(strArr[0]));
                int i3 = query.getInt(query.getColumnIndex(strArr[1]));
                query.close();
                Intent intent2 = new Intent(getApplicationContext(), ImageviewActivity.class);
                intent2.putExtra(t.m48671a("C^GW"), string);
                intent2.putExtra(k.m48770a("\u001fs\u0019d\u001eu\u0011u\u0019n\u001e"), i3);
                startActivity(intent2);
                return;
            }
            Toast.makeText(getApplicationContext(), t.m48671a("pPFSW\u001f]PG\u001f_PR[\u0013V^^TZ"), Toast.LENGTH_SHORT).show();
        } else if (i == 9) {
            if (!this.f39761o) {
                setResult(-1, intent);
                finish();
            } else {
                setResult(-1, intent);
                finish();
            }
        } else if (i == 33) {
            setResult(-1, intent);
            finish();
        } else if (i == f39746z) {
            this.f39770x.mo53653H(TextureCache.m40393d().mo46485e());
            this.f39753g.requestRender();
        } else {
            onBackPressed();
        }
    }

    public void onBackPressed() {
        if (this.f39760n) {
            this.f39763q.setVisibility(View.GONE);
            this.f39762p.setVisibility(View.VISIBLE);
            this.f39760n = false;
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.imageview_layout);


        this.f39750d = (ProgressBar) findViewById(R.id.loading);
        this.f39747a = (LinearLayout) findViewById(R.id.effects_menu);
        this.f39763q = (LinearLayout) findViewById(R.id.effect_settings);
        this.f39762p = (HorizontalScrollView) findViewById(R.id.effects_scroll);
        C4228i iVar = new C4228i(this, false);
        this.f39754h = iVar;
        iVar.mo24137b(this.f39747a);
        this.f39753g = (FastImageProcessingView) findViewById(R.id.preview);
        this.f39771y = (ImageView) findViewById(R.id.share);
        m bVar = new m();
        this.f39749c = bVar;
        this.f39753g.setPipeline(bVar);
        Bundle extras = getIntent().getExtras();
        this.f39756j = extras.getString(t.m48671a("C^GW"));
        int i = extras.getInt(k.m48770a("\u001fs\u0019d\u001eu\u0011u\u0019n\u001e"));
        this.f39768v = extras.getBoolean(t.m48671a("\\\\S_^TZ"), false);
        this.f39761o = extras.getBoolean(k.m48770a("d\u0014h\u0004"), false);
        int i2 = extras.getInt(t.m48671a("^@OV\\GG"), -1);
        int i3 = extras.getInt(k.m48770a("\u0011r\u0000d\u0013u\t"), -1);
        Class cls = (Class) extras.getSerializable(k.m48770a("d\u0016g\u0015b\u0004"));
        if (cls != null) {
            try {
                this.f39752f = (jm) cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f39753g.setAlpha(0.0f);
        this.f39748b = (ImageViewTarget) findViewById(R.id.image);
        if (PreferenceManager.getDefaultSharedPreferences(this.f39753g.getContext()).getBoolean(t.m48671a("Y\\JAT"), false) && (i2 < 0 || i3 < 0)) {
            this.f39751e = 2160;
        }
        try {
            if (this.f39756j.length() > 0) {
                this.f39758l = m48721c(this.f39756j, i, (float) this.f39751e);
            } else {
                this.f39758l = TextureCache.m40393d().mo46485e();
            }
            if (this.f39758l == null) {
                StringBuilder insert = new StringBuilder().insert(0, k.m48770a(">nPd\bb\u0015q\u0004h\u001foPc\u0005uPo\u0005m\u001c!\u0012h\u0004l\u0011qPg\u001fsP"));
                insert.append(this.f39756j);
            }
        } catch (Exception e2) {
            StringBuilder insert2 = new StringBuilder().insert(0, t.m48671a("p^FX[K\u0013^]\u001fVGPZCKZP]\u001fDWZSV\u001f_PR[ZQT\u001fZRRXV\u001f"));
            insert2.append(this.f39756j);
        }
        if (i2 <= 0 || i3 <= 0) {
            m48722d(this.f39758l);
            findViewById(R.id.layout_crop).setVisibility(View.GONE);
            findViewById(R.id.layout_filter).setVisibility(View.VISIBLE);
            return;
        }
        CropImageView cropImageView = (CropImageView) findViewById(R.id.CropImageView);
        cropImageView.setImageBitmap(this.f39758l);
        cropImageView.setFixedAspectRatio(true);
        cropImageView.setAspectRatio(i2, i3);
        ((RelativeLayout) findViewById(R.id.layout_crop)).post(new C11204d(cropImageView));
        findViewById(R.id.btn_done).setOnClickListener(new C11202b(cropImageView));
        findViewById(R.id.btn_cancel).setOnClickListener(new C11203c());
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        ComikaApplication.f15521e = ComikaApplication.C4231a.f15528d;
    }
}
