package com.yeonsik.databindingsample.databindingsample.bindings;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class BindingAdapters {

    /**
     * 바인딩이 이뤄질 때 메서드 네이밍은 상관이 없고 imageUrl과 error가 둘 다 ImageView에
     * 사용되고 imageUrl이 문자열이고 error가 Drawable인 경우에 바인딩이 이뤄진다.
     *
     * @param imageView
     * @param url
     * @param errorDrawable
     */
    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView imageView, String url, Drawable errorDrawable) {
        Glide.with(imageView.getContext()).load(url).error(errorDrawable).into(imageView);
    }
}
