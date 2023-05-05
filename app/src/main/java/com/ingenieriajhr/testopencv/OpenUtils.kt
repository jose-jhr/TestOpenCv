package com.ingenieriajhr.testopencv

import android.graphics.Bitmap
import org.opencv.android.Utils
import org.opencv.core.CvType
import org.opencv.core.Mat
import org.opencv.imgproc.Imgproc


class OpenUtils {


    fun setUtil(bitmap: Bitmap):Bitmap{

        val mat = Mat()

        Utils.bitmapToMat(bitmap,mat)

        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_BGR2GRAY)

        Imgproc.Laplacian(mat,mat, CvType.CV_8U)

        Utils.matToBitmap(mat,bitmap)

        return bitmap

    }

}