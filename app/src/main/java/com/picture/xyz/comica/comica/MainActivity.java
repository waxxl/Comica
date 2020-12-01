package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RadioGroup;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.p240d.C4228i;
import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
import com.picture.xyz.comica.p243f.p244a.p245a.l;
import com.picture.xyz.comica.p488g.g;

/* renamed from: gr.gamebrain.comica.MainActivity */
/* compiled from: ra */
public class MainActivity extends Activity  {
    private static String f39778d = "gr.video.comica";
    File f39779a;
    Uri f39780b;
    private int m48729e(Context context, Uri uri) {
        try {
            context.getContentResolver().notifyChange(uri, (ContentObserver) null);
            int attributeInt = new ExifInterface(this.f39779a.getAbsolutePath()).getAttributeInt(C4228i.m21095a("v/P8W)X)P2W"), 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void m48730f() {
        C4230g gVar = new C4230g((EGLContext) null, 2);
        l cVar = new l(gVar, 1, 1);
        cVar.mo51913b();
        String glGetString = GLES20.glGetString(7939);
        Log.e(C4232b.m21129a("m\u000f\\\u0012F\u0004A\u0018F\u0004"), glGetString);
        g.m48768b(glGetString);
        cVar.mo51916e();
        gVar.mo24148f();
    }

    /* renamed from: g */
    private /* synthetic */ void m48731g(boolean z) {

    }

    /* renamed from: h */


    /* renamed from: i */
    private /* synthetic */ void m48733i() {
        if (ContextCompat.checkSelfPermission(this, C4232b.m21129a("\u0016F\u0013Z\u0018A\u0013\u0006\u0007M\u0005E\u001e[\u0004A\u0018FYk6e2z6")) == 0 && ContextCompat.checkSelfPermission(this, C4228i.m21095a("X3]/V4]sI8K0P.J4V3\u0017\nk\u0014m\u0018f\u0018a\t|\u000fw\u001cu\u0002j\tv\u000fx\u001a|")) == 0) {
            m48734k();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4232b.m21129a("\u0016F\u0013Z\u0018A\u0013\u0006\u0007M\u0005E\u001e[\u0004A\u0018FYk6e2z6"));
        arrayList.add(C4228i.m21095a("X3]/V4]sI8K0P.J4V3\u0017\nk\u0014m\u0018f\u0018a\t|\u000fw\u001cu\u0002j\tv\u000fx\u001a|"));

    }

    /* renamed from: k */
    private /* synthetic */ void m48734k() {
        Intent intent = new Intent(C4232b.m21129a("I\u0019L\u0005G\u001eLYE\u0012L\u001eIYI\u0014\\\u001eG\u0019\u0006>e6o2w4i'|\"z2"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            File a = ca.m21142a();
            this.f39779a = a;
            if (a != null) {
                if (Build.VERSION.SDK_INT <= 19) {
                    this.f39780b = Uri.fromFile(a);
                } else {
                    StringBuilder insert = new StringBuilder().insert(0, getPackageName());
                    insert.append(C4228i.m21095a("\u0017-K2O4]8K"));
                    this.f39780b = FileProvider.getUriForFile(this, insert.toString(), this.f39779a);
                }
                intent.putExtra(C4232b.m21129a("G\u0002\\\u0007]\u0003"), this.f39780b);
                startActivityForResult(intent, 8);
            }
        }
    }

    /* renamed from: l */
    private /* synthetic */ void m48735l() {

    }

    /* renamed from: m */


    /* renamed from: n */
    private /* synthetic */ void m48737n() {
        if (Build.VERSION.SDK_INT >= 23) {
            m48739p();
        } else {
            m48735l();
        }
    }

    /* renamed from: o */


    /* renamed from: p */
    private /* synthetic */ void m48739p() {
        if (ContextCompat.checkSelfPermission(this, C4228i.m21095a("X3]/V4]sI8K0P.J4V3\u0017\nk\u0014m\u0018f\u0018a\t|\u000fw\u001cu\u0002j\tv\u000fx\u001a|")) != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C4232b.m21129a("\u0016F\u0013Z\u0018A\u0013\u0006\u0007M\u0005E\u001e[\u0004A\u0018FY%a#m(m/|2z9i;w$|8z6o2"));
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 1);
            return;
        }
        m48735l();
    }


    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.camera:
                mo51984j();
                return;



            default:
                return;
        }
    }


    /* renamed from: d */
    public void mo10630d(int i, Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo51984j() {
        if (Build.VERSION.SDK_INT >= 23) {
            m48733i();
        } else {
            m48734k();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 7) {
//            Uri uri = null;
//            List<Uri> B = GalleryActivity.m8689B(intent);
//            if (B != null && B.size() > 0) {
//                uri = B.get(0);
//            }
//            String path = uri.getPath();
//            String[] strArr = {C4232b.m21129a("(L\u0016\\\u0016"), C4228i.m21095a("V/P8W)X)P2W")};
//            Cursor query = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, C4232b.m21129a("w\u0013I\u0003IJ\u0017W"), new String[]{path}, (String) null);
//            if (query != null) {
//                query.moveToFirst();
//                query.getString(query.getColumnIndex(strArr[0]));
//                int i3 = query.getInt(query.getColumnIndex(strArr[1]));
//                query.close();
//                Intent intent2 = new Intent(getApplicationContext(), ImageviewActivity.class);
//                intent2.putExtra(C4228i.m21095a("-X)Q"), path);
//                intent2.putExtra(C4232b.m21129a("\u0018Z\u001eM\u0019\\\u0016\\\u001eG\u0019"), i3);
//                startActivityForResult(intent2, 9);
//            }
        } else if (i == 118) {
            new ba(this, intent.getData()).execute(new Void[0]);
        } else if (i == 8) {
            try {
                String absolutePath = this.f39779a.getAbsolutePath();
                int e = m48729e(this, this.f39780b);
                Intent intent3 = new Intent(getApplicationContext(), ImageviewActivity.class);
                intent3.putExtra(C4228i.m21095a("-X)Q"), absolutePath);
                intent3.putExtra(C4232b.m21129a("\u0018Z\u001eM\u0019\\\u0016\\\u001eG\u0019"), e);
                startActivityForResult(intent3, 9);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        m48730f();

        try {
            ca.m21146e();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length != 0) {

        }
    }
}
