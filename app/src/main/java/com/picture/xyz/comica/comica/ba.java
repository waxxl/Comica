package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: gr.gamebrain.comica.n */
public class ba extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    Uri f39824a;

    /* renamed from: b */
    Activity f39825b;

    /* renamed from: c */
    String f39826c;

    public ba(Activity activity, Uri uri) {
        this.f39824a = uri;
        this.f39825b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.f39826c = new File(this.f39825b.getCacheDir(), q.m48751b("#001+0&;\";i578")).getAbsolutePath();
        try {
            InputStream openInputStream = this.f39825b.getContentResolver().openInputStream(this.f39824a);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f39826c));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    openInputStream.close();
                    return null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(Void voidR) {
        int i = 0;
        try {
            int attributeInt = new ExifInterface(this.f39826c).getAttributeInt(q.m48751b("\u001056\"13>36(1"), 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this.f39825b, ImageviewActivity.class);
        intent.putExtra(q.m48751b("7>37"), this.f39826c);
        intent.putExtra(q.m48751b("056\"13>36(1"), i);
        this.f39825b.startActivityForResult(intent, 9);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
    }
}
