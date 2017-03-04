package com.yeonsik.databindingsample.databindingsample.datas;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.yeonsik.databindingsample.databindingsample.BR;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class User2 extends BaseObservable {
    private String firstName;
    private String lastName;

    public User2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
