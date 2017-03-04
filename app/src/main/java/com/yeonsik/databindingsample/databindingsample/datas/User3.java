package com.yeonsik.databindingsample.databindingsample.datas;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by yeonsik on 2017-03-04.
 */

/**
 * ObservableField 방식
 *
 * ObservableField 를 사용할 시에는 public final 로 선언을 해줘야 한다.
 */
public class User3 {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
