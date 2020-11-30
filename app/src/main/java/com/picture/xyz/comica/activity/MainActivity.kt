package com.picture.xyz.comica.activity

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.app.AppLaunchChecker
import androidx.core.content.ContextCompat
import androidx.palette.graphics.Palette
import com.picture.xyz.comica.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val CHOOSE_PHOTO = 0x01
    val CAMERA_INTENT = 0x02

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gallery.setOnClickListener(this)
        camera.setOnClickListener(this)

        checkPermission(false)
    }

    fun checkPermission(gotoGallery: Boolean) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
            !== PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf<String>(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                1
            )
        } else {
            openAlbum() //有权限就打开相册
        }
    }

    open fun openCamera(context: Activity) {
        //val intent = Intent() //调用照相机
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        //intent.action = "android.media.action.STILL_IMAGE_CAMERA"
        //intent.putExtra(MediaStore.EXTRA_OUTPUT, getOutputMediaFile(MEDIA_TYPE_IMAGE))
        context.startActivityForResult(intent, CAMERA_INTENT)
    }

    fun openAlbum() {
        //通过intent打开相册，使用startactivityForResult方法启动actvity，会返回到onActivityResult方法，所以我们还得复写onActivityResult方法
        val intent = Intent("android.intent.action.GET_CONTENT")
        intent.setType("image/*")
        startActivityForResult(intent, CHOOSE_PHOTO)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.gallery -> {
                checkPermission(true)
            }

            R.id.camera -> {
                openCamera(this)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == CHOOSE_PHOTO) {
                var intent = Intent()
                intent.data = data!!.data
                startActivity(intent)
            } else if (requestCode == CAMERA_INTENT) {
                if (data != null) {
                    if (data.hasExtra("data")) {
                        var thumbnail: Bitmap = data.getParcelableExtra("data")!!
                        var intent = Intent()
                        intent.putExtra("data", thumbnail)
                        //intent.data = data!!.data
                        startActivity(intent)
                    }
                }

            }
        }
    }

    external fun stringFromJNI(): String

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }
}
