package com.sycamore.sycaplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sycamore.sycaplayer.bean.PlayInfo;

import java.util.List;

public class PlayInfoAdapter extends BaseAdapter {

    private List<PlayInfo> mPlayInfoList;
    private LayoutInflater mInflater;

    public PlayInfoAdapter(Context context, List<PlayInfo> playInfoList) {
        mPlayInfoList = playInfoList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mPlayInfoList.size();
    }

    public Object getItem(int position) {
        return mPlayInfoList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_grid_play, null);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        PlayInfo playInfo = mPlayInfoList.get(position);
        viewHolder.tv.setText(playInfo.getName());

        return convertView;
    }

    private static class ViewHolder {
        TextView tv;
    }

}