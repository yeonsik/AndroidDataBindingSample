package com.yeonsik.databindingsample.databindingsample.bindings;

import android.databinding.BindingConversion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class BindingConversions {

    /**
     * 바인딩이 이뤄질 때 메서드 네이밍은 상관이 없고 Date 타입이 set 되는 곳에
     * 바인딩이 이뤄진다.
     *
     * @param date
     * @return
     */
    @BindingConversion
    public static String convertDateToDisplayedText(Date date) {
        return new SimpleDateFormat("yyyy.MM.dd").format(date);
    }
}
