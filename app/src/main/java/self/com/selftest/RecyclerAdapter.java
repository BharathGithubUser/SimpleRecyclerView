package self.com.selftest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RowData>{
    Context context;
    List<String> rowData;
    public RecyclerAdapter(Context context, List<String> rowData) {
        this.rowData=rowData;
        this.context=context;
    }

    @Override
    public RowData onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_single_row,parent,false);
        return new RowData(rowItem);
    }

    @Override
    public void onBindViewHolder(RowData holder, int position) {
        holder.rowText.setText(rowData.get(position));
    }

    @Override
    public int getItemCount() {
        return rowData.size();
    }

    public class RowData extends RecyclerView.ViewHolder{
        TextView rowText;
        public RowData(View itemView) {
            super(itemView);
            rowText=itemView.findViewById(R.id.row_data);
        }
    }
}
