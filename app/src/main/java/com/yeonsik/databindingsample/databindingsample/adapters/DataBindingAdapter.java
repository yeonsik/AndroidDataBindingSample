package com.yeonsik.databindingsample.databindingsample.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.ListItemUserAdapterBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.User;

import java.util.ArrayList;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class DataBindingAdapter extends RecyclerView.Adapter<DataBindingAdapter.UserViewHolder> {

    private Context mContext;
    private ArrayList<User> mUserList;

    public DataBindingAdapter(Context context, ArrayList<User> userList) {
        mContext = context;
        mUserList = userList;
    }

    @Override
    public int getItemCount() {
        return mUserList == null ? 0 : mUserList.size();
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user_adapter_binding, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = mUserList.get(position);
        holder.binding.setUser(user);
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        ListItemUserAdapterBindingBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
