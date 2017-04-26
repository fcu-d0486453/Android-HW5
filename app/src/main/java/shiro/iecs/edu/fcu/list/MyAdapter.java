package shiro.iecs.edu.fcu.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater myInflater;
    private List<Item> items;

    public MyAdapter(Context context, List<Item> item){
        this.items = item;
        myInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Item getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
            convertView = myInflater.inflate(R.layout.item, null);
            holder = new ViewHolder(
                    (TextView) convertView.findViewById(R.id.title),
                    (TextView) convertView.findViewById(R.id.details)
            );
            convertView.setTag(holder);
        return convertView;
    }


    private class ViewHolder {
        TextView txtTitle;
        TextView txtDetails;
        public ViewHolder(TextView txtTitle, TextView txtDetail){
            this.txtTitle = txtTitle;
            this.txtDetails = txtDetail;
        }

    }
}
