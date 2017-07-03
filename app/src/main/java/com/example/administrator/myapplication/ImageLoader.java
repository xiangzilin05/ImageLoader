package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2017/7/3.
 */

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 图片加载类
 */
public class ImageLoader {
    // 图片缓存
    LruCache<String, Bitmap> mImageCache;
}
